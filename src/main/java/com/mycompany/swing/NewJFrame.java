/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author algho
 */
public class NewJFrame extends javax.swing.JFrame {
        Contact cont = new Contact();
        User use = new User();
        Contacts conts = new Contacts();

        /**
         * Creates new form NewJFrame
         */
        public NewJFrame() {
                initComponents();
                setTitle("Book Phone"); // Set the title of the JFrame
                ImageIcon icon = new ImageIcon("src\\main\\java\\com\\mycompany\\swing\\Icons\\4298389.png"); // Replace
                                                                                                              // "your_icon.png"
                                                                                                              // with
                                                                                                              // the
                                                                                                              // actual
                                                                                                              // name of
                                                                                                              // your
                                                                                                              // icon
                                                                                                              // file
                setIconImage(icon.getImage()); // Set the program icon

        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Name = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        NameLable = new javax.swing.JLabel();
        phoneLable1 = new javax.swing.JLabel();
        addressF = new javax.swing.JTextField();
        NameLable1 = new javax.swing.JLabel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        booked = new javax.swing.JTable();

        jTextField2.setText("jTextField1");
        jTextField2.setName("jTextField2"); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName("jPanel1"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setName("jPanel2"); // NOI18N

        Name.setName("Name"); // NOI18N

        phoneNumber.setName("phoneNumber"); // NOI18N

        clearButton.setBackground(new java.awt.Color(240, 240, 240));
        clearButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/swing/Icons/eraser.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.setBorder(null);
        clearButton.setName("clearButton"); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(240, 240, 240));
        addButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/swing/Icons/add.png"))); // NOI18N
        addButton.setText("Book");
        addButton.setBorder(null);
        addButton.setName("addButton"); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(240, 240, 240));
        deleteButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/swing/Icons/delete.png"))); // NOI18N
        deleteButton.setText("Delete Account");
        deleteButton.setBorder(null);
        deleteButton.setName("deleteButton"); // NOI18N

        updateButton.setBackground(new java.awt.Color(240, 240, 240));
        updateButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/swing/Icons/updated.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.setName("updateButton"); // NOI18N

        NameLable.setBackground(new java.awt.Color(255, 255, 255));
        NameLable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NameLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/swing/Icons/signature.png"))); // NOI18N
        NameLable.setLabelFor(NameLable);
        NameLable.setText("Name");
        NameLable.setName("NameLable"); // NOI18N

        phoneLable1.setBackground(new java.awt.Color(255, 255, 255));
        phoneLable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        phoneLable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/swing/Icons/smartphone.png"))); // NOI18N
        phoneLable1.setLabelFor(phoneNumber);
        phoneLable1.setText("Phone Number");
        phoneLable1.setName("phoneLable1"); // NOI18N

        addressF.setName("addressF"); // NOI18N

        NameLable1.setBackground(new java.awt.Color(255, 255, 255));
        NameLable1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        NameLable1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/swing/Icons/address.png"))); // NOI18N
        NameLable1.setLabelFor(NameLable);
        NameLable1.setText("Address");
        NameLable1.setName("NameLable1"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addComponent(NameLable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phoneLable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addComponent(NameLable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressF, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(phoneLable1)
                .addGap(14, 14, 14)
                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NameLable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NameLable1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressF, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        booked.setBackground(new java.awt.Color(225, 225, 225));
        booked.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        booked.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Phone Number", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        booked.setFocusable(false);
        booked.setGridColor(new java.awt.Color(255, 255, 255));
        booked.setName("booked"); // NOI18N
        booked.setShowGrid(true);
        jScrollPane1.setViewportView(booked);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jScrollPane1)
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(104, 104, 104))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 286, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Book phone");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        String name = Name.getText();
        String phone = phoneNumber.getText();
        String address = addressF.getText();
        if(!phone.isEmpty() || !name.isEmpty() || !address.isEmpty() ) {
            Name.setText("");
            phoneNumber.setText("");
            addressF.setText("");
        }
        else    {
            JOptionPane.showMessageDialog(null, "Nothing to clear",
                                        "invalid Click", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_clearButtonActionPerformed

        private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed

                String name = Name.getText();
                String phone = phoneNumber.getText();
                String address = addressF.getText();
                boolean validName = false, validPhone = false, validAddress = false;
                DefaultTableModel model = (DefaultTableModel) booked.getModel();


                if (phone.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill out the phone number field",
                                        "Missing Information", JOptionPane.WARNING_MESSAGE);
                } else {
                        if (use.validPhone(phone)) {
                                validPhone = true;
                                if (name.isEmpty()) {
                                        JOptionPane.showMessageDialog(null, "Please fill out the name field",
                                                        "Missing Information", JOptionPane.WARNING_MESSAGE);
                                } else {
                                        if (use.validName(name)) {
                                                validName = true;
                                                if (address.isEmpty()) {
                                                        JOptionPane.showMessageDialog(null,
                                                                        "Please fill out the address field",
                                                                        "Missing Information",
                                                                        JOptionPane.WARNING_MESSAGE);
                                                } else {
                                                        if (use.validAddress(address)) {
                                                                validAddress = true;
                                                        } else {
                                                                JOptionPane.showMessageDialog(null,
                                                                                "Please enter a valid address",
                                                                                "Invalid Information",
                                                                                JOptionPane.WARNING_MESSAGE);
                                                        }
                                                }
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Please enter a valid name",
                                                                "Invalid Information", JOptionPane.WARNING_MESSAGE);
                                        }
                                }
                        } else {
                                JOptionPane.showMessageDialog(null, "Please enter a valid phone number",
                                                "Invalid Information", JOptionPane.WARNING_MESSAGE);
                        }

                        if (validAddress && validName && validPhone) {
                                if (!conts.isDuplicated(phone)) {
                                        User obj = new User(name,phone,address);
                                        conts.addContact(obj);
                                        model.addRow(new Object[] { name, phone, address });
                                }
                                else {
                                JOptionPane.showMessageDialog(null, "This phone number is already in the system, please enter another one",
                                                "Invalid Information", JOptionPane.WARNING_MESSAGE);
                                }

                        }
                }

        }// GEN-LAST:event_addButtonActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(NewJFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(NewJFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(NewJFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(NewJFrame.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new NewJFrame().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JLabel NameLable;
    private javax.swing.JLabel NameLable1;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressF;
    private javax.swing.JTable booked;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel phoneLable1;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
