import java.util.*;
class Assignment{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
			
			double x,y,z;
				
			System.out.print("Input Number 1 	: ");
			x=input.nextDouble();
			
			System.out.print("Input Number 2 	: ");
			y=input.nextDouble();
			                    
			if(x < y){
					System.out.println("\nThe first number is less than the second number");
			}else if( x > y){
					System.out.println("\nThe first number is greater than the second number");
			}else{
					System.out.println("\nBoth are equal   ");
		}				
	}	
}		
