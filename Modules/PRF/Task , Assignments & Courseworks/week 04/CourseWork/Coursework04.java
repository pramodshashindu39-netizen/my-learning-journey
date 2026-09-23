import java.util.*;
class Coursework04{
		public static void main ( String args[]){ 
			Scanner input=new Scanner(System.in); 
			
			System.out.println( );
						System.out.println("-----------------------------------------------------------------------" );
						System.out.println("|			SALARY INFORMATION SYSTEM                     |" );
						System.out.println("-----------------------------------------------------------------------\n\n\n" );
						System.out.println("[1] Calculate Income Tax" );
						System.out.println("[2] Calculate Annual Bonus" );
						System.out.println("[3] Calculate Loan Amount \n\n" );
						System.out.print  ("Enter an option to continue > " );
						int num=input.nextInt();
						
							String name;
							double salary;
						
						switch(num){
							 
							case 1:{
									System.out.println("-----------------------------------------------------------------------" );
									System.out.println("|			Calculate Income Tax                          |" );
									System.out.println("-----------------------------------------------------------------------\n\n\n" );
									System.out.print("Input Employee name		- ");
									name = input.next();
									System.out.println("");
									
									System.out.print("Input Employee salary	- ");
									salary = input.nextDouble();
									System.out.println("");
									
									double tax=0;
									
									if(salary <= 100000.00 ){
										System.out.println("No Tax to pay");
									}else if(salary <= 141667.00){
										tax = (int)((salary - 100000.00)*0.06);
									}else if(salary <= 183333.00){
										tax = (int)((salary - 141667.00)*0.12 + 2500.00);
									}else if(salary <= 225000.00){
										tax = (int)((salary - 183333.00)*0.18 + 7500.00);
									}else if(salary <= 266667.00){
										tax = (int)((salary - 225000.00)*0.24 + 15000.00);
									}else if(salary <= 308333.00){
										tax = (int)((salary - 266667.00)*0.30 + 25000.00);
									}else{
										tax = (int)((salary - 308333.00)*0.36 + 37500.00);
									}	
									System.out.println("You have to pay Income Tax per month	:" + tax);
									
									break;
									}
							case 2:
									{
										System.out.println("-----------------------------------------------------------------------" );
										System.out.println("|			Calculate Annual Bonus                        |" );
										System.out.println("-----------------------------------------------------------------------\n\n\n" );
										System.out.print("Input Employee name		- ");
										name = input.next();
										System.out.println("");
										
										System.out.print("Input Employee salary	- ");
										salary = input.nextDouble();		
										System.out.println("");	
										
										double bonus;
										if(salary<100000){
											bonus=5000;
										}else if(salary<=199000){
											bonus=(int)(salary*0.1);
										}else if(salary <= 299000){
											bonus=(int)(salary*0.15);
										}else if(salary <=399000){
											bonus=(int)(salary*0.2);
										}else{
											bonus=(int)(salary*0.35);
										} 						
										System.out.println("Annual Bonus   - " + bonus);									
										break;
									}
									
							case 3:
									System.out.println("-----------------------------------------------------------------------" );
									System.out.println("|			Calculate Loan Amount                        |" );
									System.out.println("-----------------------------------------------------------------------\n\n\n" );
									System.out.print("Input Employee name		- ");
									name = input.next();
									System.out.print("");
									
									System.out.print("Input Employee salary	- ");
									salary = input.nextDouble();
									System.out.println("");	
										
									if (salary<=50000){							
										System.out.println("You can not get a Loan because yor salary lessthan Rs.50 000...		: ");
									}else{							
										System.out.print("Enter Number of year	- ");
										int year=input.nextInt();	
										System.out.println("");
										
										if(year>5){
										System.out.println("Your Input is not valid.The maximum number of the year is 5.");
										}else{
											
											double installement=salary*0.6;
											double r =year*0.15;//r=annual interest rate
											double n=year*12;//number of months
											
											double loan_amount = Math.round(installement*(1-(1/Math.pow(1+(r/12),n)))/(r/12));
											System.out.println("You can get Loan Amount		: " + loan_amount);	
																			 
											}
										}										
									break;	
																
							default :
									System.out.println("Wrong Input.Try Again ");
									break;
						}

						
						
				}
		}

