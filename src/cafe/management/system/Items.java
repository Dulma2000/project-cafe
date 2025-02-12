/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import dao.CategoryDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dulma
 */
public class Items extends javax.swing.JFrame {
Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
Statement st=null;

    /**
     * Creates new form Items
     */

    public Items() {
        initComponents();
        DisplayItems();
        
    }
    
private void DisplayItems(){
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
        st=con.createStatement();
        rs=st.executeQuery("select*from product");
      proTable.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException e){
        
    }
}

private void Clear(){
   
     txtId.setText("");
     txtname.setText("");
     txtprice.setText("");
     txtqty.setText("");
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCat = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        proTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnclear = new javax.swing.JButton();
        lblLout = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        lblcat1 = new javax.swing.JLabel();
        lblCat2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblcashier = new javax.swing.JLabel();
        Billslbl = new javax.swing.JLabel();
        reportlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(57, 18, 4));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(246, 220, 215));
        jPanel2.setForeground(new java.awt.Color(206, 126, 25));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(211, 126, 19));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(192, 92, 18));
        jLabel2.setText("Id");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 40, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtname.setForeground(new java.awt.Color(101, 76, 10));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 240, -1));

        jLabel3.setBackground(new java.awt.Color(211, 126, 19));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(192, 92, 18));
        jLabel3.setText("Quantity");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, -1, -1));

        txtqty.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtqty.setForeground(new java.awt.Color(101, 76, 10));
        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });
        jPanel2.add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, 240, -1));

        jLabel4.setBackground(new java.awt.Color(211, 126, 19));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(192, 92, 18));
        jLabel4.setText("Price");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        txtprice.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtprice.setForeground(new java.awt.Color(101, 76, 10));
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        jPanel2.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 240, -1));

        jLabel5.setBackground(new java.awt.Color(211, 126, 19));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(192, 92, 18));
        jLabel5.setText("Categories");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 110, -1));

        txtCat.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatActionPerformed(evt);
            }
        });
        jPanel2.add(txtCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 240, -1));

        proTable.setBackground(new java.awt.Color(246, 215, 195));
        proTable.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        proTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product name", "Quantity", "Price"
            }
        ));
        proTable.setRowHeight(25);
        proTable.setSelectionBackground(new java.awt.Color(211, 153, 69));
        proTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(proTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 1100, 260));

        AddBtn.setBackground(new java.awt.Color(239, 196, 115));
        AddBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(40, 10, 10));
        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 110, 30));

        EditBtn.setBackground(new java.awt.Color(236, 189, 99));
        EditBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(40, 10, 10));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        jPanel2.add(EditBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 100, 30));

        btndelete.setBackground(new java.awt.Color(236, 189, 99));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(40, 10, 10));
        btndelete.setText("Delete");
        btndelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndeleteMouseClicked(evt);
            }
        });
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 280, 100, 30));

        jLabel6.setBackground(new java.awt.Color(211, 126, 19));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(192, 92, 18));
        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 80, -1));

        txtId.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txtId.setForeground(new java.awt.Color(101, 76, 10));
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 240, 30));

        btnclear.setBackground(new java.awt.Color(236, 189, 99));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnclear.setForeground(new java.awt.Color(40, 10, 10));
        btnclear.setText("Clear");
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 90, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 1210, 650));

        lblLout.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblLout.setForeground(new java.awt.Color(243, 229, 229));
        lblLout.setText("Logout");
        lblLout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoutMouseClicked(evt);
            }
        });
        jPanel1.add(lblLout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 90, 30));

        lblCat.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblCat.setForeground(new java.awt.Color(243, 229, 229));
        lblCat.setText("Categories");
        lblCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCatMouseClicked(evt);
            }
        });
        jPanel1.add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, 30));

        lblcat1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblcat1.setForeground(new java.awt.Color(243, 229, 229));
        lblcat1.setText("Billing");
        lblcat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcat1MouseClicked(evt);
            }
        });
        jPanel1.add(lblcat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, 30));

        lblCat2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblCat2.setForeground(new java.awt.Color(232, 201, 119));
        lblCat2.setText("Products");
        lblCat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCat2MouseClicked(evt);
            }
        });
        jPanel1.add(lblCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 229, 229));
        jLabel1.setText("Manage Products");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 330, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/cafe 3.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/logout3.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 30, 50));

        lblcashier.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblcashier.setForeground(new java.awt.Color(243, 229, 229));
        lblcashier.setText("Cashier");
        lblcashier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcashierMouseClicked(evt);
            }
        });
        jPanel1.add(lblcashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 30));

        Billslbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Billslbl.setForeground(new java.awt.Color(243, 229, 229));
        Billslbl.setText("Bills");
        Billslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillslblMouseClicked(evt);
            }
        });
        jPanel1.add(Billslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, 30));

        reportlbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        reportlbl.setForeground(new java.awt.Color(243, 229, 229));
        reportlbl.setText("Sales Report");
        reportlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportlblMouseClicked(evt);
            }
        });
        jPanel1.add(reportlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1502, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ArrayList<Category>list=CategoryDao.getAllRecords();
        Iterator<Category> itr=list.iterator();
        while(itr.hasNext()){
            Category categoryObj=itr.next();
            txtCat.addItem(categoryObj.getName());
        }
    }//GEN-LAST:event_formComponentShown

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        if(txtname.getText().isEmpty()|| txtprice.getText().isEmpty()|| txtCat.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this,"Missing Information");
            
        }else{
            try{
                 PreparedStatement getNextID = con.prepareStatement("SELECT MAX(Pid) + 1 FROM product");
    ResultSet rs = getNextID.executeQuery();
    int nextID = 1; 
    if (rs.next()) {
        nextID = rs.getInt(1);
    }
    
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
              PreparedStatement Save=con.prepareStatement("insert into product values(?,?,?,?,?)");
              Save.setInt(1, nextID);
              Save.setString(2, txtname.getText());
              Save.setInt(3,Integer.parseInt(txtqty.getText()));
                String priceText = txtprice.getText().replace("Rs.", "");
                Save.setDouble(4, Double.parseDouble(priceText));
              
              Save.setString(5, txtCat.getSelectedItem().toString());
              int row =Save.executeUpdate();
              JOptionPane.showMessageDialog(this, "Item added");
              DisplayItems();
              con.close();
            }catch(SQLException Ex){
                JOptionPane.showMessageDialog(this, Ex);
            }
        }
    }//GEN-LAST:event_AddBtnActionPerformed
