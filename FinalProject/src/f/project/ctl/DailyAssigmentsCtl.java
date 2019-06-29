package f.project.ctl;

import f.project.Interfaz.InterfazGeneral;
import f.project.dto.DailyAssigmentsDto;
import f.project.dto.EmployeeDto;
import f.project.view.DailyAssigmentsView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import f.project.view.EmployeeView;
import f.project.view.TaskView;
import javax.swing.JOptionPane;

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

    public void AsignarDaily() {
        TablaDaily = ((DefaultTableModel) DailyAssigmentsView.tableAssignTask.getModel());
        int indexcomboEmployee = DailyAssigmentsView.cboEmployees.getSelectedIndex() - 1;
        int indexcomboTask = DailyAssigmentsView.cboTasks.getSelectedIndex() - 1;
        String datnameEmployee = String.valueOf(EmployeeView.tableEmployee.getValueAt(indexcomboEmployee, 1));
        String datsurnameEmployee = String.valueOf(EmployeeView.tableEmployee.getValueAt(indexcomboEmployee, 2));
        String datCargo = String.valueOf(EmployeeView.tableEmployee.getValueAt(indexcomboEmployee, 4));
        String tarea = String.valueOf(TaskView.tableTask.getValueAt(indexcomboTask, 4));
        //ArrayDaily = new ArrayList();
        DailyAssigmentsDto DailyData = new DailyAssigmentsDto();
        DailyData.setCode(TablaDaily.getRowCount());
        DailyData.setNameEmployeeDaily(String.valueOf(datsurnameEmployee + datnameEmployee));
        DailyData.setCargoEmployeeDaily(datCargo);
        DailyData.setNameTaskDaily(tarea);
        DailyData.setTaskProgress("0");
        ArrayDaily.add(DailyData);
        GrabarDato();//Grabo los Datos en la Tabla
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
        TablaDaily = ((DefaultTableModel) DailyAssigmentsView.tableAssignTask.getModel());
        objDailyAssigments = (DailyAssigmentsDto) ArrayDaily.get(ArrayDaily.size() - 1);
        Object[] fila = new Object[5];
        fila[0] = objDailyAssigments.getCode()+1;
        fila[1] = objDailyAssigments.getNameEmployeeDaily();
        fila[2] = objDailyAssigments.getCargoEmployeeDaily();
        fila[3] = objDailyAssigments.getNameTaskDaily();
        fila[4] = objDailyAssigments.getTaskProgress();
        TablaDaily.addRow(fila);
    }

    public void actualizar() {
        TablaDaily = ((DefaultTableModel) DailyAssigmentsView.tableAssignTask.getModel());
        int inputprogress = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su progreso"));
        int indxselect = DailyAssigmentsView.tableAssignTask.getSelectedRow();
        int resultado = this.Buscar(indxselect);
        if (resultado >= 0) {      
            objDailyAssigments = (DailyAssigmentsDto) ArrayDaily.get(ArrayDaily.size() - 1);
            TablaDaily.setValueAt(inputprogress, resultado, 4);
            Object[] fila = new Object[5];
            fila[0] = objDailyAssigments.getCode();
            fila[1] = objDailyAssigments.getNameEmployeeDaily();
            fila[2] = objDailyAssigments.getCargoEmployeeDaily();
            fila[3] = objDailyAssigments.getNameTaskDaily();
            fila[4] = inputprogress;
            ArrayDaily.set(indxselect, objDailyAssigments);
        }
    }
}
