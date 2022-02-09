package project.management.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import project.management.system.Task.Status;
import static project.management.system.ProjectManagementSystem.teamMembers;
import static project.management.system.ProjectManagementSystem.tasks;



public class TeamLeader extends TeamMember{

    public TeamLeader(String email, String username, String password, String accountType) {
        super(email, username, password, accountType);
    }

    public TeamLeader() {
    }
    
    
    public static void addTask(String taskName, String taskDeadline, Status taskStatus){
        tasks.add(new Task(String.valueOf(taskName), String.valueOf(taskDeadline),taskStatus));  
    }
    
    public static void deleteTast(String taskName){
        for (int i = 0 ; i <tasks.size();i++){
             if (taskName.equals(tasks.get(i).getTaskName()))
            {
                tasks.remove(i);
                JOptionPane.showMessageDialog(null, "Task has been deleted", "Success", JOptionPane.INFORMATION_MESSAGE);

            }
            else
                  JOptionPane.showMessageDialog(null, "The task doesn't even exist", "Not found", JOptionPane.INFORMATION_MESSAGE);
        } 
    }
    
    
    public  boolean findTask (String taskName){
        boolean foundTask = false;
        for (int i = 0; i < tasks.size();i++){
            if (taskName.equals(tasks.get(i).getTaskName())){
                foundTask = true;
            }
            
        }
        return foundTask;
    }
    
    public  boolean findMember (String memberName){
        boolean foundUser = false;
        for (int i = 0; i < teamMembers.size();i++){
            if (memberName.equals(teamMembers.get(i).getUsername())){
                foundUser = true;
            }
            
        }
        return foundUser;
    }
    
 
    
    public  void assignTask(String taskName, String memberName){
        if (taskName.equals("") || memberName.equals("")){
            JOptionPane.showMessageDialog(null, "Both Task name and Member name are required", "faild", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
             if (findMember(memberName)){
                 if(findTask(taskName)){
                     for (int i = 0 ; i < teamMembers.size(); i++){
                         for (int j = 0; j <tasks.size();j++){
                            if (memberName.equals(teamMembers.get(i).getUsername()) && taskName.equals(tasks.get(j).getTaskName())){
                                Task assignedTask = new Task(tasks.get(j));
                                assignedTask.setTaskStatus(Status.ON_GOING);
                                teamMembers.get(i).assignedTasks.add(assignedTask);
                                System.out.println(teamMembers.get(i).assignedTasks);

                               
                                }
      
                                
                            }
                           

                        
                     }
                }
                else{
                     JOptionPane.showMessageDialog(null, "Task not found", "faild", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Team Member not found", "faild", JOptionPane.INFORMATION_MESSAGE);
            }
             
        }
        
    }
    
    
    
    public  void unAssignTask(String taskName, String memberName){
       if (taskName.equals("") || memberName.equals("")){
            JOptionPane.showMessageDialog(null, "Both Task name and Member name are required", "faild", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else{
            if (findMember(memberName)){
                     for (int i = 0 ; i < teamMembers.size();i++){
                         for (int j = 0; j< teamMembers.get(i).assignedTasks.size();j++){
                            if (memberName.equals(teamMembers.get(i).getUsername()) && taskName.equals(teamMembers.get(i).assignedTasks.get(j).getTaskName())){
                                Task assignedTask = new Task(teamMembers.get(i).assignedTasks.get(j));
                                teamMembers.get(i).assignedTasks.remove(assignedTask);
                                System.out.println(teamMembers.get(i).assignedTasks);

                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Task not found", "faild", JOptionPane.INFORMATION_MESSAGE);

                            }

                         }
                     }
                 }
                 
                 
             
             else{
                JOptionPane.showMessageDialog(null, "Team Member not found", "faild", JOptionPane.INFORMATION_MESSAGE);
            }
             
        }
        
        }

 }
   

                 
    
        
     
           
                
                

