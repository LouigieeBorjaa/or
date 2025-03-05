/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or;

import config.config;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author janin
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
    }

    private boolean emailExists(String email) {

        config con = new config();

        try {
            String query = "SELECT * FROM user WHERE u_email = ?";
            PreparedStatement pstmt = con.getConnection().prepareStatement(query);
            pstmt.setString(1, email.trim());
            ResultSet resultSet = pstmt.executeQuery();

            if (resultSet.next()) {

                return true;
            }

        } catch (SQLException ex) {
            System.out.println("" + ex);

        }

        return false;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        COMPIRM = new javax.swing.JButton();
        cNumber = new javax.swing.JTextField();
        lName = new javax.swing.JTextField();
        fName = new javax.swing.JTextField();
        eMail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cPass = new javax.swing.JPasswordField();
        Pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("REGISTER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        COMPIRM.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        COMPIRM.setText("CONFIRM");
        COMPIRM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                COMPIRMMouseClicked(evt);
            }
        });
        COMPIRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMPIRMActionPerformed(evt);
            }
        });
        jPanel1.add(COMPIRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 120, 40));

        cNumber.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cNumberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cNumberFocusLost(evt);
            }
        });
        cNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNumberActionPerformed(evt);
            }
        });
        jPanel1.add(cNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 240, 30));

        lName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lNameFocusLost(evt);
            }
        });
        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });
        jPanel1.add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 240, 30));

        fName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fNameFocusLost(evt);
            }
        });
        fName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fNameMouseExited(evt);
            }
        });
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        jPanel1.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 240, 30));

        eMail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        eMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                eMailFocusLost(evt);
            }
        });
        eMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eMailActionPerformed(evt);
            }
        });
        jPanel1.add(eMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 240, 30));

        jLabel2.setText("Contact Number");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));

        jLabel3.setText("First name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel4.setText("Last name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel6.setText("Confirm Password");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        cPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cPassFocusLost(evt);
            }
        });
        cPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cPassActionPerformed(evt);
            }
        });
        jPanel1.add(cPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 240, 30));

        Pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassFocusLost(evt);
            }
        });
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        jPanel1.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 240, 30));

        jLabel7.setText("Email");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, 10));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Choose account type)", "Customer", "Receptionist" }));
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void COMPIRMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_COMPIRMMouseClicked

        boolean isValid = true;
        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Some fields are required", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "Registration Completed", "Success", JOptionPane.INFORMATION_MESSAGE);

            config con = new config();

            con.insertData("INSERT INTO customer (fname, lname, email, c_number, cpass, type, status)"
                    + "VALUES ('" + fName.getText() + "','" + lName.getText() + "','" + eMail.getText() + "',"
                    + "'" + cNumber.getText() + "','" + Pass.getText() + "','" + type.getSelectedItem() + "', 'Pending')");

            Login lg = new Login();

            lg.setVisible(true);
            this.dispose();


    }//GEN-LAST:event_COMPIRMMouseClicked
    }
    private void COMPIRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMPIRMActionPerformed

        boolean isValid = true;

        if (fName.getText().isEmpty()) {
            fName.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            fName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (lName.getText().isEmpty()) {
            lName.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            lName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (Pass.getPassword().length == 0) {
            Pass.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else if (Pass.getPassword().length < 8) {
            Pass.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Password must contain at least 8 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            isValid = false;
        }

        if (cPass.getPassword().length == 0) {
            cPass.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            cPass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        if (eMail.getText().isEmpty()) {
            this.eMail.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;

        }

        if (cNumber.getText().isEmpty()) {
            cNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
            isValid = false;
        } else {
            cNumber.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        }

        if (!isValid) {
            JOptionPane.showMessageDialog(null, "Some fields are required", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            JOptionPane.showMessageDialog(null, "Registration Completed", "Success", JOptionPane.INFORMATION_MESSAGE);

            config con = new config();

            con.insertData("INSERT INTO customer (fname, lname, email, c_number, cpass, type, status)"
                    + "VALUES ('" + fName.getText() + "','" + lName.getText() + "','" + eMail.getText() + "',"
                    + "'" + cNumber.getText() + "','" + Pass.getText() + "','" + type.getSelectedItem() + "', 'Pending')");

            Login lg = new Login();

            lg.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_COMPIRMActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed


    }//GEN-LAST:event_fNameActionPerformed

    private void fNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fNameFocusLost

        if (fName.getText().isEmpty()) {
            fName.setBorder(BorderFactory.createLineBorder(Color.RED));
            boolean isValid = false;
        } else {
            fName.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }


    }//GEN-LAST:event_fNameFocusLost

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameActionPerformed


    }//GEN-LAST:event_lNameActionPerformed

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed


    }//GEN-LAST:event_PassActionPerformed

    private void cPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cPassActionPerformed

    }//GEN-LAST:event_cPassActionPerformed

    private void eMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eMailActionPerformed


    }//GEN-LAST:event_eMailActionPerformed

    private void cNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNumberActionPerformed
        if (cNumber.getText().isEmpty()) {
            cNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
            boolean isValid = false;
        } else {
            cNumber.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        String contactNumber = cNumber.getText().trim();
        if (!contactNumber.matches("\\d{11}")) {
            cNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Contact number must contain exactly 11 digits.", "Error", JOptionPane.ERROR_MESSAGE);
            boolean isValid = false;
        } else {
            cNumber.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }


    }//GEN-LAST:event_cNumberActionPerformed

    private void fNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fNameMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameMouseExited

    private void lNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lNameFocusLost

    }//GEN-LAST:event_lNameFocusLost

    private void PassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassFocusLost
        if (Pass.getPassword().length == 0) {
            Pass.setBorder(BorderFactory.createLineBorder(Color.RED));
            boolean isValid = false;
        } else if (Pass.getPassword().length < 8) {
            Pass.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Password must contain at least 8 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            boolean isValid = false;
    }//GEN-LAST:event_PassFocusLost
    }


    private void cPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cPassFocusLost
        if (cPass.getPassword().length == 0) {
            cPass.setBorder(BorderFactory.createLineBorder(Color.RED));
            boolean isValid = false;
        } else {
            cPass.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

                  }//GEN-LAST:event_cPassFocusLost

    private void eMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_eMailFocusLost

       // Regular expression for email validation
