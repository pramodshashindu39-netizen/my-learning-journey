import java.util.*;
class ChickenFactorySystemCopy{
	public static void main(String args[]){
			Scanner input=new Scanner(System.in);
			
			//Home Page
			
			System.out.println("#+-------------------------------------------------------+");
			System.out.println(" |	Boiled Chicken Packet Factory System             |");
			System.out.println("#+-------------------------------------------------------+\n");
			
			System.out.print("Enter Today's Manufacturing Price (Rs. per kg) : ");
			double  manufacturingPrice = input.nextDouble();
			System.out.print("Enter Today's Selling Price (Rs. per kg) : ");
			double  sellingPrice = input.nextDouble();
			
			int totalBoxes=1;
			int totalPacketsDay=0;
			double totalWeightDay=0;
			double maximumWeightDay=0;
			double minimumWeightDay=1000;
			double averageWeightDay=0;
			
			double	totalWeight =0.0;
			double	maximumWeight=0.0;
			double	minimumWeight=100;
			double  averageWeight=0.0;		
				
			L1:while(true){
				
				System.out.println("Starting Box "+totalBoxes+"...");
				
				//Packing a Box
				
				System.out.println("#+-------------------------------------------------------+");
				System.out.println(" |			Box "+totalBoxes+"          			|");
				System.out.println("#+-------------------------------------------------------+\n");
				
				int totalPackets = 0;
				
				L2:while(true){
					System.out.print("Enter packet weight (kg) [0 = box full, -1 = end day] : ");
					double packetWeight = input.nextDouble();
			
					

					
					if(packetWeight>0 && packetWeight<10 ){
						
						totalWeight +=packetWeight;
						maximumWeight =Math.max(maximumWeight,packetWeight);
						minimumWeight =Math.min(minimumWeight,packetWeight);
						averageWeight =totalWeight/totalPackets;
						totalPackets ++;
						continue L2;
							
					}else if(packetWeight<-1 ){								
							System.out.println("Invalid Input ... ");
							continue L2;
							
					// Box Report 

					
					}else if(packetWeight==0){
						
							
							System.out.println("\n#-----------Box "+totalBoxes+" Report -------------");
							System.out.println("Total Packets 	 : " + totalPackets);
							System.out.println("Total Weight     : " + totalWeight +" kg");
							System.out.println("Maximum Weight	 : " + maximumWeight+" kg");
							System.out.println("Minimum Weight	 : " + minimumWeight+" kg");
							System.out.println("Average Weight	 : " + averageWeight+" kg");
							System.out.println("#-----------------------------------------\n");
							
							totalBoxes++;
							
							totalWeightDay+=totalWeight;
							maximumWeightDay=Math.max(maximumWeightDay,totalWeight);
							minimumWeightDay=Math.min(minimumWeightDay,totalWeight);
							averageWeightDay=totalWeightDay/totalPackets;
							totalPacketsDay+=totalPackets;
							
							continue L1;
							 
							 
				}else if(packetWeight==-1){
						break L1;
				}
			}
		}
			// Ending the Day 
			
			double manufacturingCost=totalWeightDay*manufacturingPrice;
			double totalIncome=totalWeightDay*sellingPrice;
			double netProfit= totalIncome-manufacturingCost;
			
			averageWeightDay=totalWeightDay/totalPacketsDay;
			
			
			System.out.println("\n#================== DAY END SUMMARY =====================\n");
			System.out.println("Total Boxes Packed 	: "+(totalBoxes-1));
			System.out.println("Total Packets Packed	: "+totalPacketsDay);
			System.out.println("Total Weight (Day)	: "+totalWeightDay+" kg");
			System.out.println("Maximum Weight (Day)	: "+maximumWeightDay+" kg");
			System.out.println("Minimum Weight (Day)    : "+minimumWeightDay+" kg");
			System.out.println("Average Weight (Day)	: "+averageWeightDay+" kg");
			System.out.println("Manufacturing Cost 	: Rs."+manufacturingCost);
			System.out.println("Total Income (Sales)	: Rs."+totalIncome);
			System.out.println("Net Profit		: Rs."+netProfit);
			System.out.println("\n#=========================================================");		
			
			System.out.println("\nThank You . Program Ended.");
	}
}

