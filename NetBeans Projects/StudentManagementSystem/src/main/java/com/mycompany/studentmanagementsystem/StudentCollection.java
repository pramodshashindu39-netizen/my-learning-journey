/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem;

/**
 *
 * @author ADMIN
 */
public class StudentCollection {
    	private Student[] studentArray=new Student[]{
		new Student("PR24105001","Nimal",76,55,"200514103720"),
		new Student("PR24101002","Bimal",96,75,"200314183721"),
		new Student("OR24105001","Amal",26,95,"200297003420"),
		new Student("OR24101002","Nioth",86,55,"200614193820"),
	};	
	public boolean addNewStudent(Student student){
		extendsStudentArray();
		studentArray[studentArray.length-1]=student;
                
		return true;
	}
	public Student[] getAllStudent(){
		Student[] tempStudentArray=new Student[studentArray.length];
		for (int i = 0; i < studentArray.length; i++){
			tempStudentArray[i]=studentArray[i];
		}
		return tempStudentArray;
	}
	public Student searchStudent(String id){
		for (int i = 0; i < studentArray.length; i++){
			if(id.equalsIgnoreCase(studentArray[i].getId())){
				return studentArray[i];
			}
		}
		return null;
	}
	private void extendsStudentArray(){
		Student[] tempStudentArray=new Student[studentArray.length+1];
		for (int i = 0; i < studentArray.length; i++){
			tempStudentArray[i]=studentArray[i];
		}
		studentArray=tempStudentArray;
	}
	public int search(Student student){
		for (int i = 0; i < studentArray.length; i++){
			if(student.getId().equalsIgnoreCase(studentArray[i].getId())){
				return i;
			}
		}
		return -1;
	}
	public boolean updateStudent(Student student){
		int index=search(student);
		if(index!=-1){
			studentArray[index]=student;
			return true;
		}
		return false;
	}
        
        public  int studentCount(int bacthNumber){
            int stuCountForEachBatch=0;
            for (int i = 0; i < studentArray.length; i++){
                    if (bacthNumber==Integer.parseInt( studentArray[i].id.substring(4,7))){
                            stuCountForEachBatch++;
                    }
            }
            return stuCountForEachBatch;
	}
        
        
        public String createRegistrationNo(String lectureMode,int  bacthNumber){
		
            int stuCount=studentCount(bacthNumber);

            String registrationNo="";
            if(lectureMode.equalsIgnoreCase("physical")){
                    registrationNo="PR24" + bacthNumber + String.format("%03d",stuCount+1);
            }else{
                    registrationNo="OR24" + bacthNumber + String.format("%03d",stuCount+1);
            }
            return registrationNo;
	}
        
        public  boolean deleteStudent(String id) {
        Student tempStudentArray[]=new Student[studentArray.length-1];
        
            for (int i = 0,j=0; i <studentArray.length ; i++) {
                if (!id.equalsIgnoreCase(studentArray[i].id)){
                    tempStudentArray[j]=studentArray[i];
                    j++;
                }
            }
            studentArray=tempStudentArray;
            
            return true;
        }
        
        private StudentCollection(){}
        
        private static StudentCollection studentCollection;//null
        
        public static StudentCollection getInstance(){
        
            if (studentCollection==null) {
                studentCollection=new StudentCollection();
            }
            return studentCollection;
        }
        
        
        
        
        
        

}
