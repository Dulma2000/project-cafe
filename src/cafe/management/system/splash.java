         /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafe.management.system;

/**
 *
 * @author Dulma
 */
public class splash extends javax.swing.JFrame {

    
    public splash() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        percentage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        myprogress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(57, 18, 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(246, 215, 208));
        jLabel6.setText("CAFE MANAGEMENT SYSTEM");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 340, -1));

        percentage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        percentage.setForeground(new java.awt.Color(255, 255, 255));
        percentage.setText("      %");
        jPanel2.add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cafe/management/system/cafe4.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 150, 220));

        myprogress.setBackground(new java.awt.Color(255, 102, 102));
        myprogress.setForeground(new java.awt.Color(79, 39, 29));
        jPanel2.add(myprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 570, 15));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 560, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    splash Mysplash=new splash();
    Mysplash.setVisible(true);
    try{
           for(int i=0; i<=100; i++ )
            {
                Thread.sleep(40);
                Mysplash.myprogress.setValue(i);
                Mysplash.percentage.setText(Integer.toString(i)+"%");
            }
            }    
            catch(Exception e){
                
                    
                    }
    new login().setVisible(true);
    Mysplash.dispose();
    
       
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar myprogress;
    private javax.swing.JLabel percentage;
    // End of variables declaration//GEN-END:variables
}
