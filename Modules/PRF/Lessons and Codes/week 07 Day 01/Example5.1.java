import java.util.*;
class Example6{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		//int a,b,c,d;
		
		int[] num=new int[4];
		for(int i=0;i<4;i++){
		System.out.print("Input number 1 : ");
		num[i]=input.nextInt();
		}
		
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
