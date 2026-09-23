import java.util.*;
class AccountBill{
	public static void main (String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("========================================================");
		System.out.println("|		LECO APP - MAIN MENU		|");
		System.out.println("========================================================\n\n");
		System.out.println("	[1] Add LECO Account");
		System.out.println("	[2] Bill Calculation\n\n");
		System.out.print("Enter an option to continue > ");
		int enter=input.nextInt();
		
		String name;
		String nic;
		String meter_number;
		String acc_number;
		
		switch(enter){
			case 1: 
					System.out.println("\n[1] Domestic - No Solar(Normal Meter)");
					System.out.println("[2] Domestic - With Solar(Net Metering/Net Plus)\n\n");
					
					System.out.print("Enter an option to continue > ");	
					int en=input.nextInt();																				//en------->enter
					
					switch(en){
						case 1:                                                                                        //  * Is My method correct ?
						case 2:
								System.out.println("\n\n========================================================");
								System.out.println("|		ADD LECO ACCOUNT		|");
								System.out.println("========================================================\n\n");
								
								System.out.print("Input Account Number		- ");
								acc_number = input.next();
								
								System.out.print("Input Customer name 		- ");
								name = input.next();
								
								
								System.out.print("Input NIC Number 		- ");
								nic = input.next();
								
								System.out.print("Input Meter Number 		- ");
								meter_number = input.next();
								
								System.out.println("Select Account Type 		- " + en);
								
								System.out.println("\n\n---------------------ACCOUNT CREATED---------------------");
								System.out.println("Account Number : " + acc_number);
								System.out.println("Customer Name  : " + name);
								System.out.println("NIC Number     : " + nic);
								System.out.println("Meter Number   : " + meter_number);
								
								String acc_type;
									if(en==1){
										acc_type="Domestic - No Solar";
									}else{
										acc_type="Domestic - With Solar";
									} 
									
								System.out.print("Account Type   : " + acc_type);							
								System.out.println("\n\n\nYour LECO account has been created successfully");
								break;
					
					  default:
								System.out.println("Not a valid input");
								break;
					}
					break;
							
			case 2:
					System.out.println("\n\n========================================================");
					System.out.println("|	LECO BILL CALCULATION - ONLY METER	|");
					System.out.println("========================================================\n\n");
					
					System.out.print("Input Customer name 		- ");
					name = input.next();
					
					System.out.print("Input Total Units 		- ");
					int unit = input.nextInt();
					
					double energy_charge=0.0;
					double fixed_charge=0.0;
					
					if(unit <=30){
						energy_charge= unit*4;
						fixed_charge=75.00;
					}else if(unit <=60){
						energy_charge =(double)((unit - 30)*6.0 + 120.00);
						fixed_charge=200.00;
					}else if(unit <=90){
						energy_charge= (double)((unit - 60)*14.0 + 660.00);
						fixed_charge=400.00;
					}else if(unit <=120){
						energy_charge= (double)((unit - 90)*20.0 + 1080.00);
						fixed_charge=1000.00;
					}else if(unit <=180){
						energy_charge= (double)((unit - 120)*33.0 + 1680.00);
						fixed_charge=1500.00;
					}else{
						energy_charge= (double)((unit - 180)*52.0 + 3660.00);
						fixed_charge=2000.00;
					}
					
					double tot_bill= (energy_charge + fixed_charge);
					
					System.out.printf("\nEnergy Charge 		: Rs. %.2f ", energy_charge);
					System.out.printf("\nFixed Charge		: Rs. %.2f" , fixed_charge);
					System.out.printf("\n\nYou have to pay 	: Rs. %.2f" , tot_bill);			
					break;
			
			default:
					System.out.println("\nNot a valid input");
					break;
			}  
	}
}
