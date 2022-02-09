package project.management.system;

import java.util.ArrayList;

public class TeamMember {
    private String email;
    private String username;
    private String password;
    private String accountType;
    public ArrayList<Task> assignedTasks = new ArrayList<>();

    public TeamMember() {
    }

    public TeamMember(String email, String username,  String password ,String accountType) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.accountType = accountType;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
     public String getEmail() {
        return email;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getAccountType() {
        return accountType;
    }    
    
    
}