package yadihar;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.sql.*;
import java.awt.HeadlessException;

/**
 *
 * @author ASUS
 */
public class receiver_po  extends javax.swing.JFrame {
    //private Object model;
 private DefaultTableModel model;
    
    private void kosongkan(){
    txtKode.setText("");
    txtNamaBarang.setText("");
    txtSatuan.setText("");
    txtQty.setText("");
    txtKeterangan.setText("");
}
     
   
    private void tampilkan_data(){ // 2 menampilkan data
      DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Kode");
    model.addColumn("Nama_Barang");
    model.addColumn("Satuan");
    model.addColumn("Qty_Rcv");
    model.addColumn("Keterangan");
    
    
    String cari = TexCari.getText();//membuat pungsi cari
    
    //menampilkan data dari database ke dalam tabel
    try{ //MEMBUAT VARIABEL NOMOR  ( memanggil data dari dtabase)
        int no = 1;  //untuk memberi nilai satu dan seterusnya
        String sql =("SELECT *FROM receiver_po WHERE Kode LIKE'%"+cari+"%'");  //menampilkan data dari database ke dalam tabel dam menampilkan pungsi cari "like" untuk menampilkan
        java.sql.Connection conn = (Connection)konfig.configDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet res = stm.executeQuery(sql);
        while(res.next()){
            //untuk menampilkan data dalam setiap kolom jtable
            model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5)});
         }
        jTable1.setModel(model);
        
    }catch (SQLException e){
        System.out.println("Error" + e.getMessage());
    }
    
    
    
    
    
    
      }
    public receiver_po(){
        initComponents();
        tampilkan_data();
        kosongkan();
       
    }
         

    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNamaBarang = new javax.swing.JTextField();
        txtSatuan = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtKeterangan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TBSimpan = new javax.swing.JButton();
        TBUbah = new javax.swing.JButton();
        TBHapus = new javax.swing.JButton();
        TBBatal = new javax.swing.JButton();
        TexCari = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        txtKode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penerimaan Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Satuan");

        jLabel4.setText("Qty Rcv");

        jLabel5.setText("Keterangan");

        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });

        txtSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSatuanActionPerformed(evt);
            }
        });

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        txtKeterangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeteranganActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        TBSimpan.setText("Simpan");
        TBSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBSimpanActionPerformed(evt);
            }
        });

        TBUbah.setText("Ubah");
        TBUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBUbahActionPerformed(evt);
            }
        });

        TBHapus.setText("Hapus");
        TBHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBHapusActionPerformed(evt);
            }
        });

        TBBatal.setText("Batal");
        TBBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBBatalActionPerformed(evt);
            }
        });

        TexCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexCariActionPerformed(evt);
            }
        });
        TexCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TexCariKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TexCariKeyTyped(evt);
            }
        });

        jButton2.setText("cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Kode");

        Exit.setText("Exie");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(TBSimpan))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)))))
                            .addGap(52, 52, 52)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TBUbah)
                                .addComponent(jButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(TBHapus)
                                    .addGap(53, 53, 53)
                                    .addComponent(TBBatal))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(TexCari, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(16, 16, 16)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Exit))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TBSimpan)
                    .addComponent(TBUbah)
                    .addComponent(TBHapus)
                    .addComponent(TBBatal))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TexCari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TBUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBUbahActionPerformed
         try{
         String sql = "UPDATE receiver_po SET Kode ='"+txtKode.getText()+"',Nama_Barang='"+txtNamaBarang.getText()+"',Satuan='"+txtSatuan.getText()+"',Qty_Rcv='"+txtQty.getText() +"',Keterangan='"+txtKeterangan.getText()+"'WHERE Kode = '"+txtKode.getText()+"'";
         java.sql.Connection conn = (Connection)konfig.configDB();
         java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.execute();
           JOptionPane.showMessageDialog(null,"Edit Data Berhasil...");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan();
    
        
        
        
    }//GEN-LAST:event_TBUbahActionPerformed

    private void TBSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBSimpanActionPerformed
       // TODO add your handling code here:
        try{
            String  sql = "INSERT INTO receiver_po VALUES('"+txtKode.getText()+"','"+txtNamaBarang.getText()+"','"+txtSatuan.getText()+"','"+txtQty.getText()+"','"+txtKeterangan.getText()+"')";
            java.sql.Connection conn = (Connection)konfig.configDB();
   java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
   pstm.execute ();
   JOptionPane.showMessageDialog(null,"proses simpan data berhasil..");
      tampilkan_data();//memangil methode sebelumnya
      kosongkan();//memangil kosongkan form
   
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    
    }//GEN-LAST:event_TBSimpanActionPerformed

    private void TBHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBHapusActionPerformed
        // TODO add your handling code here:
         try{
            String sql = "DELETE FROM receiver_po WHERE Kode ='"+txtKode.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
         java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.execute();
           JOptionPane.showMessageDialog(null,"hapus Data Berhasil...");
        tampilkan_data();
        kosongkan();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }                                   
    }//GEN-LAST:event_TBHapusActionPerformed

    private void TBBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBBatalActionPerformed
        // TODO add your handling code here:
        kosongkan();
    }//GEN-LAST:event_TBBatalActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
              
        int baris = jTable1.rowAtPoint(evt.getPoint());
 
        String Kode = jTable1.getValueAt(baris, 0).toString();
        txtKode.setText(Kode);
        
        String Nama_Barang = jTable1.getValueAt(baris, 1).toString();
        txtNamaBarang.setText(Nama_Barang);
        
        String Satuan = jTable1.getValueAt(baris, 2).toString();
        txtSatuan.setText(Satuan);
        
        String Qty_Rcv= jTable1.getValueAt(baris, 3).toString();
        txtQty.setText(Qty_Rcv);
        
        String Keterang= jTable1.getValueAt(baris, 4).toString();
        txtKeterangan.setText(Keterang);
        
        
 
    }//GEN-LAST:event_jTable1MouseClicked

    private void TexCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexCariActionPerformed
   // TODO add your handling code here:
    }//GEN-LAST:event_TexCariActionPerformed

    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    private void txtSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSatuanActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtKeteranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeteranganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeteranganActionPerformed

    private void TexCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexCariKeyReleased
        // TODO add your handling code here:
       tampilkan_data();
    }//GEN-LAST:event_TexCariKeyReleased

    private void TexCariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TexCariKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TexCariKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        tampilkan_data();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed
    private void tcariKeyReleased(java.awt.event.KeyEvent evt) {                                  
        try {
            Connection c = konfig.getcofigDB();
            Statement s = c.createStatement();
      //String sql = ("select * from receiver_po where Kode like '%" +TexCari+ "%' ");
          
            String sql = "select * from receiver_po where Kode like '%" + TexCari.getText() + "%' or Nama_Barang like'%" + TexCari.getText() + "%' or Satuan like'%" + TexCari.getText() + "%' or Qty_Rcv like'%" + TexCari.getText() + "%' " + " or Keterangan like'%" + TexCari.getText() + "%' " + "";
            ResultSet r = s.executeQuery(sql);

          while (r.next()) {
                Object[] o = new Object[5];
                o[0] = r.getString("Kode");
                o[1] = r.getString("Nama_Barang");
                o[2] = r.getString("Satuan");
                o[3] = r.getString("Qty_Rcv");
                o[4] = r.getString("Keterangan");
             //  jTable1.addRow(o); 
           model.addRow(o);//menambahkan garis
            }
            r.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
    
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
            java.util.logging.Logger.getLogger(receiver_po.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receiver_po.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receiver_po.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receiver_po.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receiver_po().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton TBBatal;
    private javax.swing.JButton TBHapus;
    private javax.swing.JButton TBSimpan;
    private javax.swing.JButton TBUbah;
    private javax.swing.JTextField TexCari;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSatuan;
    // End of variables declaration//GEN-END:variables
}
