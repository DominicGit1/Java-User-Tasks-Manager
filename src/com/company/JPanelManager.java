package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class JPanelManager extends JFrame {
    public JPanelManager() {
        super("User Task Manager");
        loginMenu(); // calls the first login menu
    }

    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");

    public void loginMenu() {
        // create a new panel with GridBagLayout manager
        JPanel loginPanel = new JPanel(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        loginPanel.add(labelUsername, constraints);

        constraints.gridx = 1;
        loginPanel.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        loginPanel.add(labelPassword, constraints);

        constraints.gridx = 1;
        loginPanel.add(fieldPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        loginPanel.add(buttonLogin, constraints);

        // set border for the panel
        loginPanel.setPreferredSize(new Dimension(600, 600));
        loginPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));

        // add the panel to this frame
        add(loginPanel);

        pack();
        setLocationRelativeTo(null);
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if ((src == buttonLogin) && (textUsername.getText().equals("Admin")) && (fieldPassword.getText().equals("123"))) // on pressing login button
                {
                    loginPanel.removeAll(); // removes all loginPanel components
                    instantiateMenu(); // moves onto the next menu
                }
            }
        });
    }

    private JLabel labelUser = new JLabel("Hello User.");
    private JButton buttonMembers = new JButton("View Member(s)");
    private JButton buttonTeams = new JButton("View Team(s)");
    private JButton buttonTasks = new JButton("View Task(s)");
    private JButton buttonCategories = new JButton("View Categories");


    private JPanel userPanel = new JPanel(new GridBagLayout());

    public void instantiateMenu() {
        labelUser.setOpaque(true);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;
        userPanel.add(labelUser, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonMembers, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonTeams, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonTasks, constraints);

        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonCategories, constraints);

        // set border for the panel
        userPanel.setPreferredSize(new Dimension(600, 600));
        userPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "User Panel"));

        // MEMBER   GUI
        GridBagConstraints MemberConstraints = new GridBagConstraints();
        MemberConstraints.anchor = GridBagConstraints.WEST;
        MemberConstraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        MemberConstraints.gridx = 0;
        MemberConstraints.gridy = 0;
        userPanel.add(labelMenuMembers, MemberConstraints);

        MemberConstraints.gridy = 1;
        userPanel.add(labelMenuUsername, MemberConstraints);
        MemberConstraints.gridy = 2;
        userPanel.add(labelMenuPassword, MemberConstraints);

        MemberConstraints.gridx = 0;
        MemberConstraints.gridy = 3;
        MemberConstraints.gridwidth = 2;
        MemberConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonPreviousMember, MemberConstraints);
        MemberConstraints.gridx = 1;
        userPanel.add(buttonNextMember, MemberConstraints);
        MemberConstraints.gridx = 1;
        MemberConstraints.gridy = 8;
        userPanel.add(buttonCreateMember, MemberConstraints);

        MemberConstraints.gridx = 2;
        MemberConstraints.gridy = 12;
        userPanel.add(buttonDeleteMember, MemberConstraints);
        MemberConstraints.gridx = 0;
        userPanel.add(buttonEditMember, MemberConstraints);

        MemberConstraints.gridx = 0;
        MemberConstraints.gridy = 8;
        MemberConstraints.gridwidth = 2;
        MemberConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturn, MemberConstraints);


        menuMembersVis(false);
        // TASKS    GUI

        GridBagConstraints constraintsTasks = new GridBagConstraints();
        constraintsTasks.anchor = GridBagConstraints.WEST;
        constraintsTasks.insets = new Insets(12, 12, 12, 12);

        // add components to the panel
        constraintsTasks.gridx = 0;
        constraintsTasks.gridy = 0;
        userPanel.add(labelMenuTasks, constraintsTasks);
        constraintsTasks.gridy = 1;
        userPanel.add(labelMenuTaskName, constraintsTasks);
        constraintsTasks.gridy = 2;
        userPanel.add(labelMenuTaskDescription, constraintsTasks);
        constraintsTasks.gridy = 3;
        userPanel.add(labelMenuTaskDueDate, constraintsTasks);
        constraintsTasks.gridy = 4;
        userPanel.add(labelMenuTaskCreatedOn, constraintsTasks);
        constraintsTasks.gridy = 5;
        userPanel.add(labelMenuTaskStatus, constraintsTasks);
        constraintsTasks.gridy = 6;
        userPanel.add(labelMenuTaskCreatedBy, constraintsTasks);
        constraintsTasks.gridy = 7;
        userPanel.add(labelMenuTaskAssignedTo, constraintsTasks);
        constraintsTasks.gridy = 8;
        userPanel.add(labelMenuTaskSubtasks, constraintsTasks);

        constraintsTasks.gridy = 9;
        userPanel.add(buttonPreviousTask, constraintsTasks);
        constraintsTasks.gridx = 1;
        userPanel.add(buttonNextTask, constraintsTasks);
        constraintsTasks.gridx = 1;
        constraintsTasks.gridy = 10;
        userPanel.add(buttonCreateTask, constraintsTasks);
        constraintsTasks.gridx = 1;
        constraintsTasks.gridy = 12;
        userPanel.add(buttonDeleteTask, constraintsTasks);
        constraintsTasks.gridx = 0;
        constraintsTasks.gridy = 12;
        userPanel.add(buttonEditTask, constraintsTasks);

        constraintsTasks.gridx = 0;
        constraintsTasks.gridy = 10;

        userPanel.add(buttonTaskReturn, constraintsTasks);

        constraintsTasks.gridwidth = 2;
        constraintsTasks.anchor = GridBagConstraints.CENTER;
        menuTasksVis(false);

        // Teams GUI

        GridBagConstraints constraintsTeams = new GridBagConstraints();
        constraintsTeams.anchor = GridBagConstraints.WEST;
        constraintsTeams.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        constraintsTeams.gridx = 0;
        constraintsTeams.gridy = 0;
        userPanel.add(labelMenuTeams, constraintsTeams);


        constraintsTeams.gridy = 1;
        userPanel.add(labelMenuTeamName, constraintsTeams);
        constraintsTeams.gridy = 2;
        userPanel.add(labelMenuTeamMembers, constraintsTeams);

        constraintsTeams.gridy = 3;
        userPanel.add(buttonPreviousTeam, constraintsTeams);
        constraintsTeams.gridx = 1;

        userPanel.add(buttonNextTeam, constraintsTeams);
        constraintsTeams.gridx = 0;
        constraintsTeams.gridy = 4;
        userPanel.add(textMenuTeamaddMember, constraintsTeams);

        constraintsTeams.gridx = 1;
        userPanel.add(buttonTeamAddMember, constraintsTeams);

        constraintsTeams.gridx = 2;
        userPanel.add(labelMenuTeamAddMemberError, constraintsTeams);

        constraintsTeams.gridx = 0;
        constraintsTeams.gridy = 5;
        constraintsTeams.gridwidth = 2;
        constraintsTeams.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonCreateTeam, constraintsTeams);
        constraintsTeams.gridx = 0;
        constraintsTeams.gridy = 7;
        userPanel.add(buttonDeleteTeam, constraintsTeams);

        constraintsTeams.gridx = 0;
        constraintsTeams.gridy = 7;
        userPanel.add(buttonDeleteTeam, constraintsTeams);
        constraintsTeams.gridx = 1;
        constraintsTeams.gridy = 8;
        userPanel.add(buttonEditTeam, constraintsTeams);

        constraintsTeams.gridx = 0;
        constraintsTeams.gridy = 8;
        constraintsTeams.gridwidth = 2;
        constraintsTeams.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturn, constraintsTeams);
        menuTeamsVis(false);

        //CATEGORIES GUI

        GridBagConstraints categoryConstraints = new GridBagConstraints();
        categoryConstraints.anchor = GridBagConstraints.WEST;
        categoryConstraints.insets = new Insets(10, 10, 10, 10);

        // add components to the panel
        categoryConstraints.gridx = 0;
        categoryConstraints.gridx = 0;
        categoryConstraints.gridy = 0;
        userPanel.add(labelMenuCategory, categoryConstraints);
        categoryConstraints.gridy = 1;
        userPanel.add(labelViewCategoryName, categoryConstraints);
        categoryConstraints.gridy = 2;
        userPanel.add(labelViewCategoryTaskList, categoryConstraints);

        categoryConstraints.gridy = 3;

        userPanel.add(buttonPreviousCategory, categoryConstraints);

        categoryConstraints.gridx = 1;
        userPanel.add(buttonNextCategory, categoryConstraints);


        categoryConstraints.gridy = 4;
        categoryConstraints.gridx = 0;
        userPanel.add(textMenuCategoryaddTask, categoryConstraints);

        categoryConstraints.gridx = 1;
        userPanel.add(buttonCategoryAddTask, categoryConstraints);

        categoryConstraints.gridx = 2;
        userPanel.add(labelMenuCategoryAddTaskError, categoryConstraints);
        categoryConstraints.gridx = 0;
        categoryConstraints.gridy = 8;
        categoryConstraints.gridwidth = 2;
        userPanel.add(buttonReturn, categoryConstraints);


        categoryConstraints.gridx = 1;
        categoryConstraints.gridy = 8;
        categoryConstraints.gridwidth = 2;

        userPanel.add(buttonCreateCategory, categoryConstraints);
        categoryConstraints.gridy = 10;
        userPanel.add(buttonDeleteCategory, categoryConstraints);
        categoryConstraints.gridx = 0;
        categoryConstraints.gridy = 10;
        userPanel.add(buttonEditCategory, categoryConstraints);
        menuCategoryVis(false);

        // Task Adding Menu GUI
        GridBagConstraints TaskCon = new GridBagConstraints();
        TaskCon.anchor = GridBagConstraints.WEST;
        TaskCon.insets = new Insets(10, 10, 10, 10);
        TaskCon.gridx = 0;
        TaskCon.gridy = 0;
        TaskCon.anchor = GridBagConstraints.CENTER;
        userPanel.add(labelTaskName, TaskCon);
        TaskCon.gridy = 1;
        userPanel.add(labelTaskDescription, TaskCon);
        TaskCon.gridy = 2;
        userPanel.add(labelTaskDueDate, TaskCon);
        TaskCon.gridy = 3;
        userPanel.add(labelTaskCreatedOn, TaskCon);
        TaskCon.gridy = 4;
        userPanel.add(labelTaskStatus, TaskCon);
        TaskCon.gridy = 5;
        userPanel.add(labelTaskCreatedBy, TaskCon);
        TaskCon.gridy = 6;
        userPanel.add(labelTaskAssignedTo, TaskCon);


        TaskCon.gridx = 1;
        TaskCon.anchor = GridBagConstraints.CENTER;

        TaskCon.gridy = 0;
        userPanel.add(textTaskName, TaskCon);
        TaskCon.gridy = 1;
        userPanel.add(textTaskDescription, TaskCon);
        TaskCon.gridy = 2;
        userPanel.add(textTaskDueDate, TaskCon);
        TaskCon.gridy = 3;
        userPanel.add(textTaskCreatedOn, TaskCon);
        TaskCon.gridy = 4;
        userPanel.add(textTaskStatus, TaskCon);
        TaskCon.gridy = 5;
        userPanel.add(textTaskCreatedBy, TaskCon);
        TaskCon.gridy = 6;
        userPanel.add(textTaskAssignedTo, TaskCon);
        TaskCon.gridx = 3;
        TaskCon.gridy = 7;
        userPanel.add(comboColorBox, TaskCon);
        TaskCon.gridx = 0;
        TaskCon.gridy = 8;
        TaskCon.anchor = GridBagConstraints.CENTER;
        userPanel.add(buttonReturnSecond, TaskCon);
        TaskCon.gridx = 1;
        userPanel.add(buttonTaskCreate, TaskCon);
        userPanel.add(buttonTaskEdit, TaskCon);
        menuCreateTaskVis(false);

        //Member adding GUI

        GridBagConstraints MemberAddConstraints = new GridBagConstraints();
        MemberAddConstraints.anchor = GridBagConstraints.WEST;
        MemberAddConstraints.insets = new Insets(10, 10, 10, 10);
        MemberAddConstraints.gridx = 0;
        MemberAddConstraints.gridy = 0;
        MemberAddConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(labelMemberUsername, MemberAddConstraints);
        MemberAddConstraints.gridy = 1;
        userPanel.add(labelMemberPassword, MemberAddConstraints);


        MemberAddConstraints.gridx = 1;
        MemberAddConstraints.anchor = GridBagConstraints.CENTER;

        MemberAddConstraints.gridy = 0;
        userPanel.add(textMemberUsername, MemberAddConstraints);
        MemberAddConstraints.gridy = 1;
        userPanel.add(textMemberPassword, MemberAddConstraints);
        MemberAddConstraints.gridy = 2;

        MemberAddConstraints.anchor = GridBagConstraints.CENTER;

        MemberAddConstraints.gridx = 0;
        userPanel.add(buttonMemberReturn, MemberAddConstraints);
        MemberAddConstraints.gridx = 1;
        userPanel.add(buttonMemberCreate, MemberAddConstraints);
        userPanel.add(buttonMemberEdit, MemberAddConstraints);
        menuCreateMemberVis(false);

        // MENU  CATEGORY CREATE GUI


        GridBagConstraints CategoryAddConstraints = new GridBagConstraints();
        CategoryAddConstraints.anchor = GridBagConstraints.WEST;
        CategoryAddConstraints.insets = new Insets(10, 10, 10, 10);
        CategoryAddConstraints.gridx = 0;
        CategoryAddConstraints.gridy = 0;
        CategoryAddConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(labelCategoryName, CategoryAddConstraints);
        CategoryAddConstraints.gridy = 1;
        userPanel.add(labelCategoryDescription, CategoryAddConstraints);
        CategoryAddConstraints.gridy = 2;
        userPanel.add(labelCategoryCreatedOn, CategoryAddConstraints);
        CategoryAddConstraints.gridy = 3;
        userPanel.add(labelCategoryCreatedBy, CategoryAddConstraints);


        CategoryAddConstraints.gridx = 1;
        CategoryAddConstraints.anchor = GridBagConstraints.CENTER;

        CategoryAddConstraints.gridy = 0;
        userPanel.add(textCategoryName, CategoryAddConstraints);
        CategoryAddConstraints.gridy = 1;
        userPanel.add(textCategoryDescription, CategoryAddConstraints);
        CategoryAddConstraints.gridy = 2;
        userPanel.add(textCategoryCreatedOn, CategoryAddConstraints);
        CategoryAddConstraints.gridy = 3;
        userPanel.add(textCategoryCreatedBy, CategoryAddConstraints);
        CategoryAddConstraints.gridy = 4;

        CategoryAddConstraints.anchor = GridBagConstraints.CENTER;

        CategoryAddConstraints.gridx = 0;
        userPanel.add(buttonCategoryReturn, CategoryAddConstraints);
        CategoryAddConstraints.gridx = 1;
        userPanel.add(buttonCategoryCreate, CategoryAddConstraints);
        userPanel.add(buttonCategoryEdit, CategoryAddConstraints);
        menuCreateCategoryVis(false);


        //MENU TEAM CREATE GUI


        GridBagConstraints TeamAddConstraints = new GridBagConstraints();
        TeamAddConstraints.anchor = GridBagConstraints.WEST;
        TeamAddConstraints.insets = new Insets(10, 10, 10, 10);
        TeamAddConstraints.gridx = 0;
        TeamAddConstraints.gridy = 0;
        TeamAddConstraints.anchor = GridBagConstraints.CENTER;
        userPanel.add(labelTeamName, TeamAddConstraints);


        TeamAddConstraints.gridx = 1;
        TeamAddConstraints.anchor = GridBagConstraints.CENTER;

        TeamAddConstraints.gridy = 0;
        userPanel.add(textTeamName, TeamAddConstraints);
        TeamAddConstraints.gridy = 1;
        TeamAddConstraints.anchor = GridBagConstraints.CENTER;

        TeamAddConstraints.gridx = 0;
        userPanel.add(buttonTeamReturn, TeamAddConstraints);
        TeamAddConstraints.gridx = 1;
        userPanel.add(buttonTeamCreate, TeamAddConstraints);
        userPanel.add(buttonTeamEdit, TeamAddConstraints);
        menuCreateTeamVis(false);


        add(userPanel);
        pack();
        setLocationRelativeTo(null);

        //Selection Menu Buttons

        buttonMembers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonMembers) // on pressing button
                {
                    userPanel.setBackground(Color.CYAN);
                    invis(false);//set general stuff visibility to false
                    menuMembers(); // moves onto the next menu
                }
            }
        });
        buttonTeams.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonTeams) // on pressing button
                {
                    userPanel.setBackground(Color.RED);
                    invis(false);//set general stuff visibility to false
                    menuTeams(); // moves onto the next menu
                }
            }
        });
        buttonTasks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonTasks) // on pressing button
                { // turns the menu buttons off
                    userPanel.setBackground(Color.GREEN);
                    invis(false);//set general stuff visibility to false
                    menuTasks(); // moves onto the next menu
                }
            }
        });

        buttonCategories.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonCategories) // on pressing button
                {
                    userPanel.setBackground(Color.YELLOW);
                    userPanel.setBackground(Color.YELLOW);
                    invis(false);//set general stuff visibility to false
                    menuCategories(); // moves onto the next menu
                }
            }
        });
        // Menu View Member Buttons

        buttonEditMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonEditMember) // on pressing button
                {

                    menuMembersVis(false);
                    menuCreateMember(true); // moves onto the next menu
                }
            }
        });
        buttonCreateMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonCreateMember) // on pressing button
                {

                    menuMembersVis(false);
                    menuCreateMember(false); // moves onto the next menu
                }
            }
        });
        buttonNextMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonNextMember) // on pressing button
                {
                    if ((memberIndex + 1) < members.size()) {
                        memberIndex++;
                        labelMenuUsername.setText("Username: " + members.get(memberIndex).getUsername());
                        labelMenuPassword.setText("Password: " + members.get(memberIndex).getPassword());
                    }

                }
            }
        });

        buttonPreviousMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonPreviousMember) // on pressing button
                {
                    if ((memberIndex - 1) >= 0) {
                        memberIndex--;
                        labelMenuUsername.setText("Username: " + members.get(memberIndex).getUsername());
                        labelMenuPassword.setText("Password: " + members.get(memberIndex).getPassword());
                    }

                }
            }
        });
        buttonReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonReturn) // on pressing button
                {
                    menuMembersVis(false);
                    selectMenu(); // moves onto the next menu
                }
            }
        });
        buttonDeleteMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonDeleteMember) // on pressing button
                {
                    if ((memberIndex - 1) >= 0) {
                        members.remove(memberIndex);
                        memberIndex--;
                        labelMenuUsername.setText("Username: " + members.get(memberIndex).getUsername());
                        labelMenuPassword.setText("Password: " + members.get(memberIndex).getPassword());

                        // moves onto the next menu
                    }
                }
            }
        });
        // Menu View Team Buttons

        buttonCreateTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonCreateTeam) // on pressing button
                {
                    menuTeamsVis(false);
                    menuCreateTeam(false); // moves onto the next menu
                }
            }
        });

        buttonEditTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonEditTeam) // on pressing button
                {
                    menuTeamsVis(false);
                    menuCreateTeam(true); // moves onto the next menu
                }
            }
        });
        buttonTeamAddMember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonTeamAddMember) // on pressing button
                {
                    int index= memberSearch(textMenuTeamaddMember.getText());

                    if(index== 0)// no match and display error text
                    {
                        labelMenuTeamAddMemberError.setVisible(true);
                    }
                    else // match and add to team
                    {

                        labelMenuTeamAddMemberError.setVisible(false);
                        teams.get(teamIndex).addMember(members.get(index));
                        labelMenuTeamMembers.setText("Members: " + teams.get(teamIndex).getMemberNames());
                    }

                }
            }
        });

        buttonNextTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonNextTeam) // on pressing button
                {
                    if ((teamIndex + 1) < teams.size()) {
                        teamIndex++;
                        labelMenuTeamName.setText("Name: " + teams.get(teamIndex).getName());

                        labelMenuTeamMembers.setText("Members: " + teams.get(teamIndex).getMemberNames());
                    }

                }
            }
        });

        buttonPreviousTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonPreviousTeam) // on pressing button
                {
                    if ((teamIndex - 1) >= 0) {
                        teamIndex--;
                        labelMenuTeamName.setText("Name: " + teams.get(teamIndex).getName());

                        labelMenuTeamMembers.setText("Members: " + teams.get(teamIndex).getMemberNames());
                    }

                }
            }
        });

        buttonDeleteTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();


                if (src == buttonDeleteTeam) // on pressing button
                {

                    if ((teamIndex - 1) >= 0) {
                        teams.remove(teamIndex);
                        teamIndex--;
                        labelMenuTeamName.setText("Name: " + teams.get(teamIndex).getName());

                        labelMenuTeamMembers.setText("Members: " + teams.get(teamIndex).getMemberNames());
                        // moves onto the next menu
                    }
                }
            }
        });

        buttonReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonReturn) // on pressing button
                {
                    menuTeamsVis(false);
                    selectMenu(); // moves onto the next menu
                }
            }
        });

        //menu View Tasks Buttons

        buttonCreateTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonCreateTask) // on pressing button
                {
                    menuTasksVis(false);
                    menuCreateTask(false); // moves onto the next menu
                }
            }
        });

        buttonEditTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonEditTask) // on pressing button
                {
                    menuTasksVis(false);
                    menuCreateTask(true); // moves onto the next menu
                }
            }
        });

        buttonNextTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonNextTask) // on pressing button
                {
                    if ((taskIndex + 1) < tasks.size()) {
                        taskIndex++;
                        labelMenuTaskName.setText("Name: " + tasks.get(taskIndex).getName());
                        if (tasks.get(taskIndex).getTextColor() == "White") {
                            labelMenuTaskName.setForeground(Color.WHITE);
                        } else if (tasks.get(taskIndex).getTextColor() == "Black")
                            labelMenuTaskName.setForeground(Color.BLACK);
                        else if (tasks.get(taskIndex).getTextColor() == "Red")
                            labelMenuTaskName.setForeground(Color.RED);
                        else if (tasks.get(taskIndex).getTextColor() == "Green")
                            labelMenuTaskName.setForeground(Color.GREEN);
                        labelMenuTaskDescription.setText("Description: " + tasks.get(taskIndex).getDescription());
                        labelMenuTaskDueDate.setText("Due Date: " + tasks.get(taskIndex).getDue_date());
                        labelMenuTaskCreatedOn.setText("Created On: " + tasks.get(taskIndex).getCreated_on());
                        labelMenuTaskStatus.setText("Status: " + tasks.get(taskIndex).getStatus());
                        labelMenuTaskCreatedBy.setText("Created By: " + tasks.get(taskIndex).getCreated_by().getUsername());
                        labelMenuTaskAssignedTo.setText("Assigned To: " + tasks.get(taskIndex).getAssigned_to().getUsername());
                        labelMenuTaskSubtasks.setText("Subtasks: " + tasks.get(taskIndex).getSubtasks());
                    }

                }
            }
        });

        buttonPreviousTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonPreviousTask) // on pressing button
                {
                    if ((taskIndex - 1) >= 0) {
                        taskIndex--;
                        labelMenuTaskName.setText("Name: " + tasks.get(taskIndex).getName());
                        if (tasks.get(taskIndex).getTextColor() == "White") { // Color
                            labelMenuTaskName.setForeground(Color.WHITE);
                        } else if (tasks.get(taskIndex).getTextColor() == "Black")
                            labelMenuTaskName.setForeground(Color.BLACK);
                        else if (tasks.get(taskIndex).getTextColor() == "Red")
                            labelMenuTaskName.setForeground(Color.RED);
                        else if (tasks.get(taskIndex).getTextColor() == "Green")
                            labelMenuTaskName.setForeground(Color.GREEN);
                        labelMenuTaskDescription.setText("Description: " + tasks.get(taskIndex).getDescription());
                        labelMenuTaskDueDate.setText("Due Date: " + tasks.get(taskIndex).getDue_date());
                        labelMenuTaskCreatedOn.setText("Created On: " + tasks.get(taskIndex).getCreated_on());
                        labelMenuTaskStatus.setText("Status: " + tasks.get(taskIndex).getStatus());
                        labelMenuTaskCreatedBy.setText("Created By: " + tasks.get(taskIndex).getCreated_by().getUsername());
                        labelMenuTaskAssignedTo.setText("Assigned To: " + tasks.get(taskIndex).getAssigned_to().getUsername());
                        labelMenuTaskSubtasks.setText("Subtasks: " + tasks.get(taskIndex).getSubtasks());
                    }

                }
            }
        });
        buttonTaskReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonTaskReturn) // on pressing button
                {
                    menuTasksVis(false);
                    selectMenu(); // moves onto the next menu
                }
            }
        });

        buttonDeleteTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonDeleteTask) // on pressing button
                {
                    if ((taskIndex - 1) >= 0) {
                        tasks.remove(taskIndex);
                        taskIndex--;
                        labelMenuTaskName.setText("Name: " + tasks.get(taskIndex).getName());
                        if (tasks.get(taskIndex).getTextColor() == "White") { // Color
                            labelMenuTaskName.setForeground(Color.WHITE);
                        } else if (tasks.get(taskIndex).getTextColor() == "Black")
                            labelMenuTaskName.setForeground(Color.BLACK);
                        else if (tasks.get(taskIndex).getTextColor() == "Red")
                            labelMenuTaskName.setForeground(Color.RED);
                        else if (tasks.get(taskIndex).getTextColor() == "Green")
                            labelMenuTaskName.setForeground(Color.GREEN);
                        labelMenuTaskDescription.setText("Description: " + tasks.get(taskIndex).getDescription());
                        labelMenuTaskDueDate.setText("Due Date: " + tasks.get(taskIndex).getDue_date());
                        labelMenuTaskCreatedOn.setText("Created On: " + tasks.get(taskIndex).getCreated_on());
                        labelMenuTaskStatus.setText("Status: " + tasks.get(taskIndex).getStatus());
                        labelMenuTaskCreatedBy.setText("Created By: " + tasks.get(taskIndex).getCreated_by().getUsername());
                        labelMenuTaskAssignedTo.setText("Assigned To: " + tasks.get(taskIndex).getAssigned_to().getUsername());
                        labelMenuTaskSubtasks.setText("Subtasks: " + tasks.get(taskIndex).getSubtasks());
                    }
                }
            }
        });
        // Menu View Categories Buttons
        buttonCategoryAddTask.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonCategoryAddTask) // on pressing button
                {

                    int index= taskSearch(textMenuCategoryaddTask.getText());

                    if(index== 0)// no match and display error text
                    {
                        labelMenuCategoryAddTaskError.setVisible(true);
                    }
                    else // match and add to Category
                    {

                        labelMenuCategoryAddTaskError.setVisible(false);
                        categories.get(categoryIndex).addTask(tasks.get(index));
                        labelViewCategoryTaskList.setText("Tasks: " + categories.get(categoryIndex).getTaskNames());
                    }


                }
            }
        });


        buttonNextCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonNextCategory) // on pressing button
                {
                    if ((categoryIndex + 1) < categories.size()) {
                        categoryIndex++;
                        labelViewCategoryName.setText("Name: " + categories.get(categoryIndex).getName());
                        labelViewCategoryTaskList.setText("Tasks: " + categories.get(categoryIndex).getTaskNames());
                        //labelViewCategoryDescription.setText("Description: " + categories.get(categoryIndex).getDescription());
                        //labelViewCategoryCreatedBy.setText("Created By: " + categories.get(categoryIndex).getCreated_by());
                        //labelViewCategoryCreatedOn.setText("Created On: " + categories.get(categoryIndex).getCreated_on());
                    }

                }
            }
        });

        buttonPreviousCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonPreviousCategory) // on pressing button
                {
                    if ((categoryIndex - 1) >= 0) {
                        categoryIndex--;
                        labelViewCategoryName.setText("Name: " + categories.get(categoryIndex).getName());
                        // labelViewCategoryDescription.setText("Description: " + categories.get(categoryIndex).getDescription());
                        //labelViewCategoryCreatedBy.setText("Created By: " + categories.get(categoryIndex).getCreated_by());
                        //labelViewCategoryCreatedOn.setText("Created On: " + categories.get(categoryIndex).getCreated_on());
                        labelViewCategoryTaskList.setText("Tasks: " + categories.get(categoryIndex).getTaskNames());
                    }

                }
            }
        });
        buttonCreateCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonCreateCategory) {
                    menuCategoryVis(false);
                    menuCreateCategory(false); // moves onto the next menu
                }

            }
        });

        buttonEditCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonEditCategory) {
                    menuCategoryVis(false);
                    menuCreateCategory(true); // moves onto the next menu
                }

            }
        });
        buttonReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonReturn) // on pressing button
                {
                    menuCategoryVis(false);
                    selectMenu(); // moves onto the next menu
                }
            }
        });
        buttonDeleteCategory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();

                if (src == buttonDeleteCategory) // on pressing button
                {
                    if ((categoryIndex - 1) >= 0) {
                        categories.remove(categoryIndex);
                        categoryIndex--;
                        labelViewCategoryName.setText("Name: " + categories.get(categoryIndex).getName());
                        // labelViewCategoryDescription.setText("Description: " + categories.get(categoryIndex).getDescription());
                        //labelViewCategoryCreatedBy.setText("Created By: " + categories.get(categoryIndex).getCreated_by());
                        //labelViewCategoryCreatedOn.setText("Created On: " + categories.get(categoryIndex).getCreated_on());
                        labelViewCategoryTaskList.setText("Tasks: " + categories.get(categoryIndex).getTaskNames());
                    }

                }
            }
        });
        //Menu Create Tasks Buttons


        buttonTaskCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonTaskCreate) // on pressing button
                {
                    menuCreateTaskVis(false);
                    // name, description, due date, created on, status, created by, assigned to
                    Task task = new Task(textTaskName.getText(), textTaskDescription.getText(), textTaskDueDate.getText(), textTaskCreatedOn.getText(),
                            textTaskStatus.getText(), nobody, nobody);
                    task.assignColor((String) comboColorBox.getSelectedItem());
                    tasks.add(task);
                    //Task task = new Task(textTaskName.getText(), textTaskDescription.getText(), textTaskDueDate.getText(), textTaskCreatedOn.getText(),
                    //textTaskStatus.getText(), textTaskCreatedBy.getText(), textTaskAssignedTo.getText());
                    menuTasks(); // moves onto the next menu
                }
            }
        });

        buttonTaskEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonTaskEdit) // on pressing button
                {
                    menuCreateTaskVis(false);
                    // name, description, due date, created on, status, created by, assigned to
                    tasks.get(taskIndex).Edit(textTaskName.getText(), textTaskDescription.getText(), textTaskDueDate.getText(), textTaskCreatedOn.getText(),
                            textTaskStatus.getText(), nobody, nobody);
                    tasks.get(taskIndex).assignColor((String) comboColorBox.getSelectedItem());

                    //Task task = new Task(textTaskName.getText(), textTaskDescription.getText(), textTaskDueDate.getText(), textTaskCreatedOn.getText(),
                    //textTaskStatus.getText(), textTaskCreatedBy.getText(), textTaskAssignedTo.getText());
                    menuTasks(); // moves onto the next menu
                }
            }
        });
        buttonReturnSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonReturnSecond) // on pressing button
                {

                    menuCreateTaskVis(false);
                    menuTasks(); // moves onto the next menu
                }
            }
        });

        //Menu Create Teams Buttons

        buttonTeamCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonTeamCreate) // on pressing button
                {


                    menuCreateTeamVis(false);
                    // UserName, Pass
                    Team team = new Team(textTeamName.getText());
                    teams.add(team);
                    menuTeams(); // moves onto the next menu
                }
            }
        });

        buttonTeamEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonTeamEdit) // on pressing button
                {


                    menuCreateTeamVis(false);
                    teams.get(teamIndex).Edit(textTeamName.getText());
                    // UserName, Pass
                    menuTeams(); // moves onto the next menu
                }
            }
        });
        buttonTeamReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonTeamReturn) // on pressing button
                {


                    menuCreateTeamVis(false);
                    menuTeams(); // moves onto the next menu
                }
            }
        });
        //Menu Create Categories Buttons

        buttonCategoryCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonCategoryCreate) // on pressing button
                {


                    menuCreateCategoryVis(false);
                    // UserName, Pass
                    TaskCategory category = new TaskCategory(textCategoryName.getText(), textCategoryDescription.getText(),
                            textCategoryCreatedOn.getText(), nobody);
                    // replace nobody with person who created it, to be replaced after login is finished

                    //Category category = new Category(namefield, descfield, etc..)
                    categories.add(category);
                    menuCategories(); // moves onto the next menu
                }
            }
        });


        buttonCategoryEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonCategoryEdit) // on pressing button
                {


                    menuCreateCategoryVis(false);
                    // UserName, Pass
                    categories.get(categoryIndex).Edit(textCategoryName.getText(), textCategoryDescription.getText(),
                            textCategoryCreatedOn.getText(), nobody);
                    menuCategories(); // moves onto the next menu
                }
            }
        });
        buttonCategoryReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonCategoryReturn) // on pressing button
                {


                    menuCreateCategoryVis(false);
                    menuCategories(); // moves onto the next menu
                }
            }
        });

        //Menu Create Members Buttons

        buttonMemberCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonMemberCreate) // on pressing button
                {


                    menuCreateMemberVis(false);
                    // UserName, Pass
                    Member member = new Member(textMemberUsername.getText(), textMemberPassword.getText());
                    members.add(member);
                    menuMembers(); // moves onto the next menu
                }
            }
        });
        buttonMemberEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonMemberEdit) // on pressing button
                {


                    menuCreateMemberVis(false);
                    // UserName, Pass
                    members.get(memberIndex).changeUsername(textMemberUsername.getText());
                    members.get(memberIndex).changePassword(textMemberPassword.getText());
                    menuMembers(); // moves onto the next menu
                }
            }
        });
        buttonMemberReturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object src = e.getSource();
                if (src == buttonMemberReturn) // on pressing button
                {


                    menuCreateMemberVis(false);
                    menuMembers(); // moves onto the next menu
                }
            }
        });

        // add the panel to this frame
        selectMenu();

    }

    public void invis(boolean a) //set general stuff visibility to false
    {
        buttonMembers.setVisible(a);
        buttonTeams.setVisible(a);
        buttonTasks.setVisible(a);
        buttonCategories.setVisible(a);
        labelUser.setVisible(a);
    }

    public void selectMenu() {
        //repaint();
        userPanel.setBackground(Color.WHITE);
        invis(true);
    }

    private JLabel labelMenuMembers = new JLabel("Current Member(s)");
    private JLabel labelMenuUsername = new JLabel("Username: ");
    private JLabel labelMenuPassword = new JLabel("Password: ");
    private JButton buttonPreviousMember = new JButton("Previous Member");
    private JButton buttonNextMember = new JButton("Next Member");
    private JButton buttonCreateMember = new JButton("Create New Member");
    private JButton buttonReturn = new JButton("Main Menu");
    private JButton buttonDeleteMember = new JButton("Delete Member");
    private JButton buttonEditMember = new JButton("Edit Member");

    int memberIndex = 0;

    public void menuMembersVis(Boolean a) {
        labelMenuMembers.setVisible(a);//menu visibility
        buttonCreateMember.setVisible(a);
        buttonReturn.setVisible(a);
        buttonNextMember.setVisible(a);
        buttonPreviousMember.setVisible(a);
        labelMenuUsername.setVisible(a);
        labelMenuPassword.setVisible(a);
        buttonDeleteMember.setVisible(a);
        buttonEditMember.setVisible(a);
    }

    public void menuMembers() {

        labelMenuUsername.setText("Username: " + members.get(memberIndex).getUsername());
        labelMenuPassword.setText("Password: " + members.get(memberIndex).getPassword());
        menuMembersVis(true);
    }

    private JLabel labelMenuTeams = new JLabel("Current Team(s)");
    private JLabel labelMenuTeamName = new JLabel("Name: ");
    private JLabel labelMenuTeamMembers = new JLabel("Members: ");
    private JTextField textMenuTeamaddMember = new JTextField(20);
    private JLabel labelMenuTeamAddMemberError = new JLabel("Error: Member not found");

    private JButton buttonTeamAddMember = new JButton("Add");
    private JButton buttonCreateTeam = new JButton("Create New Team");
    private JButton buttonNextTeam = new JButton("Next");
    private JButton buttonPreviousTeam = new JButton("Previous");
    private JButton buttonDeleteTeam = new JButton("Delete Team");
    private JButton buttonEditTeam = new JButton("Edit Team");

    public void menuTeamsVis(Boolean a) {
        labelMenuTeamAddMemberError.setVisible(a);
        labelMenuTeams.setVisible(a);
        buttonCreateTeam.setVisible(a);
        buttonReturn.setVisible(a);
        labelMenuTeamName.setVisible(a);
        labelMenuTeamMembers.setVisible(a);
        buttonPreviousTeam.setVisible(a);
        buttonNextTeam.setVisible(a);
        buttonReturn.setVisible(a);
        buttonTeamAddMember.setVisible(a);
        textMenuTeamaddMember.setVisible(a);
        buttonDeleteTeam.setVisible(a);
        buttonEditTeam.setVisible(a);
    }

    private int teamIndex = 0;

    public void menuTeams() {

        labelMenuTeamName.setText("Name: " + teams.get(teamIndex).getName());
        labelMenuTeamMembers.setText("Members: " + teams.get(teamIndex).getMemberNames());
        menuTeamsVis(true);
        labelMenuTeamAddMemberError.setVisible(false);
    }

    private JLabel labelMenuTasks = new JLabel("Current Task(s)");
    private JLabel labelMenuTaskName = new JLabel();
    private JLabel labelMenuTaskDescription = new JLabel();
    private JLabel labelMenuTaskDueDate = new JLabel();
    private JLabel labelMenuTaskCreatedOn = new JLabel();
    private JLabel labelMenuTaskStatus = new JLabel();
    private JLabel labelMenuTaskCreatedBy = new JLabel();
    private JLabel labelMenuTaskAssignedTo = new JLabel();
    private JLabel labelMenuTaskSubtasks = new JLabel();
    private JButton buttonTaskReturn = new JButton("Back");
    private JButton buttonCreateTask = new JButton("Create New Task");
    private JButton buttonDeleteTask = new JButton("Delete Task");
    private JButton buttonEditTask = new JButton("Edit Task");

    private JButton buttonNextTask = new JButton("Next");
    private JButton buttonPreviousTask = new JButton("Previous");
    private int taskIndex = 0;

    public void menuTasksVis(Boolean a) {
        labelMenuTasks.setVisible(a);
        labelMenuTaskDescription.setVisible(a);
        labelMenuTaskDueDate.setVisible(a);
        labelMenuTaskCreatedOn.setVisible(a);
        labelMenuTaskStatus.setVisible(a);
        labelMenuTaskCreatedBy.setVisible(a);
        labelMenuTaskAssignedTo.setVisible(a);
        labelMenuTaskSubtasks.setVisible(a);
        labelMenuTaskName.setVisible(a);
        buttonCreateTask.setVisible(a);
        buttonNextTask.setVisible(a);
        buttonTaskReturn.setVisible(a);
        buttonPreviousTask.setVisible(a);
        buttonDeleteTask.setVisible(a);
        buttonEditTask.setVisible(a);
    }

    public void menuTasks() {
        labelMenuTaskName.setText("Name: " + tasks.get(taskIndex).getName());
        if (tasks.get(taskIndex).getTextColor() == "White") {
            labelMenuTaskName.setForeground(Color.WHITE);
        } else if (tasks.get(taskIndex).getTextColor() == "Black")
            labelMenuTaskName.setForeground(Color.BLACK);
        else if (tasks.get(taskIndex).getTextColor() == "Red")
            labelMenuTaskName.setForeground(Color.RED);
        else if (tasks.get(taskIndex).getTextColor() == "Green")
            labelMenuTaskName.setForeground(Color.GREEN);

        labelMenuTaskDescription.setText("Description: " + tasks.get(taskIndex).getDescription());
        labelMenuTaskDueDate.setText("Due Date: " + tasks.get(taskIndex).getDue_date());
        labelMenuTaskCreatedOn.setText("Created On: " + tasks.get(taskIndex).getCreated_on());
        labelMenuTaskStatus.setText("Status: " + tasks.get(taskIndex).getStatus());
        labelMenuTaskCreatedBy.setText("Created By: " + tasks.get(taskIndex).getCreated_by().getUsername());
        labelMenuTaskAssignedTo.setText("Assigned To: " + tasks.get(taskIndex).getAssigned_to().getUsername());
        labelMenuTaskSubtasks.setText("Subtasks: " + tasks.get(taskIndex).getSubtasks());

        menuTasksVis(true);
        // add the panel to this frame
    }


    private JLabel labelMenuCategory = new JLabel("Current Category(s)");

    private JLabel labelViewCategoryName = new JLabel("Name: ");
    private JButton buttonNextCategory = new JButton("Next Category");
    private JButton buttonPreviousCategory = new JButton("Previous Category");
    private JTextField textMenuCategoryaddTask = new JTextField(20);
    private JLabel labelViewCategoryTaskList = new JLabel("Tasks: ");
    private JLabel labelMenuCategoryAddTaskError = new JLabel("Error: Task name not found ");
    private JButton buttonCategoryAddTask = new JButton("Add");
    // private JLabel labelViewCategoryDescription = new JLabel("Description: ");
    // private JLabel labelViewCategoryCreatedOn = new JLabel("Created On: ");
    //  private JLabel labelViewCategoryCreatedBy = new JLabel("Created By: ");
    private JButton buttonCreateCategory = new JButton("Create New Category");
    private JButton buttonDeleteCategory = new JButton("Delete Category");
    private JButton buttonEditCategory = new JButton("Edit Category");

    int categoryIndex = 0;

    public void menuCategoryVis(Boolean a) {
        labelMenuCategoryAddTaskError.setVisible(a);
        labelMenuCategory.setVisible(a);
        buttonCreateCategory.setVisible(a);
        labelViewCategoryName.setVisible(a);
        buttonNextCategory.setVisible(a);
        buttonPreviousCategory.setVisible(a);
        textMenuCategoryaddTask.setVisible(a);
        labelViewCategoryTaskList.setVisible(a);
        buttonCategoryAddTask.setVisible(a);
        buttonReturn.setVisible(a);
        buttonDeleteCategory.setVisible(a);
        buttonEditCategory.setVisible(a);
    }

    public void menuCategories() {

        labelViewCategoryName.setText("Name: " + categories.get(categoryIndex).getName());
        labelViewCategoryTaskList.setText("Tasks: " + categories.get(categoryIndex).getTaskNames());
        menuCategoryVis(true);
        labelMenuCategoryAddTaskError.setVisible(false);
    }


    private JLabel labelTaskName = new JLabel("Name: ");
    private JLabel labelTaskDescription = new JLabel("Description: ");
    private JLabel labelTaskDueDate = new JLabel("DueDate: ");
    private JLabel labelTaskCreatedOn = new JLabel("CreatedOn: ");
    private JLabel labelTaskStatus = new JLabel("Status: ");
    private JLabel labelTaskCreatedBy = new JLabel("CreatedBy: ");
    private JLabel labelTaskAssignedTo = new JLabel("AssignedTo: ");
    private JTextField textTaskName = new JTextField(20);
    private JTextField textTaskDescription = new JTextField(20);
    private JTextField textTaskDueDate = new JTextField(20);
    private JTextField textTaskCreatedOn = new JTextField(20);
    private JTextField textTaskStatus = new JTextField(20);
    private JTextField textTaskCreatedBy = new JTextField(20);
    private JTextField textTaskAssignedTo = new JTextField(20);
    private JButton buttonReturnSecond = new JButton("Back");
    private JButton buttonTaskCreate = new JButton("Create");
    private JButton buttonTaskEdit = new JButton("Edit");
    String[] textColors = {"Black", "White", "Red", "Green"};
    private JComboBox comboColorBox = new JComboBox(textColors);

    public void menuCreateTaskVis(boolean a) {

        labelTaskName.setVisible(a);
        labelTaskDescription.setVisible(a);
        labelTaskDueDate.setVisible(a);
        labelTaskCreatedOn.setVisible(a);
        labelTaskStatus.setVisible(a);
        labelTaskCreatedBy.setVisible(a);
        labelTaskAssignedTo.setVisible(a);
        textTaskName.setVisible(a);
        textTaskDescription.setVisible(a);
        textTaskDueDate.setVisible(a);
        textTaskCreatedOn.setVisible(a);
        textTaskStatus.setVisible(a);
        textTaskCreatedBy.setVisible(a);
        textTaskAssignedTo.setVisible(a);
        buttonReturnSecond.setVisible(a);
        buttonTaskCreate.setVisible(a);
        comboColorBox.setVisible(a);
        buttonTaskEdit.setVisible(a);
    }

    public void menuCreateTask(boolean edit) {
        menuCreateTaskVis(true);
        if (edit)
            buttonTaskCreate.setVisible(false);
        else
            buttonTaskEdit.setVisible(false);
    }

    //instantiate text field
    public void menuCreateTeamVis(boolean a) {

        buttonTeamReturn.setVisible(a);
        labelTeamName.setVisible(a);
        buttonTeamCreate.setVisible(a);
        textTeamName.setVisible(a);
        buttonTeamEdit.setVisible(a);

    }

    private JButton buttonTeamCreate = new JButton("Create");
    private JButton buttonTeamEdit = new JButton("Edit");
    private JButton buttonTeamReturn = new JButton("Back");
    private JLabel labelTeamName = new JLabel("Name: ");
    private JTextField textTeamName = new JTextField(20);

    public void menuCreateTeam(boolean edit) {
        menuCreateTeamVis(true);
        if (edit)
            buttonTeamCreate.setVisible(false);
        else
            buttonTeamEdit.setVisible(false);
        //Team team = new Team(namefield, descfield, etc..)
    }//instantiate text field

    public void menuCreateCategoryVis(boolean a) {

        buttonCategoryReturn.setVisible(a);
        labelCategoryName.setVisible(a);
        labelCategoryDescription.setVisible(a);
        labelCategoryCreatedBy.setVisible(a);
        labelCategoryCreatedOn.setVisible(a);
        buttonCategoryCreate.setVisible(a);
        textCategoryName.setVisible(a);
        textCategoryDescription.setVisible(a);
        textCategoryCreatedOn.setVisible(a);
        textCategoryCreatedBy.setVisible(a);
        buttonCategoryEdit.setVisible(a);
    }

    private JButton buttonCategoryCreate = new JButton("Create");
    private JButton buttonCategoryEdit = new JButton("Edit");
    private JButton buttonCategoryReturn = new JButton("Back");
    private JLabel labelCategoryName = new JLabel("Name: ");
    private JLabel labelCategoryDescription = new JLabel("Description: ");
    private JLabel labelCategoryCreatedOn = new JLabel("Created On: ");
    private JLabel labelCategoryCreatedBy = new JLabel("Created By: ");
    private JTextField textCategoryName = new JTextField(20);
    private JTextField textCategoryDescription = new JTextField(20);
    private JTextField textCategoryCreatedOn = new JTextField(20);
    private JTextField textCategoryCreatedBy = new JTextField(20);

    public void menuCreateCategory(boolean edit) {
        menuCreateCategoryVis(true);
        if (edit)
            buttonCategoryCreate.setVisible(false);
        else
            buttonCategoryEdit.setVisible(false);

    }

    private JButton buttonMemberCreate = new JButton("Create");
    private JButton buttonMemberEdit = new JButton("Edit");
    private JButton buttonMemberReturn = new JButton("Back");
    private JLabel labelMemberUsername = new JLabel("Username: ");
    private JLabel labelMemberPassword = new JLabel("Password: ");
    private JTextField textMemberUsername = new JTextField(20);
    private JTextField textMemberPassword = new JTextField(20);

    public void menuCreateMemberVis(boolean a) {
        buttonMemberReturn.setVisible(a);
        labelMemberUsername.setVisible(a);
        labelMemberPassword.setVisible(a);
        buttonMemberCreate.setVisible(a);
        textMemberUsername.setVisible(a);
        textMemberPassword.setVisible(a);
        buttonMemberEdit.setVisible(a);
    }

    public void menuCreateMember(boolean edit) {

        menuCreateMemberVis(true);
        if (edit)
            buttonMemberCreate.setVisible(false);
        else {

            buttonMemberEdit.setVisible(false);
        }

    }

    public int memberSearch(String username){ // if index returns 0 then there is no matching Member Found
        int index = 0;
        for(int i = 0; i < members.size(); i++) {
           if (username.equals(members.get(i).getUsername()))
           {
               index = i;
           }
        }
        return index;
}

    public int taskSearch(String taskname){ // if index returns 0 then no matching Task found
        int index = 0;
        for(int i = 0; i < tasks.size(); i++) {
            if (taskname.equals(tasks.get(i).getName()))
                index = i;
        }
        return index;
    }
    //instantiate text field

    private static Member nobody = new Member("N/A", "N/A");
    private static Task nullTask = new Task("N/A", "N/A", "N/A", "N/A", "N/A", nobody,nobody);
    private static TaskCategory nullCategory = new TaskCategory("N/A", "N/A",  "N/A", nobody);
    private static Team nullTeam = new Team("N/A");

    private static  ArrayList<Member> members = new ArrayList<Member>();
    private static ArrayList<Task> tasks = new ArrayList<Task>();
    private static ArrayList<Team> teams = new ArrayList<Team>();
    private static ArrayList<TaskCategory> categories = new ArrayList<TaskCategory>();
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        members.add(nobody);
        tasks.add(nullTask);
        teams.add(nullTeam);
        categories.add(nullCategory);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JPanelManager().setVisible(true);
            }
        });
    }
}
