package f.project.view;

import f.project.ctl.DailyAssigmentsCtl;
import java.awt.Color;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;

public class DailyAssigmentsView extends javax.swing.JInternalFrame {

    public DailyAssigmentsView() {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#FFFFFF"));
        jScrollPane2.getViewport().setBackground(Color.decode("#f0fff0"));
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);

    }
    DailyAssigmentsCtl ct = new DailyAssigmentsCtl();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableAssignTask = new javax.swing.JTable();
        btnRegisterDayliAssigments = new rojeru_san.RSButton();
        btnUpdateDayliAssigments = new rojeru_san.RSButton();
        btnDeleteDayliAssigments = new rojeru_san.RSButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cboTasks = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cboEmployees = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Gestion de Asignacion de Tareas Diarias");
        setName("Assigment"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAssignTask = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tableAssignTask.setBackground(new java.awt.Color(95, 158, 160));
        tableAssignTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "EMPLEADO", "CARGO", "TAREA", "PROGRESO"
            }
        ));
        tableAssignTask.setSelectionBackground(new java.awt.Color(67, 150, 209));
        tableAssignTask.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableAssignTask);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 790, 238));

        btnRegisterDayliAssigments.setBackground(new java.awt.Color(95, 158, 160));
        btnRegisterDayliAssigments.setText("Registrar");
        btnRegisterDayliAssigments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterDayliAssigmentsActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegisterDayliAssigments, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 160, -1));

        btnUpdateDayliAssigments.setBackground(new java.awt.Color(95, 158, 160));
        btnUpdateDayliAssigments.setText("Actualizar");
        btnUpdateDayliAssigments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDayliAssigmentsActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdateDayliAssigments, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 150, -1));

        btnDeleteDayliAssigments.setBackground(new java.awt.Color(95, 158, 160));
        btnDeleteDayliAssigments.setText("Eliminar");
        btnDeleteDayliAssigments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDayliAssigmentsActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteDayliAssigments, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 160, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("TAREA:");

        cboTasks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));

        jLabel1.setText("EMPLEADO:");

        cboEmployees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccionar-" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboEmployees, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cboTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 750, 163));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterDayliAssigmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterDayliAssigmentsActionPerformed
        ct.AsignarDaily();
        cboEmployees.setSelectedIndex(0);
        cboTasks.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterDayliAssigmentsActionPerformed

    private void btnUpdateDayliAssigmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDayliAssigmentsActionPerformed
        ct.actualizar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateDayliAssigmentsActionPerformed

    private void btnDeleteDayliAssigmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDayliAssigmentsActionPerformed
        // TODO add your handling code here:
        ct.Eliminar();
    }//GEN-LAST:event_btnDeleteDayliAssigmentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton btnDeleteDayliAssigments;
    private rojeru_san.RSButton btnRegisterDayliAssigments;
    private rojeru_san.RSButton btnUpdateDayliAssigments;
    public static javax.swing.JComboBox<String> cboEmployees;
    public static javax.swing.JComboBox<String> cboTasks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tableAssignTask;
    // End of variables declaration//GEN-END:variables
}
