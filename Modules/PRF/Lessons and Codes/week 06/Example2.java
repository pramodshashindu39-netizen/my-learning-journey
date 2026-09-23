import java.util.*;
class Example{
	public static int getTotal(int num1, int num2){//num1, num2-->Parameters
		//----------Process-----------------
		int total=num1+num2;
		return total;

	}
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input number 1 : ");
		int num1=input.nextInt();		
		System.out.print("Input number 1 : ");
		int num2=input.nextInt();
		int total;
		total=getTotal(num1,num2);
		
		//---------output-------------------
		System.out.println(num1+" + "+num2+" = "+total);
	}
}
