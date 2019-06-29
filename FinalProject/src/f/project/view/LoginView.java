package f.project.view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import f.project.ctl.UserCtl;
import f.project.dto.UserDto;
import java.awt.Color;
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.jPanel2.setBackground(Color.decode("#EBF5FB"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new rojerusan.RSMetroTextFullPlaceHolder();
        txtPassword = new rojerusan.RSMetroTextPassPlaceHolder();
        rSPanelCircleImage1 = new rojerusan.RSPanelCircleImage();
        rSLabelImage1 = new rojerusan.RSLabelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenid@ !");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("PASSWORD:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("USER:");

        txtUser.setPlaceholder("Ingrese su usuario");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });

        txtPassword.setPlaceholder("Ingrese su contraseña");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        rSPanelCircleImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/man (2).png"))); // NOI18N

        javax.swing.GroupLayout rSPanelCircleImage1Layout = new javax.swing.GroupLayout(rSPanelCircleImage1);
        rSPanelCircleImage1.setLayout(rSPanelCircleImage1Layout);
        rSPanelCircleImage1Layout.setHorizontalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 139, Short.MAX_VALUE)
        );
        rSPanelCircleImage1Layout.setVerticalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(rSPanelCircleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSPanelCircleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(47, 47, 47))
        );

        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_TAB) {
                    txtPassword.requestFocus();
                    System.out.print("tab");
                }
            }
        });

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 630, 230));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/bg.jpg"))); // NOI18N
        getContentPane().add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validateLogin();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSPanelCircleImage rSPanelCircleImage1;
    private rojerusan.RSMetroTextPassPlaceHolder txtPassword;
    private rojerusan.RSMetroTextFullPlaceHolder txtUser;
    // End of variables declaration//GEN-END:variables

    private void validateLogin() {
        UserCtl userCtl = new UserCtl();
        UserDto userDto = new UserDto();
        MenuView menu = new MenuView();

        String username = txtUser.getText();
        String password = txtPassword.getText();

        userDto.setUsername(username);
        userDto.setPassword(password);

        boolean istrue = userCtl.validateLogin(userDto);
        if (istrue) {
            this.dispose();
            JOptionPane.showMessageDialog(this, "Bienvenido usuario : " + '"' + username.toUpperCase()  + '"', "Welcome Message" , JOptionPane.INFORMATION_MESSAGE);
            menu.setVisible(true);
            
        } else {
            txtUser.setText("");
            txtPassword.setText("");
            JOptionPane.showMessageDialog(this, "Datos incorrectos" , "Information Message" , JOptionPane.INFORMATION_MESSAGE);
            txtUser.requestFocus();
        }
    }
}
