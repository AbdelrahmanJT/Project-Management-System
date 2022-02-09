
package project.management.system;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import project.management.system.GUI.*;
import static project.management.system.ProjectManagementSystem.teamMembers;



public class SignUp {
    
  
    public SignUp(ArrayList <TeamMember> teamMembers) {   
    }

    
    
    public static boolean checkUserName(JTextField userName){
        boolean foundUser = false;
        for (int j = 0 ; j < teamMembers.size(); j++){
            if (teamMembers.get(j).getUsername().equals(String.valueOf(userName.getText()))){
            foundUser = true;
            }
        }
        return foundUser;
    }

    
    
    public static boolean checkEmail(JTextField email){
        boolean found = false;
        for (int j = 0 ; j < teamMembers.size(); j++){
            if (teamMembers.get(j).getEmail().equals(String.valueOf(email.getText()))){
            found = true;
            }
        }
        return found;
    }
    
    
    
    
    public static void register(JTextField email, JTextField userName, JTextField password,JRadioButton teamMember,JRadioButton teamLeader){
                 if(email.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Email is required", "Invalid", JOptionPane.INFORMATION_MESSAGE);

                }
                else if (userName.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Username is required", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                   
                }
                else if (password.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "password is required", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                    
                }
                else if (teamMember.isSelected() == false && teamLeader.isSelected()==false){    
                    JOptionPane.showMessageDialog(null, "Account Type is required", "Invalid", JOptionPane.INFORMATION_MESSAGE);
                }

                
                else{
                    if(SignUp.checkEmail(email)){
                        JOptionPane.showMessageDialog(null, "Email already exists, Try another", "Invalid", JOptionPane.INFORMATION_MESSAGE);      
                    }
                    else if (SignUp.checkUserName(userName)){
                        
                        JOptionPane.showMessageDialog(null, " Username already exists, Try another", "Invalid", JOptionPane.INFORMATION_MESSAGE);                              
                    }
                    else{
                        String accType = "";
                        if (teamMember.isSelected())
                        {
                            accType = "Team Member";
                        }
                        else if (teamLeader.isSelected())
                        {
                            accType = "Team Leader";
                        }   
                        TeamMember added = new TeamMember(email.getText(),userName.getText(), password.getText(),accType);
                        teamMembers.add(added);
                        
                        
                        //We will replace this with the Pagew we'll creaate
                        if(added.getAccountType().equals("Team Member")){
                            new GUITasks().setVisible(true);
                        }
                        else if(added.getAccountType().equals("Team Leader")){
                            new GUITeamLeader().setVisible(true);
                        }                    
                    
                        
                    }
                    
                }
    }
}        


