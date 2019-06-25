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
public class EmployeeDto {
    private String code;
    private String name;
    private String surname;
    private String jobTitle;
    
    public EmployeeDto(String code, String name, String surname, String jobTitle) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.jobTitle = jobTitle;
    }
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
     

    
    
}
