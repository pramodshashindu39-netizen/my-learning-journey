import java.io.*;
import java.util.*;

class Student{
	private String id;
	private String name;
	private int prfMarks;
	private int dbmsMarks;
	private double gpa;
	
	
	public Student(String id, String name, int prfMarks, int dbmsMarks,double gpa){
		this.id=id;
		this.name=name;
		this.prfMarks=prfMarks;
		this.dbmsMarks=dbmsMarks;
		this.gpa=gpa;
	}
	public String toString(){
		return id+"\t\t"+name+"\t\t"+prfMarks+"\t\t"+dbmsMarks+"\t\t"+gpa;
	}
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	public int getPrfMarks(){
		return prfMarks;
	}
	public int getDbmsMarks(){
		return dbmsMarks;
	}
	public double gpa(){
		return gpa;
	}
}

class Demo{
	public static void main(String[] args) {
		
		try{
			File f1=new File("Student.txt");
			Scanner input=new Scanner(f1);
			
			while(input.hasNext()){
				String line=input.nextLine();
				String[] rowData=line.split(" ,");
				String id=rowData[0];
				String name=rowData[1];
				int prfMarks=Integer.parseInt(rowData[2]);
				int dbmsMarks=Integer.parseInt(rowData[3]);
				double gpa=Double.parseDouble(rowData[4]);
		
				Student s1=new Student(id,name,prfMarks,dbmsMarks,gpa);
				System.out.println(s1.toString());
			}
			
		}catch(IOException ex){
			
		}
		
	}
}
