package com.todolist;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DeleteTask {
    static void deleteTask(){


        try{
            numOfTask.numOfTask();
            Scanner in = new Scanner(System.in);
            System.out.println("Enter The TASK NUMBER TO DELETE");
            int index = in.nextInt();
            Main.tasklist.remove(index - 1);
            FileWriter fw = new FileWriter("tasklist.txt");
            PrintWriter pw = new PrintWriter(fw);
            for(int i = 0; i < Main.tasklist.size(); i++){
                pw.println(Main.tasklist.get(i));

            }
            Main.tasklist.clear();
            pw.close();
        }catch (IOException e){
            System.out.println(e);
            Main.tasklist.clear();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Enter Correct Index");
            Main.tasklist.clear();
        }


    }
}