int Key=0;
    private void proTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)proTable.getModel();
        int MyIndex=proTable.getSelectedRow();
        Key=Integer.parseInt(model.getValueAt(MyIndex,0).toString());
         txtId.setText(model.getValueAt(MyIndex,0).toString());
        txtname.setText(model.getValueAt(MyIndex,1).toString());
        txtqty.setText(model.getValueAt(MyIndex,2).toString());
        txtprice.setText(model.getValueAt(MyIndex,3).toString());
        txtCat.setSelectedItem(model.getValueAt(MyIndex,4).toString());
        
    }//GEN-LAST:event_proTableMouseClicked

    private void btndeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndeleteMouseClicked
        // TODO add your handling code here:
        if(Key==0){
            JOptionPane.showMessageDialog(this,"Select the Item");
        }else{
            try{
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
             String Query="Delete from product where Pid="+Key;
             Statement Del=con.createStatement();
             Del.executeUpdate(Query);
             JOptionPane.showMessageDialog(this, "Iteem Deleted");
              DisplayItems();
              Clear();
             
                
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_btndeleteMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
                 
              
    }//GEN-LAST:event_btndeleteActionPerformed

    private void lblCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatMouseClicked
          new manageCategory().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_lblCatMouseClicked

    private void lblLoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoutMouseClicked
       
          new login().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_lblLoutMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
 if(txtname.getText().isEmpty()|| txtqty.getText().isEmpty()|| txtprice.getText().isEmpty()){
     JOptionPane.showMessageDialog(this,"Missing Information");
 }
 else{
 try{
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
         String Query="update product set Pname='"+txtname.getText()+"'"+",Pquantity="+txtqty.getText()+""+",Price='"+txtprice.getText()+"'"+",category='"+txtCat.getSelectedItem().toString()+"'"+"where Pid="+txtId.getText();
         Statement Add=con.createStatement();
         Add.executeUpdate(Query);
         JOptionPane.showMessageDialog(this, "Product updated");
        DisplayItems();
 }catch(SQLException e){
     e.printStackTrace();
 }
 }    
    }//GEN-LAST:event_EditBtnMouseClicked

    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_btnclearMouseClicked

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void lblcat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcat1MouseClicked
        // TODO add your handling code here:
        
          new Billing().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_lblcat1MouseClicked

    private void lblCat2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCat2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCat2MouseClicked

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCatActionPerformed

    private void lblcashierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcashierMouseClicked
        // TODO add your handling code here:
          new cashier().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_lblcashierMouseClicked

    private void BillslblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillslblMouseClicked
        // TODO add your handling code here:
        new receipt().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_BillslblMouseClicked

    private void reportlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportlblMouseClicked
        // TODO add your handling code here:
        new report().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportlblMouseClicked

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
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel Billslbl;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblCat2;
    private javax.swing.JLabel lblLout;
    private javax.swing.JLabel lblcashier;
    private javax.swing.JLabel lblcat1;
    private javax.swing.JTable proTable;
    private javax.swing.JLabel reportlbl;
    private javax.swing.JComboBox<String> txtCat;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtqty;
    // End of variables declaration//GEN-END:variables
}
