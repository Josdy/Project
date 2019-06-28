package f.project.view;

import f.project.view.Informationview;
import java.awt.Dimension;

public class MenuView extends javax.swing.JFrame {

    int height = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int width = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

    public MenuView() {

        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setPreferredSize(new Dimension(width, height));
        BackgroundPanel.setPreferredSize(new Dimension(width, height));
        menuPanel.setPreferredSize(new Dimension(menuPanel.getWidth(), height));
        desktop.setPreferredSize(new Dimension(width - menuPanel.getWidth(), height));

    }

    public Informationview iv = new Informationview();
    public EmployeeView ev = new EmployeeView();
    public TaskView tv = new TaskView();
    public DailyAssigmentsView dav = new DailyAssigmentsView();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
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
        setName("principal"); // NOI18N

        BackgroundPanel.setBackground(new java.awt.Color(0, 112, 192));
        BackgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(0, 86, 179));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        menuPanel.add(rSPanelCircleImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 20, -1, -1));

        btnEmployee.setBackground(new java.awt.Color(0, 86, 179));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/employee.jpg"))); // NOI18N
        btnEmployee.setText("Empleado");
        btnEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEmployee.setName("Employee"); // NOI18N
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });
        menuPanel.add(btnEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 269, -1));

        btnTask.setBackground(new java.awt.Color(0, 86, 179));
        btnTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/task.jpg"))); // NOI18N
        btnTask.setText("Tareas Diarias");
        btnTask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTask.setName("Task"); // NOI18N
        btnTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaskActionPerformed(evt);
            }
        });
        menuPanel.add(btnTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 243, 269, -1));

        btnDailyAssigments.setBackground(new java.awt.Color(0, 86, 179));
        btnDailyAssigments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/adminrrhh.jpg"))); // NOI18N
        btnDailyAssigments.setText("Asignacion Carga Laboral");
        btnDailyAssigments.setName("Assigment"); // NOI18N
        btnDailyAssigments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyAssigmentsActionPerformed(evt);
            }
        });
        menuPanel.add(btnDailyAssigments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 289, 269, -1));

        btnReport.setBackground(new java.awt.Color(0, 86, 179));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/report.jpg"))); // NOI18N
        btnReport.setText("Reporte");
        btnReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReport.setName("Report"); // NOI18N
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        menuPanel.add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 335, 269, -1));

        btnInformation.setBackground(new java.awt.Color(0, 86, 179));
        btnInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f/project/image/info.jpg"))); // NOI18N
        btnInformation.setText("Informacion");
        btnInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInformation.setName("Information"); // NOI18N
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });
        menuPanel.add(btnInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 381, 269, -1));

        BackgroundPanel.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        BackgroundPanel.add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1376, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformationActionPerformed
        // TODO add your handling code here:
        //        desktop.add(iv);

        Dimension desktopSize = BackgroundPanel.getSize();
        Dimension FrameSize = tv.getSize();
        iv.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        String name = this.btnInformation.getName();
        win(true, name);

    }//GEN-LAST:event_btnInformationActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:

       

    }//GEN-LAST:event_btnReportActionPerformed

    private void btnDailyAssigmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyAssigmentsActionPerformed
        // TODO add your handling code here:

        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = dav.getSize();
        dav.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        String name = this.btnDailyAssigments.getName();
        win(true, name);

    }//GEN-LAST:event_btnDailyAssigmentsActionPerformed

    private void btnTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaskActionPerformed
        // TODO add your handling code here:

        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = tv.getSize();
        tv.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        String name = this.btnTask.getName();
        win(true, name);

//         tv.show();
    }//GEN-LAST:event_btnTaskActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
//        desktop.add(ev); 

        Dimension desktopSize = desktop.getSize();
        Dimension FrameSize = ev.getSize();
        ev.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        String name = this.btnEmployee.getName();
        win(true, name);
    }//GEN-LAST:event_btnEmployeeActionPerformed
    public void win(Boolean jif, String name) {
        if (jif) {
            String n = name;
            switch (name) {
                case "Employee":
                    desktop.removeAll();
                    desktop.repaint();
                    desktop.add(ev);
                    ev.show();

                    break;
                case "Task":

                    desktop.removeAll();
                    desktop.repaint();
                    desktop.add(tv);
                    tv.show();

                    break;
                case "Assigment":
//                
                    desktop.removeAll();
                    desktop.repaint();
                    desktop.add(dav);
                    dav.show();

                    break;

                case "Information":
//                
                    desktop.removeAll();
                    desktop.repaint();
                    desktop.add(iv);
                    iv.show();

                    break;

            }
        }
    }

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
    private javax.swing.JPanel BackgroundPanel;
    private rojerusan.RSButtonIconI btnDailyAssigments;
    private rojerusan.RSButtonIconI btnEmployee;
    private rojerusan.RSButtonIconI btnInformation;
    private rojerusan.RSButtonIconI btnReport;
    private rojerusan.RSButtonIconI btnTask;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JPanel menuPanel;
    private rojerusan.RSPanelCircleImage rSPanelCircleImage1;
    // End of variables declaration//GEN-END:variables
}
