package f.project.view;

import f.project.view.Informationview;
import java.awt.Dimension;

public class MenuView extends javax.swing.JFrame {

    public MenuView() {
        initComponents();
        this.setLocationRelativeTo(this);
//          this.setExtendedState(this.MAXIMIZED_BOTH);

    }
    public Informationview iv = new Informationview();
    public EmployeeView ev = new EmployeeView();
    public TaskView tv = new TaskView();
    public ReportView rv = new ReportView();
    public DailyAssigmentsView dav = new DailyAssigmentsView();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        rSPanelCircleImage1 = new rojerusan.RSPanelCircleImage();
        btnEmployee = new rojerusan.RSButtonIconI();
        btnTask = new rojerusan.RSButtonIconI();
        btnDailyAssigments = new rojerusan.RSButtonIconI();
        btnReport = new rojerusan.RSButtonIconI();
        btnInformation = new rojerusan.RSButtonIconI();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administracion de Recursos Humanos");
        setBackground(new java.awt.Color(0, 112, 192));

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 86, 179));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelCircleImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/menu .jpg"))); // NOI18N

        javax.swing.GroupLayout rSPanelCircleImage1Layout = new javax.swing.GroupLayout(rSPanelCircleImage1);
        rSPanelCircleImage1.setLayout(rSPanelCircleImage1Layout);
        rSPanelCircleImage1Layout.setHorizontalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelCircleImage1Layout.setVerticalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel2.add(rSPanelCircleImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, -1, -1));

        btnEmployee.setBackground(new java.awt.Color(0, 86, 179));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/employee.jpg"))); // NOI18N
        btnEmployee.setText("Empleado");
        btnEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        jPanel2.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 269, -1));

        btnTask.setBackground(new java.awt.Color(0, 86, 179));
        btnTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/task.jpg"))); // NOI18N
        btnTask.setText("Tareas Diarias");
        btnTask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskActionPerformed(evt);
            }
        });
        jPanel2.add(btnTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 243, 269, -1));

        btnDailyAssigments.setBackground(new java.awt.Color(0, 86, 179));
        btnDailyAssigments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/adminrrhh.jpg"))); // NOI18N
        btnDailyAssigments.setText("Asignacion Carga Laboral");
        btnDailyAssigments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyAssigmentsActionPerformed(evt);
            }
        });
        jPanel2.add(btnDailyAssigments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 269, -1));

        btnReport.setBackground(new java.awt.Color(0, 86, 179));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/report.jpg"))); // NOI18N
        btnReport.setText("Reporte");
        btnReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        jPanel2.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, 269, -1));

        btnInformation.setBackground(new java.awt.Color(0, 86, 179));
        btnInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/info.jpg"))); // NOI18N
        btnInformation.setText("Informacion");
        btnInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });
        jPanel2.add(btnInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 381, 269, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        jPanel1.add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, -1, 478));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformationActionPerformed
        // TODO add your handling code here:
        desktop.add(iv);
        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = ev.getSize();
        iv.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        iv.show();
    }//GEN-LAST:event_btnInformationActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        desktop.add(rv);
        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = ev.getSize();
        rv.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        rv.show();
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnDailyAssigmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyAssigmentsActionPerformed
        // TODO add your handling code here:
        desktop.add(dav);
        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = ev.getSize();
        dav.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        dav.show();
    }//GEN-LAST:event_btnDailyAssigmentsActionPerformed

    private void btnTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskActionPerformed
        // TODO add your handling code here:
        desktop.add(tv);
        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = ev.getSize();
        tv.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        tv.show();
    }//GEN-LAST:event_btnTaskActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
        desktop.add(ev);
        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = ev.getSize();
        ev.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        ev.show();
    }//GEN-LAST:event_btnEmployeeActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btnDailyAssigments;
    private rojerusan.RSButtonIconI btnEmployee;
    private rojerusan.RSButtonIconI btnInformation;
    private rojerusan.RSButtonIconI btnReport;
    private rojerusan.RSButtonIconI btnTask;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojerusan.RSPanelCircleImage rSPanelCircleImage1;
    // End of variables declaration//GEN-END:variables
}
