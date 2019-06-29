package f.project.view;

import f.project.abstracts.TaskAbstract;
import f.project.ctl.TaskCtl;
import java.awt.Color;

public class TaskView extends javax.swing.JInternalFrame {
 TaskCtl tas = new TaskCtl();

    public TaskView() {
        initComponents();
        this.getContentPane().setBackground( Color.decode("#FFFFFF") );
        jScrollPane2.getViewport().setBackground(Color.decode("#f0fff0"));
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        tas= new TaskCtl();
        Priority();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableTask = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboTaskPriority = new javax.swing.JComboBox<>();
        txtDescriptionTask = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodetask = new javax.swing.JTextField();
        btnRegisterTask = new rojeru_san.RSButton();
        btnUpdateTask = new rojeru_san.RSButton();
        btnDeleteTask = new rojeru_san.RSButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestion de Tareas Diarias");
        setName("Task"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(95, 158, 160));

        tableTask.setBackground(new java.awt.Color(95, 158, 160));
        tableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRIORIDAD", "TIEMPO", "ESTADO"
            }
        ));
        tableTask.setGridColor(new java.awt.Color(240, 255, 240));
        tableTask.setInheritsPopupMenu(true);
        tableTask.setSelectionBackground(new java.awt.Color(67, 150, 209));
        jScrollPane2.setViewportView(tableTask);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 350, 970, 250));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("PRIORIDAD:");

        jLabel3.setText("CODIGO:");

        jLabel4.setText("(hrs.)");

        txtTime.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTimeKeyTyped(evt);
            }
        });

        jLabel5.setText("TIEMPO:");

        cboTaskPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));

        txtDescriptionTask.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescriptionTaskKeyTyped(evt);
            }
        });

        jLabel2.setText("NOMBRE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodetask, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescriptionTask, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addComponent(cboTaskPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTaskPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodetask, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescriptionTask, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 970, -1));

        btnRegisterTask.setBackground(new java.awt.Color(95, 158, 160));
        btnRegisterTask.setText("Registrar");
        btnRegisterTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 131, -1));

        btnUpdateTask.setBackground(new java.awt.Color(95, 158, 160));
        btnUpdateTask.setText("Actualizar");
        btnUpdateTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, 131, -1));

        btnDeleteTask.setBackground(new java.awt.Color(95, 158, 160));
        btnDeleteTask.setText("Eliminar");
        btnDeleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 250, 131, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateTaskActionPerformed

    private void btnRegisterTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterTaskActionPerformed
        // TODO add your handling code here:
        tas.InsertTask(12, "sas", "dd", 34, "fff");
       // tas.InsertTask(123, txtDescriptionTask.getText(), cboTaskPriority.getSelectedItem().toString(), Integer.parseInt(txtTime.getText()), "abc");
    }//GEN-LAST:event_btnRegisterTaskActionPerformed

    private void btnDeleteTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTaskActionPerformed
        // TODO add your handling code here:
        tas.Eliminar();
    }//GEN-LAST:event_btnDeleteTaskActionPerformed

    private void txtDescriptionTaskKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionTaskKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtDescriptionTaskKeyTyped

    private void txtTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimeKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtTimeKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnDeleteTask;
    private rojeru_san.RSButton btnRegisterTask;
    private rojeru_san.RSButton btnUpdateTask;
    public static javax.swing.JComboBox<String> cboTaskPriority;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tableTask;
    public static javax.swing.JTextField txtCodetask;
    public static javax.swing.JTextField txtDescriptionTask;
    public static javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables

    private void Priority() {
       cboTaskPriority.removeAllItems();
       cboTaskPriority.addItem("-Seleccionar-");
       for(String tipo:tas.obtenerPrioridad()){
           cboTaskPriority.addItem(tipo);
       }
       cboTaskPriority.setSelectedIndex(0);
    }
}
