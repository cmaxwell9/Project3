package com.cmax.Project3;
/*
Project 3 should make use of topics covered during weeks seven though eleven.

        Modify your code from Project 2 so that the class representing tasks implements
        the appropriate interface allowing tasks to be sorted based first on
        their priority then on their name.  If two tasks have different priorities,
        the task with the greater priority appears before the other task.  If two
        tasks have the same priority, then the task whose name would appear first
        alphabetically appears before the other task.  If two tasks have the same
        priority and their names are the same, then they are "equal" with regard to
        the comparison.

        Additionally, modify the code from Project 2 to include a custom class
        representing a collection of tasks.  This class should implement the
        appropriate interface so that a for-each loop can be used to iterate through
        all the tasks.  The order in which the tasks are returned for the for-each loop
        is up to you.

        Be sure to commit your code and push it to GitHub.  If you would like to
        work in teams, use forks and pull requests; individual team members should
        submit links to their fork of the repository.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        String userInput;
        userInput = "6";
        while (((int) Double.parseDouble(userInput)) != 0) {
            System.out.println("Menu");
            System.out.println("1) Add a task.");
            System.out.println("2) Remove a task.");
            System.out.println("3) Update a task.");
            System.out.println("4) List all tasks.");
            System.out.println("5) List all tasks of a certain priority.");
            System.out.println("6) Sort tasks by Pri, Name ");
            System.out.println("7) iterate through all the tasks");
            System.out.println("0) Exit.");
            System.out.println("Choose an Option.");
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            userInput = scanner.nextLine();

            try { int x = ((int) Double.parseDouble(userInput));}
            catch(NumberFormatException nfe){userInput = "6";};

            switch ((int) Double.parseDouble(userInput)) {
                case 1:
                    PriList.add();
                    break;
                case 2:
                    PriList.remove();
                    break;

                case 3:
                    PriList.update();
                    break;

                case 4:
                    PriList.list();
                    break;
                case 5:
                    PriList.listpri();
                    break;
                case 6:
                    PriList.sortpri();
                    break;
                case 7:
                    TaskCollection TC = new TaskCollection();
                    int y = 0;
                    for (y = 0; y < PriList.Tasks.size(); y++) {
                         if (y < PriList.Tasks.size()) {
                                TC.addTask(PriList.Tasks.get(y));
                            } else {
                                break;
                            }
                        }

                        for(Task task: TC) {
                            System.out.println(task);
                    }
                    System.out.println("****** inerated ******");
                case 0:
                    break;
                default:
                    System.out.println("Invalid Entry, Please try again...");
                    break;
            }
        }
    }
}

