package f.project.ctl;

import f.project.Interfaz.InterfazGeneral;

import f.project.dto.EmployeeDto;
import f.project.view.EmployeeView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class EmployeeCtl extends  ClassGeneral implements InterfazGeneral {

    private ArrayList<EmployeeDto> arrayEmployee = new ArrayList();

    public EmployeeCtl() {
    }

    public ArrayList<EmployeeDto> getArrayEmployee() {
        return arrayEmployee;
    }

    public void setArrayEmployee(ArrayList<EmployeeDto> arrayEmployee) {
        this.arrayEmployee = arrayEmployee;
    }

    public void InsertEmployee(int cod, String nom, String ape, String job, Double sue, int tel, String gra) {
        EmployeeDto Employee = new EmployeeDto();
        Employee.setCode(cod);
        Employee.setName(nom);
        Employee.setSurname(ape);
        Employee.setCellphone(tel);
        Employee.setJobTitle(job);
        Employee.setGrade(gra);
        Employee.setSalary(sue);
        arrayEmployee.add(Employee);
        GrabarDato();
    }

    @Override
    public int Buscar(int dat) {
        int resultado = -1;
        for (int i = 0; i < arrayEmployee.size(); i++) {
            EmployeeDto objEmploy = (EmployeeDto) arrayEmployee.get(i);
            if (objEmploy.getCode() == dat) {
                resultado = i;
                break;
            }
        }
        return resultado;
    }

    @Override
    public boolean Eliminar() {
//        boolean exito = false;
//        int resultado = this.Buscar(123);
//        if (resultado >= 0) {
//            arrayEmployee.remove(resultado);
//            exito = true;
//        }
//        return exito;
 DefaultTableModel Tabla = ((DefaultTableModel) EmployeeView.tableEmployee.getModel());
        boolean exito = false;
        int filaseleccionada = EmployeeView.tableEmployee.getSelectedRow();
        if (filaseleccionada == -1) {
            mensajeError("No se ha seleccionado un Empleado a Eliminar");
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
        DefaultTableModel Tabla = ((DefaultTableModel) EmployeeView.tableEmployee.getModel());
        EmployeeDto objEmployee = (EmployeeDto) arrayEmployee.get(arrayEmployee.size() - 1);
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
