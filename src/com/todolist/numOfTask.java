package com.todolist;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class numOfTask {
    static void numOfTask(){
        try{

            FileReader fr = new FileReader("tasklist.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while((line = br.readLine()) != null){
                Main.tasklist.add(line);
            }
            for (int i = 0; i < Main.tasklist.size(); i++){
                System.out.println((i+1) + "." + Main.tasklist.get(i));
            }
            br.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
