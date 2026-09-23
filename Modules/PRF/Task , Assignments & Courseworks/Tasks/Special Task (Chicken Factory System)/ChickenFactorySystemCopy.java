import java.util.*;

class ChickenFactorySystem {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Home Page
        System.out.println("#+-------------------------------------------------------+");
        System.out.println(" |        Boiled Chicken Packet Factory System           |");
        System.out.println("#+-------------------------------------------------------+\n");

        System.out.print("Enter Today's Manufacturing Price (Rs. per kg) : ");
        double manufacturingPrice = input.nextDouble();

        System.out.print("Enter Today's Selling Price (Rs. per kg) : ");
        double sellingPrice = input.nextDouble();

        int totalBoxes = 0;
        int currentBox = 1;

        int totalPacketsDay = 0;
        double totalWeightDay = 0;

        double maximumWeightDay = 0;
        double minimumWeightDay = Double.MAX_VALUE;

        L1:
        while (true) {

            System.out.println("\nStarting Box " + currentBox + "...");

            System.out.println("#+-------------------------------------------------------+");
            System.out.println(" |                      Box " + currentBox + "                          |");
            System.out.println("#+-------------------------------------------------------+\n");

            int totalPackets = 0;
            double totalWeight = 0;
            double maximumWeight = 0;
            double minimumWeight = Double.MAX_VALUE;

            L2:
            while (true) {

                System.out.print("Enter packet weight (kg) [0 = box full, -1 = end day] : ");
                double packetWeight = input.nextDouble();

                if (packetWeight == -1) {
                    break L1;
                }

                if (packetWeight == 0) {

                    double averageWeight = 0;

                    if (totalPackets > 0) {
                        averageWeight = totalWeight / totalPackets;
                    }

                    System.out.println("\n#----------- Box " + currentBox + " Report -----------");
                    System.out.println("Total Packets   : " + totalPackets);
                    System.out.printf("Total Weight    : %.2f kg%n", totalWeight);

                    if (totalPackets > 0) {
                        System.out.printf("Maximum Weight  : %.2f kg%n", maximumWeight);
                        System.out.printf("Minimum Weight  : %.2f kg%n", minimumWeight);
                    } else {
                        System.out.println("Maximum Weight  : 0.00 kg");
                        System.out.println("Minimum Weight  : 0.00 kg");
                    }

                    System.out.printf("Average Weight  : %.2f kg%n", averageWeight);
                    System.out.println("#-----------------------------------------");

                    // Day Summary Update
                    totalBoxes++;
                    totalPacketsDay += totalPackets;
                    totalWeightDay += totalWeight;

                    if (totalPackets > 0) {
                        maximumWeightDay = Math.max(maximumWeightDay, maximumWeight);
                        minimumWeightDay = Math.min(minimumWeightDay, minimumWeight);
                    }

                    currentBox++;

                    continue L1;
                }

                if (packetWeight < -1 || packetWeight > 10) {
                    System.out.println("Invalid Input...");
                    continue;
                }

                totalPackets++;
                totalWeight += packetWeight;

                if (packetWeight > maximumWeight) {
                    maximumWeight = packetWeight;
                }

                if (packetWeight < minimumWeight) {
                    minimumWeight = packetWeight;
                }
            }
        }

        double averageWeightDay = 0;

        if (totalPacketsDay > 0) {
            averageWeightDay = totalWeightDay / totalPacketsDay;
        }

        if (minimumWeightDay == Double.MAX_VALUE) {
            minimumWeightDay = 0;
        }

        double manufacturingCost = totalWeightDay * manufacturingPrice;
        double totalIncome = totalWeightDay * sellingPrice;
        double netProfit = totalIncome - manufacturingCost;

        System.out.println("\n#================ DAY END SUMMARY =================");

        System.out.println("Total Boxes Packed      : " + totalBoxes);
        System.out.println("Total Packets Packed    : " + totalPacketsDay);
        System.out.printf("Total Weight (Day)      : %.2f kg%n", totalWeightDay);
        System.out.printf("Maximum Packet Weight   : %.2f kg%n", maximumWeightDay);
        System.out.printf("Minimum Packet Weight   : %.2f kg%n", minimumWeightDay);
        System.out.printf("Average Packet Weight   : %.2f kg%n", averageWeightDay);
        System.out.printf("Manufacturing Cost      : Rs. %.2f%n", manufacturingCost);
        System.out.printf("Total Income (Sales)    : Rs. %.2f%n", totalIncome);
        System.out.printf("Net Profit              : Rs. %.2f%n", netProfit);

        System.out.println("#==================================================");

        System.out.println("\nThank You. Program Ended.");

        input.close();
    }
}
