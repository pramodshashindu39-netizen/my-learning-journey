import java.util.*;
class Customer{
	private String customerID;
	private String customerName;
	private String customerPhoneNo;
	
	Customer(String customerID,String customerName,String customerPhoneNo){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerPhoneNo = customerPhoneNo;
		
	}
	
	String getCustomerID(){
		return customerID;
	}
	
}

class Order{
	private String OrderID;
	private String customerID;
	private String billValue;
}

class BurgerShop{
	
	public static Customer customerArray [] = new Customer [0];
	public static Order orderArray [] = new Order [0];
	
	public static boolean checkCustomerID(String customerID){
		for (int i = 0; i < customerArray.length ; i++){
			
			String custID=customerArray[i].getCustomerID();
			if (custID.equals(customerID)){
				return true;
			}
		}
		return false;
	}

	public static void cutomerArrayExtend(Customer customer){
			Customer tempCustomerArray[] = new Customer[customerArray.length+1];
			
			for (int i = 0; i < customerArray.length ; i++){
				tempCustomerArray[i]=customerArray[i];
			}
			
			tempCustomerArray[tempCustomerArray.length-1]=customer;
			customerArray=tempCustomerArray;
		
	}
	
	public static void orderArrayExtend(Order order){
		
		
	}
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		
		System.out.println("=".repeat(50));
		System.out.println("BURGER SHOP BILLING SYSTEM - DAILY TRANSACTIONS");
		System.out.println("=".repeat(50));
		
		System.out.println();
		
		L1:do{
			
				System.out.print("Enter Customer ID (Enter -1 to Stop) : ");
				String customerID=input.nextLine();
				
				if (customerID.equals("-1")){
					break L1;
				}
				
				if (!checkCustomerID(customerID)){
					System.out.print("New Customer Detected.	Enter Customer Name : ");
					String customerName=input.nextLine();
					
					System.out.print("Enter Customer Phone Number : ");
					String customerPhoneNo=input.nextLine();
					
					Customer customer = new Customer(customerID,customerName,customerPhoneNo);
					
					cutomerArrayExtend(customer);
					
				}
				
				System.out.print("Enter Bill Value : ");
				double billValue=input.nextDouble();
				
				input.nextLine();
				
				Order order = new Order();
				
				orderArrayExtend(order);
					
				System.out.println();
			
		} while(true);
		
	}
}
