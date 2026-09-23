import java.util.*;
class Example3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Input no of Students:");
		int students=input.nextInt();
		
		double[] avgMarks=new double[students];
		for(int i=0;i<students;i++){
			System.out.print("Input marks for student "+(i+1)+":");
			avgMarks[i]=input.nextInt();
		}
		
		int total=0;
		for(int k=0;k<50;k++){
			total+=avgMarks[k];
		}
			
		double avg=total/students;
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}
