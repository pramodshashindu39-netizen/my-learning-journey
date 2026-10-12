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
public class StudentCollection {
    public boolean addNeStudent(Student student) throws IOException {
        FileWriter fw=new FileWriter("Student.txt",true);
        fw.write(student.toString());
        fw.close();
        return true;
    }

    public Student searchStudent(String id) throws FileNotFoundException {
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
}
