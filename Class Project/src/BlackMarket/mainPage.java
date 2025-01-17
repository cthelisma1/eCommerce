
package BlackMarket;

import java.sql.*;
import javax.swing.*;
import java.io.IOException;
import javax.swing.text.*;
import net.proteanit.sql.DbUtils;

public class mainPage extends javax.swing.JFrame {
    
    // used to connect to database
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    /**
     * Creates new form mainPage
     */
   
    //makes the program run on run
    public mainPage() {
        initComponents();
        conn = javaconnect.ConnecrDb();
        Update_table();
        
    }

   //update table that is used to update the table with information
    
  private void Update_table(){
    
      //image variable
      //ImageIcon icon = new ImageIcon("/Users/karlscales/Desktop/pic.gif"); 

        //picture.setIcon(icon);
    
        //try statement to query the database
        try{
    String sql = "select ItemNumber, Name, Description, Price, Category from Inventory";
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
    //table_inventory.setEnabled(false);
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
        categoryBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_inventory = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        picture = new javax.swing.JLabel();
        addCart = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        cart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setText("Welcome to The Market!! ");

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Weapons", "Body Parts", "Drugs", "Bootlegs", "Exotic Animals" }));
        categoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Item ID:");

        jLabel3.setText("Item Name:");

        jLabel4.setText("Description:");

        desc.setColumns(20);
        desc.setRows(5);
        desc.setWrapStyleWord(true);
        jScrollPane1.setViewportView(desc);

        jLabel5.setText("Price:");

        jLabel6.setText("Quantity");

        table_inventory.setAutoCreateRowSorter(true);
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
        jScrollPane2.setViewportView(table_inventory);

        searchButton.setText("Search Name");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        picture.setText("_");

        addCart.setText("Add To Cart");
        addCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        cart.setText("Shopping Cart");
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(269, 269, 269)
                                .addComponent(cart)
                                .addGap(18, 18, 18)
                                .addComponent(logout))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2)
                                .addGap(154, 154, 154)
                                .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton)))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel6))
                                .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(addCart)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 615, Short.MAX_VALUE)
                        .addComponent(picture)
                        .addGap(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout)
                    .addComponent(cart))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addCart)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(picture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //method used to see if the mouse is being clicked.
    private void table_inventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_inventoryMouseClicked
       if (evt.getClickCount() == 2){
           JTable target = (JTable)evt.getSource();
         int row = target.getSelectedRow();
         int column = target.getSelectedColumn();       
       }
       else{
        int row = table_inventory.getSelectedRow();
         String Table_click =(table_inventory.getModel().getValueAt(row, 0).toString()); 
        try{
          String sql = "select Image from Inventory where ItemNumber ='"+Table_click+"'";  
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                byte[]imagedata = rs.getBytes("Image");
                format = new ImageIcon(imagedata);
                picture.setIcon(format);
            }
        }catch(Exception e){
         e.printStackTrace();   
        }finally {
   try{
        rs.close();
        pst.close();
        //conn.close();
    } catch (Exception e){
    }     
    }
        try{       
         String sql = "select ItemNumber, Name, Description, Qty, Price, Category from Inventory where ItemNumber='"+Table_click+"' ";
         pst = conn.prepareStatement(sql);
         rs = pst.executeQuery();
         if(rs.next()){
             
             String add1 = rs.getString("ItemNumber");
             id.setText(add1);
             
             String add2 = rs.getString("Name");
             name.setText(add2);
             
             String add3 = rs.getString("Price");
             price.setText(add3);
             
             String add4 = rs.getString("Description");
             desc.setText(add4);
             
             String add5 = rs.getString("Qty");
             quantity.setText(add5);
             
             id.setEditable(false);
             name.setEditable(false);
             price.setEditable(false);
             desc.setEditable(false);
             quantity.setEditable(false);

         }   
        }catch(Exception e){
       JOptionPane.showMessageDialog(null,e);    
        }finally {
   try{
        rs.close();
        pst.close();
    } catch (Exception e){   
    }   }   }
    }//GEN-LAST:event_table_inventoryMouseClicked
    //method to add items to the shopping cart
    
    private void addCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartActionPerformed
        // TODO add your handling code here:
        String selection;
        selection = (String) categoryBox.getSelectedItem();
        
        
            try {
                    String sql2 = "Select Image from Inventory where ItemNumber =?";
                    
                    conn = javaconnect.ConnecrDb();
                    pst = conn.prepareStatement(sql2);
                    pst.setString(1, id.getText());
                    rs = pst.executeQuery();
                    
                    byte[] imagedata = rs.getBytes("Image");
                    byte[] image = imagedata;
                    
                    rs.close();
                    pst.close();
                    
                    String sql ="Insert into ShoppingCart (ItemNumber,Name,Description,Price,Qty, Image) values(?,?,?,?,?,?) ";   
                    conn = javaconnect.ConnecrDb();
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, id.getText());
                    pst.setString(2, name.getText());
                    pst.setString(3, desc.getText());
                    pst.setString(4, price.getText());
                    pst.setString(5, quantity.getText());
        
                    pst.setBytes(6, image);
        
                    pst.execute();
        
                    JOptionPane.showMessageDialog(null, "Item Added to cart");
                    name.setText("");
                    price.setText("");
                    desc.setText("");
                    id.setText("");
                    quantity.setText("");
                    
                    pst.close();
                    //conn.close();
                    
                    ShoppingCart regFace = new ShoppingCart();
                    regFace.setVisible(true);
                    dispose();
                } catch ( Exception e ) {
                        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                        System.exit(0);
                    }
            
    }//GEN-LAST:event_addCartActionPerformed

    //function to send to the shopping cart
    
    private void cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartActionPerformed
        // TODO add your handling code here:
        
        //just change the ShopppingCart to the actual shopping Cart
        
        ShoppingCart regFace = new ShoppingCart();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_cartActionPerformed

    //function to send back to login 
    
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        
        //just change the homeFrame variable to the login 
        
        Login regFace = new Login();
        regFace.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        try{
         String sql = "select * from Inventory where Name =? AND Category =?";   
         
         String selection;
         selection = (String) categoryBox.getSelectedItem();
         
         pst=conn.prepareStatement(sql);
         pst.setString(1, search.getText());
         pst.setString(2, selection);
        
         rs=pst.executeQuery();
         
         //table_inventory.setEnabled(false);
         
         
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
    }//GEN-LAST:event_searchButtonActionPerformed

    private void categoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBoxActionPerformed

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
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainPage().setVisible(true);
            }
        });
        
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCart;
    private javax.swing.JButton cart;
    private javax.swing.JComboBox categoryBox;
    private javax.swing.JTextArea desc;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JLabel picture;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table_inventory;
    // End of variables declaration//GEN-END:variables

    //extra variables for the image icon 
private ImageIcon format = null;
String filename=null;
int s=0;
byte[] person_image=null;
}
