import java.util.*;
class JavaFlowControlQuestion1{
	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	
	double totalMarks=0;
	System.out.print("Chemistry : ");
	totalMarks+=input.nextDouble();
	
	System.out.print("Physics : ");
	totalMarks+=input.nextDouble();
	
	System.out.print("Combined Maths : ");
	totalMarks+=input.nextDouble();
	
	double avgMarks=(totalMarks/3.0);
	System.out.printf("\nTotal Marks : %.2f",totalMarks);
	System.out.printf("\nAverage Marks : %.2f",avgMarks);
	
	System.out.println();
	String status=avgMarks>75?"Pass":"Fail";
	System.out.println("\n"+status);
	
	}
}
