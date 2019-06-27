package f.project.ctl;

import f.project.Interfaz.InterfazGeneral;
import f.project.dto.EmployeeDto;
import f.project.view.EmployeeView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EmployeeCtl extends ClassGeneral implements InterfazGeneral {

    public ArrayList<EmployeeDto> arrayEmployee = new ArrayList();
    private DefaultTableModel Tabla;
    private EmployeeDto objEmployee;

    public EmployeeCtl() {

    }

    public ArrayList<EmployeeDto> getArrayEmployee() {
        return arrayEmployee;
    }

    public void setArrayEmployee(ArrayList<EmployeeDto> arrayEmployee) {
        this.arrayEmployee = arrayEmployee;
    }

    public void InsertEmployee(int cod, String nom, String ape, String job, Double sue, int tel, String gra) {
        // arrayEmployee = new ArrayList();
        //  if (Buscar(cod) < 0) {
        EmployeeDto Employee = new EmployeeDto();
        Employee.setCode(cod);
        Employee.setName(nom);
        Employee.setSurname(ape);
        Employee.setJobTitle(job);
        Employee.setSalary(sue);
        Employee.setCellphone(tel);
        Employee.setGrade(gra);
        arrayEmployee.add(Employee);
        GrabarDato();//Grabo los Datos en la Tabla
        /* } else {
            mensajeError("El Codigo Ya ha sido Ingresado Anteriormente");
        }*/
    }

    @Override
    public int Buscar(int cod) {
        int resultado = -1;
        for (int i = 0; i < arrayEmployee.size(); i++) {
            objEmployee = (EmployeeDto) arrayEmployee.get(i);
            if (objEmployee.getCode() == cod) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    @Override
    public boolean Eliminar() {
        Tabla = ((DefaultTableModel) EmployeeView.tableEmployee.getModel());
        boolean exito = false;
        int filaseleccionada = EmployeeView.tableEmployee.getSelectedRow();
        if (filaseleccionada == -1) {
            mensajeError("No se ha seleccionado un Alumno a Eliminar");
            return exito;
        }
        String Dat = String.valueOf(Tabla.getValueAt(filaseleccionada, 0));
        int resultado = this.Buscar(Integer.parseInt(Dat));
        if (resultado >= 0) {
            arrayEmployee.remove(resultado);
            Tabla.removeRow(filaseleccionada);
            exito = true;
        }
        return exito;
    }

    @Override
    public void GrabarDato() {
        Tabla = ((DefaultTableModel) EmployeeView.tableEmployee.getModel());
        objEmployee = (EmployeeDto) arrayEmployee.get(arrayEmployee.size() - 1);
        Object[] fila = new Object[7];
        fila[0] = objEmployee.getCode();
        fila[1] = objEmployee.getName();
        fila[2] = objEmployee.getSurname();
        fila[3] = objEmployee.getCellphone();
        fila[4] = objEmployee.getJobTitle();
        fila[5] = objEmployee.getGrade();
        fila[6] = objEmployee.getSalary();
        Tabla.addRow(fila);
    }
}
