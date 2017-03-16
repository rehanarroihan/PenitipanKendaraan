package penitipankendaraan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rehan
 */
public class frmLogin extends javax.swing.JFrame {
    
    public static String uname = "";
    
    public frmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tvFailed = new javax.swing.JLabel();
        etUsername = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        etPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Penitipan Kendaraan \"Barokah\" Bungurasih");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 80, 80, 20);

        tvFailed.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        tvFailed.setForeground(new java.awt.Color(255, 0, 0));
        tvFailed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tvFailed.setText("Invalid username or password");
        getContentPane().add(tvFailed);
        tvFailed.setBounds(290, 180, 190, 20);
        getContentPane().add(etUsername);
        etUsername.setBounds(310, 100, 150, 30);

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btLogin);
        btLogin.setBounds(310, 200, 150, 30);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tekton Pro Cond", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"BAROKAH\"");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 130, 270, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<p><b>Terminal Bungurasih</b></p>\n<p>Waru, Kabupaten Sidoarjo, Jawa Timur 61256</p>\n</html>");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 210, 200, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Sistem Informasi");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 80, 270, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Penitipan Kendaraan");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 100, 270, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 280, 320);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 30, 180, 40);

        jLabel8.setText("Password");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(310, 130, 90, 20);
        getContentPane().add(etPassword);
        etPassword.setBounds(310, 150, 150, 30);

        setSize(new java.awt.Dimension(509, 304));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
        btLogin.setText("Please Wait");
        btLogin.setEnabled(false);
        
        Connection connection;
        PreparedStatement ps;
        
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_parkir?zeroDateTimeBehavior=convertToNull","root","");
            ps = connection.prepareStatement("SELECT username , password FROM tb_admin WHERE username = ? AND password = ?");
            ps.setString(1, etUsername.getText());
            ps.setString(2, etPassword.getText());
            ResultSet result = ps.executeQuery();
            if(result.next()){
                uname = etUsername.getText();
                new frmMain().show();
                this.dispose();
            }else{
                //JOptionPane.showMessageDialog(rootPane, "Salah!");
                tvFailed.setVisible(true);
                etPassword.setText("");
                etUsername.requestFocus();
                
                btLogin.setText("Login");
                btLogin.setEnabled(true);
            }   
        }   
        catch(SQLException ex){
            tvFailed.setText(ex.getMessage());
            tvFailed.setVisible(true);
            
            btLogin.setText("Login");
            btLogin.setEnabled(true);
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tvFailed.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JPasswordField etPassword;
    private javax.swing.JTextField etUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tvFailed;
    // End of variables declaration//GEN-END:variables
}
