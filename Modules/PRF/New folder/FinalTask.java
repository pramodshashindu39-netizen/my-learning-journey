import java.util.*;
class FinalTask{
	
	public static String[] customerIDs=new String[0]; 
	public static double[] billValues=new double[0];
	
	public static void extendArray(String custID, double billValue){
		
		for (int i = 0; i < customerIDs.length ; i++){
			if(custID.equals(customerIDs[i])){
				billValues[i]+=billValue;
				return;
			}
		}
		
		String[] tempCustomerIDs=new String[customerIDs.length+1];
		double[] tempBillValues=new double[billValues.length+1]; 
		
		for (int j = 0; j < customerIDs.length; j++){
			tempCustomerIDs[j]=customerIDs[j];
			tempBillValues[j]=billValues[j];
		}
		
		tempCustomerIDs[tempCustomerIDs.length -1]=custID;
		tempBillValues[tempBillValues.length-1]=billValue;
		
		customerIDs=tempCustomerIDs;
		billValues=tempBillValues;				
			
	}

	
	public static void customerReportSort(){
		for (int i = 0; i < customerIDs.length-1 ; i++){
			for (int j = 0; j < customerIDs.length-1-i ; j++){
				if(billValues[j]<billValues[j+1]){
					double temp1=billValues[j];
					billValues[j]=billValues[j+1];
					billValues[j+1]=temp1;
					
					String temp2=customerIDs[j];
					customerIDs[j]=customerIDs[j+1];
					customerIDs[j+1]=temp2;
				}
			}
		}
	}
	
	
	public static void customerReport(){
		System.out.println("\n\n");
		System.out.println("-".repeat(20) + " Customer Report " + "-".repeat(20));
		System.out.println("\n Customer ID 		 | 		Total Bill Values");
		System.out.println("-".repeat(58));
		System.out.println("\n");
		
		customerReportSort();
		for (int i = 0; i <  customerIDs.length; i++){
			System.out.printf("	%-15s  |	%20.2f",customerIDs[i],billValues[i]);
			System.out.println();
		}
		
	}
	
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		String custID="";
		do{
			System.out.print("Enter Customer ID (Enter -1 to stop) :  ");
			custID=input.next();
			double billValue=0;
				if(custID.equals("-1")){
					break;
				}
				
				System.out.print("Enter Bill Value : ");
				billValue=input.nextDouble();
					
				extendArray( custID, billValue);
					
		}while(true);
		
		customerReport();
	}
}
