/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;




/**
 *
 * @author Dulma
 */
public class Signup extends javax.swing.JFrame {
 Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
Statement st=null;
  
    

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
       
    }
    public void clear(){
        txtName.setText("");
        txtEmail.setText("");
        txtMobile.setText("");
      txtpwd.setText("");
    
        
       
        
    
}
    
    
     private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        return email != null && pat.matcher(email).matches();
    }

    private boolean isValidMobileNumber(String mobileNumber) {
        // Assuming a valid mobile number is 10 digits long
        String mobileRegex = "^\\d{10}$";
        Pattern pat = Pattern.compile(mobileRegex);
        return mobileNumber != null && pat.matcher(mobileNumber).matches();
    }

    private boolean isValidPassword(String password) {
        // Password must be at least 6 characters long
        return password != null && password.length() >= 6;
    }

    private boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        usercombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(209, 107, 9));
        jLabel2.setText("Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 59, 22));

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 103, 170, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(209, 107, 9));
        jLabel3.setText("Email");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 51, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 152, 171, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(209, 107, 9));
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 117, 20));

        txtMobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileKeyReleased(evt);
            }
        });
        jPanel2.add(txtMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 206, 171, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(209, 107, 9));
        jLabel4.setText("Mobile Number");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        btnSignup.setBackground(new java.awt.Color(248, 179, 65));
        btnSignup.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(153, 0, 51));
        btnSignup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/signup2.png"))); // NOI18N
        btnSignup.setText("Sign Up");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 120, -1));

        btnlogin.setBackground(new java.awt.Color(252, 205, 165));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(124, 60, 13));
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/login.png"))); // NOI18N
        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        usercombo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Seller", " " }));
        usercombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usercomboActionPerformed(evt);
            }
        });
        jPanel2.add(usercombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 311, 171, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(209, 107, 9));
        jLabel7.setText("User type");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Already have an account");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 170, -1));

        txtpwd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 260, 171, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(115, 77, 1));
        jLabel1.setText("Sign Up");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 120, -1));

        btnClear.setBackground(new java.awt.Color(248, 179, 65));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        btnClear.setForeground(new java.awt.Color(102, 0, 0));
        btnClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dulma\\OneDrive\\Desktop\\cafe pic\\JFrame Cafe Image & Icon (1)\\Cafe Image & Icon\\images\\clear.png")); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 470, 590));

        jPanel3.setBackground(new java.awt.Color(57, 18, 4));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/cafe2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
     
         String name =txtName.getText();
          String email =txtEmail.getText();
           String mobileNumber =txtMobile.getText();
        String password = new String(txtpwd.getPassword());
        String role = (String) usercombo.getSelectedItem();
         if (!isValidName(name)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid name");
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address");
        } else if (!isValidMobileNumber(mobileNumber)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid mobile number (10 digits)");
        } else if (!isValidPassword(password)) {
            JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long");
        }
       else if (name.isEmpty() || email.isEmpty() || mobileNumber.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields");
        }
        else{
       try{ con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
          String sql = "INSERT INTO user (name, email, mobileNumber, password, role) VALUES (?, ?, ?, ?, ?)";
           PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, mobileNumber);
            statement.setString(4, password);
            statement.setString(5, role);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Signup successful");
               
                txtName.setText("");
                txtEmail.setText("");
               txtMobile.setText("");
              txtpwd.setText("");
            }
       }catch( SQLException Ex){
           JOptionPane.showMessageDialog(this, "Error: " + Ex.getMessage());
       }
    }//GEN-LAST:event_btnSignupActionPerformed
    }
    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtMobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMobileKeyReleased

    private void usercomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usercomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usercomboActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();

    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSignup;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtpwd;
    private javax.swing.JComboBox<String> usercombo;
    // End of variables declaration//GEN-END:variables
}
