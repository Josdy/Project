package f.project.ctl;

import f.project.Interfaz.InterfazGeneral;
import f.project.dto.DailyAssigmentsDto;
import f.project.view.DailyAssigmentsView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import f.project.view.EmployeeView;

public class DailyAssigmentsCtl extends ClassGeneral implements InterfazGeneral {

    private ArrayList<DailyAssigmentsDto> ArrayDaily = new ArrayList();
    private DefaultTableModel TablaDaily;
    private DefaultTableModel Tabla;
    private DailyAssigmentsDto objDailyAssigments;
    private EmployeeCtl employeeCtl;

    public DailyAssigmentsCtl() {
    }

    public ArrayList<DailyAssigmentsDto> getArrayDaily() {
        return ArrayDaily;
    }

    public void setArrayDaily(ArrayList<DailyAssigmentsDto> ArrayDaily) {
        this.ArrayDaily = ArrayDaily;
    }

    public void loadingEmployee() {
        Tabla = ((DefaultTableModel) EmployeeView.tableEmployee.getModel());
        DailyAssigmentsView.cboEmployees.removeAllItems();
        for (int i = 0; i < Tabla.getRowCount(); i++) {
            DailyAssigmentsView.cboEmployees.addItem(String.valueOf(Tabla.getValueAt(1, i)));
            System.out.println("da" + i);
        }
    }

    public void loadingTask() {

    }

    public void AsignarDaily(String progress) {
        //int opcionseleccionada = DailyAssigmentsView.cboEmployees.getSelectedIndex();
        //int opcionseleccionada = 0;
        Tabla = ((DefaultTableModel) EmployeeView.tableEmployee.getModel());
        System.out.println("dd" + Tabla.getRowCount());
        // employeeDto=(EmployeeDto) employeeCtl.arrayEmployee.get(opcionseleccionada);
        //  objDailyAssigments.setEmployeeDto(employeeDto);
        // DailyAssigments.setTaskDto(objDailyAssigments.getTaskCtl().arregloTask.get(opcionseleccionada));
        // DailyAssigments.setTaskProgress(progress);
        //  ArrayDaily.add(DailyAssigments);
        //  GrabarDato();//Grabo los Datos en la Tabla
    }

    @Override
    public int Buscar(int cod) {
        int resultado = -1;
        for (int i = 0; i < ArrayDaily.size(); i++) {
            objDailyAssigments = (DailyAssigmentsDto) ArrayDaily.get(i);
            if (objDailyAssigments.getCode() == cod) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    @Override
    public boolean Eliminar() {
        TablaDaily = ((DefaultTableModel) DailyAssigmentsView.tableAssignTask.getModel());
        boolean exito = false;
        int filaseleccionada = DailyAssigmentsView.tableAssignTask.getSelectedRow();
        if (filaseleccionada == -1) {
            mensajeError("No se ha seleccionado un Registro a Eliminar");
            return exito;
        }
        String Dat = String.valueOf(TablaDaily.getValueAt(filaseleccionada, 0));
        int resultado = this.Buscar(Integer.parseInt(Dat));
        if (resultado >= 0) {
            ArrayDaily.remove(resultado);
            TablaDaily.removeRow(filaseleccionada);
            exito = true;
        }
        return exito;
    }

    @Override
    public void GrabarDato() {
        objDailyAssigments = (DailyAssigmentsDto) ArrayDaily.get(ArrayDaily.size() - 1);
        Object[] fila = new Object[5];
        fila[0] = 1;
        fila[1] = objDailyAssigments.getEmployeeDto().getSurname();
        fila[2] = objDailyAssigments.getEmployeeDto().getJobTitle();
        fila[3] = objDailyAssigments.getTaskDto().getDescription();
        fila[4] = objDailyAssigments.getTaskProgress();
        TablaDaily.addRow(fila);
    }
}
