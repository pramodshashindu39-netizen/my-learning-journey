import java.util.*;
class Example{
	public static void printPrimeNumbers(int a){

		
		//----------Process-----------------
		boolean isPrime=true;
		for(int i=2; i<a; i++){
			if(a%i==0){
				isPrime=false;
				break;
			}
		}
		//---------output-------------------
		if(isPrime){
			System.out.println(a+" is a prime number....");
		}
	}

	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		//----------Input--------------------
		System.out.print("Input an integer : ");
		int num=input.nextInt();		

		printPrimeNumbers(num);
	}
}
