/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentMarkManagementMystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
class StudentController {

    public static boolean addNewStudent(Student student) throws IOException {
        FileWriter fw=new FileWriter("Student.txt",true); //appendable
        fw.write(student.toString()+"\n");
        fw.close();
        return  true;
    }

    public static String getNewStudentId() throws FileNotFoundException {
        Scanner input=new Scanner(new File("Student.txt"));
        String line=null;
        while(input.hasNextLine()){
            line=input.nextLine();
        }
        if(line==null){
            return "S0001";
        }else{
            int lastStudentIdNo=Integer.parseInt(line.substring(1, 5));//0001
            return String.format("S%04d", lastStudentIdNo+1);
        }
    }

    public static Student searchStudent(String id) throws FileNotFoundException {
        Scanner input=new Scanner(new File("Student.txt"));
        while(input.hasNextLine()){
            String line=input.nextLine();
            if(line.substring(0, 5).equalsIgnoreCase(id)){
                String[] rowData=line.split(",");
                return new Student(rowData[0],rowData[1],Integer.parseInt(rowData[2]),Integer.parseInt(rowData[3]));
            }
        }
        return null;
    }
}
