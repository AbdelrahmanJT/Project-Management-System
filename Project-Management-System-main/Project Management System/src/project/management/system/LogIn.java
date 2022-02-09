
 
package project.management.system;

import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import project.management.system.GUI.*;
import static project.management.system.ProjectManagementSystem.teamMembers;



public class LogIn {
    
    
    private static String accType;
    private static String username;
    
    public static boolean validation (JTextField userName,JTextField password ) {
        boolean found = false;
        for (int i = 0 ; i < teamMembers.size() ; i++)
        {
            if (userName.getText().equals(teamMembers.get(i).getUsername()) && password.getText().equals(teamMembers.get(i).getPassword()))
            {
                    accType = teamMembers.get(i).getAccountType();
                    username = teamMembers.get(i).getUsername();
                    found = true; 
                    return found;    
            }
        
        }
        return found;
    }
    
    public static void logIn(ArrayList <Task> tasks,ArrayList <TeamMember> teamMembers , JTextField userName,JTextField password ){
        if (validation(userName, password))
                {
                    if(accType.equals("Team Member")){
                        new GUITeamMember().setVisible(true);
                    }
                    else if(accType.equals("Team Leader")){
                       new GUITeamLeader().setVisible(true);
                    }
                    
                }
        else{
            JOptionPane.showMessageDialog(null, "Wrong username OR password", "Invalid", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }


    
}

