/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import java.awt.Desktop;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dulma
 */
public class receipt extends javax.swing.JFrame {Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
Statement st=null;
    /**
     * Creates new form cashier
     */
 

    /**
     * Creates new form receipt
     */
    public receipt() {
        initComponents();
        DisplayItems();
    }
       
      private void DisplayItems(){
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
        st=con.createStatement();
        rs=st.executeQuery("select * from bills");
      BillTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException e){
        
    }
}
private void openPDF(String pdfPath) {
    try {
        File pdfFile = new File(pdfPath);
        if (pdfFile.exists()) {
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(pdfFile);
            } else {
                JOptionPane.showMessageDialog(this, "Desktop is not supported");
            }
        } else {
            JOptionPane.showMessageDialog(this, "File does not exist");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        deletebtn = new javax.swing.JButton();
        lblproducts = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        sellinglbl = new javax.swing.JLabel();
        catlbl = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblcashier = new javax.swing.JLabel();
        billlbl = new javax.swing.JLabel();
        reportlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(57, 18, 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 229, 229));
        jLabel2.setText("View Bill Details");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 320, -1));

        jPanel2.setBackground(new java.awt.Color(246, 220, 215));
        jPanel2.setForeground(new java.awt.Color(255, 51, 51));
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentShown(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BillTable.setBackground(new java.awt.Color(246, 215, 195));
        BillTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "seller ID", "null", "Title 4", "Title 5", "Title 6"
            }
        ));
        BillTable.setRowHeight(60);
        BillTable.setSelectionBackground(new java.awt.Color(211, 153, 69));
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BillTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 1020, 490));

        deletebtn.setBackground(new java.awt.Color(255, 204, 51));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });
        jPanel2.add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 570, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 1260, 630));

        lblproducts.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblproducts.setForeground(new java.awt.Color(243, 229, 229));
        lblproducts.setText("Products");
        lblproducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblproductsMouseClicked(evt);
            }
        });
        jPanel1.add(lblproducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, -1));

        lblLogout.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(243, 229, 229));
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });
        jPanel1.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 120, -1));

        sellinglbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        sellinglbl.setForeground(new java.awt.Color(243, 229, 229));
        sellinglbl.setText("Billing");
        sellinglbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellinglblMouseClicked(evt);
            }
        });
        jPanel1.add(sellinglbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, -1));

        catlbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        catlbl.setForeground(new java.awt.Color(243, 229, 229));
        catlbl.setText("Categories");
        catlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catlblMouseClicked(evt);
            }
        });
        jPanel1.add(catlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/logout3.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 30, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/cafe 3.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 100, 80));

        lblcashier.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblcashier.setForeground(new java.awt.Color(243, 229, 229));
        lblcashier.setText("Cashier");
        lblcashier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcashierMouseClicked(evt);
            }
        });
        jPanel1.add(lblcashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 30));

        billlbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        billlbl.setForeground(new java.awt.Color(255, 204, 102));
        billlbl.setText("Bills");
        billlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billlblMouseClicked(evt);
            }
        });
        jPanel1.add(billlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, 30));

        reportlbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        reportlbl.setForeground(new java.awt.Color(243, 229, 229));
        reportlbl.setText("Sales Report");
        reportlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportlblMouseClicked(evt);
            }
        });
        jPanel1.add(reportlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
        // TODO add your handling code here:
         int selectedRow = BillTable.getSelectedRow();
    String billId = BillTable.getValueAt(selectedRow, 0).toString();

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "");
        String query = "SELECT pdfPath FROM bills WHERE BId = ?";
        pst = con.prepareStatement(query);
        pst.setString(1, billId);
        rs = pst.executeQuery();

        if (rs.next()) {
            String pdfPath = rs.getString("pdfPath");
            openPDF(pdfPath);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, e);
    }

    }//GEN-LAST:event_BillTableMouseClicked

    private void jPanel2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2ComponentShown

    private void lblproductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblproductsMouseClicked
        new Items().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblproductsMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void sellinglblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellinglblMouseClicked
        // TODO add your handling code here:
        new Billing().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sellinglblMouseClicked

    private void catlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_catlblMouseClicked

    private void lblcashierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcashierMouseClicked
        // TODO add your handling code here:
        new cashier().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcashierMouseClicked

    private void billlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billlblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_billlblMouseClicked

    private void reportlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportlblMouseClicked
        // TODO add your handling code here:
                new report().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportlblMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        int selectedRow = BillTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }

        String id = BillTable.getValueAt(selectedRow, 0).toString();
        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Bill?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "");
                String query = "DELETE FROM bills WHERE BId=?";
                pst = con.prepareStatement(query);
                pst.setString(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "User deleted successfully.");
                DisplayItems(); // Refresh the table
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_deletebtnMouseClicked

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
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JLabel billlbl;
    private javax.swing.JLabel catlbl;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblcashier;
    private javax.swing.JLabel lblproducts;
    private javax.swing.JLabel reportlbl;
    private javax.swing.JLabel sellinglbl;
    // End of variables declaration//GEN-END:variables
}
