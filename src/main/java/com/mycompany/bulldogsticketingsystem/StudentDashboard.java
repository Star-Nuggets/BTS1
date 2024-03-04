/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bulldogsticketingsystem;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Kaede
 */
public class StudentDashboard extends javax.swing.JFrame {
    byte[] proofOfPaymentContent;
    byte[] supportingDocumentContent;
    String currentUser;

    /**
     * Creates new form StudentDashboard
     */
    public StudentDashboard(String currentUser) {
        this.currentUser = currentUser; // Initialize the currentUser field in the constructor
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ExitX = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        WelcomeUser = new javax.swing.JLabel();
        SubmitATicket = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        MiddleName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        StudentNumber = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        TypeOfDocument = new javax.swing.JLabel();
        NumberOfCopies = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SpecialInstruction = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PaymentType = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        Type_of_Documents = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        Payment_Method = new javax.swing.JComboBox<>();
        SecondBgStudentDashboard = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(50, 62, 143));
        jPanel5.setForeground(new java.awt.Color(50, 62, 143));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 810, 970, 10));

        jPanel3.setBackground(new java.awt.Color(50, 62, 143));
        jPanel3.setForeground(new java.awt.Color(50, 62, 143));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 10, 780));

        jPanel4.setBackground(new java.awt.Color(50, 62, 143));
        jPanel4.setForeground(new java.awt.Color(50, 62, 143));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ExitX.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ExitX.setForeground(new java.awt.Color(255, 255, 255));
        ExitX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ExitX.setText("    X");
        ExitX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitXMouseClicked(evt);
            }
        });
        jPanel4.add(ExitX, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, 50, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(50, 62, 143));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PaymentDetails.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 380, 540));

        WelcomeUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        WelcomeUser.setForeground(new java.awt.Color(12, 40, 105));
        WelcomeUser.setText("Welcome, (User)");
        jPanel1.add(WelcomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 200, 50));

        SubmitATicket.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        SubmitATicket.setForeground(new java.awt.Color(12, 40, 105));
        SubmitATicket.setText("Submit a Ticket");
        jPanel1.add(SubmitATicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 170, 20));

        FirstName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FirstName.setForeground(new java.awt.Color(12, 40, 105));
        FirstName.setText("First Name:");
        jPanel1.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 90, 20));

        MiddleName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        MiddleName.setForeground(new java.awt.Color(12, 40, 105));
        MiddleName.setText("Middle Name:");
        MiddleName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(MiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 120, 20));

        LastName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        LastName.setForeground(new java.awt.Color(12, 40, 105));
        LastName.setText("Last Name:");
        jPanel1.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 110, 20));

        StudentNumber.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        StudentNumber.setForeground(new java.awt.Color(12, 40, 105));
        StudentNumber.setText("Student No:");
        jPanel1.add(StudentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 130, 20));

        Email.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Email.setForeground(new java.awt.Color(12, 40, 105));
        Email.setText("Email:");
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 120, 20));

        TypeOfDocument.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TypeOfDocument.setForeground(new java.awt.Color(12, 40, 105));
        TypeOfDocument.setText("Type of Document:");
        jPanel1.add(TypeOfDocument, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 140, 20));

        NumberOfCopies.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        NumberOfCopies.setForeground(new java.awt.Color(12, 40, 105));
        NumberOfCopies.setText("No. of Copies:");
        jPanel1.add(NumberOfCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 40, 105));
        jLabel4.setText("Purpose:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 110, -1));

        SpecialInstruction.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SpecialInstruction.setForeground(new java.awt.Color(12, 40, 105));
        SpecialInstruction.setText("Special Instruction:");
        jPanel1.add(SpecialInstruction, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 150, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(12, 40, 105));
        jLabel6.setText("For CTC of Grade and CoR, please specify here the AY and term.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        jLabel5.setForeground(new java.awt.Color(12, 40, 105));
        jLabel5.setText("(Ex. CTC  of Grades - AY 2022-2023 1st, CoR - AY 2023-2024 2nd) ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, -1, -1));

        PaymentType.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        PaymentType.setForeground(new java.awt.Color(12, 40, 105));
        PaymentType.setText("Payment Method:");
        jPanel1.add(PaymentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 690, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 40, 105));
        jLabel3.setText("Proof of Payment:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 760, 130, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(12, 40, 105));
        jLabel1.setText("Total Amount Paid:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 720, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 40, 105));
        jLabel7.setText("Required Document:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 800, -1, -1));

        jButton1.setText("Attach a file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 800, 220, -1));

        jButton5.setText("Attach a File");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 760, 220, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 870, 140, 50));

        jButton2.setBackground(new java.awt.Color(50, 62, 143));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(12, 40, 105));
        jButton2.setText("Submit Ticket");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 870, 140, 50));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(50, 62, 143));
        jButton3.setText("View Submitted Ticket");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 870, 220, 50));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 720, 220, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 220, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 220, 30));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 220, 30));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 220, 30));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 220, 30));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 220, 30));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 360, 100));

        Type_of_Documents.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your type of document", "Assigned Flowchart/Curriculum", "Certificate of Attendance", "Certificate of Course Description", "Certificate of English Medium", "Certificate of Enrollment", "Certificate of GWA", "Certificate of Registration", "CTC of Grades", "Honorable Dismissal/Transfer Credentials", "Student Flowchart", "Transcript of Records" }));
        Type_of_Documents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Type_of_DocumentsActionPerformed(evt);
            }
        });
        jPanel1.add(Type_of_Documents, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 220, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your Purpose", "Employment", "Scholarship/Educational Assistance", "Other" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 220, -1));

        Payment_Method.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Payment Method", "Gcash", "Bank Transfer" }));
        jPanel1.add(Payment_Method, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 690, 220, -1));

        SecondBgStudentDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BgStudentDashboard.png"))); // NOI18N
        jPanel1.add(SecondBgStudentDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 930, 950));

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 30, 990, 1190));

        setSize(new java.awt.Dimension(969, 1368));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitXMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Type_of_DocumentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Type_of_DocumentsActionPerformed

    }//GEN-LAST:event_Type_of_DocumentsActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        attachFile(jButton1, supportingDocumentContent);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void attachFile(JButton button, byte[] fileContent) {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            button.setText("Attached: " + selectedFile.getName());
            // Store the file for later use
            try {
                FileInputStream fis = new FileInputStream(selectedFile);
                fileContent = new byte[(int) selectedFile.length()];
                fis.read(fileContent);
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String getInput(JTextField field) {
        return field.getText();
    }

    private String getInput(JComboBox<String> comboBox) {
        return (String) comboBox.getSelectedItem();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Retrieve data from form fields
        String firstName = getInput(jTextField1);
        String middleName = getInput(jTextField3);
        String lastName = getInput(jTextField4);
        String studentNumber = getInput(jTextField5);
        String email = getInput(jTextField6);
        String typeOfDocument = getInput(Type_of_Documents);
        int numberOfCopies = Integer.parseInt(getInput(jTextField2));
        String purpose = getInput(jComboBox1);
        String specialInstruction = getInput(jTextField7);
        String paymentMethod = getInput(Payment_Method);
        double totalAmountPaid = Double.parseDouble(getInput(jTextField8));

        String url = "jdbc:mysql://localhost:3306/ticket?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String username = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, pass);

            LocalDateTime now = LocalDateTime.now();
            String query = "INSERT INTO ticketable (first_Name, middle_Name, last_Name, student_Number, email_Address, document_Type, number_of_Copies, purpose, special_Instruction, type_of_Payment, total_amount_Paid, proof_of_Payment, list_of_Requirements, ticket_Status, date_Time) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, middleName);
            preparedStatement.setString(3, lastName);
            preparedStatement.setString(4, studentNumber);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, typeOfDocument);
            preparedStatement.setInt(7, numberOfCopies);
            preparedStatement.setString(8, purpose);
            preparedStatement.setString(9, specialInstruction);
            preparedStatement.setString(10, paymentMethod);
            preparedStatement.setDouble(11, totalAmountPaid);
            preparedStatement.setBytes(12, proofOfPaymentContent);
            preparedStatement.setBytes(13, supportingDocumentContent);
            preparedStatement.setString(14, "Pending");
            preparedStatement.setTimestamp(15, Timestamp.valueOf(now));
            preparedStatement.executeUpdate();

            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);

                // Generate ticket_friendlyId
                String ticket_friendlyId = String.format("%d%04d", LocalDate.now().getYear(), id);

                // Update the new ticket with the generated ticket_friendlyId
                query = "UPDATE ticketable SET ticket_friendlyId = ? WHERE ticket_ID = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, ticket_friendlyId);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to connect to database");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        attachFile(jButton5, supportingDocumentContent);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new ViewStudentTickets(currentUser).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDashboard("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel ExitX;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel MiddleName;
    private javax.swing.JLabel NumberOfCopies;
    private javax.swing.JLabel PaymentType;
    private javax.swing.JComboBox<String> Payment_Method;
    private javax.swing.JLabel SecondBgStudentDashboard;
    private javax.swing.JLabel SpecialInstruction;
    private javax.swing.JLabel StudentNumber;
    private javax.swing.JLabel SubmitATicket;
    private javax.swing.JLabel TypeOfDocument;
    private javax.swing.JComboBox<String> Type_of_Documents;
    private javax.swing.JLabel WelcomeUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
