/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Dulma
 */
public class Billing extends javax.swing.JFrame {
Connection con=null;
PreparedStatement pst=null;
ResultSet rs=null;
Statement st=null;
    /**
     * Creates new form Billing
     */
String sellerName;

    public Billing(String sellerName) {
        initComponents();
        DisplayItems();
        ShowDate();
        GetCat();
        this.sellerName = sellerName;
        snamelbl.setText(sellerName); 
       
    }
    public Billing() {
        initComponents();
        DisplayItems();
        ShowDate();
        GetCat();
    }
  
int BId;
Statement St1=null;
ResultSet Rs1=null;

 public void Balance(){
      
        int total=Integer.parseInt(txttotal.getText());
        int pay=Integer.parseInt(txtpay.getText());
        
        int bal=pay-total;
        txtbalance.setText(String.valueOf(bal));
  }
  public void bill(){
     
        String total = txttotal.getText();
String pay = txtpay.getText();
String bal = txtbalance.getText();

DefaultTableModel model = (DefaultTableModel) billtbl.getModel();

txtbill.setText(txtbill.getText() + "*************************************************\n");
txtbill.setText(txtbill.getText() + "*                    Cafe                       *\n");
txtbill.setText(txtbill.getText() + "*************************************************\n");
txtbill.setText(txtbill.getText() + "Seller: " + sellerName + "\n");
    txtbill.setText(txtbill.getText() + "Date: " + datelbl.getText() + "\n"+"\n");
// Heading
txtbill.setText(txtbill.getText() + String.format("%-30s%-15s%-10s%-10s\n", "Product", "Price", "Quantity", "Amount"));
txtbill.setText(txtbill.getText() + "--------------------------------   ---------------\n");

for (int i = 0; i < model.getRowCount(); i++) {
    String pname = model.getValueAt(i, 1).toString();
    String price = model.getValueAt(i, 2).toString();
    String qty = model.getValueAt(i, 3).toString();
    String amount = model.getValueAt(i, 4).toString();

    txtbill.setText(txtbill.getText() + String.format("%-30s%-15s%-10s%-10s\n", pname, price, qty, amount));
}
txtbill.setText(txtbill.getText() + "\n");

txtbill.setText(txtbill.getText() + String.format("%-30s: %s\n", "Subtotal", total));
txtbill.setText(txtbill.getText() + String.format("%-30s: %s\n", "Pay", pay));
txtbill.setText(txtbill.getText() + String.format("%-30s: %s\n", "Balance", bal));

txtbill.setText(txtbill.getText() + "****************************************************\n");
txtbill.setText(txtbill.getText() + "*             THANK YOU COME AGAIN!                *\n");
txtbill.setText(txtbill.getText() + "****************************************************\n");


          
       
  }
  
    
private void CountBills(){
   try{
       St1=con.createStatement();
       Rs1=St1.executeQuery("select  Max(BId) from bills");
       Rs1.next();
       BId=Rs1.getInt(1)+1;
   } catch(SQLException ex){
       
   }
}
     private void InsertBills(){
             try {
        CountBills();
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe", "root", "");

        StringBuilder productDetails = new StringBuilder();
        DefaultTableModel model = (DefaultTableModel) billtbl.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            String pname = model.getValueAt(i, 1).toString();
            String qty = model.getValueAt(i, 3).toString();
            String amount = model.getValueAt(i, 4).toString();

            productDetails.append(pname).append(" (Qty: ").append(qty).append(", Amount: ").append(amount).append(")");

            if (i < model.getRowCount() - 1) {
                productDetails.append(", ");
            }
        }
  String pdfFilePath = "C:\\BILLS\\" + BId + ".pdf";
        // Debugging: Print out the productDetails before saving
        System.out.println("Product Details: " + productDetails.toString());

        PreparedStatement Save = con.prepareStatement("INSERT INTO bills (BId, sid, sname, BillDate, BAmt, products,pdfPath) VALUES (?, ?, ?, ?, ?, ?,?)");
        Save.setInt(1, BId);
        Save.setInt(2, 1); // Assuming sid is 1; modify as necessary
        Save.setString(3, sellerName);
        Save.setString(4, datelbl.getText());
        Save.setInt(5, GrdTotal);
        Save.setString(6, productDetails.toString());
        Save.setString(7, pdfFilePath); 

        int row = Save.executeUpdate();
        JOptionPane.showMessageDialog(this, "Bill Added");
        con.close();
    } catch (SQLException Ex) {
        JOptionPane.showMessageDialog(this, Ex);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton();
        btnprint = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        protable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        datelbl = new javax.swing.JLabel();
        snamelbl = new javax.swing.JLabel();
        snamelbl1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        billtbl = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpay = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        billbtn = new javax.swing.JButton();
        txtcat = new javax.swing.JComboBox<>();
        btnrefresh = new javax.swing.JButton();
        filterbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblCat = new javax.swing.JLabel();
        lblCat2 = new javax.swing.JLabel();
        lblcashier = new javax.swing.JLabel();
        lblcat1 = new javax.swing.JLabel();
        Billslbl = new javax.swing.JLabel();
        reportlbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 18, 4));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 229, 229));
        jLabel1.setText("Billing Products");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 260, 40));

        jPanel2.setBackground(new java.awt.Color(246, 220, 215));
        jPanel2.setForeground(new java.awt.Color(144, 18, 18));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Balance");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Price");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 56, 20));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txtName.setForeground(new java.awt.Color(144, 18, 18));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 240, -1));

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(144, 18, 18));
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 240, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 20));

        txtQty.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txtQty.setForeground(new java.awt.Color(144, 18, 18));
        jPanel2.add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 240, -1));

        addbtn.setBackground(new java.awt.Color(252, 206, 137));
        addbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addbtn.setText("Add to bill");
        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
        });
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });
        jPanel2.add(addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        btnprint.setBackground(new java.awt.Color(255, 204, 0));
        btnprint.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnprint.setText("Print");
        btnprint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprintMouseClicked(evt);
            }
        });
        jPanel2.add(btnprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, -1));

        btnclear.setBackground(new java.awt.Color(255, 204, 0));
        btnclear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnclear.setText("Clear");
        btnclear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnclearMouseClicked(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, -1, -1));

        protable1.setBackground(new java.awt.Color(246, 215, 195));
        protable1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        protable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        protable1.setGridColor(new java.awt.Color(249, 200, 164));
        protable1.setRowHeight(26);
        protable1.setSelectionBackground(new java.awt.Color(211, 153, 69));
        protable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                protable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(protable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 610, 180));

        txtbill.setColumns(20);
        txtbill.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtbill.setRows(5);
        jScrollPane2.setViewportView(txtbill);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 340, 410, 330));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 102, 0));
        jLabel5.setText("Products Stocks");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 190, 30));

        datelbl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        datelbl.setForeground(new java.awt.Color(153, 51, 0));
        datelbl.setText("Date");
        jPanel2.add(datelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 150, -1));

        snamelbl.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        snamelbl.setForeground(new java.awt.Color(204, 0, 0));
        snamelbl.setText("Seller name");
        jPanel2.add(snamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 170, -1));

        snamelbl1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        snamelbl1.setForeground(new java.awt.Color(153, 0, 51));
        snamelbl1.setText("Seller name:");
        jPanel2.add(snamelbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, -1));

        billtbl.setBackground(new java.awt.Color(246, 215, 195));
        billtbl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        billtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Total"
            }
        ));
        billtbl.setRowHeight(25);
        billtbl.setSelectionBackground(new java.awt.Color(211, 153, 69));
        jScrollPane3.setViewportView(billtbl);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 670, 210));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Total");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 58, 20));

        txttotal.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txttotal.setForeground(new java.awt.Color(144, 18, 18));
        jPanel2.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 150, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Name");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 58, 20));

        txtpay.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txtpay.setForeground(new java.awt.Color(144, 18, 18));
        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });
        jPanel2.add(txtpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Pay");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 58, -1));

        txtbalance.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        txtbalance.setForeground(new java.awt.Color(144, 18, 18));
        jPanel2.add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 150, -1));

        billbtn.setBackground(new java.awt.Color(255, 204, 0));
        billbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        billbtn.setText("Bill");
        billbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                billbtnMouseClicked(evt);
            }
        });
        billbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billbtnActionPerformed(evt);
            }
        });
        jPanel2.add(billbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, 30));

        txtcat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcatMouseClicked(evt);
            }
        });
        jPanel2.add(txtcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 160, -1));

        btnrefresh.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnrefreshMouseClicked(evt);
            }
        });
        jPanel2.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 60, 100, -1));

        filterbtn.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        filterbtn.setText("Filter");
        filterbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterbtnMouseClicked(evt);
            }
        });
        jPanel2.add(filterbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 1350, 700));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 229, 229));
        jLabel6.setText("Logout");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/logout3.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/cafe 3.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 80));

        lblCat.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblCat.setForeground(new java.awt.Color(243, 229, 229));
        lblCat.setText("Categories");
        lblCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCatMouseClicked(evt);
            }
        });
        jPanel1.add(lblCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        lblCat2.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblCat2.setForeground(new java.awt.Color(243, 229, 229));
        lblCat2.setText("Products");
        lblCat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCat2MouseClicked(evt);
            }
        });
        jPanel1.add(lblCat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        lblcashier.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblcashier.setForeground(new java.awt.Color(243, 229, 229));
        lblcashier.setText("Cashier");
        lblcashier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcashierMouseClicked(evt);
            }
        });
        jPanel1.add(lblcashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 30));

        lblcat1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblcat1.setForeground(new java.awt.Color(232, 201, 119));
        lblcat1.setText("Billing");
        lblcat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcat1MouseClicked(evt);
            }
        });
        jPanel1.add(lblcat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        Billslbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        Billslbl.setForeground(new java.awt.Color(243, 229, 229));
        Billslbl.setText("Bills");
        Billslbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillslblMouseClicked(evt);
            }
        });
        jPanel1.add(Billslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 30));

        reportlbl.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        reportlbl.setForeground(new java.awt.Color(243, 229, 229));
        reportlbl.setText("Sales Report");
        reportlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportlblMouseClicked(evt);
            }
        });
        jPanel1.add(reportlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1710, 850));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
   
    private void UpdateQty(){
      try{
          int newQty=AvailQty-Integer.parseInt(txtQty.getText());
          String UpdateQuery="update product set Pquantity=? where Pid=?";
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
          PreparedStatement Ps=con.prepareStatement(UpdateQuery);
          Ps.setInt(1, newQty);
          Ps.setInt(2, Key);
          
          if(Ps.executeUpdate()==1){
              DisplayItems();
              JOptionPane.showMessageDialog(this, "Item Added");
              //Clear();
          }
      }catch(HeadlessException | NumberFormatException | SQLException e){
          JOptionPane.showMessageDialog(this,e);
      }
  }
    
    private void Filter(){
          try{
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
        st=con.createStatement();
        rs=st.executeQuery("select*from product where category='"+txtcat.getSelectedItem().toString()+"'"); 
        protable1.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException e){
        
    }
        
    }
    private void DisplayItems(){
    try{
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
        st=con.createStatement();
        rs=st.executeQuery("select * from product");
      protable1.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException e){
        
    }
}
private void ShowDate(){
    Date d=new Date();
    SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
    datelbl.setText(s.format(d));
}

