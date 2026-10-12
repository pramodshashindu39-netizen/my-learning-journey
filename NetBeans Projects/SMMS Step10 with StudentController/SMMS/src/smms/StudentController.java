/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class StudentController {
    public static  boolean addNeStudent(Student student) throws IOException {
        FileWriter fw=new FileWriter("Student.txt",true);
        fw.write(student.toString()+"\n");
        fw.close();
        return true;
    }

    public static Student searchStudent(String id) throws FileNotFoundException {
        Scanner input=new Scanner(new File("Student.txt"));
        while(input.hasNextLine()){
            String line=input.nextLine();
            if(id.equalsIgnoreCase(line.substring(0,5))){
                String[] rowData=line.split(",");
                return new Student(rowData[0], rowData[1], Integer.parseInt(rowData[2]), Integer.parseInt(rowData[3]));
            }
        }
        return null;
    }
    
     public static boolean deleteStudent(String id) throws IOException{
        FileWriter fw=new FileWriter("TempStudent.txt");
        Scanner input=new Scanner(new File("Student.txt"));
        while(input.hasNextLine()){
            String line=input.nextLine();
            if(line.substring(0, 5).equalsIgnoreCase(id)){
               continue;
            }
            fw.write(line+"\n");
        }
        fw.close();
        input.close();
        
        File oldFile=new File("Student.txt");
        oldFile.delete();
        
        fw=new FileWriter("Student.txt");
        input=new Scanner(new File("TempStudent.txt"));
        while(input.hasNextLine()){
            fw.write(input.nextLine()+"\n");
        }
        fw.close();
        input.close();
        File tempFile=new File("TempStudent.txt");
        tempFile.delete();
        return true;
    }

}
