package penitipankendaraan;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class frmMain extends javax.swing.JFrame {
    private String resi = "";
    private String nopol = "";
    private String kendaraan = "";
    private String tgl_masuk = "";
    private String tgl_keluar = "";
    private String hari = "";
    
    private String uname = "";
    
    private String total;
    
    public frmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tvUname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        etResi = new javax.swing.JTextField();
        tvValidation = new javax.swing.JLabel();
        etNopol = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etKendaraan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        etHari = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        etKeluar = new com.toedter.calendar.JDateChooser();
        etMasuk = new com.toedter.calendar.JDateChooser();
        valHari = new javax.swing.JLabel();
        valResi = new javax.swing.JLabel();
        valNopol = new javax.swing.JLabel();
        valKendaraan = new javax.swing.JLabel();
        valMasuk = new javax.swing.JLabel();
        valKeluar = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penitipan Kendaraan \"Barokah\" Bungurasih");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Cond", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"BAROKAH\"");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 80, 230, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>\n<p><b>Terminal Bungurasih</b></p>\n<p>Waru, Kabupaten Sidoarjo,<br>Jawa Timur 61256</p>\n</html>");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 400, 200, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sistem Informasi");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 30, 230, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Penitipan Kendaraan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 50, 230, 40);

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setLayout(null);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Selamat Datang,");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(30, 230, 190, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Selamat Datang,");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 10, 170, 20);

        tvUname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tvUname.setForeground(new java.awt.Color(255, 255, 255));
        tvUname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvUname.setText("No Session Available");
        jPanel3.add(tvUname);
        tvUname.setBounds(0, 20, 190, 30);

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(20, 50, 150, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 200, 190, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 230, 490);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jPanel2.add(etResi);
        etResi.setBounds(40, 130, 150, 30);

        tvValidation.setForeground(new java.awt.Color(255, 0, 0));
        tvValidation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvValidation.setText("Harap Lengkapi Data");
        jPanel2.add(tvValidation);
        tvValidation.setBounds(20, 290, 390, 20);
        jPanel2.add(etNopol);
        etNopol.setBounds(40, 180, 150, 30);

        jLabel3.setText("Nomor Polisi");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 160, 150, 20);
        jPanel2.add(etKendaraan);
        etKendaraan.setBounds(40, 230, 150, 30);

        jLabel8.setText("Jenis Kendaraan");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 210, 150, 20);

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));
        jPanel4.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Penitipan Kendaraan");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(0, 50, 230, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Input Data");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(0, 0, 430, 40);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 430, 40);

        jLabel13.setText("Tanggal Masuk");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(230, 110, 150, 20);

        jLabel14.setText("Tanggal Keluar");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(230, 160, 150, 20);
        jPanel2.add(etHari);
        etHari.setBounds(230, 230, 150, 30);

        jLabel15.setText("Total Hari");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(230, 210, 150, 20);
        jPanel2.add(etKeluar);
        etKeluar.setBounds(230, 180, 150, 30);
        jPanel2.add(etMasuk);
        etMasuk.setBounds(230, 130, 150, 30);

        valHari.setForeground(new java.awt.Color(255, 0, 0));
        valHari.setText("◄");
        jPanel2.add(valHari);
        valHari.setBounds(390, 230, 30, 30);

        valResi.setForeground(new java.awt.Color(255, 0, 0));
        valResi.setText("◄");
        jPanel2.add(valResi);
        valResi.setBounds(200, 130, 30, 30);

        valNopol.setForeground(new java.awt.Color(255, 0, 0));
        valNopol.setText("◄");
        jPanel2.add(valNopol);
        valNopol.setBounds(200, 180, 30, 30);

        valKendaraan.setForeground(new java.awt.Color(255, 0, 0));
        valKendaraan.setText("◄");
        jPanel2.add(valKendaraan);
        valKendaraan.setBounds(200, 230, 30, 30);

        valMasuk.setForeground(new java.awt.Color(255, 0, 0));
        valMasuk.setText("◄");
        jPanel2.add(valMasuk);
        valMasuk.setBounds(390, 130, 30, 30);

        valKeluar.setForeground(new java.awt.Color(255, 0, 0));
        valKeluar.setText("◄");
        jPanel2.add(valKeluar);
        valKeluar.setBounds(390, 180, 30, 30);

        jLabel19.setText("No Resi");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(40, 110, 150, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(240, 10, 430, 340);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));
        jPanel6.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Action");
        jPanel6.add(jLabel16);
        jLabel16.setBounds(0, 0, 430, 40);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(0, 0, 430, 40);

        Save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel5.add(Save);
        Save.setBounds(10, 50, 70, 30);

        Delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel5.add(Delete);
        Delete.setBounds(90, 50, 80, 30);

        Clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel5.add(Clear);
        Clear.setBounds(180, 50, 70, 30);

        Refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });
        jPanel5.add(Refresh);
        Refresh.setBounds(260, 50, 80, 30);

        Edit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel5.add(Edit);
        Edit.setBounds(350, 50, 70, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(240, 360, 430, 100);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", " Petugas", "No. Resi", "Nopol", "Kendaraan", "Tgl Masuk", "Tgl Keluar", "Tarif"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        jPanel7.add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 470, 390);

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));
        jPanel8.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Penitipan Kendaraan");
        jPanel8.add(jLabel17);
        jLabel17.setBounds(0, 50, 230, 40);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Preview Data");
        jPanel8.add(jLabel18);
        jLabel18.setBounds(0, 0, 490, 40);

        jPanel7.add(jPanel8);
        jPanel8.setBounds(0, 0, 490, 40);

        getContentPane().add(jPanel7);
        jPanel7.setBounds(680, 10, 490, 450);

        setSize(new java.awt.Dimension(1190, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here: ketika windows terbuka
        uname = frmLogin.uname;
        tvUname.setText(uname);
        tvValidation.setVisible(false);
        
        hideValidation();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new frmLogin().show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        
        if(inputTrue() == true){
            //Logcat kw
            System.out.println("Validasi benar");
            System.out.println("----------------------------------");
            
            
            tvValidation.setVisible(false);
            hideValidation();
            
            //Diitung dulu ya
            Integer intHari = Integer.valueOf(hari);
            Integer tareef = 3000;
            Integer tareefTotal = intHari*tareef;
            
            total = tareefTotal.toString();
            
            //Input start
            String SQLsave = "INSERT INTO tb_transaksi (resi,petugas,nopol,jns_kendaraan,tgl_masuk,tgl_keluar,tarif) "
                    + "VALUES('"+resi+"','"+uname+"','"+nopol+"','"+kendaraan+"','"+tgl_masuk+"','"+tgl_keluar+"','"+total+"')";
            int masok = DBConnection.execute(SQLsave);
            if (masok == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                //selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_DeleteActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ClearActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RefreshActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EditActionPerformed

    public boolean inputTrue(){
        resi = etResi.getText();
        nopol = etNopol.getText();
        kendaraan = etKendaraan.getText();
        hari = etHari.getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        tgl_masuk = dateFormat.format(etMasuk.getDate());
        tgl_keluar = dateFormat.format(etKeluar.getDate());
        
        //Ceritanya jadi logcat (biasa.., anak android)
        System.out.println("No. Resi : "+resi);
        System.out.println("No. Polisi : "+nopol);
        System.out.println("Masuk : "+tgl_masuk);
        System.out.println("Keluar : "+tgl_keluar);
        System.out.println("Kendaraan : "+kendaraan);
        System.out.println("Jumlah Hari : "+hari);
        System.out.println("----------------------------------");
        
        if("".equals(resi)){
            valResi.setVisible(true);
            valNopol.setVisible(false);
            valKendaraan.setVisible(false);
            valMasuk.setVisible(false);
            valKeluar.setVisible(false);
            valHari.setVisible(false);
            
            tvValidation.setVisible(true);
            return false;
        }
        else if("".equals(nopol)){
            valResi.setVisible(false);
            valNopol.setVisible(true);
            valKendaraan.setVisible(false);
            valMasuk.setVisible(false);
            valKeluar.setVisible(false);
            valHari.setVisible(false);
            
            tvValidation.setVisible(true);
            return false;
        }
        else if("".equals(kendaraan)){
            valResi.setVisible(false);
            valNopol.setVisible(false);
            valKendaraan.setVisible(true);
            valMasuk.setVisible(false);
            valKeluar.setVisible(false);
            valHari.setVisible(false);
            
            tvValidation.setVisible(true);
            return false;
        }
        else if("".equals(tgl_masuk)){
            valResi.setVisible(false);
            valNopol.setVisible(false);
            valKendaraan.setVisible(false);
            valMasuk.setVisible(true);
            valKeluar.setVisible(false);
            valHari.setVisible(false);
            
            tvValidation.setVisible(true);
            return false;
        }
        else if("".equals(tgl_keluar)){
            valResi.setVisible(false);
            valNopol.setVisible(false);
            valKendaraan.setVisible(false);
            valMasuk.setVisible(false);
            valKeluar.setVisible(true);
            valHari.setVisible(false);
            
            tvValidation.setVisible(true);
            return false;
        }
        else if("".equals(hari)){
            valResi.setVisible(false);
            valNopol.setVisible(false);
            valKendaraan.setVisible(false);
            valMasuk.setVisible(false);
            valKeluar.setVisible(false);
            valHari.setVisible(true);
            
            tvValidation.setVisible(true);
            return false;
        }
        return true;
    }
    
    public void hideValidation(){
        valResi.setVisible(false);
        valNopol.setVisible(false);
        valKendaraan.setVisible(false);
        valMasuk.setVisible(false);
        valKeluar.setVisible(false);
        valHari.setVisible(false);
    }
    
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Save;
    private javax.swing.JTextField etHari;
    private com.toedter.calendar.JDateChooser etKeluar;
    private javax.swing.JTextField etKendaraan;
    private com.toedter.calendar.JDateChooser etMasuk;
    private javax.swing.JTextField etNopol;
    private javax.swing.JTextField etResi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblData;
    private javax.swing.JLabel tvUname;
    private javax.swing.JLabel tvValidation;
    private javax.swing.JLabel valHari;
    private javax.swing.JLabel valKeluar;
    private javax.swing.JLabel valKendaraan;
    private javax.swing.JLabel valMasuk;
    private javax.swing.JLabel valNopol;
    private javax.swing.JLabel valResi;
    // End of variables declaration//GEN-END:variables
}
