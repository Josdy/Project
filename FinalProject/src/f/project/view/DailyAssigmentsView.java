package f.project.view;

import f.project.ctl.DailyAssigmentsCtl;

public class DailyAssigmentsView extends javax.swing.JInternalFrame {
    
    public DailyAssigmentsView() {
        initComponents();
    }
    DailyAssigmentsCtl asig = new DailyAssigmentsCtl();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableAssignTask = new javax.swing.JTable();
        cboEmployees = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboTasks = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDeleteAssignTask = new javax.swing.JButton();
        btnUpdateAssignTask = new javax.swing.JButton();
        btnRegisterAssignTask = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Asignacion de Tareas Diarias");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAssignTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "EMPLEADO", "CARGO", "TAREA", "PROGRESO"
            }
        ));
        jScrollPane2.setViewportView(tableAssignTask);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 749, 238));

        cboEmployees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));
        getContentPane().add(cboEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 53, 438, 30));

        jLabel1.setText("EMPLEADO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 57, -1, -1));

        jLabel2.setText("TAREA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 120, -1, -1));

        cboTasks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));
        getContentPane().add(cboTasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 116, 438, 30));

        jLabel3.setText("PROGRESO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 184, -1, -1));

        jLabel4.setText("(%)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 184, 30, 20));

        btnDeleteAssignTask.setText("Eliminar");
        getContentPane().add(btnDeleteAssignTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 261, 80, 30));

        btnUpdateAssignTask.setText("Actualizar");
        getContentPane().add(btnUpdateAssignTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 261, 90, 30));

        btnRegisterAssignTask.setText("Asignar");
        btnRegisterAssignTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterAssignTaskActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterAssignTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 261, 100, 30));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterAssignTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterAssignTaskActionPerformed
        asig.AsignarDaily("80");
    }//GEN-LAST:event_btnRegisterAssignTaskActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAssignTask;
    private javax.swing.JButton btnRegisterAssignTask;
    private javax.swing.JButton btnUpdateAssignTask;
    public static javax.swing.JComboBox<String> cboEmployees;
    public static javax.swing.JComboBox<String> cboTasks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTable tableAssignTask;
    // End of variables declaration//GEN-END:variables
}
