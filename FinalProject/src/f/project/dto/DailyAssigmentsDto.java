/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f.project.dto;

/**
 *
 * @author JOSDY
 */
public class DailyAssigmentsDto {
    private int code;
    private EmployeeDto employeeDto;
    private TaskDto taskDto;
    private String taskProgress;

    public DailyAssigmentsDto(int code, EmployeeDto employeeDto, TaskDto taskDto, String taskProgress) {
        this.code = code;
        this.employeeDto = employeeDto;
        this.taskDto = taskDto;
        this.taskProgress = taskProgress;
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

    public TaskDto getTaskDto() {
        return taskDto;
    }

    public void setTaskDto(TaskDto taskDto) {
        this.taskDto = taskDto;
    }

    public String getTaskProgress() {
        return taskProgress;
    }

    public void setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
    }
    
    
}
