import java.util.*;
class JavaFlowControlQuestion5{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		int numberOfCopies=0;
		double pricePerCopy=0.0;
		double totalPrice=0.0;
		
		while(true){
			System.out.print("The number of copies to be printed : ");
			numberOfCopies=input.nextInt();	
			
			if (numberOfCopies>1000){
				pricePerCopy=25.00;
				break;
			}else if(numberOfCopies>=800){
				pricePerCopy=26.00;
				break;
			}else if(numberOfCopies>=500){
				pricePerCopy=27.00;
				break;
			}else if(numberOfCopies>=100){
				pricePerCopy=28.00;
				break;
			}else if(numberOfCopies>0){
				pricePerCopy=30.00;
				break;
			}else{
				System.out.println("\nWrong input...Please enter a value greaterthan 0.\n");
			}
	
		}
		
			totalPrice=numberOfCopies*pricePerCopy;
			
			System.out.println("\nThe price per copy : Rs. "+pricePerCopy);
			System.out.println("\nThe total price for the printing copies : Rs. "+totalPrice);
	
	}

}
