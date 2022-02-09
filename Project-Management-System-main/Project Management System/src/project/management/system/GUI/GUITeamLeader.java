/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.management.system.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project.management.system.Task;
import project.management.system.TeamLeader;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ALKODS
 */
public class GUITeamLeader extends javax.swing.JFrame {

    /**
     * Creates new form GUITeamLeader
     */
    public GUITeamLeader() {
        initComponents();
        this.setTitle("Team Leader");
        addTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               
                 if (taskName.getText().equals("") || taskDeadline.getDate() == null){
                   JOptionPane.showMessageDialog(null, "Task name and Deadline both required", "Invalid", JOptionPane.INFORMATION_MESSAGE);
               }
                else{
                      SimpleDateFormat deadline = new SimpleDateFormat("dd-MM-Y");
                      String date = deadline.format(taskDeadline.getDate());
                      TeamLeader.addTask(taskName.getText(), date, Task.Status.TO_DO);
                }
            }
        });
        
          showAllTasks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new GUITasks().setVisible(true);
                
            }
        });
          
         deleteTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               if (taskName.getText().equals("")){
                   JOptionPane.showMessageDialog(null, "Task name is required", "Invalid", JOptionPane.INFORMATION_MESSAGE);
               }
               else
                TeamLeader.deleteTast(taskName.getText());
                
            }
            
        });
          
        assign.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                TeamLeader teamLeader = new TeamLeader();
                teamLeader.assignTask(task.getText(),teamMemberName.getText());
            }
        });
       
//        unassign.addActionListener(new ActionListener() {
//            @Override
//           public void actionPerformed(ActionEvent ae) {
//                TeamLeader teamLeader = new TeamLeader();
//                teamLeader.unAssignTask(task.getText(),teamMemberName.getText());
//            }
//        });
//        

        myTasks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                //filter method
                
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taskName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addTask = new javax.swing.JButton();
        taskDeadline = new com.toedter.calendar.JDateChooser();
        showAllTasks = new javax.swing.JButton();
        deleteTask = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        task = new javax.swing.JTextField();
        teamMemberName = new javax.swing.JTextField();
        assign = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        myTasks = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Task name");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Deadline");

        addTask.setText("Add Task");

        showAllTasks.setText("Show All tasks");

        deleteTask.setText("Delete Task");

        jLabel3.setText("Task name is enough to delete it");

        assign.setText("Assign");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Task");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Team member name");

        myTasks.setText("My tasks");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(taskDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteTask)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addTask))
                            .addComponent(teamMemberName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(assign))
                            .addComponent(task)
                            .addComponent(taskName)))
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myTasks)
                        .addGap(18, 18, 18)
                        .addComponent(showAllTasks)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(taskName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(taskDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteTask)
                    .addComponent(addTask))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamMemberName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(assign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showAllTasks)
                    .addComponent(myTasks))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUITeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITeamLeader.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTask;
    private javax.swing.JButton assign;
    private javax.swing.JButton deleteTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton myTasks;
    private javax.swing.JButton showAllTasks;
    private javax.swing.JTextField task;
    private com.toedter.calendar.JDateChooser taskDeadline;
    private javax.swing.JTextField taskName;
    private javax.swing.JTextField teamMemberName;
    // End of variables declaration//GEN-END:variables
}
