import java.util.*;
class iCalc_Number_Converter{
	public static void main(String args[]){
				Scanner input=new Scanner(System.in);
				
				char enter=0;
				int enter_ch=0;
				
				do{
				
				System.out.println("					 /$$                     /$$             ");   
				System.out.println("					|__/                    | $$              ");  
				System.out.println("					 /$$  /$$$$$$$  /$$$$$$ | $$  /$$$$$$$      ");
				System.out.println("					| $$ /$$_____/ |____  $$| $$ /$$_____/      ");
				System.out.println("					| $$| $$        /$$$$$$$| $$| $$            ");
				System.out.println("					| $$| $$       /$$__  $$| $$| $$            ");
				System.out.println("					| $$|  $$$$$$$|  $$$$$$$| $$|  $$$$$$$      ");
				System.out.println("					|__/ \\_______/ \\_______/|__/ \\_______/   \n\n");
				
				System.out.println("  _   _                       _                        _____                                         _                 		 			");
				System.out.println(" | \\ | |                     | |                      / ____|                                       | |                				");
				System.out.println(" |  \\| |  _   _   _ __ ___   | |__     ___   _ __    | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __  				");
				System.out.println(" | . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|   | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__| 		");
				System.out.println(" | |\\  | | |_| | | | | | | | | |_) | |  __/ | |      | |____  | (_) | | | | |  \\ V /  |  __/ | |    | |_  |  __/ | |    ");
				System.out.println(" |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|       \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|    \n	");
				
				System.out.println("=====================================================================================================================================\n\n");
																																	   
				System.out.println("[01] Decimal Converter\n");
				System.out.println("[02] Binary Converter\n");
				System.out.println("[03] Octal Converter\n");
				System.out.println("[04] HexadecimalConverter\n");
				System.out.println("[05] Roman Number Converter\n");
				
				//	Home Page User Input

				System.out.print("Enter option -> ");
				int en=input.nextInt();		
				
				String binary  ="";
				String octal   ="";
				String hex_dec ="";																				//var------>en
				
				int power=0;
				int decimal=0;
				
				int temp_1=0,temp_2=0;
				switch(en){
					case 1:
					
							System.out.println("+------------------------------------------------+");
							System.out.println("|\t\t Decimal Converter\t\t |");
							System.out.println("+------------------------------------------------+\n\n\n");
							System.out.print("Enter an Decimal number : ");
							int dec_num=input.nextInt();
																								//var------->dec_num
							 temp_1 = dec_num;																		//var------->dec_num_1
							 temp_2 = dec_num;																		//var------->dec_num_2
							

				
						  //DECIMAL TO BINARY
						  
							if (dec_num==0){
									binary = "0";
									octal  = "0";
									hex_dec= "0";
					
							}else{ 
								while(dec_num>0){
								int x=dec_num % 2;																			//var--------->x
								binary= x + binary;
								dec_num = dec_num / 2;
								}
						    }
						    
						   //DECIMAL TO OCTAL
							

								while(temp_1>0){
								int x=temp_1 % 8;
								octal= x + octal;
								temp_1 = temp_1 / 8;
								}
						
						    		    
						    // DECIMAL TO HEXADECIMAL

								while(temp_2>0){
								int x=temp_2 % 16;																		//var-------->x
									if(x<10){
										hex_dec = x + hex_dec;
									}else{
										char z= (char)(x+55);																//var-------->z
										hex_dec = z + hex_dec;
									}
								temp_2 = temp_2 / 16; 
								}
				
						    
						 
						    System.out.println("\n		Binary number : " + binary);
							System.out.println("\n		Octal number  : " + octal);
							System.out.println("\n		Hexadecimal number  : " + hex_dec);

						
							break;
							
					case 2:
							System.out.println("+------------------------------------------------+");
							System.out.println("|\t\t Binary Converter\t\t |");
							System.out.println("+------------------------------------------------+");
							
							
							System.out.print("Enter an Binary Number : ");
							int bin_num=input.nextInt();
										
							while(bin_num>0){
								    decimal = decimal + (bin_num % 10)*((int)Math.pow(2,power));
									power ++;
									bin_num=bin_num/10;	
								}

									temp_1 = decimal;	
									temp_2 = decimal;							
							//binary to octal-------->decimal to octal

								while(temp_1>0){
								int x=temp_1 % 8;
								octal= x + octal;
								temp_1 = temp_1 / 8;
								}	
								
								while(temp_2>0){
								int x=temp_2 % 16;																		//var-------->x
									if(x<10){
										hex_dec = x + hex_dec;
									}else{
										char z= (char)(x+55);														 	             //var-------->z
										hex_dec = z + hex_dec;
									}
								temp_2 = temp_2 / 16; 
								}
								
							System.out.print("\n		Decimal number : " + decimal);									
							System.out.println("\n		Octal number  : " + octal);	
							System.out.println("		Hexadecimal number  : " + hex_dec);																						

							

							break;
							
					case 3:
							System.out.println("+------------------------------------------------+");
							System.out.println("|\t\t  Octal Converter\t\t |");
							System.out.println("+------------------------------------------------+");
							
							
							System.out.print("Enter an Octal number : ");
							int oct_num=input.nextInt();
							

							while(oct_num>0){
								decimal = decimal + (oct_num%10)*((int)Math.pow(8,power));
								power++;
								oct_num = oct_num/10; 
								}

								temp_1 = decimal;
								temp_2 = decimal;							
														
								while(temp_1>0){
								int x=temp_1 % 2;
								binary= x + binary;
								temp_1 = temp_1 / 2;
								}	
								
								while(temp_2>0){
								int x=temp_2 % 16;																		//var-------->x
									if(x<10){
										hex_dec = x + hex_dec;
									}else{
										char z= (char)(x+55);															//var-------->z
										hex_dec = z + hex_dec;
									}
								temp_2 = temp_2 / 16; 
								}

							System.out.print("\n		Decimal number : " + decimal);									
							System.out.println("\n		Binary number  : " + binary);	
							System.out.println("		Hexadecimal number  : " + hex_dec);	
																						
							break;

					case 4:
							System.out.println("+------------------------------------------------+");
							System.out.println("|\t\t HexadecimalConverter\t\t |");
							System.out.println("+------------------------------------------------+");
							
							System.out.print("Enter an Hexadecimal number : ");
							String hex_num=input.next();
							
							decimal = Integer.parseInt(hex_num,16);
	
							temp_1 = decimal;
							temp_2 = decimal;
							
								while(temp_1>0){
								int x=temp_1 % 2;
								binary= x + binary;
								temp_1 = temp_1 / 2;
								}	
								
								while(temp_2>0){
								int x=temp_2 % 8;
								octal= x + octal;
								temp_2 = temp_2 / 8;
								}	

							System.out.print("\n		Decimal number : " + decimal);									
							System.out.println("\n		Binary number  : " + binary);	
							System.out.println("		Octal number : " + octal);	
							break;
					
					case 5:
							System.out.println("+------------------------------------------------+");
							System.out.println("|\t\t Roman Number Converter\t\t |");
							System.out.println("+------------------------------------------------+");
							break;
						
							
					default:		
							System.out.println("Not a Valid Input");
							
					
					}
					System.out.print("\nDo you want to go to homepage (Y/N)-> ");
					enter=input.next().charAt(0);
			
		} while(enter =='Y' || enter == 'y');
							
	}
}
