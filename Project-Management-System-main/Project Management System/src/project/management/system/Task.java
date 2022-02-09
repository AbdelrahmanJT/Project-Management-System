package project.management.system;

public class Task {
    
    private String taskName;     
    private String taskDeadline;
    private Status taskStatus;
    
    public enum Status 
    {       
        TO_DO,
        ON_GOING,
        DONE
    }

    public Task(Task newTask) {
        this.taskName = newTask.taskName;
        this.taskDeadline = newTask.taskDeadline;
        this.taskStatus = newTask.taskStatus;
    }
   

    public Task (String taskName, String taskDeadline, Status taskStatus)
    {
        this.taskName = taskName;
        this.taskDeadline = taskDeadline;
        this.taskStatus = taskStatus;
    }
    
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDeadline(String taskDeadline) {
        this.taskDeadline = taskDeadline;
    }

    public void setTaskStatus(Status taskStatus){
        this.taskStatus = taskStatus;
    }
    public String getTaskName() {
        return taskName;
    }

    public String getTaskDeadline() {
        return taskDeadline;
    }
    
    public Status getTaskStatus(){
        return taskStatus;
    }

    @Override
    public String toString() {
        return "Task{" +"taskName=" + taskName + ", taskDeadline=" + taskDeadline + ", taskStatus=" + taskStatus + '}';
    }
    
}

