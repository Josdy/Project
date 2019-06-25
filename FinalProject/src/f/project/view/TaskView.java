package f.project.view;

public class TaskView extends javax.swing.JInternalFrame {

    public TaskView() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodetask = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescriptionTask = new javax.swing.JTextField();
        btnRegisterTask = new javax.swing.JButton();
        btnUpdateTask = new javax.swing.JButton();
        btnDeleteTask = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTask = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Tareas Diarias");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodetask.setEnabled(false);
        getContentPane().add(txtCodetask, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 45, 157, 30));

        jLabel1.setText("CODIGO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 51, -1, -1));

        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 94, -1, -1));
        getContentPane().add(txtDescriptionTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 250, 30));

        btnRegisterTask.setText("Registrar");
        getContentPane().add(btnRegisterTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 162, 90, 30));

        btnUpdateTask.setText("Actualizar");
        getContentPane().add(btnUpdateTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 162, 100, 30));

        btnDeleteTask.setText("Eliminar");
        getContentPane().add(btnDeleteTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 162, 90, 30));

        tableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION"
            }
        ));
        jScrollPane2.setViewportView(tableTask);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, 749, 238));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteTask;
    private javax.swing.JButton btnRegisterTask;
    private javax.swing.JButton btnUpdateTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableTask;
    private javax.swing.JTextField txtCodetask;
    private javax.swing.JTextField txtDescriptionTask;
    // End of variables declaration//GEN-END:variables
}
