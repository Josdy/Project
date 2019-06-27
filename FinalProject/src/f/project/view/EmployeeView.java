package f.project.view;

import f.project.ctl.EmployeeCtl;

public class EmployeeView extends javax.swing.JInternalFrame {

    public EmployeeView() {
        initComponents();
    }
    EmployeeCtl empleado = new EmployeeCtl();

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
        txtGrade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCellphone = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

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
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel3.setText("APELLIDO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setText("CARGO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 292, 33));

        txtCodeEmployee.setEditable(false);
        getContentPane().add(txtCodeEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 157, 33));
        getContentPane().add(txtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 292, 33));
        getContentPane().add(txtJobTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, 292, 33));

        btnRegisterEmployee.setText("Registrar");
        btnRegisterEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        btnUpdateEmployee.setText("Actualizar");
        getContentPane().add(btnUpdateEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        btnDeleteEmployee.setText("Eliminar");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "TELEFONO", "CARGO", "GRADO", "SUELDO"
            }
        ));
        jScrollPane2.setViewportView(tableEmployee);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 850, 160));
        getContentPane().add(txtGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 292, 33));

        jLabel5.setText("GRADO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 90, 33));

        jLabel6.setText("(S/.)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        jLabel7.setText("SUELDO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jLabel8.setText("TELEFONO:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        getContentPane().add(txtCellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 190, 33));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1000, 240));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 510, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterEmployeeActionPerformed
        empleado.InsertEmployee(123, "uno", "dos", "tres", 123.50, 123, "apro");
    }//GEN-LAST:event_btnRegisterEmployeeActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        empleado.Eliminar();
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnRegisterEmployee;
    private javax.swing.JButton btnUpdateEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable tableEmployee;
    private javax.swing.JTextField txtCellphone;
    private javax.swing.JTextField txtCodeEmployee;
    private javax.swing.JTextField txtGrade;
    private javax.swing.JTextField txtJobTitle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
