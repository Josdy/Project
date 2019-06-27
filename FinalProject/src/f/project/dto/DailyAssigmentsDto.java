package f.project.dto;

import f.project.ctl.EmployeeCtl;
import f.project.ctl.TaskCtl;

public class DailyAssigmentsDto {

    private int code;
    private EmployeeDto employeeDto;
    private EmployeeCtl employeeCtl;
    private TaskDto taskDto;
    private TaskCtl taskCtl;
    private String taskProgress;

    public DailyAssigmentsDto() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public EmployeeDto getEmployeeDto() {
        return employeeDto;
    }

    public void setEmployeeDto(EmployeeDto employeeDto) {
        this.employeeDto = employeeDto;
    }

    public EmployeeCtl getEmployeeCtl() {
        return employeeCtl;
    }

    public void setEmployeeCtl(EmployeeCtl employeeCtl) {
        this.employeeCtl = employeeCtl;
    }

    public TaskDto getTaskDto() {
        return taskDto;
    }

    public void setTaskDto(TaskDto taskDto) {
        this.taskDto = taskDto;
    }

    public TaskCtl getTaskCtl() {
        return taskCtl;
    }

    public void setTaskCtl(TaskCtl taskCtl) {
        this.taskCtl = taskCtl;
    }

    public String getTaskProgress() {
        return taskProgress;
    }

    public void setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
    }

}
