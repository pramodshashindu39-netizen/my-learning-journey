import java.util.*;
class Customer{
	private String custID;
	private int totBillValue;
	
	
}

class BurgerShop{
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		L1:do{
			System.out.print("Enter Customer ID (Enter -1 to stop) : ");
			String custID=input.next();
			if (custID.equals("-1")){
				break;
			}
			System.out.print("Enter Bill Value : ");	
			int billValue=input.nextInt();
			System.out.println();
		}while(true);
		
		

	}
}
