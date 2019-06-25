package f.project.view;

import com.sun.java.swing.plaf.windows.resources.windows;

public class DailyAssigmentsView extends javax.swing.JInternalFrame {

    public DailyAssigmentsView() {
        initComponents();
       
    }

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
        txtProgressTask = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnDeleteAssignTask = new javax.swing.JButton();
        btnUpdateAssignTask = new javax.swing.JButton();
        btnRegisterAssignTask = new javax.swing.JButton();

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 329, 749, 238));

        cboEmployees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));
        getContentPane().add(cboEmployees, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 46, 438, 37));

        jLabel1.setText("EMPLEADO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 57, -1, -1));

        jLabel2.setText("TAREA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 120, -1, -1));

        cboTasks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));
        getContentPane().add(cboTasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 109, 438, 37));

        jLabel3.setText("PROGRESO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 184, -1, -1));

        txtProgressTask.setEnabled(false);
        getContentPane().add(txtProgressTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 171, 90, 30));

        jLabel4.setText("(%)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 184, -1, -1));

        btnDeleteAssignTask.setText("Eliminar");
        getContentPane().add(btnDeleteAssignTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 268, -1, -1));

        btnUpdateAssignTask.setText("Actualizar");
        getContentPane().add(btnUpdateAssignTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 268, -1, -1));

        btnRegisterAssignTask.setText("Registrar");
        getContentPane().add(btnRegisterAssignTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 268, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAssignTask;
    private javax.swing.JButton btnRegisterAssignTask;
    private javax.swing.JButton btnUpdateAssignTask;
    private javax.swing.JComboBox<String> cboEmployees;
    private javax.swing.JComboBox<String> cboTasks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAssignTask;
    private javax.swing.JTextField txtProgressTask;
    // End of variables declaration//GEN-END:variables
}
