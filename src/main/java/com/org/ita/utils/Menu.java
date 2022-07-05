package com.org.ita.utils;


import java.io.IOException;

public class Menu {

    Group member;

    public void run() {
        int userSelection;
        Data.menu();
        try {
            userSelection = Integer.parseInt(Buffer.br.readLine());
            switch (userSelection) {
                case 1:
                    Data.groupInfo();
                    break;
                case 2:
                    Tasks.showAllTasks();
                    break;
                case 3:
                    System.out.println("Please pick user by ID");
                    userSelection = Integer.parseInt(Buffer.br.readLine());
                    System.out.println("You have picked " + Group.getMemberNameById(userSelection));
                    break;
                case 4:
                    System.out.println("First chose user");
                    Data.groupInfo();
                    userSelection = Integer.parseInt(Buffer.br.readLine());

                    member = Group.getMemberById(userSelection);
                    System.out.println("Chose task number now");
                    int task = Integer.parseInt(Buffer.br.readLine());
                    System.out.println("Task condition:\n" + Tasks.getDescriptionById(task));

                    RunTask runTask = new RunTask();
                    runTask.setMember(member);
                    runTask.runTask(task);


                    break;
                default:
                    System.out.println("No such number. Try again");
                    break;
            }
        } catch (IOException e) {
            System.out.println("Input should be digit");
        }

    }


}
