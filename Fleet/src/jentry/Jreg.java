/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jentry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Phephisa
 */
public class Jreg extends javax.swing.JFrame {
        ArrayList<Journal> journallist;
    /**
     * Creates new form journal
     */
    public Jreg() {
        initComponents();
        journallist = new ArrayList<>();
        tableUpdate();
    }
    Connection con;        //myswl connection created
    PreparedStatement pst;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txttitle = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtcontents = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Journal Registration"));

        jLabel1.setText("ID");

        jLabel2.setText("Journal Date");

        jLabel3.setText("Journal Title");

        txttitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttitleActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Edit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel5.setText("Jounal Contents");

        txtcontents.setColumns(20);
        txtcontents.setRows(5);
        txtcontents.setLineWrap(true);
        txtcontents.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtcontents);

        jButton4.setText("BubbleSort");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Undo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("InsertionSort");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6)
                                .addGap(40, 40, 40))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton3)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Title", "Contents"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Table1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Journal Registration");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        int id = Integer.parseInt(txtid.getText());
        String jdate = txtdate.getText();
        String jtitle = txttitle.getText();
        String jcontents = txtcontents.getText();
       
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //sql driver
            //connectin to our databse 
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jentry?useSSL=false","root","");
             //SQL statement to input our values
             pst = con.prepareStatement("insert into journal(id, jdate, jtitle, jcontents)values(?,?,?,?)");
             //values ordeer on statement, field name in table
             pst.setInt(1, id);
             pst.setString(2, jdate);
             pst.setString(3, jtitle);
             pst.setString(4, jcontents);
            
             pst.executeUpdate();
             //messsage of success
                JOptionPane.showMessageDialog(this, "Journal Added Successfully...");
             
             //taking input from the form inputted by user
             txtid.setText("");
             txtdate.setText("");
             txttitle.setText("");
             txtcontents.setText("");
            
             tableUpdate();  //refreshing  table after record inputted
 
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Jreg.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
           DefaultTableModel d1 = (DefaultTableModel)Table1.getModel();
         int selectIndex = Table1.getSelectedRow();
         
         txtid.setText(d1.getValueAt(selectIndex, 0).toString());
         txtdate.setText(d1.getValueAt(selectIndex, 1).toString());
         txttitle.setText(d1.getValueAt(selectIndex, 2).toString());
        txtcontents.setText(d1.getValueAt(selectIndex, 3).toString());
        
        
        
        
    }//GEN-LAST:event_Table1MouseClicked
    //edit button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: 
        
        DefaultTableModel d1 = (DefaultTableModel) Table1.getModel();
        int selectedIndex = Table1.getSelectedRow();
            try {   
                
            int id = Integer.parseInt(d1.getValueAt(selectedIndex, 0).toString());
            String jdate =txtdate.getText();
            String jtitle =txttitle.getText();
           
            String jcontents =txtcontents.getText();

            
           
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jentry?useSSL=false","root","");
            pst = con.prepareStatement("update journal set jdate=?,jtitle=?,jcontents=? where id= ?");
            pst.setString(1,jdate);
            pst.setString(2,jtitle);
            pst.setString(3,jcontents);
            pst.setInt(4,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated");
            tableUpdate();
            
 
           
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Jreg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
          DefaultTableModel d1 = (DefaultTableModel) Table1.getModel();
            int selectedIndex = Table1.getSelectedRow();
            try {   
                
            String id = d1.getValueAt(selectedIndex, 0).toString();
      
            int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete the record","Warning",JOptionPane.YES_NO_OPTION);
           if(dialogResult == JOptionPane.YES_OPTION)
           {
           // Saving code here
                      
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jentry?useSSL=false","root","");
            pst = con.prepareStatement("delete from journal where id = ?");
            pst.setString(1,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted");
            tableUpdate();
           
           }
      
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Jreg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txttitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttitleActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     table();
     tableUpdate();
     ArrayList<Journal> arrOld = journallist;
     DefaultTableModel df = (DefaultTableModel)Table1.getModel();
            df.setRowCount(0);
     
     ArrayList<String> arrGen1 = new ArrayList();
        for (Journal obj: arrOld) {
            arrGen1.add(obj.getTitle());
        }
        arrGen1 = Algorithms.bubbleSort(arrGen1);
        ArrayList<Journal> arrGen3 = new ArrayList();
        for(String str: arrGen1){

            for(int i=0; i<arrOld.size();i++){
                if(str.equalsIgnoreCase(arrOld.get(i).getTitle())){

                    arrGen3.add(arrOld.get(i));

                    arrOld.remove(i);
                }
            }
        }
        //System.out.println(arrGen3);
        df.setRowCount(0);//reset data model
        for (int i = 0; i < arrGen3.size(); i++) {
            Object[] objs = {arrGen3.get(i).getId(), arrGen3.get(i).getDate(), arrGen3.get(i).getTitle(), arrGen3.get(i).getContents()};
            df.addRow(objs);
        }
     
     
     
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       //undo action to clear the contents
        tableUpdate();
        txtid.setText("");
        txtdate.setText("");
        txttitle.setText("");
        txtcontents.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
table();
     tableUpdate();
     ArrayList<Journal> arrOld = journallist;
     DefaultTableModel df = (DefaultTableModel)Table1.getModel();
            df.setRowCount(0);
     
     ArrayList<String> arrGen1 = new ArrayList();
        for (Journal obj: arrOld) {
            arrGen1.add(obj.getTitle());
        }
        arrGen1 = Algorithms.insertionSort(arrGen1);
        ArrayList<Journal> arrGen3 = new ArrayList();
        for(String str: arrGen1){

            for(int i=0; i<arrOld.size();i++){
                if(str.equalsIgnoreCase(arrOld.get(i).getTitle())){

                    arrGen3.add(arrOld.get(i));

                    arrOld.remove(i);
                }
            }
        }
        //System.out.println(arrGen3);
        df.setRowCount(0);//reset data model
        for (int i = 0; i < arrGen3.size(); i++) {
            Object[] objs = {arrGen3.get(i).getId(), arrGen3.get(i).getDate(), arrGen3.get(i).getTitle(), arrGen3.get(i).getContents()};
            df.addRow(objs);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(Jreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jreg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jreg().setVisible(true);
            }
        });
    }
    
    public ArrayList<Journal> getWork(){
    
    int c;
        ArrayList<Journal> arrList = new ArrayList<Journal>();
        try {
            Class.forName("com.mysql.jdbc.Driver"); //sql driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jentry?useSSL=false","root","");
            pst = con.prepareStatement("select * from journal");
            ResultSet Rs = pst.executeQuery();
            
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)Table1.getModel();
            df.setRowCount(0);
            
            
            while(Rs.next())
            {
               arrList.add(new Journal(Rs.getString("id"), Rs.getString("jdate"), Rs.getString("jtitle"), Rs.getString("jcontents")));
            
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Jreg.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return arrList;
    }
    
    public void table(){
    
        DefaultTableModel df = (DefaultTableModel)Table1.getModel();
            df.setRowCount(0);
            for (int i = 0; i < journallist.size(); i++) {
            Object[] objs = {journallist.get(i).getId(),journallist.get(i).getDate(),journallist.get(i).getTitle(),journallist.get(i).getContents()};
            df.addRow(objs);
    
    }
    }
    
    
    public void tableUpdate()
    {
    
        int c;
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //sql driver
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jentry?useSSL=false","root","");
            pst = con.prepareStatement("select * from journal");
            ResultSet Rs = pst.executeQuery();
            
            ResultSetMetaData rd = Rs.getMetaData();
            c = rd.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)Table1.getModel();
            df.setRowCount(0);
            
            
            while(Rs.next())
            {
                Vector v2 = new Vector();
                
                for(int i=1; i<=c; i++)
                {   
                    v2.add(Rs.getString("id"));
                    v2.add(Rs.getString("jdate"));
                    v2.add(Rs.getString("jtitle"));
                    v2.add(Rs.getString("jcontents"));
                    
                }
               
               df.addRow(v2);
            
            }
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Jreg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Jreg.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }
    
    
     
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtcontents;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables
}
