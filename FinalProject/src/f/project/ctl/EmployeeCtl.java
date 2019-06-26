package f.project.ctl;

import f.project.abstracts.EmployeeAbstract;
import f.project.dto.EmployeeDto;
import java.util.ArrayList;

public class EmployeeCtl extends EmployeeAbstract {

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
        Employee.setJobTitle(job);
        Employee.setSalary(sue);
        Employee.setCellphone(tel);
        Employee.setGrade(gra);
        arrayEmployee.add(Employee);
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
        boolean exito = false;
        int resultado = this.Buscar(123);
        if (resultado >= 0) {
            arrayEmployee.remove(resultado);
            exito = true;
        }
        return exito;
    }


    @Override
    public void GrabarDato() {
      
    }

}
