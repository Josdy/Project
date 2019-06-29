/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f.project.dao;

import f.project.view.DailyAssigmentsView;
import f.project.view.EmployeeView;
import f.project.view.TaskView;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giancarlo
 */
public class DailyAssigmentsDao {

    private DefaultTableModel TablaEmployee;
    private DefaultTableModel TablaTask;

    public void loadEmployee() {
        DailyAssigmentsView.cboEmployees.removeAllItems();

        DailyAssigmentsView.cboEmployees.addItem("SELECCIONAR EMPLEADO");
        TablaEmployee = ((DefaultTableModel) EmployeeView.tableEmployee.getModel());
        for (int i = 0; i < TablaEmployee.getRowCount(); i++) {
            String name = String.valueOf(TablaEmployee.getValueAt(i, 1));
            String surname = String.valueOf(TablaEmployee.getValueAt(i, 2));
            DailyAssigmentsView.cboEmployees.addItem(name + surname);
        }
    }

    public void loadTask() {
        DailyAssigmentsView.cboTasks.removeAllItems();
        DailyAssigmentsView.cboTasks.addItem("SELECCIONAR TAREA");
        TablaTask = ((DefaultTableModel) TaskView.tableTask.getModel());
        for (int i = 0; i < TablaTask.getRowCount(); i++) {
            String TaskAsignar = String.valueOf(TablaTask.getValueAt(i, 1));
            DailyAssigmentsView.cboTasks.addItem(TaskAsignar);
        }
    }
}
