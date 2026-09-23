import java.util.*;
class BillPrint{
		public static void main(String args[]){
		Scanner input=new Scanner(System.in);	
		System.out.println("=================================================================================");
		System.out.println("");
		System.out.println("__          __  _               	     _          _ __  __            _ ");
		System.out.println("\\ \\        / / | |            	            | |        (_)  \\/  |          | | ");
		System.out.println(" \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_	  ");
		System.out.println("  \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_  `_ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|  ");
		System.out.println("   \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_");
		System.out.println("    \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__|    ");
		System.out.println("");
		System.out.println("=================================================================================");
		System.out.println();
		
		System.out.print("Enter Customer Phone Number - " );
		String pnb=input.next();
		System.out.println("");
		
		System.out.print("Enter Your Name             - ");
		String name=input.next();
		System.out.println("");
		
		System.out.println("");
		System.out.println("");
		System.out.println("=================================================================================\n");
	
		System.out.print("Basmathi Qty(kg) - ");
		int basmathiQTY=input.nextInt();
		double basmathiprice=250.00;
		System.out.println("");
		double basmathitot= basmathiQTY*basmathiprice;

		System.out.print("Dhal Qty(kg)     - ");
		int dhalQTY=input.nextInt();
		double dhalprice=180.00;
		System.out.println("");
		double dhaltot= dhalQTY* dhalprice;
	
		System.out.print("Sugar Qty(kg)    - ");
		int sugarQTY=input.nextInt();
		double sugarprice =150.00;
		System.out.println("");
		double sugartot=sugarQTY*sugarprice;

		System.out.print("Highland Qty     - ");
		int highlandQTY=input.nextInt();
		double highlandprice=1200.00;
		System.out.println("");
		double highlandtot=highlandQTY*highlandprice;
	
		System.out.print("Yoghurt Qty      - ");
		int yoghurtQTY=input.nextInt();
		double yoghurtprice=50.00;
		System.out.println("");
		double yoghurttot=yoghurtQTY*yoghurtprice;
		
		System.out.print("Flour Qty(kg)    - ");
		int flourQTY=input.nextInt();
		double flourprice=120.00;
		System.out.println("");
		double flourtot=flourQTY*flourprice;
	
		System.out.print("Soap Qty         - ");
		int soapQTY=input.nextInt();
		double soapprice=160.00;
		System.out.println("");
		double soaptot=soapQTY*soapprice;
		
		double total=basmathitot+dhaltot+sugartot+highlandtot+yoghurttot+flourtot+soaptot;

		double discount=total*0.1;
		
		System.out.println("+---------------------------------------------------------------+");
		System.out.println("|		 _   __  __          _____ _______              |");
		System.out.println("|		(_) |  \\/  |   /\\   |  __ \\__   __|  	        |");
		System.out.println("|		 _  | \\  / |  /  \\  | |__) | | |     		|");
		System.out.println("|		| | | |\\/| | / /\\ \\ |  _  /  | |                |");
		System.out.println("|		| | | |  | |/ ____ \\| | \\ \\  | |                |");
		System.out.println("|		|_| |_|  |_/_/    \\_\\_|  \\_\\ |_|                |");
		System.out.println("|			225,Galle Road,Panadura.	        |");
		System.out.println("|		                                                |");
		System.out.println("|						                |");
		System.out.println("+---------------------------------------------------------------+");
		System.out.printf ("|			    # Tel   : %-26s|\n",pnb);
		System.out.printf ("|			    # Name  : %-26s|\n",name);
		System.out.println("+-----------------+-------------+---------------+---------------+");
		System.out.println("|                 |     Qty     | unit price(Rs)|    Price(Rs)  |");
		System.out.println("+-----------------+-------------+---------------+---------------+");
		System.out.printf ("|    #Basmathi    |     %-8d|    %-11.2f|    %-11.2f|\n",basmathiQTY,basmathiprice,basmathitot);
		System.out.println("|                 |             |               |               |");
		System.out.printf ("|    #Dhal        |     %-8d|    %-11.2f|    %-11.2f|\n", dhalQTY,dhalprice,dhaltot);
		System.out.println("|                 |             |               |               |");
		System.out.printf ("|    #Sugar       |     %-8d|    %-11.2f|    %-11.2f|\n",sugarQTY,sugarprice,sugartot);
		System.out.println("|                 |             |               |               |");
		System.out.printf ("|    #highland    |     %-8d|    %-11.2f|    %-11.2f|\n",highlandQTY,highlandprice,highlandtot);
		System.out.println("|                 |             |               |               |");
		System.out.printf ("|    #Yoghurt     |     %-8d|    %-11.2f|    %-11.2f|\n",yoghurtQTY,yoghurtprice,yoghurttot);
		System.out.println("|                 |             |               |               |");
		System.out.printf ("|    #Flour       |     %-8d|    %-11.2f|    %-11.2f|\n",flourQTY,flourprice,flourtot);
		System.out.println("|                 |             |               |               |");
		System.out.printf ("|    #Soap        |     %-8d|    %-11.2f|    %-11.2f|\n",soapQTY,soapprice,soaptot);
		System.out.println("|                 |             |               |               |");
		System.out.println("+-----------------+-------------+---------------+---------------+");
		System.out.printf ("|                               |    Total      |   %-12.2f|\n",  total );
		System.out.println("|                               +---------------+---------------+");	
		System.out.printf ("|                               | Discount(10%%) |   %-12.2f|\n", discount);
	    System.out.println("|                               +---------------+---------------+");
		System.out.printf ("|                               |     Price     |   %-12.2f|\n", total-discount);
		System.out.println("+-------------------------------+---------------+---------------+");
		
		}
	}
