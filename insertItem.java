package BlackMarket;

import java.sql.*;
import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import net.proteanit.sql.DbUtils;
import javax.swing.JFileChooser;
 import java.awt.*;
import java.awt.event.KeyEvent;

public class insertItem extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form insertItem
     */
    public insertItem() {
        initComponents();
        conn = javaconnect.ConnecrDb();
        Update_table();
    }
private void Update_table(){
    
    try{
    String sql = "select ItemNumber, Name, Description, Qty, Price, Category from Inventory";
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
    table_inventory.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(Exception e ){
    JOptionPane.showMessageDialog(null,e);    
    } finally {
   try{
        rs.close();
        pst.close();    
    } catch (Exception e){
    }           
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        price = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        categoryBox = new javax.swing.JComboBox();
        addItem = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        add_image = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_inventory = new javax.swing.JTable();
        txt_attach = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        item_numb = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        manageCustomers = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setText("The Market");

        jLabel2.setText("Add Items");

        jLabel3.setText("Item Name:");

        jLabel4.setText("Description:");

        jLabel5.setText("Category:");

        jLabel6.setText("Price:");

        jLabel7.setText("Quantity:");

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane1.setViewportView(desc);

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weapons", "Body Parts", "Drugs", "Bootlegs", "Exotic Animals" }));

        addItem.setText("Add Item");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        add_image.setText("Add Image");
        add_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_imageActionPerformed(evt);
            }
        });

        table_inventory.setModel(new javax.swing.table.DefaultTableModel(
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
        table_inventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_inventoryMouseClicked(evt);
            }
        });
        table_inventory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                table_inventoryKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(table_inventory);

        edit.setText("UPDATE");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jLabel8.setText("Item # :");

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        manageCustomers.setText("Manage Customers");
        manageCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomersActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jButton1.setText("Employee Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(item_numb, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                        .addComponent(stock)
                                        .addComponent(price)
                                        .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_attach)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addItem)
                                .addComponent(add_image))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(manageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(image)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logout))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(image))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item_numb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_image)
                            .addComponent(txt_attach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addItem)
                            .addComponent(reset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manageCustomers)
                            .addComponent(edit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(delete))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        // TODO add your handling code here:
         //_category = category.getText();
        
        String selection;
        selection = (String) categoryBox.getSelectedItem();
        
        
            try {
                    String sql ="Insert into Inventory (ItemNumber, Name,Description,Qty,Price,Image,Category) values(?,?,?,?,?,?,?) ";
                    //String sql ="Insert into Inventory (Name,Price,Description,Category,Qty, Image) values(?,?,?,?,?,?) ";   
                    conn = javaconnect.ConnecrDb();
                    pst = conn.prepareStatement(sql);
                    pst.setString(2, name.getText());
                    pst.setString(5, price.getText());
                    pst.setString(3, desc.getText());
                    pst.setString(7, selection);
                    pst.setString(4, stock.getText());
                    pst.setString(1, item_numb.getText());
        
                    pst.setBytes(6, person_image);
        
                    pst.execute();
        
                    JOptionPane.showMessageDialog(null, "Item Added");
                    name.setText("");
                    price.setText("");
                    desc.setText("");
                    stock.setText("");
                    txt_attach.setText("");
                    
                    //pst.close();
                    //conn.close();
                    
                } catch ( Exception e ) {
                        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                        System.exit(0);
                    }
            Update_table();
    }//GEN-LAST:event_addItemActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        name.setText("");
        price.setText("");
        desc.setText("");
        stock.setText("");
        item_numb.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void add_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_imageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        txt_attach.setText(filename);
        
        try{
            
            File image= new File (filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum= fis.read(buf))!=-1;){
                
            bos.write(buf,0,readNum);         
            }
           person_image=bos.toByteArray(); 
            
        }
        catch(Exception e){
            
          JOptionPane.showMessageDialog(null,e);   
        }
    }//GEN-LAST:event_add_imageActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         try{
            String value1 = name.getText();
            String value2 = price.getText();
            String value3 = stock.getText();
            String value4 = desc.getText();
            String value5 = item_numb.getText();
            
            String sql = "update Inventory set Name = '"+value1+"',Price='"+value2+"',Description='"+value4+"',Qty='"+value3+"' where ItemNumber='"+value5+"'" ;
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "updated");
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }finally {
        
   try{
        rs.close();
        pst.close();
        //conn.close();
        
    } catch (Exception e){
           
         }    
    }
        Update_table();
    }//GEN-LAST:event_editActionPerformed

    private void table_inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_inventoryMouseClicked
        // TODO add your handling code here:
        int row = table_inventory.getSelectedRow();
         String Table_click =(table_inventory.getModel().getValueAt(row, 0).toString()); 
        
        try{
          String sql = "select Image from Inventory where ItemNumber ='"+Table_click+"'";  
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                byte[]imagedata = rs.getBytes("Image");
                format = new ImageIcon(imagedata);
                jLabel9.setIcon(format);
                
                
            }
        }catch(Exception e){
            
         e.printStackTrace();   
        }finally {
        
   try{
        rs.close();
        pst.close();   
    } catch (Exception e){       
    }   
    }      
        try{
         String sql = "select * from Inventory where ItemNumber='"+Table_click+"' ";
         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery();
         if(rs.next()){
             
             String add1 = rs.getString("ItemNumber");
             item_numb.setText(add1);
             
             String add2 = rs.getString("Name");
             name.setText(add2);
             
             String add3 = rs.getString("Price");
             price.setText(add3);
             
             String add4 = rs.getString("Description");
             desc.setText(add4);
             
             String add5 = rs.getString("Qty");
             stock.setText(add5);                       
         }   
        }catch(Exception e){         
       JOptionPane.showMessageDialog(null,e);    
        }finally {
   try{
        rs.close();
        pst.close();     
    } catch (Exception e){
   }            
    }
    }//GEN-LAST:event_table_inventoryMouseClicked

    private void table_inventoryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_inventoryKeyReleased
        // TODO add your handling code here:
         if(evt.getKeyCode()==KeyEvent.VK_DOWN||evt.getKeyCode()==KeyEvent.VK_UP){
            
            try{
         int row = table_inventory.getSelectedRow();
         String Table_click =(table_inventory.getModel().getValueAt(row, 0).toString()); 
          
         String sql = "select * from Inventory where ItemNumber='"+Table_click+"' ";
         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery();
         if(rs.next()){
             
             String add1 = rs.getString("ItemNumber");
             item_numb.setText(add1);
             
             String add2 = rs.getString("Name");
             name.setText(add2);
             
             String add3 = rs.getString("Price");
             price.setText(add3);
             
             String add4 = rs.getString("Description");
             desc.setText(add4);
             
             String add5 = rs.getString("Qty");
             stock.setText(add5);             
           
             
         }   
        }catch(Exception e){
       JOptionPane.showMessageDialog(null,e);    
        } finally {  
   try{
        rs.close();
        pst.close();    
    } catch (Exception e){      
    }       
    }         
        }
    }//GEN-LAST:event_table_inventoryKeyReleased
