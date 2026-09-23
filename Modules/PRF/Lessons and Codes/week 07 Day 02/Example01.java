import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input no of Students : ");
		final int N=input.nextInt();
		
		//-------------Create an array type "int"-------------------
		int[] stMarks=createAnArray(N);
		
		//--------------Read marks----------------------------------	
		readMarks(stMarks);
		
		//--------------Find total marks----------------------------
		int total=findTotal(stMarks);
				
		//--------------Find maximum--------------------------------
		int max=findMax(stMarks);
		
		//--------------Find minimum--------------------------------
		int min=findMin(stMarks);
		
		//--------------Print marks---------------------------------
		//[54, 76, 76, 23, 98, 64, 24 ....]
		printMarks(stMarks);
		
		//--------------Output--------------------------------------
		double avg=(double)total/N;
		System.out.println("Total marks   : "+total);
		System.out.println("Maximum       : "+max);
		System.out.println("Minimum       : "+min);
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}
