package project.management.system;


import project.management.system.GUI.*;
import java.util.ArrayList;

public class ProjectManagementSystem {
    public static ArrayList <TeamMember> teamMembers = new ArrayList<>();
    public static ArrayList <Task> tasks = new ArrayList<>();
        

    public static void main(String[] args) {
       TeamMember  user1 = new TeamMember("ahmed@gmail","ahmed","123","Team Member");
       TeamMember  user2 = new TeamMember("sasa","sasa","123","Team Leader");
       
       Task task = new Task("Task 1", "25-1-2021", Task.Status.TO_DO);
       Task task2 = new Task("Task 2", "25-1-2021", Task.Status.TO_DO);

       tasks.add(task);
       tasks.add(task2);
       
       teamMembers.add(user1);
       teamMembers.add(user2);
       
       new GUILogIn().setVisible(true);
    }    
}
