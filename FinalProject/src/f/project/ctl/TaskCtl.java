package f.project.ctl;

import f.project.dto.TaskDto;
import f.project.view.TaskView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import f.project.Interfaz.InterfazGeneral;

public class TaskCtl extends ClassGeneral implements InterfazGeneral {

    public ArrayList<TaskDto> arregloTask = new ArrayList();
    private TaskDto objTask;
    private DefaultTableModel Tabla;

    public TaskCtl() {
    }

    public ArrayList<TaskDto> getArregloTask() {
        return arregloTask;
    }

    public void setArregloTask(ArrayList<TaskDto> arregloTask) {
        this.arregloTask = arregloTask;
    }

    public void InsertTask(int cod, String desc, String pri, int time, String est) {
        if (Buscar(cod) < 0) {
            TaskDto task = new TaskDto();
            task.setDescription(desc);
            task.setStatus(est);
            task.setPriority(pri);
            task.setTime(time);
            task.setCode(cod);
            arregloTask.add(task);
            GrabarDato();//Grabo los Datos en la Tabla
        } else {
            mensajeError("El Codigo Ya ha sido Ingresado Anteriormente");
        }
    }

    @Override
    public int Buscar(int cod) {
        int resultado = -1;
        for (int i = 0; i < arregloTask.size(); i++) {
            objTask = (TaskDto) arregloTask.get(i);
            if (objTask.getCode() == cod) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    @Override
    public boolean Eliminar() {
        Tabla = ((DefaultTableModel) TaskView.tableTask.getModel());
        boolean exito = false;
        int filaseleccionada = TaskView.tableTask.getSelectedRow();
        if (filaseleccionada == -1) {
            mensajeError("No se ha seleccionado un Alumno a Eliminar");
            return exito;
        }
        String Dat = String.valueOf(Tabla.getValueAt(filaseleccionada, 0));
        int resultado = this.Buscar(Integer.parseInt(Dat));
        if (resultado >= 0) {
            arregloTask.remove(resultado);
            Tabla.removeRow(filaseleccionada);
            exito = true;
        }
        return exito;
    }

    @Override
    public void GrabarDato() {
        Tabla = ((DefaultTableModel) TaskView.tableTask.getModel());
        objTask = (TaskDto) arregloTask.get(arregloTask.size() - 1);
        Object[] fila = new Object[5];
        fila[0] = objTask.getCode();
        fila[1] = objTask.getDescription();
        fila[2] = objTask.getPriority();
        fila[3] = objTask.getTime();
        fila[4] = objTask.getStatus();
        Tabla.addRow(fila);
    }
}
