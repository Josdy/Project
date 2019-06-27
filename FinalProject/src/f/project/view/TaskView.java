package f.project.view;

import f.project.ctl.TaskCtl;

public class TaskView extends javax.swing.JInternalFrame {

    public TaskView() {
        initComponents();
    }
    TaskCtl tas = new TaskCtl();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodetask = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescriptionTask = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTask = new javax.swing.JTable();
        cboTaskPriority = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescriptionTask1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnRegisterTask = new javax.swing.JButton();
        btnUpdateTask = new javax.swing.JButton();
        btnDeleteTask = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Tareas Diarias");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtCodetask, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 45, 157, 30));

        jLabel1.setText("PRIORIDAD:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        getContentPane().add(txtDescriptionTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 250, 30));

        tableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRIORIDAD", "TIEMPO", "ESTADO"
            }
        ));
        jScrollPane2.setViewportView(tableTask);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 749, 180));

        cboTaskPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));
        getContentPane().add(cboTaskPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 230, 37));

        jLabel3.setText("CODIGO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 51, -1, -1));

        jLabel4.setText("(hrs.)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, -1));
        getContentPane().add(txtDescriptionTask1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 70, 30));

        jLabel5.setText("TIEMPO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 800, 130));

        btnRegisterTask.setText("Registrar");
        btnRegisterTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        btnUpdateTask.setText("Actualizar");
        getContentPane().add(btnUpdateTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        btnDeleteTask.setText("Eliminar");
        btnDeleteTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterTaskActionPerformed
        tas.InsertTask(123, "sfs", "sfa", 12, "sasfas");
    }//GEN-LAST:event_btnRegisterTaskActionPerformed

    private void btnDeleteTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTaskActionPerformed
        tas.Eliminar();
    }//GEN-LAST:event_btnDeleteTaskActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteTask;
    private javax.swing.JButton btnRegisterTask;
    private javax.swing.JButton btnUpdateTask;
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
    public static javax.swing.JTextField txtDescriptionTask1;
    // End of variables declaration//GEN-END:variables
}
