package yadihar;
import java.awt.event.KeyEvent;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class karyawan extends javax.swing.JFrame {
private void kosongkan_form(){// 1 kosongkan form (membuat prosedur)
    txtNik.setEditable(true); // ??
    txtNik.setText(null);
    txtNama.setText(null);
    cbJabatan.setSelectedItem(null);
    txtAlamat.setText(null);
    txtEmail.setText(null);
    txtTelp.setText(null);
    }
private void tampilkan_data(){ // 2 menampilkan data pada tiap bootom
    TBtambah.setEnabled(false);
    TBsimpan.setEnabled(true);
    TBedit.setEnabled(false);
    TBhapus.setEnabled(false);
  //  TBbatal.setEnabled(true);
    TBkeluar.setEnabled(false);
      
    //memberi nama pada tiap kolom tabel
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("txtNo");
    model.addColumn("Nik");
    model.addColumn("Nama Karyawan");
    model.addColumn("Jabatan");
    model.addColumn("Alamat");
    model.addColumn("Email");
    model.addColumn("Telp");
    
    String cari = TexCari.getText();//membuat pungsi cari
    //menampilkan datadari database ke dalam tabel
    try{ //MEMBUAT VARIABEL NOMOR  ( memanggil data dari dtabase)
        int no = 1; // untuk memberi urutan nilai 1 dan seterusnya
        String sql ="SELECT *from Karyawan where nik like'%"+cari+"%'"; // cari dari string cari
        java.sql.Connection conn = (Connection)konfig.configDB();
        java.sql.Statement stm = conn.createStatement();
        java.sql.ResultSet res = stm.executeQuery(sql);
        while(res.next()){
            model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
         }
        tabelkaryawan.setModel(model);
        
    }catch (SQLException e){
        System.out.println("Error" + e.getMessage());
    } 
    
   
    
}
    /**
     * Creates new form karyawan
     */
    public karyawan() { //pemangilan (3)
        initComponents();
        tampilkan_data();
        kosongkan_form();
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
        txtNik = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelkaryawan = new javax.swing.JTable();
        TBtambah = new javax.swing.JButton();
        TBsimpan = new javax.swing.JButton();
        TBedit = new javax.swing.JButton();
        TBhapus = new javax.swing.JButton();
        TBbatal = new javax.swing.JButton();
        TBkeluar = new javax.swing.JButton();
        cbJabatan = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        TexCari = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("aplikasi data karyawan");
        setMaximumSize(new java.awt.Dimension(2147483, 2147483647));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DATA KARYAWAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 32, -1, -1));

        jLabel2.setText("Nik");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel3.setText("Nama Karyawan");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setText("Jabatan");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel7.setText("No telp");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        getContentPane().add(txtNik, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 145, -1));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 145, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 145, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 145, -1));
        getContentPane().add(txtTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 145, -1));

        tabelkaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelkaryawan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 494, 90));

        TBtambah.setText("Tamabah Data");
        TBtambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBtambahActionPerformed(evt);
            }
        });
        getContentPane().add(TBtambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        TBsimpan.setText("Simpan");
        TBsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(TBsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        TBedit.setText("Edit");
        TBedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBeditActionPerformed(evt);
            }
        });
        getContentPane().add(TBedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        TBhapus.setText("Hapus");
        TBhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBhapusActionPerformed(evt);
            }
        });
        getContentPane().add(TBhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        TBbatal.setText("Batal");
        TBbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBbatalActionPerformed(evt);
            }
        });
        getContentPane().add(TBbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, -1, -1));

        TBkeluar.setText("Keluar");
        TBkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(TBkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, -1, -1));

        cbJabatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IT Enginer", "database Administator", "kepala IT", "personalia" }));
        cbJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJabatanActionPerformed(evt);
            }
        });
        getContentPane().add(cbJabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 145, -1));

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, -1));
        getContentPane().add(TexCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 180, -1));

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TBkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_TBkeluarActionPerformed

    private void TBtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBtambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    TBtambah.setEnabled(false);
    TBsimpan.setEnabled(true);
    TBedit.setEnabled(false);
    TBhapus.setEnabled(false);
  //  TBbatal.setEnabled(true);
    TBkeluar.setEnabled(false);
   
        
    }//GEN-LAST:event_TBtambahActionPerformed

    private void TBsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBsimpanActionPerformed
        // TODO add your handling code here:
        try{
   String  sql = "INSERT INTO karyawan VALUES('"+txtNik.getText()+"','"+txtNama.getText()+"','"+cbJabatan.getSelectedItem()+"','"+txtAlamat.getText()+"','"+txtEmail.getText()+"','"+txtTelp.getText()+"')";
   java.sql.Connection conn = (Connection)konfig.configDB();
   java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
   pstm.execute ();
   JOptionPane.showMessageDialog(null,"proses simpan data berhasil..");
      tampilkan_data();//memangil methode sebelumnya
      kosongkan_form();//memangil kosongkan form
   
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_TBsimpanActionPerformed

    private void tabelkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkaryawanMouseClicked
     
    TBtambah.setEnabled(true);
    TBsimpan.setEnabled(false);
    TBedit.setEnabled(true);
    TBhapus.setEnabled(true);
   // TBbatal.setEnabled(true);
    TBkeluar.setEnabled(true);
            
txtNik.setEnabled(false);
        
// TODO add your handling code here:
        int baris = tabelkaryawan.rowAtPoint(evt.getPoint());
        
        String nik = tabelkaryawan.getValueAt(baris, 1).toString();
        txtNik.setText(nik);
        
        String nama = tabelkaryawan.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        
        String jab = tabelkaryawan.getValueAt(baris, 3).toString();
        cbJabatan.setSelectedItem(jab);
        
        String alamat= tabelkaryawan.getValueAt(baris, 4).toString();
        txtAlamat.setText(alamat);
        
        String email = tabelkaryawan.getValueAt(baris, 5).toString();
        txtEmail.setText(email);
        
        String telp = tabelkaryawan.getValueAt(baris, 6).toString();
         txtTelp.setText(telp);
        
    }//GEN-LAST:event_tabelkaryawanMouseClicked

    private void TBeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBeditActionPerformed
        // TODO add your handling code here:
        try{
         String sql = "UPDATE karyawan SET nik ='"+txtNik.getText()+"',nama='"+txtNama.getText()+"',jabatan='"+cbJabatan.getSelectedItem()+"',alamat='"+txtAlamat.getText()+"',email='"+txtEmail.getText()+"',no_telp='"+txtTelp.getText()+"'WHERE nik = '"+txtNik.getText()+"'";
         java.sql.Connection conn = (Connection)konfig.configDB();
         java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.execute();
           JOptionPane.showMessageDialog(null,"Edit Data Berhasil...");
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_TBeditActionPerformed

    private void TBhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBhapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM karyawan WHERE nik='"+txtNik.getText()+"'";
            java.sql.Connection conn = (Connection)konfig.configDB();
         java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
         pstm.execute();
           JOptionPane.showMessageDialog(null,"hapus Data Berhasil...");
        
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();//untuk menampilkan 
        kosongkan_form();
    }//GEN-LAST:event_TBhapusActionPerformed

    private void TBbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBbatalActionPerformed
        // TODO add your handling code here:
         TBtambah.setEnabled(false);
    TBsimpan.setEnabled(true);
    TBedit.setEnabled(false);
    TBhapus.setEnabled(false);
  //  TBbatal.setEnabled(true);
    TBkeluar.setEnabled(false);
   
        kosongkan_form();
    }//GEN-LAST:event_TBbatalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tampilkan_data();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJabatanActionPerformed

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
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TBbatal;
    private javax.swing.JButton TBedit;
    private javax.swing.JButton TBhapus;
    private javax.swing.JButton TBkeluar;
    private javax.swing.JButton TBsimpan;
    private javax.swing.JButton TBtambah;
    private javax.swing.JTextField TexCari;
    private javax.swing.JComboBox cbJabatan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelkaryawan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
