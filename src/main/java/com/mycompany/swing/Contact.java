package com.mycompany.swing;

import java.util.*;

import javax.swing.JOptionPane;

public class Contact {
    private String name;
    private String phone = "";
    private String Dphone = "";

    private String email = "";
    private String password;
    private String address;
    private int ID = -1;
    static Set<Integer> randomIds = new HashSet<Integer>();

    public Contact() {
    }

    public Contact(String name, String phone,String Dphone, String address) {
        giveRandomId();
        setName(name);
        setAddress(address);
        setPhone(phone);
        this.Dphone = Dphone;
                                // JOptionPane.showMessageDialog(null,
                                // "Information has been added. Please note that your ID is: " + this.getID()
                                //         + ". Please save it.",
                                // "Operation complete", JOptionPane.INFORMATION_MESSAGE);
    }

    {
        addIds();
}
private void addIds() {
    for (; randomIds.size() != 1200;) {
        int random = 0;
        while (random == 0) {
            random = (int) (Math.random() * Math.pow(10, 5));
        }
        randomIds.add(random);
    }
}


    public void giveRandomId() {
        Iterator<Integer> iterator = randomIds.iterator();
        if (iterator.hasNext()) {
            this.ID = iterator.next();
            iterator.remove();
        } else {
            System.err.println("No more available IDs");
        }
    }

    public String getDphone() {
        return this.Dphone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validName(name)) {
            this.name = name;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (validPhone(phone)) {
            this.phone = phone;
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (validEmail(email)) {
            this.email = email;
        }
    }

    public String getPass() {
        return this.password;
    }

    public void setPassword(String password) {
        if (validPass(password)) {
            this.password = password;
        }
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        if (validAddress(address)) {
            this.address = address;
        }
    }

    public int getID() {
        return this.ID;
    }

    boolean validPhone(String phone) {
        if (phone.matches("^(01[0-2]|015)\\d{8}$")) {
            return true;
        }
        if (phone.length() != 11) {
            System.err.println("Phone number length must be 11");
        } else {
            System.err.println("Invalid Phone Number Format");
        }
        return false;
    }

    static boolean validName(String name) {
        if (name.matches("[a-zA-Z ]*")) {
            return true;
        }
        System.err.println("Invalid Name, please enter a valid one");
        return false;
    }

    static boolean validEmail(String email) {
        if (email.matches(("^[a-zA-Z\\d+_.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]+$"))) {
            return true;
        }
        System.out.println("Invalid email, please Enter a valid one");
        return false;
    }

    static boolean validAddress(String email) {
        if (email.matches(("^[a-zA-Z0-9.,\\s]+$"))) {
            return true;
        }
        System.out.println("Invalid address, please Enter a valid one");
        return false;
    }

    public boolean validPass(String pass) {
        return pass.matches("^.*(?=.{8,})(?=.*\\d)(?=.*[a-zA-Z]).*$");
    }
}
