import java.util.*;
class Example7{
	public static void main(String args[]){	
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input no of students : ");
		final int N=input.nextInt();
		
		System.out.print("Input no of subjects : ");
		final int S=input.nextInt();
		
		int[][] stMarks=new int[N][S];
		Random r=new Random();
		for(int i=0; i<N; i++){	
			for(int j=0; j<S; j++){
				stMarks[i][j]=r.nextInt(101); //0 to 100
			}
		}
		
		//-----------Print marks-----------------------
		for (int i = 0; i < N; i++){
			System.out.println("Student "+ (i+1));
			for (int j = 0; j < S ; j++){
				System.out.println("\tSubject "+stMarks[i][j]);
			}
			System.out.println("\n\n");
		}
		
	}
}
