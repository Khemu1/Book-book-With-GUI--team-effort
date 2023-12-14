// package com.mycompany.swing;

// import javax.swing.*;
// import java.util.*;

// public class FormData {
//     private String email;
//     private String password;
//     private String ID = "15a";
//     static ArrayList<FormData> data = new ArrayList<>(Arrays.asList());
//     static LinkedHashSet<String> randomIds = new LinkedHashSet<String>();

//     FormData() {

//     }

//     FormData(String email, String password) {
//         // giveRandomId();
//         this.email = email;
//         this.password = password;
//     }

//     static {

//         addIds();
//     }

//     static private void addIds() {
//         for (; randomIds.size() != 1200;) {
//             int random = 0;
//             while (random == 0) {
//                 random = (int) (Math.random() * Math.pow(10, 5));
//             }
//             String sId = String.valueOf(random) + String.valueOf((char) ((int) (Math.random() * 26) + 'A'));
//             randomIds.add(sId);
//         }
//     }

//     public void giveRandomId() {
//         Iterator<String> iterator = randomIds.iterator();
//         if (iterator.hasNext()) {
//             this.ID = iterator.next();
//             iterator.remove();
//         } else {
//             System.err.println("No more available IDs");
//         }
//     }

//     public String getEmail() {
//         return this.email;
//     }

//     public void setEmail(String email) {
//         if (validEmail(email)) {
//             this.email = email;
//         }
//     }

//     public String getPass() {
//         return this.password;
//     }

//     public void setPassword(String password) {
//         if (validPass(password)) {
//             this.password = password;
//         }
//     }

//     public String getID() {
//         return this.ID;
//     }

//     public void setID(String id) {
//         this.ID = id;
//     }

//     static boolean validEmail(String email) {
//         if (email.matches(("^[a-zA-Z\\d+_.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]+$"))) {
//             return true;
//         }
//         System.out.println("Invalid email, please enter a valid one");
//         return false;
//     }

//     public boolean validPass(String pass) {
//         return pass.matches("^.*(?=.{8,})(?=.*\\d)(?=.*[a-zA-Z]).*$");
//     }

//     public void addAccount(String email,String password) {
//         FormData obj = new FormData(email,password);
//         data.add(obj);
//     }
//     public boolean login(String email, String password) {
//         for (int i = 0; i < data.size(); i++) {
//             if (data.get(i).getPass().equals(password) && data.get(i).getEmail().equals(email)) {
//                 return true;
//             }
//         }
//         System.out.println("Invalid Email or Password");
//         return false;
//     }

//     public FormData giveUserObject(String email, String password) {
//         for (int i = 0; i < data.size(); i++) {
//             if (data.get(i).getPass().equals(password) && data.get(i).getEmail().equals(email)) {
//                 return data.get(i);
//             }
//         }
//         return null;
//     }

//     public boolean isDuplicated(String email) {
//         for (FormData obj : data) {
//             if (obj.getEmail().equals(email)) {
//                 System.out.println("Duplicated Email. Please enter another one.");
//                 return true;
//             }
//         }
//         return false;
//     }

//     public boolean isDuplicatedEdit(String id, String email) {
//         if (validEmail(email)) {
//             for (int i = 0; i < data.size(); i++) {
//                 if (!data.get(i).getID().equals(id) && data.get(i).getEmail().equals(email)) {
//                     System.out.println("Duplicated Email. Please enter another one.");
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public boolean findEmailAndID(String id, String email) {
//         for (FormData obj : data) {
//             if (obj.getEmail().equals(email) && obj.getID().equals(id)) {
//                 return true;
//             }
//         }
//         JOptionPane.showMessageDialog(null,
//                 "This account wasn't found in the system.",
//                 "Account wasn't found",
//                 JOptionPane.INFORMATION_MESSAGE);
//         return false;
//     }

//     public void deleteAccount(String id, String email) {
//         Iterator<FormData> iterator = data.iterator();
//         while (iterator.hasNext()) {
//             FormData obj = iterator.next();
//             if (obj.getEmail().equals(email) && obj.getID().equals(id)) {
//                 iterator.remove();
//                 JOptionPane.showMessageDialog(null,
//                         "Your account has been deleted.",
//                         "Deletion Successful",
//                         JOptionPane.INFORMATION_MESSAGE);
//                 return;
//             }
//         }
//     }
    
// }
