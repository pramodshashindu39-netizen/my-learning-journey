import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		//int a,b,c,d,e,f,g,h,i,j;
		int[] ar=new int[10];
		System.out.print("Input marks for student 1 : ");
		ar[0]=input.nextInt();
		
		System.out.print("Input marks for student 2 : ");
		ar[1]=input.nextInt();
		
		System.out.print("Input marks for student 3 : ");
		ar[2]=input.nextInt();
		
		System.out.print("Input marks for student 4 : ");
		ar[3]=input.nextInt();
		
		System.out.print("Input marks for student 5 : ");
		ar[4]=input.nextInt();
		
		System.out.print("Input marks for student 6 : ");
		ar[5]=input.nextInt();
		
		System.out.print("Input marks for student 7 : ");
		ar[6]=input.nextInt();
		
		System.out.print("Input marks for student 8 : ");
		ar[7]=input.nextInt();
		
		System.out.print("Input marks for student 9 : ");
		ar[8]=input.nextInt();
		
		System.out.print("Input marks for student 10: ");
		ar[9]=input.nextInt();
		
		int total=0;
		total+=ar[0];
		total+=ar[1];
		total+=ar[2];
		total+=ar[3];
		total+=ar[4];
		total+=ar[5];
		total+=ar[6];
		total+=ar[7];
		total+=ar[8];
		total+=ar[9];

		double avg=total/10.0;
		System.out.println("Total marks   : "+total);
		System.out.println("Average marks : "+avg);
	}
}
