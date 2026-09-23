import java.util.*;
class Example6{
	public static void printDigitCount(int a){
		
		int count=0;
		do{
			count++;
	
		}while(a/10!=0);
	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		//----------Input--------------------
		System.out.print("Input an integer : ");
		int num=input.nextInt();		

		printDigitCount(num);
	}
}
