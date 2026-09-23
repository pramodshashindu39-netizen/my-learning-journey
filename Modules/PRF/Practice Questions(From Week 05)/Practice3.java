import java.util.*;
class Practice3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Print Number(Print only an integer number) : ");
		int num = input.nextInt();
		int digit=0;
		String reverse_num="";
	
		while(num>0){
			digit = num%10;
			reverse_num+=digit;
			
			num/=10;
				
		}
		System.out.print(reverse_num);
	}
}

/* import java.util.*;

class Practice3 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Print Number (Print only an integer number): ");
        String num = input.next();

        boolean valid = true;

        // Check whether every character is a digit
        for (int i = 0; i < num.length(); i++) {

            char ch = num.charAt(i);

            if (ch < '0' || ch > '9') {
                valid = false;
                break;
            }
        }

        if (valid) {

            String reverse = "";

            for (int i = num.length() - 1; i >= 0; i--) {
                reverse += num.charAt(i);
            }

            System.out.println("Reversed Number: " + reverse);

        } else {

            System.out.println("Invalid Input");
        }
    }
} */

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


/*   import java.util.*;

class Practice3 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Print Number (Print only an integer number): ");
        String num = input.next();

        boolean valid = true;
        int start = 0;

        // Check negative sign
        if (num.charAt(0) == '-') {

            start = 1;

            // Only "-" entered
            if (num.length() == 1) {
                valid = false;
            }
        }

        // Check remaining characters are digits
        for (int i = start; i < num.length(); i++) {

            char ch = num.charAt(i);

            if (ch < '0' || ch > '9') {
                valid = false;
                break;
            }
        }


        if (valid) {

            String reverse = "";

            // If negative number
            if (num.charAt(0) == '-') {

                reverse = "-";

                for (int i = num.length() - 1; i >= 1; i--) {
                    reverse += num.charAt(i);
                }

            } 
            // Positive number
            else {

                for (int i = num.length() - 1; i >= 0; i--) {
                    reverse += num.charAt(i);
                }
            }

            System.out.println("Reversed Number: " + reverse);

        } else {

            System.out.println("Invalid Input");
        }
    }
}   */
