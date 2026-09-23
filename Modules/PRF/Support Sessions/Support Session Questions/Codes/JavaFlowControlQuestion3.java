import java.util.*;
class JavaFlowControlQuestion3{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);	
	
	System.out.print("Input Num 1 : ");
	int num1=input.nextInt();
	
	System.out.print("Input Num 2 : ");
	int num2=input.nextInt();
	
	System.out.print("Input Num 3 : ");
	int num3=input.nextInt();
	
	boolean status= num1>(num2+num3) || num2>(num1+num3) || num3>(num1+num2);
	System.out.println("\n"+status);
						
	}
}
