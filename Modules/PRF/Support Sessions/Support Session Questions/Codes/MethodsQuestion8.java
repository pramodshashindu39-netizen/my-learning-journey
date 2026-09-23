import java.util.*;
class MethodsQuestion8{

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("input num 1 : ");
		int num1 = input.nextInt();
		
		System.out.println("input num 2 : ");
		int power = input.nextInt();
		
		for (int i = power ; i > 0 ; i--){
			recursion(num1,power);
			power--;
	
		}
	}
	
	public static void recursion(int num1,int power){
		
		int x=num1;
		for (int i = 0; i < power-1; i++){
			x*=num1;
		}
			
		System.out.println(x);
	}
}
