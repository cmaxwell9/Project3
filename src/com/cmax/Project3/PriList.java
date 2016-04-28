package com.cmax.Project3;

/**
 * Created by Clint on 4/24/2016.
 *

 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by MM12222 on 3/3/2016.
 */
public class PriList {
    static ArrayList<Task> Tasks = new ArrayList<Task>();

    static String add(){
        System.out.println("Enter the new task's name.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Task task1 = new Task("A","b",1);
        String userInput;
        userInput = scanner.nextLine();
        task1.Name = userInput;
        System.out.println("Enter the new task's description.");
        userInput = scanner.nextLine();
        task1.Desc = userInput;
        System.out.println("Enter the new task's priority");
        userInput = scanner.nextLine();
        int x =0;
        try { x = ((int) Double.parseDouble(userInput));}
        catch(NumberFormatException nfe){
            System.out.println("Pri must be between 1,2,3,4, or 5");
            userInput = "6";};
        task1.Pri = x;
        Tasks.add(task1);
        System.out.println("****** added ******");
        return "add";
    }
    static String remove(){
        System.out.println("Enter the index of the contact to remove.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String userInput;
        userInput = scanner.nextLine();

        try { int x = ((int) Double.parseDouble(userInput));}
        catch(NumberFormatException nfe){
            System.out.println(" invalid index ");
            return "remove";}
        try {  Tasks.remove((int) Double.parseDouble(userInput)-1);}
        catch(IndexOutOfBoundsException IOOBE){
            System.out.println(" invalid index / out of bounds");
            return "remove";}


        System.out.println("****** removed ******");
        return "remove";
    }

    static String update(){
        System.out.println("Enter the index of the task to update.");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String userInput;
        userInput = scanner.nextLine();
        try { int i = ((int) Double.parseDouble(userInput)-1);}
        catch(NumberFormatException nfe){
            System.out.println(" invalid index ");
            return "update";}
        try {  Tasks.get((int) Double.parseDouble(userInput)-1);}
        catch(IndexOutOfBoundsException IOOBE){
            System.out.println(" invalid index / out of bounds");
            return "update";}
        int i = ((int) Double.parseDouble(userInput)-1);

        System.out.println("Enter the new task's name.");
        Task task1 = new Task("A","B",1);
        userInput = scanner.nextLine();
        task1.Name = userInput;
        System.out.println("Enter the new task's description.");
        userInput = scanner.nextLine();
        task1.Desc = userInput;
        System.out.println("Enter the new task's priority");
        userInput = scanner.nextLine();
        int x =0;
        try { x = ((int) Double.parseDouble(userInput));}
        catch(NumberFormatException nfe){
            System.out.println("Pri must be between 1,2,3,4, or 5");

            userInput = "6";};
        task1.Pri = x;
        Tasks.set(i,task1);

        System.out.println("****** updated ******");
        return "update";
    }

    static String list(){
        for (int x = 0; x< Tasks.size(); x++) {

            if (x < Tasks.size()) {
                Task contact1 = Tasks.get(x);
                System.out.println("Task index: " + (x+1) +", Name: " + contact1.Name + ", Description: " + contact1.Desc + ", Priorty: " + contact1.Pri);}
            else
            {break;
            }
        }
        System.out.println("****** listed ******");
        return "list";
    }

    static String listpri() {

        String userInput;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a priority");
        userInput = scanner.nextLine();
        int x = 0;
        try {
            x = ((int) Double.parseDouble(userInput));
        } catch (NumberFormatException nfe) {
            System.out.println("Pri must be between 1,2,3,4, or 5");
        }
        ;
        int y = 0;
        for (y = 0; y < Tasks.size(); y++) {
            {
                if (y < Tasks.size()) {
                    Task contact1 = Tasks.get(y);
                } else {
                    break;
                }
            }
            Task contact1 = Tasks.get(y);
            if (contact1.Pri == x) {
                System.out.println("Task index: " + (y + 1) + ", Name: " + contact1.Name + ", Description: " + contact1.Desc + ", Priorty: " + contact1.Pri);
            }}
        System.out.println("****** listed ******");
        return "list";

    }

    static String sortpri() {

        Collections.sort(Tasks);
        for (Task task : Tasks) {
            task.display();
        }
        System.out.println("****** Sorted ******");
        return "sort";

    }


















}
