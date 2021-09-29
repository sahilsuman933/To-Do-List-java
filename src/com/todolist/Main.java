package com.todolist;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> tasklist = new ArrayList<String>();


    public static void main(String[] args) {


        System.out.print("\n" +
                " ________                    _______    ______         __        ______   ______   ________ \n" +
                "|        \\                  |       \\  /      \\       |  \\      |      \\ /      \\ |        \\\n" +
                " \\$$$$$$$$  ______          | $$$$$$$\\|  $$$$$$\\      | $$       \\$$$$$$|  $$$$$$\\ \\$$$$$$$$\n" +
                "   | $$    /      \\  ______ | $$  | $$| $$  | $$      | $$        | $$  | $$___\\$$   | $$   \n" +
                "   | $$   |  $$$$$$\\|      \\| $$  | $$| $$  | $$      | $$        | $$   \\$$    \\    | $$   \n" +
                "   | $$   | $$  | $$ \\$$$$$$| $$  | $$| $$  | $$      | $$        | $$   _\\$$$$$$\\   | $$   \n" +
                "   | $$   | $$__/ $$        | $$__/ $$| $$__/ $$      | $$_____  _| $$_ |  \\__| $$   | $$   \n" +
                "   | $$    \\$$    $$        | $$    $$ \\$$    $$      | $$     \\|   $$ \\ \\$$    $$   | $$   \n" +
                "    \\$$     \\$$$$$$          \\$$$$$$$   \\$$$$$$        \\$$$$$$$$ \\$$$$$$  \\$$$$$$     \\$$   \n" +
                "                                                                                            \n" +
                "                                                                                            \n" +
                "                                                                                            \n");



        Scanner in = new Scanner(System.in);
        boolean mainlooprunning = true;

        while (mainlooprunning) {

            System.out.println("WELCOME TO THE TO-DO LIST PROGRAM: \n1.ADD TASK \n2.Read Task \n3.Remove Task \n4.Exit");


            boolean innerlooprunning = true;

            System.out.println("\nEnter YOUR TASK NUMBER:");
            int TaskNumber = in.nextInt();
            in.nextLine();


            while (innerlooprunning) {
                switch (TaskNumber) {
                    case 1 -> {
                        System.out.println("Enter Your Task:");
                        String task = in.nextLine();
                        AddTask.addTask(task);
                        System.out.println("If YOU WANT TO WRITE ANOTHER TASK WRITE: 1 ELSE ENTER 0");
                        int action = in.nextInt();
                        in.nextLine();
                        if (action == 0) {
                            innerlooprunning = false;
                        } else if (action == 1) {

                        } else {
                            System.out.println("Wrong Value.... GO BACK TO MAIN MENU !!! \n");
                            innerlooprunning = false;
                        }
                    }
                    case 2 -> {
                        System.out.println("LIST OF TASK: \n");
                        ReadTask.readTask();
                        System.out.println("\n");
                        innerlooprunning = false;
                    }
                    case 3 -> {
                        DeleteTask.deleteTask();
                        System.out.println("Do YOU WANT TO DELETE ANOTHER TASK? 1 = YES AND 0 = NO");
                        int response = in.nextInt();
                        if (response == 0) {
                            innerlooprunning = false;
                        } else {
                            System.out.println("Enter Right Input");
                        }
                    }
                    case 4 -> {
                        innerlooprunning = false;
                        mainlooprunning = false;
                    }
                    default -> {
                        System.out.println("ENTER CORRECT INPUT");
                        innerlooprunning = false;
                    }
                }
            }
        }


    }

}
