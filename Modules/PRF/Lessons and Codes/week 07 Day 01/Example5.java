import java.util.*;
class Example5{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		//int a,b,c,d;
		
		int[] num=new int[4];
		
		System.out.print("Input number 1 : ");
		num[0]=input.nextInt();
		System.out.print("Input number 2 : ");
		num[1]=input.nextInt();
		System.out.print("Input number 3 : ");
		num[2]=input.nextInt();
		System.out.print("Input number 4 : ");
		num[3]=input.nextInt();
		
		//maximum number
		int max=num[0];
		if(num[1]>max){
			max=num[1];
		}
		if(num[2]>max){
			max=num[2];
		}
		if(num[3]>max){
			max=num[3];
		}
		System.out.println("max : "+max);
	}
}
