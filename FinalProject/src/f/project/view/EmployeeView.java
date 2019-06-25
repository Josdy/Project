package f.project.view;

public class EmployeeView extends javax.swing.JInternalFrame {

    public EmployeeView() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCodeEmployee = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtJobTitle = new javax.swing.JTextField();
        btnRegisterEmployee = new javax.swing.JButton();
        btnUpdateEmployee = new javax.swing.JButton();
        btnDeleteEmployee = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();

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
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Gestion de Empleados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CODIGO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 85, -1, -1));

        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 144, -1, -1));

        jLabel3.setText("APELLIDO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 210, -1, -1));

        jLabel4.setText("CARGO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 275, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 135, 292, 33));
        getContentPane().add(txtCodeEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 87, 157, 33));
        getContentPane().add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 201, 292, 33));
        getContentPane().add(txtJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 256, 292, 33));

        btnRegisterEmployee.setText("Registrar");
        getContentPane().add(btnRegisterEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 356, -1, -1));

        btnUpdateEmployee.setText("Actualizar");
        getContentPane().add(btnUpdateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 356, -1, -1));

        btnDeleteEmployee.setText("Eliminar");
        getContentPane().add(btnDeleteEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 356, -1, -1));

        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "CARGO"
            }
        ));
        jScrollPane2.setViewportView(tableEmployee);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 462, 749, 238));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnRegisterEmployee;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableEmployee;
    private javax.swing.JTextField txtCodeEmployee;
    private javax.swing.JTextField txtJobTitle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
