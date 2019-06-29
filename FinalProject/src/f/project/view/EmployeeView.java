package f.project.view;

import f.project.ctl.EmployeeCtl;
import java.awt.Color;

public class EmployeeView extends javax.swing.JInternalFrame {

    public EmployeeView() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#FFFFFF"));
        jScrollPane2.getViewport().setBackground(Color.decode("#f0fff0"));
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
   
        

    }
    EmployeeCtl emp= new EmployeeCtl();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodeEmployee = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtCellphone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJobTitle = new javax.swing.JTextField();
        txtGrade = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegisterEmployee = new rojeru_san.RSButton();
        btnDeleteEmployee = new rojeru_san.RSButton();

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
        setTitle("Gestion de Empleados");
        setName("Employee"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableEmployee = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tableEmployee.setBackground(new java.awt.Color(95, 158, 160));
        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "APELLIDO", "TELEFONO", "CARGO", "GRADO", "SUELDO"
            }
        ));
        tableEmployee.setSelectionBackground(new java.awt.Color(67, 150, 209));
        jScrollPane2.setViewportView(tableEmployee);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 1150, 280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("APELLIDO:");

        jLabel8.setText("TELEFONO:");

        txtCodeEmployee.setEditable(false);

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSurnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurnameKeyTyped(evt);
            }
        });

        txtCellphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCellphoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCellphoneKeyTyped(evt);
            }
        });

        jLabel7.setText("SUELDO:");

        jLabel5.setText("GRADO:");

        jLabel4.setText("CARGO:");

        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });

        jLabel6.setText("(S/.)");

        jLabel1.setText("CODIGO:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtSurname)
                            .addComponent(txtCellphone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(txtCodeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGrade)
                            .addComponent(txtJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))))
                .addGap(257, 257, 257))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtGrade, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtCellphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 1160, 280));

        btnRegisterEmployee.setBackground(new java.awt.Color(95, 158, 160));
        btnRegisterEmployee.setText("Registrar");
        btnRegisterEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        btnDeleteEmployee.setBackground(new java.awt.Color(95, 158, 160));
        btnDeleteEmployee.setText("Eliminar");
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterEmployeeActionPerformed
        // TODO add your handling code here:
        //emp.InsertEmployee(123, txtName.getText(), txtSurname.getText(), txtJobTitle.getText(), Double.parseDouble(txtSalary.getText()), Integer.parseInt(txtCellphone.getText()), txtGrade.getText());
        emp.InsertEmployee(123, "a", "a", "a", 1.0, 2, "a");

    }//GEN-LAST:event_btnRegisterEmployeeActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        // TODO add your handling code here:
        emp.Eliminar();

    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtSalaryKeyTyped

    private void txtCellphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellphoneKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtCellphoneKeyTyped

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isDigit(c) || Character.isDigit(c)) {
            evt.consume();
        }


    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
     
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtCellphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCellphoneKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtCellphoneKeyPressed

    private void txtSurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtSurnameKeyPressed

    private void txtSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !Character.isDigit(c) || Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSurnameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnDeleteEmployee;
    private rojeru_san.RSButton btnRegisterEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
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
