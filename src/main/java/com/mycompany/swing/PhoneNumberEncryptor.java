package com.mycompany.swing;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;

public class PhoneNumberEncryptor {

    private static final String SECRET_KEY = "your_secret_key";
    private static final String SALT = "your_salt";

    public static String encrypt(String phone) throws Exception {
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
        SecretKey tmp = factory.generateSecret(spec);
        SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        // Generate a random IV
        SecureRandom random = new SecureRandom();
        byte[] ivBytes = new byte[cipher.getBlockSize()];
        random.nextBytes(ivBytes);

        cipher.init(Cipher.ENCRYPT_MODE, secret, new IvParameterSpec(ivBytes));

        byte[] encrypted = cipher.doFinal(phone.getBytes());
        // Combine IV and encrypted data
        byte[] combined = new byte[ivBytes.length + encrypted.length];
        System.arraycopy(ivBytes, 0, combined, 0, ivBytes.length);
        System.arraycopy(encrypted, 0, combined, ivBytes.length, encrypted.length);

        return Base64.getEncoder().encodeToString(combined);
    }

    public static String decrypt(String encryptedPhone) throws Exception {
        byte[] combined = Base64.getDecoder().decode(encryptedPhone);

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

        // Extract IV from the combined data
        byte[] ivBytes = Arrays.copyOfRange(combined, 0, cipher.getBlockSize());
        byte[] encrypted = Arrays.copyOfRange(combined, cipher.getBlockSize(), combined.length);

        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(SECRET_KEY.toCharArray(), SALT.getBytes(), 65536, 256);
        SecretKey tmp = factory.generateSecret(spec);
        SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

        cipher.init(Cipher.DECRYPT_MODE, secret, new IvParameterSpec(ivBytes));
        byte[] decrypted = cipher.doFinal(encrypted);
        return new String(decrypted);
    }

    public static void main(String[] args) throws Exception {
        // Example usage
        String originalPhone = "1234567890";

        // Encrypt the phone number
        String encryptedPhone = encrypt(originalPhone);
        System.out.println("Encrypted Phone: " + encryptedPhone);

        // Decrypt the phone number
        String decryptedPhone = decrypt(encryptedPhone);
        System.out.println("Decrypted Phone: " + decryptedPhone);
    }
}
