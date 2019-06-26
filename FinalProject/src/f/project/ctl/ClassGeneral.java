package f.project.ctl;

import javax.swing.JOptionPane;

public class ClassGeneral {

    public void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "Validacion de ingreso de Cliente",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
