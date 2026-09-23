import java.util.*;
class RandomNumExample1{
	public static void main(String args[]){
		Random random=new Random();
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input no of Students : ");
		final int N=input.nextInt();
		
		//-------------Create an array type "int"-------------------
		int[] stMarks=new int[N];
		
		//--------------Read marks----------------------------------	
		for(int i=0; i<N; i++){
			System.out.println("Input marks for student "+(i+1)+" : ");
			stMarks[i]=random.nextInt(100);
		}
		
		//--------------Find total marks----------------------------
		int total=0;
		for(int i=0; i<N; i++){
			total+=stMarks[i];
		}
		
		//--------------Find maximum--------------------------------
		int max=stMarks[0];
		for(int i=1; i<N; i++){
			if(stMarks[i]>max){
				max=stMarks[i];
			}
		}
		//--------------Find minimum--------------------------------
		int min=stMarks[0];
		for(int i=1; i<N; i++){
			if(stMarks[i]<min){
				min=stMarks[i];
			}
		}
		//--------------Print marks---------------------------------
		//[54, 76, 76, 23, 98, 64, 24 ....]
		System.out.print("[");
		for (int i = 0; i < N; i++){
			System.out.print(stMarks[i]+", ");
		}
		System.out.println("\b\b]");
		


		//--------------Output--------------------------------------
		double avg=(double)total/N;
		System.out.println("Total marks   : "+total);
		System.out.println("Maximum       : "+max);
		System.out.println("Minimum       : "+min);
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}
