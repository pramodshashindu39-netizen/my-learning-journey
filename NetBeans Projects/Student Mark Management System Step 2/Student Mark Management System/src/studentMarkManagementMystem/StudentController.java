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
 * @author ADMIN
 */
class StudentController {

    static boolean addNewStudent(Student student) throws IOException {
        FileWriter fw=new FileWriter("Student.txt",true);
        fw.write(student.toString()+"\n");
        fw.close();
        return true;
                
    }

    static String getNewStudentId() throws FileNotFoundException {
      Scanner input=new Scanner(new File("Student.txt"));
      String line=null;
        while(input.hasNext()){
                line=input.nextLine();
        }
        if (line==null) {
            return "S0001";
        }else{
            int lastStudentIdNo=Integer.parseInt(line.substring(1, 5));
            return String.format("S%04d"+(lastStudentIdNo+1));
        }
        
    }

    static Student searchStudent(String id) throws FileNotFoundException {
        Scanner input=new Scanner(new File("Student.txt"));
        String line=null;
        while(input.hasNext()){
            line=input.nextLine();
            String StudentIdNo=line.substring(0, 5);
            
            if (StudentIdNo.equalsIgnoreCase(id)) {
                break;
            }
                
                
        } 
    }
    
}
