package com.mycompany.swing;

import java.util.ArrayList;


public class Contacts {
    static ArrayList<Contact> contacts = new ArrayList<>();

    public Contacts() {
    }

    public Contacts(Contact obj) {
        contacts.add(obj);
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    protected void addContact(String name, String phone, String Email, String address) {
        contacts.add(new Contact(name, phone,Email,address));
        System.out.println("Contact added");

    }

    protected void addContact(User obj) {
        contacts.add(new Contact(obj.getName(), obj.getPhone(),obj.getEmail(),obj.getAddress()));
        System.out.println("Contact added");
    }

    public void editContact(int index, String name, String phone) {
        Contact contact = contacts.get(index);
        contact.setName(name);
        contact.setPhone(phone);
        System.out.println("Contact has been edit");
    }

    public void deleteContacts(int index, String s) {
        if (s.equals("yes")) {
            contacts.clear();
        }
        else {
            contacts.remove(index);
        System.out.println("Contact has been deleted");
        }
    }

    public boolean validIndex(int index) {
        if ((index) >= 0 && index < contacts.size()) {
            return true;
        }
        System.out.println("Invalid Contact ID, please a valid one ");
        return false;
    }

    public boolean isDuplicated(String phone) {

        for (Contact contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                System.out.println("Duplicated Phone number. Please enter another one.");
                return true;
            }
        }

        return false;
    }
    

    public boolean isDuplicated(int editedIndex, String phone) {
        if (new Contact().validPhone(phone)) {
            for (int i = 0; i < contacts.size(); i++) {
                if (i != editedIndex && contacts.get(i).getPhone().equals(phone)) {
                    System.out.println("Duplicated Phone number. Please enter another one.");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean login(String email, String password) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPass().equals(password) && contacts.get(i).getEmail().equals(email)) {
                System.out.println("Welcome back, " + contacts.get(i).getName());
                return true;
            }
        }
        System.out.println("Invalid Email or Password");
        return false;
    }

    public Contact giveUserObject(String email, String password) {
        Contact user = new Contact();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getPass().equals(password) && contacts.get(i).getEmail().equals(email)) {
                return contacts.get(i);
            }
        }
        user = null;
        return user;
    }
}