//Delete and clear fields.
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int p = JOptionPane.showConfirmDialog(null,"Do you want to Delete item","Delete Item",JOptionPane.YES_NO_OPTION );
        if(p==0){
        String sql = "delete from Inventory where Name=?";
        
        try{
            
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, name.getText());
            
            pst.execute();
            
            name.setText("");
            price.setText("");
            desc.setText("");
            stock.setText("");
            txt_attach.setText("");
            item_numb.setText("");
            
            JOptionPane.showMessageDialog(null, "Deleted");
            
            
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
        }finally {
        
   try{
        rs.close();
        pst.close();
    } catch (Exception e){      
    }    
        }
        Update_table();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void manageCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomersActionPerformed
        // TODO add your handling code here:
        viewCustomer regFace = new viewCustomer();
                    regFace.setVisible(true);
                    dispose();
    }//GEN-LAST:event_manageCustomersActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        
        //change the viewCustomer to the main login page
        
        Login regFace = new Login();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Employee_info regFace = new Employee_info();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(insertItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItem;
    private javax.swing.JButton add_image;
    private javax.swing.JComboBox categoryBox;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea desc;
    private javax.swing.JButton edit;
    private javax.swing.JLabel image;
    private javax.swing.JTextField item_numb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JButton manageCustomers;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JButton reset;
    private javax.swing.JTextField stock;
    private javax.swing.JTable table_inventory;
    private javax.swing.JTextField txt_attach;
    // End of variables declaration//GEN-END:variables

    private ImageIcon format = null;
String filename=null;
int s=0;
byte[] person_image=null;
}