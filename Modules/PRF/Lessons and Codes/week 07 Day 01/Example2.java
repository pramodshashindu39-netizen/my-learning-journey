import java.util.*;
class Example2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		//int a,b,c,d,e,f,g,h,i,j;
		int[] stuMarks=new int[10];
		for(int i=0;i<10;i++){
			System.out.print("Input marks for student "+(i+1)+":");
			stuMarks[i]=input.nextInt();
		}
		int total=0;
		
		for(int k=0;k<10;k++){
			total+=stuMarks[k];
		}
			
		double avg=total/10.0;
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}
