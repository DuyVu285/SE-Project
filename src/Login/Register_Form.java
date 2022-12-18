/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Register_Form extends javax.swing.JFrame {

    /**
     * Creates new form Register_Form
     */
    public Register_Form() {
        initComponents();

        // center form
        this.setLocationRelativeTo(null);

        // create a black border for the close and minimizze jlabels
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_RegisterLabel = new javax.swing.JPanel();
        jLabel_RegisterTitle = new javax.swing.JLabel();
        jPanel_RegisterForm = new javax.swing.JPanel();
        jLabel_Fullname = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jLabel_ConfirmPassword = new javax.swing.JLabel();
        jLabel_Job = new javax.swing.JLabel();
        jLabel_Phone = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jTextField_Fullname = new javax.swing.JTextField();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField_Password = new javax.swing.JPasswordField();
        jPasswordField_Confirm = new javax.swing.JPasswordField();
        jTextField_Job = new javax.swing.JTextField();
        jTextField_Phone = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_Address = new javax.swing.JTextField();
        jButton_Register = new javax.swing.JButton();
        jButton_Cancel = new javax.swing.JButton();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_RegisterLabel.setBackground(new java.awt.Color(248, 148, 6));
        jPanel_RegisterLabel.setPreferredSize(new java.awt.Dimension(737, 632));

        jLabel_RegisterTitle.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel_RegisterTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_RegisterTitle.setText("Register Form");

        jPanel_RegisterForm.setBackground(new java.awt.Color(44, 62, 80));
        jPanel_RegisterForm.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_Fullname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Fullname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Fullname.setText("Full Name:");

        jLabel_Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setText("UserName:");

        jLabel_Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password:");

        jLabel_ConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_ConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_ConfirmPassword.setText("ConfirmPassword:");

        jLabel_Job.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Job.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Job.setText("Job:");

        jLabel_Phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Phone.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Phone.setText("Phone:");

        jLabel_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email:");

        jLabel_Address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_Address.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Address.setText("Address:");

        jTextField_Fullname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Fullname.setMinimumSize(new java.awt.Dimension(86, 25));
        jTextField_Fullname.setPreferredSize(new java.awt.Dimension(86, 25));

        jTextField_Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Username.setMinimumSize(new java.awt.Dimension(86, 25));
        jTextField_Username.setPreferredSize(new java.awt.Dimension(86, 25));

        jPasswordField_Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField_Password.setPreferredSize(new java.awt.Dimension(86, 25));
        jPasswordField_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PasswordActionPerformed(evt);
            }
        });

        jPasswordField_Confirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPasswordField_Confirm.setPreferredSize(new java.awt.Dimension(86, 25));
        jPasswordField_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_ConfirmActionPerformed(evt);
            }
        });

        jTextField_Job.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Job.setMinimumSize(new java.awt.Dimension(86, 25));
        jTextField_Job.setPreferredSize(new java.awt.Dimension(86, 25));

        jTextField_Phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Phone.setMinimumSize(new java.awt.Dimension(86, 25));
        jTextField_Phone.setPreferredSize(new java.awt.Dimension(86, 25));
        jTextField_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PhoneKeyTyped(evt);
            }
        });

        jTextField_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Email.setMinimumSize(new java.awt.Dimension(86, 25));
        jTextField_Email.setPreferredSize(new java.awt.Dimension(86, 25));

        jTextField_Address.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField_Address.setMinimumSize(new java.awt.Dimension(86, 25));
        jTextField_Address.setPreferredSize(new java.awt.Dimension(86, 25));

        jButton_Register.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Register.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton_Register.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Register.setText("Register");
        jButton_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_RegisterMouseExited(evt);
            }
        });
        jButton_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegisterActionPerformed(evt);
            }
        });

        jButton_Cancel.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Cancel.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_CancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_CancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_CancelMouseExited(evt);
            }
        });
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_RegisterFormLayout = new javax.swing.GroupLayout(jPanel_RegisterForm);
        jPanel_RegisterForm.setLayout(jPanel_RegisterFormLayout);
        jPanel_RegisterFormLayout.setHorizontalGroup(
            jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
            .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                        .addComponent(jLabel_Address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_RegisterFormLayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(jLabel_Fullname)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                                .addComponent(jLabel_ConfirmPassword)
                                .addGap(4, 4, 4)
                                .addComponent(jPasswordField_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel_Password)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                                    .addComponent(jLabel_Username)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                                .addComponent(jLabel_Email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RegisterFormLayout.createSequentialGroup()
                                    .addComponent(jLabel_Job)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Job, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                                    .addComponent(jLabel_Phone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_RegisterFormLayout.setVerticalGroup(
            jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Fullname)
                    .addComponent(jTextField_Fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Username)
                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Password)
                    .addComponent(jPasswordField_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_RegisterFormLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_ConfirmPassword))
                    .addComponent(jPasswordField_Confirm, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Job, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Job))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Phone)
                    .addComponent(jTextField_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Email))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel_Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel_RegisterFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Register, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jLabel_minimize.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_minimize.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_minimize.setText(" -");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabel_minimize.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabel_minimize.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_close.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_close.setText(" X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.setMaximumSize(new java.awt.Dimension(25, 25));
        jLabel_close.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabel_close.setPreferredSize(new java.awt.Dimension(25, 25));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel_RegisterLabelLayout = new javax.swing.GroupLayout(jPanel_RegisterLabel);
        jPanel_RegisterLabel.setLayout(jPanel_RegisterLabelLayout);
        jPanel_RegisterLabelLayout.setHorizontalGroup(
            jPanel_RegisterLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegisterLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_RegisterTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel_RegisterForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_RegisterLabelLayout.setVerticalGroup(
            jPanel_RegisterLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RegisterLabelLayout.createSequentialGroup()
                .addGroup(jPanel_RegisterLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_RegisterTitle)
                    .addGroup(jPanel_RegisterLabelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_RegisterLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jPanel_RegisterForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_RegisterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_RegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_ConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_ConfirmActionPerformed

    private void jPasswordField_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PasswordActionPerformed

    private void jButton_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegisterActionPerformed
        // TODO add your handling code here:
        String fname = jTextField_Fullname.getText();
        String uname = jTextField_Username.getText();
        String phone = jTextField_Job.getText();
        String pass = String.valueOf(jPasswordField_Password.getPassword());
        String address = jTextField_Address.getText();
        String email = jTextField_Email.getText();
        String job = jTextField_Job.getText();

        if (verifyFields()) {
            if (!checkUsername(uname)) {
                PreparedStatement ps;
                ResultSet rs;
                // Insert query here
                String registerUserQuery = "Insert into Users(Username,Fullname,Password,Job,Phone,Address,Email,Role) values (?,?,?,?,?,?,?,?)";
                try {
                    ps = MyCNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, uname);
                    ps.setString(2, fname);
                    ps.setString(3, pass);
                    ps.setString(4, job);
                    ps.setString(5, phone);
                    ps.setString(6, address);
                    ps.setString(7, email);
                    ps.setString(8, "User");

                    if (ps.executeUpdate() != 0) {
                        JOptionPane.showMessageDialog(null, "Your Account Has Been Created");
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace(System.err);
                }

            }
        }
    }//GEN-LAST:event_jButton_RegisterActionPerformed

    private void jButton_RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseExited
        // TODO add your handling code here:
        jButton_Register.setBackground(new Color(0, 84, 140));
    }//GEN-LAST:event_jButton_RegisterMouseExited

    private void jButton_RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_RegisterMouseEntered
        // TODO add your handling code here:
        jButton_Register.setBackground(new Color(0, 101, 183));
    }//GEN-LAST:event_jButton_RegisterMouseEntered

    private void jButton_CancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CancelMouseEntered
        // TODO add your handling code here:
        jButton_Cancel.setBackground(new Color(0, 101, 183));
    }//GEN-LAST:event_jButton_CancelMouseEntered

    private void jButton_CancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CancelMouseExited
        // TODO add your handling code here:
        jButton_Cancel.setBackground(new Color(0, 84, 140));
    }//GEN-LAST:event_jButton_CancelMouseExited

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.black);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        // TODO add your handling code here:
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jButton_CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_CancelMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton_CancelMouseClicked

    private void jTextField_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PhoneKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PhoneKeyTyped
    // create a function to check every empty fields
    public boolean verifyFields() {
        String fname = jTextField_Fullname.getText();
        String uname = jTextField_Username.getText();
        String phone = jTextField_Job.getText();
        String pass1 = String.valueOf(jPasswordField_Password.getPassword());
        String pass2 = String.valueOf(jPasswordField_Confirm.getPassword());
        String job = jTextField_Job.getText();
        String address = jTextField_Address.getText();
        String email = jTextField_Email.getText();

        if (fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("")
                || pass1.trim().equals("") || pass2.trim().equals("")|| job.trim().equals("")
                || address.trim().equals("") || email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty", "Empty Fields", 2);
            return false;
        } else if (!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(null, "Password Doesn't Match", "Confirm Password", 2);
            return false;
        } else {
            return true;
        }
    }

    // create a function to check if the entered username already exist in the database
    public boolean checkUsername(String username) {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;

        String query = "SELECT * FROM Users WHERE Username = ?";
        try {
            st = MyCNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();

            if (rs.next()) {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.err);
        }
        return username_exist;
    }

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Register_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Register;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_ConfirmPassword;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Fullname;
    private javax.swing.JLabel jLabel_Job;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Phone;
    private javax.swing.JLabel jLabel_RegisterTitle;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JPanel jPanel_RegisterForm;
    private javax.swing.JPanel jPanel_RegisterLabel;
    private javax.swing.JPasswordField jPasswordField_Confirm;
    private javax.swing.JPasswordField jPasswordField_Password;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Fullname;
    private javax.swing.JTextField jTextField_Job;
    private javax.swing.JTextField jTextField_Phone;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
