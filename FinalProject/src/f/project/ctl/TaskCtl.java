package f.project.ctl;

import f.project.abstracts.TaskAbstract;
import f.project.dto.TaskDto;
import java.util.ArrayList;

public class TaskCtl extends TaskAbstract{

    private ArrayList<TaskDto> arregloTask = new ArrayList();

    public TaskCtl() {
    }

    public ArrayList<TaskDto> getArregloTask() {
        return arregloTask;
    }

    public void setArregloTask(ArrayList<TaskDto> arregloTask) {
        this.arregloTask = arregloTask;
    }

    public void InsertTask(int cod, String desc, String pri, int time, String est) {
        TaskDto task = new TaskDto();
        task.setDescription(desc);
        task.setEstado(est);
        task.setPrioridad(pri);
        task.setTiempo(time);
        task.setCodigo(cod);
        arregloTask.add(task);
    }

    @Override
    public int Buscar(int cod) {
        int resultado = -1;
        for (int i = 0; i < arregloTask.size(); i++) {
            TaskDto objTask = (TaskDto) arregloTask.get(i);
            if (objTask.getCodigo() == cod) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    @Override
    public boolean Eliminar(int cod) {
        boolean exito = false;
        int resultado = this.Buscar(cod);
        if (resultado >= 0) {
            arregloTask.remove(resultado);
            exito = true;
        }
        return exito;
    }

}
