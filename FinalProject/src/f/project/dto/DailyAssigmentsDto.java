package f.project.dto;

import f.project.ctl.EmployeeCtl;
import f.project.ctl.TaskCtl;

public class DailyAssigmentsDto {

    private int code;
    private String nameEmployeeDaily;
    private String cargoEmployeeDaily;
    private String nameTaskDaily;
    private String progressTaskDaily;
    private String taskProgress;

    public DailyAssigmentsDto() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNameEmployeeDaily() {
        return nameEmployeeDaily;
    }

    public void setNameEmployeeDaily(String nameEmployeeDaily) {
        this.nameEmployeeDaily = nameEmployeeDaily;
    }

    public String getCargoEmployeeDaily() {
        return cargoEmployeeDaily;
    }

    public void setCargoEmployeeDaily(String cargoEmployeeDaily) {
        this.cargoEmployeeDaily = cargoEmployeeDaily;
    }

    public String getNameTaskDaily() {
        return nameTaskDaily;
    }

    public void setNameTaskDaily(String nameTaskDaily) {
        this.nameTaskDaily = nameTaskDaily;
    }

    public String getProgressTaskDaily() {
        return progressTaskDaily;
    }

    public void setProgressTaskDaily(String progressTaskDaily) {
        this.progressTaskDaily = progressTaskDaily;
    }

    public String getTaskProgress() {
        return taskProgress;
    }

    public void setTaskProgress(String taskProgress) {
        this.taskProgress = taskProgress;
    }

}
