package f.project.abstracts;

import f.project.Interfaz.InterfazGeneral;
import f.project.dto.TaskDto;
public abstract class TaskAbstract implements InterfazGeneral{

    protected static final String Estado1 = "ASIGNADO";
    protected static final String Estado2 = "NO ASIGNADO";
    public static final String PRIORIDAD1 = "ALTO";
    public static final String PRIORIDAD2 = "MEDIO";
    public static final String PRIORIDAD3 = "BAJO";
    private TaskAbstract(){
        
    }
   
    public static  InterfazGeneral Priority(String tipo){
        InterfazGeneral tp= null;
        switch(tipo){
            case PRIORIDAD1: case PRIORIDAD2: case PRIORIDAD3:
              tp=  (InterfazGeneral) new TaskDto();
                break;
        }
        return tp;
    }
}