private void GetCat(){
    try{
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
         st=con.createStatement();
         String query="select*from category";
         rs=st.executeQuery(query);
         while(rs.next())
         {
             String MyCat=rs.getString("name");
             txtcat.addItem(MyCat);
         }
    }catch(Exception e){
        e.printStackTrace();
    }
}
    
    int Key=0;
    int AvailQty;
    int i=0;
    int GrdTotal=0;
    private void protable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_protable1MouseClicked
    
        DefaultTableModel model=(DefaultTableModel)protable1.getModel();
        int MyIndex=protable1.getSelectedRow();
        Key=Integer.parseInt(model.getValueAt(MyIndex,0).toString());
        txtName.setText(model.getValueAt(MyIndex,1).toString());
        AvailQty=Integer.parseInt(model.getValueAt(MyIndex,2).toString());
       txtPrice.setText(model.getValueAt(MyIndex,3).toString());
    }//GEN-LAST:event_protable1MouseClicked

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked

                
       if(txtName.getText().isEmpty()||txtQty.getText().isEmpty()){
           JOptionPane.showMessageDialog(this,"Missing Information");
       }
       else if(AvailQty<Integer.parseInt(txtQty.getText())){
            JOptionPane.showMessageDialog(this,"Not Enough In Stock");
       }
       else{
          
           int Total=Integer.valueOf(txtPrice.getText())*Integer.valueOf(txtQty.getText());
           GrdTotal= GrdTotal+Total;
           txttotal.setText(String.valueOf(GrdTotal));
           
           
               DefaultTableModel model=(DefaultTableModel) billtbl.getModel();
               String nextRowId=Integer.toString(model.getRowCount());
               model.addRow(new Object[]{
                   Integer.parseInt(nextRowId)+1,
                   txtName.getText(),
                   txtPrice.getText(),
                   txtQty.getText(),
                    Total
               });
           
          
      
          
            
   
      
 UpdateQty();

 
          
           
       } 
        
    }//GEN-LAST:event_addbtnMouseClicked

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_addbtnActionPerformed
private void Clear(){
   txtbill.setText("");
   txtName.setText("");
   txtQty.setText("");
   i=0;
   txtPrice.setText("");

   txttotal.setText("");
   txtpay.setText("");
   txtbalance.setText("");
  GrdTotal = 0; // Reset the total
}
    private void btnclearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnclearMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) billtbl.getModel();
    model.setRowCount(0);
        Clear();
    }//GEN-LAST:event_btnclearMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new login().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    
     
    private void btnprintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprintMouseClicked
    try{
        txtbill.print();
        InsertBills();
    }catch(PrinterException e){
        JOptionPane.showMessageDialog(this, e);
    }
    }//GEN-LAST:event_btnprintMouseClicked

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
     
    }//GEN-LAST:event_txtpayActionPerformed

    private void billbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_billbtnMouseClicked
       
    }//GEN-LAST:event_billbtnMouseClicked

    private void billbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billbtnActionPerformed
  
         Balance();
         bill();
    }//GEN-LAST:event_billbtnActionPerformed

    private void txtcatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcatMouseClicked

       
        
    }//GEN-LAST:event_txtcatMouseClicked

    private void filterbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterbtnMouseClicked
        
  Filter();
    }//GEN-LAST:event_filterbtnMouseClicked

    private void btnrefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrefreshMouseClicked
       
        DisplayItems();
    }//GEN-LAST:event_btnrefreshMouseClicked

    private void lblCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatMouseClicked
        new manageCategory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCatMouseClicked

    private void lblCat2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCat2MouseClicked
        // TODO add your handling code here:
          new Items().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_lblCat2MouseClicked

    private void lblcashierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcashierMouseClicked
        // TODO add your handling code here:
        new cashier().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcashierMouseClicked

    private void lblcat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcat1MouseClicked
        // TODO add your handling code here:

        new Billing().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcat1MouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Billslbl;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton billbtn;
    private javax.swing.JTable billtbl;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnprint;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton filterbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCat;
    private javax.swing.JLabel lblCat2;
    private javax.swing.JLabel lblcashier;
    private javax.swing.JLabel lblcat1;
    private javax.swing.JTable protable1;
    private javax.swing.JLabel reportlbl;
    private javax.swing.JLabel snamelbl;
    private javax.swing.JLabel snamelbl1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JComboBox<String> txtcat;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
