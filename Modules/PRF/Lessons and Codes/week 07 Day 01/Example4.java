import java.util.*;
class Example4{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input no of Students : ");
		final int N=input.nextInt();
		
		//-------------Create an array type "int"-------------------
		int[] stMarks=new int[N];
		
		//--------------Read marks----------------------------------	
		for(int i=0; i<N; i++){
			System.out.print("Input marks for student "+(i+1)+" : ");
			stMarks[i]=input.nextInt();
		}
		
		//--------------Find total marks----------------------------
		int total=0;
		for(int i=0; i<N; i++){
			total+=stMarks[i];
		}
		
		//--------------Print marks---------------------------------
		System.out.print("[");
		for(int i=0; i<N; i++){
			System.out.print(stMarks[i]+",");
		}
		System.out.print("\b] \n");
		
		//[54, 76, 76, 23, 98, 64, 24 ....]
		//--------------Output--------------------------------------
		double avg=(double)total/N;
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}
