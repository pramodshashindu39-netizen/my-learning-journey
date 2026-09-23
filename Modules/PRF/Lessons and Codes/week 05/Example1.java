import java.util.*;

class Example1 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Roman Number : ");
        String roman = input.next();

        int total = 0;

        for (int i = 0; i < roman.length(); i++) {

            int current = 0;
            int next = 0;

            switch (roman.charAt(i)) {

                case 'I':
                    current = 1;
                    break;

                case 'V':
                    current = 5;
                    break;

                case 'X':
                    current = 10;
                    break;

                case 'L':
                    current = 50;
                    break;

                case 'C':
                    current = 100;
                    break;

                case 'D':
                    current = 500;
                    break;

                case 'M':
                    current = 1000;
                    break;
            }

            if (i < roman.length() - 1) {

                switch (roman.charAt(i + 1)) {

                    case 'I':
                        next = 1;
                        break;

                    case 'V':
                        next = 5;
                        break;

                    case 'X':
                        next = 10;
                        break;

                    case 'L':
                        next = 50;
                        break;

                    case 'C':
                        next = 100;
                        break;

                    case 'D':
                        next = 500;
                        break;

                    case 'M':
                        next = 1000;
                        break;
                }

                if (current < next)
                    total = total - current;
                else
                    total = total + current;

            } else {

                total = total + current;

            }

        }

        System.out.println("Decimal = " + total);

    }

}
