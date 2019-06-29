package f.project.view;



import java.awt.Color;

public class ReportView extends javax.swing.JInternalFrame {
 

    public ReportView() {
        initComponents();
        this.getContentPane().setBackground( Color.decode("#FFFFFF") );
        jScrollPane2.getViewport().setBackground(Color.decode("#f0fff0"));
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableTask = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Reporte Diario");
        setToolTipText("");
        setName("Report"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(95, 158, 160));

        tableTask = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int colIndex){
                return false;
            }
        };
        tableTask.setBackground(new java.awt.Color(95, 158, 160));
        tableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "EMPLEADO", "ASIGNACION", "PRIORIDAD", "TIEMPO"
            }
        ));
        tableTask.setGridColor(new java.awt.Color(240, 255, 240));
        tableTask.setInheritsPopupMenu(true);
        tableTask.setSelectionBackground(new java.awt.Color(67, 150, 209));
        jScrollPane2.setViewportView(tableTask);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 890, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tableTask;
    // End of variables declaration//GEN-END:variables

   
}
