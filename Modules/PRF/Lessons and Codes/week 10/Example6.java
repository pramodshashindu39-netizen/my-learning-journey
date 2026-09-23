import java.util.*;
class Example6{
	public static void main(String args[]){	
		String[].int[] stuMarks=new String[10].int[4];

		Scanner input=new Scanner(System.in);
		for(int i=0;i<stuMarks.length;i++){
			System.out.printf("Input marks for student %d....\n1",i+1);
			for(int j=0; j<4; j++){
				System.out.print("\tSubject "+(j+1)+" : ");
				stuMarks[i][j]=input.nextInt();
			}
		}
	}
}
