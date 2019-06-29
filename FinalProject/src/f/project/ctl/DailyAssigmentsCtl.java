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

    public ArrayList<DailyAssigmentsDto> ArrayDaily = new ArrayList();
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
        try {
            TablaDaily = ((DefaultTableModel) DailyAssigmentsView.tableAssignTask.getModel());
            String asignado = "ASIGNADA";
            int indexcomboEmployee = DailyAssigmentsView.cboEmployees.getSelectedIndex() - 1;
            int indexcomboTask = DailyAssigmentsView.cboTasks.getSelectedIndex() - 1;
            String datnameEmployee = String.valueOf(EmployeeView.tableEmployee.getValueAt(indexcomboEmployee, 1));
            String datsurnameEmployee = String.valueOf(EmployeeView.tableEmployee.getValueAt(indexcomboEmployee, 2));
            String datCargo = String.valueOf(EmployeeView.tableEmployee.getValueAt(indexcomboEmployee, 4));
            String tarea = String.valueOf(TaskView.tableTask.getValueAt(indexcomboTask, 1));
            String estado = String.valueOf(TaskView.tableTask.getValueAt(indexcomboTask, 4));
            if (estado.equalsIgnoreCase("NO ASIGNADO")) {
                //ArrayDaily = new ArrayList();
                DailyAssigmentsDto DailyData = new DailyAssigmentsDto();
                System.out.println("ID ASIGNAR" + TablaDaily.getRowCount());
                DailyData.setCode(TablaDaily.getRowCount());
                DailyData.setNameEmployeeDaily(String.valueOf(datsurnameEmployee + datnameEmployee));
                DailyData.setCargoEmployeeDaily(datCargo);
                DailyData.setNameTaskDaily(tarea);
                DailyData.setTaskProgress("0");
                ArrayDaily.add(DailyData);
                TaskView.tableTask.setValueAt(asignado, indexcomboTask, 4);
                GrabarDato();//Grabo los Datos en la Tabla
            } else {
                JOptionPane.showMessageDialog(null, "LA TAREA YA ESTA ASIGNADO A UN EMPLEADO");
            }
        } catch (Exception e) {
            System.out.println("ERROR AL ASIGNAR TAREA");
        }
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
        boolean exito = false;
        try {
            int indexcomboTask = DailyAssigmentsView.cboTasks.getSelectedIndex() - 1;
            TablaDaily = ((DefaultTableModel) DailyAssigmentsView.tableAssignTask.getModel());
            String tarea = String.valueOf(TaskView.tableTask.getValueAt(indexcomboTask, 4));
            int filaseleccionada = DailyAssigmentsView.tableAssignTask.getSelectedRow();
            if (filaseleccionada == -1) {
                mensajeError("No se ha seleccionado un Registro a Eliminar");
                return exito;
            }

            String Dat = String.valueOf(TablaDaily.getValueAt(filaseleccionada, 0));
            int resultado = this.Buscar(Integer.parseInt(Dat));
            System.out.println("res" + resultado);
            if (resultado >= 0) {
                if (tarea.equalsIgnoreCase("ASIGNADA")) {

                    TaskView.tableTask.setValueAt("NO ASIGNADO", indexcomboTask, 4);
                }
                ArrayDaily.remove(resultado);
                TablaDaily.removeRow(filaseleccionada);
                exito = true;
            }
            return exito;

        } catch (Exception e) {
            return exito;
        }
    }

    @Override
    public void GrabarDato() {
        TablaDaily = ((DefaultTableModel) DailyAssigmentsView.tableAssignTask.getModel());
        objDailyAssigments = (DailyAssigmentsDto) ArrayDaily.get(ArrayDaily.size() - 1);
        Object[] fila = new Object[5];
        fila[0] = objDailyAssigments.getCode() + 1;
        fila[1] = objDailyAssigments.getNameEmployeeDaily();
        fila[2] = objDailyAssigments.getCargoEmployeeDaily();
        fila[3] = objDailyAssigments.getNameTaskDaily();
        fila[4] = objDailyAssigments.getTaskProgress();
        TablaDaily.addRow(fila);
    }

    public void actualizar() {
        int indxselect = DailyAssigmentsView.tableAssignTask.getSelectedRow();
        TablaDaily = ((DefaultTableModel) DailyAssigmentsView.tableAssignTask.getModel());
        try {
            int progreso = Integer.parseInt(String.valueOf(TablaDaily.getValueAt(indxselect, 4)));
            if (progreso < 100) {
                int inputprogress = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su progreso"));
                if (inputprogress <= 100) {
                    int resultado = this.Buscar(indxselect);
                    if (resultado >= 0) {
                        objDailyAssigments = (DailyAssigmentsDto) ArrayDaily.get(resultado);
                        TablaDaily.setValueAt(inputprogress, resultado, 4);
                        Object[] fila = new Object[5];
                        fila[0] = objDailyAssigments.getCode();
                        fila[1] = objDailyAssigments.getNameEmployeeDaily();
                        fila[2] = objDailyAssigments.getCargoEmployeeDaily();
                        fila[3] = objDailyAssigments.getNameTaskDaily();
                        fila[4] = inputprogress;
                        ArrayDaily.set(indxselect, objDailyAssigments);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "EL PROGRESO DEBE SER MENOR O IGUAL A 100");
                }
            } else {
                JOptionPane.showMessageDialog(null, "LA TAREA A SIDO FINALIZADA POR TENER EL 100% DE PROGRESO");
            }
        } catch (Exception e) {
            System.out.println("OCURRIO UN ERROR" + e);
        }

    }
}
