import java.util.*;

class SpecialTask2{

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int T = input.nextInt();
        String output = "";

        for (int i = 1; i <= T; i++) {

            int acceptedCount = 0;
            int totalWeight = 0;
            int largestWeight = 0;
            int rejectedCount = 0;

            int weight = input.nextInt();

            while (weight != 0) {						

                if (weight >= 1 && weight <= 20) {

                    acceptedCount++;
                    totalWeight = totalWeight + weight;

                    if (weight > largestWeight) {
                        largestWeight = weight;
                    }

                } else if (weight > 20) {

                    rejectedCount++;

                }

                weight = input.nextInt();
            }

   output += "Case #" + i + ": "
            + acceptedCount + " "
            + totalWeight + " "
            + largestWeight + " "
            + rejectedCount + "\n";
        }
        
        System.out.print(output);
    }
}
