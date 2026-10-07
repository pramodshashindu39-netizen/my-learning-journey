/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem;

/**
 *
 * @author ADMIN
 */
public class Student {
        
        String id;
	private String nic;
	private String name;
	private int prfMarks;
	private int dbmsMarks;
	
	public Student(String id, String name, int prfMarks, int dbmsMarks,String nic){
		this.id=id;
		this.name=name;
		this.prfMarks=prfMarks;
		this.dbmsMarks=dbmsMarks;
                this.nic=nic;
	}

	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
        public String getNIC(){
                return nic;
        }
	
	public int getPrfMarks(){
		return prfMarks;
	}
	public int getDbmsMarks(){
		return dbmsMarks;
	}     
}
