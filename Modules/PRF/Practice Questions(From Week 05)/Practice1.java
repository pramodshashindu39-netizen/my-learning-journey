/*import java.util.*;
class Practice1{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		System.out.print("Input Number : ");
		long num = input.nextLong();
		
		if(num < 0){
				num*=(-1);
		}
		
		int count=0;
	 L1:while(true){
				num/=10;
				count = count + 1;
			if(num==0){
				
				break L1;
			}
		}	
		System.out.print(count);
	}
}
*/

import java.util.*;
class Practice1{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);

		System.out.print("Input Number : ");
		String num = input.next();
		
		int digit = num.length();
		System.out.print(digit);
		
	}
}
