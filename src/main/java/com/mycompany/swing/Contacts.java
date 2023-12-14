package com.mycompany.swing;

import java.util.ArrayList;

import javax.swing.JOptionPane;

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

    protected void addContact(String name, String phone, String Dphone, String address, String email, String eEmail) {

        contacts.add(new Contact(name, phone, Dphone, address, email, eEmail));
        System.out.println("Contact added");

    }

    // protected void addContact(User obj) {
    // Contact newContact = new Contact(obj.getName(), obj.getPhone(),
    // obj.getAddress());
    // contacts.add(newContact);
    // System.out.println("Contact added with ID: " + newContact.getID());
    // }
    protected void addContact(Contact obj) {
        contacts.add(obj);
        System.out.println("Contact added with ID: " + obj.getID());
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
        } else {
            contacts.remove(index);
            System.out.println("Contact has been deleted");
        }
    }

    public boolean exists(String s) {
        for (Contact obj : contacts) {
            if (obj.getPhone().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public boolean idExists(int s) {
        for (Contact obj : contacts) {
            System.out.println(obj.getID());
            if (obj.getID() == s) {
                return true;
            }
        }
        return false;
    }

    public boolean emailExists(String s) {
        for (Contact obj : contacts) {
            if (obj.getEmail().equals(s)) {
                return true;
            }
        }
        return false;
    }

    public Contact returnPhoneObj(String s) {
        if (exists(s)) {
            for (Contact obj : contacts) {
                if (obj.getPhone().equals(s)) {
                    return obj;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "This phone number isn't in the system ",
                    "Invalid input",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return null;
    }
    public Contact returnEmailObj(String s) {
        if (exists(s)) {
            for (Contact obj : contacts) {
                if (obj.getEmail().equals(s)) {
                    return obj;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "This email isn't in the system ",
                    "Invalid input",
                    JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public Contact returnPhoneObjById(int s) {

        for (Contact obj : contacts) {
            if (obj.getID() == (s)) {
                return obj;
            }
        }
        return null;
    }

    public void deleteContactsViaPhone(String s) {
        if (exists(s)) {
            for (Contact obj : contacts) {
                if (obj.getPhone().equals(s)) {
                    contacts.remove(obj);
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "This phone number isn't in the system ",
                    "Invalid input",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void deleteContactsViaEmail(String s) {
        if (exists(s)) {
            for (Contact obj : contacts) {
                if (obj.getEmail().equals(s)) {
                    contacts.remove(obj);
                    return;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "This phone number isn't in the system ",
                    "Invalid input",
                    JOptionPane.INFORMATION_MESSAGE);
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

    public boolean isDuplicatedEdit(String email, String phone) {
        if (new User().validPhone(phone)) {
            for (int i = 0; i < contacts.size(); i++) {
                if ( !(contacts.get(i).getEmail().equals(email)) && contacts.get(i).getPhone().equals(phone)) {
                    System.out.println("Duplicated Phone number. Please enter another one.");
                    return true;
                }
            }
        }
        return false;
    }

}
