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
		
		
		System.out.print("\n\n\nEnter Your Name             - ");
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
		
		double price;
		price = total-discount;
		
		
		
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
		System.out.printf ("|                               |     Price     |   %-12.2f|\n", price);
		System.out.println("+-------------------------------+---------------+---------------+\n");
		
		
		
		double cash;
		System.out.print("The cash amount paid by the consumer - ");
		cash=input.nextInt();
		System.out.println("");
		
		
		int change;
		change= (int) (cash % price);
		
		
		
		System.out.println("+---------------+---------------+");
		System.out.printf ("|   Net Amount  |   %-12.2f|\n", price);
		System.out.println("+---------------+---------------+");	
		System.out.printf ("|   Cash        |   %-12.2f|\n", cash);
	    System.out.println("+---------------+---------------+");
		System.out.printf ("|   Change      |   %-12d|\n", change);
		System.out.println("+-------------------------------+\n\n\n");
		
		
	
		int a,A;
		A= (change%5000);
		a= A/2000;
		
		int b,B;
		B= (A % 2000);
		b= B/1000;
		
		int c,C;
		C= (B % 1000);
		c= C/500;
		
		int d,D;
		D= (C % 500);
		d= D/100;
		
		int e,E;
		E= (D % 100);
		e= E/50;
		
		int f,F;
		F=(E % 50);
		f= E/20;
		
		int g,G;
		G= (F % 20);
		g= G/10;
		
		int h,H;
		H= (G % 10);
		h= H/5;
		
		int i,I;
		I= (H % 5);
		i= I/2;
		
		int j,J;
		J= (I % 2);
		j= J/1;
		
		
		System.out.println("+---------------+---------------+");
		System.out.println("|     Value     |       No      |");
		System.out.println("+---------------+---------------+");	
		System.out.printf ("|    Rs.5000    |   %-12d|\n", change/5000);
	    System.out.println("|---------------|---------------+");
		System.out.printf ("|    Rs.2000    |   %-12d|\n", a);
		System.out.println("|---------------|---------------+");
		System.out.printf ("|    Rs.1000    |   %-12d|\n", b);
		System.out.println("|---------------|---------------+");	
		System.out.printf ("|    Rs.500     |   %-12d|\n", c);
	    System.out.println("|---------------|---------------+");
		System.out.printf ("|    Rs.100     |   %-12d|\n", d);
		System.out.println("|---------------|---------------+");
		System.out.printf ("|    Rs.50      |   %-12d|\n", e);
		System.out.println("|---------------|---------------+");
		System.out.printf ("|    Rs.20      |   %-12d|\n", f);
		System.out.println("|---------------|---------------+");	
		System.out.printf ("|    Rs.10      |   %-12d|\n", g);
	    System.out.println("|---------------|---------------+");
		System.out.printf ("|    Rs.5       |   %-12d|\n", h);
		System.out.println("|---------------|---------------+");
		System.out.printf ("|    Rs.2       |   %-12d|\n", i);
		System.out.println("|---------------|---------------+");	
		System.out.printf ("|    Rs.1       |   %-12d|\n", j);
	    System.out.println("+---------------+---------------+");
		System.out.printf ("|  No of Notes  |   %-12d|\n", a+b+c+d+e+f);
		System.out.println("+---------------+---------------+");
		System.out.printf ("|  No of Coins  |   %-12d|\n", g+h+i );
		System.out.println("+---------------+---------------+\n\n\n");
		
		System.out.println("------------------------------------------------------");
		System.out.println("            THANK YOU FOR SHOPPING WITH US            ");
		System.out.println("------------------------------------------------------");
		
		}
	}
