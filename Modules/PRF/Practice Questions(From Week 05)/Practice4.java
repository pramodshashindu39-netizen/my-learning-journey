import java.util.*;
class Practice4{
	public static void main(String args[]){
		Random random = new Random();
		
		int num = random.nextInt();
		System.out.print("Random Number  : " + num);
		
		
		System.out.println();
		
		if(num<0){
			num*=(-1);
		}
		
		System.out.print("Absulote Value : " + num);
	}
}

/*   import java.util.*;
	 class Practice4{
	 public static void main(String args[]){
		Random random = new Random();
		
		int num = random.nextInt();
		System.out.print("Random Number  : " + num);
		
		int abs = Math.abs(num);
		System.out.print("\nAbsulote Value : " + abs);
   }	
 }	
		
		
 */
