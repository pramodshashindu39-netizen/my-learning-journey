/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentMarkManagementMystem;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.sql.*;


/**
 *
 * @author pc
 */
class StudentController {

    private static Object DriverManager;

    public static boolean addNewStudent(Student student) throws IOException {
        String SQL = "Insert into Student values('"+student.getId()+"','"+student.getName()+"',"+student.getPrfMarks()+","+student.getDbmsMarks()+")";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/StudentDB", "root", "1234");
            Statement stm = conn.createStatement();
            stm.executeUpdate(SQL);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver s/w not found...");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return true;

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

    static boolean deleteStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
