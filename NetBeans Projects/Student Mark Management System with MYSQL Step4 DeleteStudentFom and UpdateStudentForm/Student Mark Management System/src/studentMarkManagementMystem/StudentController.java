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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
class StudentController {

    public static boolean addNewStudent(Student student) throws ClassNotFoundException, SQLException {
        String SQL = "Insert into Student values('" + student.getId() + "','" + student.getName() + "'," + student.getPrfMarks() + "," + student.getDbmsMarks() + ")";
        Statement stm = DBConnection.getInstance().getConnetion().createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

    public static String getNewStudentId() throws ClassNotFoundException, SQLException {
        String SQL = "select id from Student order by id desc limit 1";
        Statement stm = DBConnection.getInstance().getConnetion().createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            int lastStudentIdNo = Integer.parseInt(rst.getString("id").substring(1));//0001
            return String.format("S%04d", lastStudentIdNo + 1);
        }
        return "S0001";
    }

    public static Student searchStudent(String id) throws ClassNotFoundException, SQLException{
        String SQL="Select * From Student where id='"+id+"'";
        ResultSet rst = DBConnection.getInstance().getConnetion().createStatement().executeQuery(SQL);
        return rst.next() ? new Student(id, rst.getString("name"), rst.getInt("prfMarks"), rst.getInt("dbmsMarks")): null;
    }

    public static boolean deleteStudent(String id) throws IOException, ClassNotFoundException, SQLException {
        return DBConnection.getInstance().getConnetion().createStatement().executeUpdate("Delete From Student where id='"+id+"'")>0;
    }

    public static boolean updateStudent(Student student) throws ClassNotFoundException, SQLException {
        String SQL = "Update Student Set name='"+student.getName()+"',prfMarks="+student.getPrfMarks()+",dbmsMarks="+student.getDbmsMarks()+" where id='"+student.getId()+"'";
        Statement stm = DBConnection.getInstance().getConnetion().createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

    public static Student[] getAllStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