String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

// Default assumption: the email is valid
boolean isValid = true;

// Check if the email field is empty
if (eMail.getText().isEmpty()) {
    eMail.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Email cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;  // Mark as invalid
} 
// Check if the email already exists
else if (emailExists(eMail.getText())) {
    eMail.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Email is already registered. Please use another email.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;  // Mark as invalid
} 
// Check if the email format is valid using regex
else if (!eMail.getText().matches(emailRegex)) {
    eMail.setBorder(BorderFactory.createLineBorder(Color.RED));
    JOptionPane.showMessageDialog(null, "Email must be in the format 'username@domain.com'.", "Error", JOptionPane.ERROR_MESSAGE);
    isValid = false;  // Mark as invalid
} 
// If the email is valid, set the border to gray
else {
    eMail.setBorder(BorderFactory.createLineBorder(Color.GRAY));
}

// Proceed with further logic if the email is valid
if (isValid) {
    // Continue processing (e.g., saving the email)
    // Your further code here...
}
    
    }//GEN-LAST:event_eMailFocusLost

    private void cNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cNumberFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cNumberFocusGained

    private void cNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cNumberFocusLost
        if (cNumber.getText().isEmpty()) {
            cNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
            boolean isValid = false;
        } else {
            cNumber.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        }
    }//GEN-LAST:event_cNumberFocusLost

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton COMPIRM;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField cNumber;
    private javax.swing.JPasswordField cPass;
    private javax.swing.JTextField eMail;
    private javax.swing.JTextField fName;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lName;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables

    private boolean isValidEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean isValidContactNumber(String contactNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
