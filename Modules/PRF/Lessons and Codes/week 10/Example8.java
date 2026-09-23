import java.util.*;
class Example8{
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
		int[] totalMark=new int[N];
		int[] Max=new int[N];
		int[] Min=new int[N];
		
		for(int i=0;i<S;i++){
		System.out.print("sub "+(i+1)+"\t");
		}
		System.out.print("	Total		max		min		avg\n");
		
		for(int i=0; i<N; i++){
			int totMarks=0,min=101;
			for(int j=0; j<S; j++){
				int max=0;
				System.out.print(stMarks[i][j]+"\t");
					totMarks=+stMarks[i][j];
					if(stMarks[i][j]>max){
						max=stMarks[i][j];
					}
				Max[i]=max;	
			}
			totalMark[i]=totMarks;
			System.out.println();
		}
			
		for (int i=0;i<S;i++){
			System.out.print(totalMark[i] +"	"+	Max[i]);
		}

		
	}
}
