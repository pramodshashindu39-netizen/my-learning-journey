import java.util.*;
class JavaFlowControlQuestion2{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);	
	
	double totalPrice=0;
		while (true){
			System.out.print("\nProduct(Enter -1 to stop) : ");
			String productName=input.nextLine();

				if (productName.equals("-1")){
					break;
				}
			
			System.out.print("Input Unit Price : ");
			double unitPrice=input.nextDouble();
		
			System.out.print("Amount :");
			double amount=input.nextDouble();
		
			input.nextLine();
			
			totalPrice+=(unitPrice*amount);
		}

	System.out.printf("\nTotal Price : %.2f",totalPrice);
	
	double discount=0.0;
	String discountStatus = totalPrice>500.00?String.format("\nDiscount Price : %.2f",(discount=(totalPrice*0.05))):"\nNo Discount Given";
	
	System.out.printf(discountStatus);
	System.out.printf("\nNew Price  : %.2f",(totalPrice - discount));
	}

}
