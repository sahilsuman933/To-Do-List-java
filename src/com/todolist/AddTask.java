package com.todolist;

import java.io.FileWriter;
import java.io.IOException;

public class AddTask {
    static void addTask(String text){
        try{
            FileWriter fw=new FileWriter("tasklist.txt" , true);
            fw.write(text);
            fw.write("\n");
            fw.close();
        }catch(IOException e){System.out.println(e);}
        System.out.println("TASK SUCCESSFULLY ADDED. \n \n \n");
    }

}
