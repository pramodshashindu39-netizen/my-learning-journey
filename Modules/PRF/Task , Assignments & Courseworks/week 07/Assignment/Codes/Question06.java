import java.util.*;
class Question06{
	public static void main(String args[]){
		String[] days={ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", " Friday", "Saturday" };
		
		// I.
		System.out.println(Arrays.toString(days));
		
		// II----part 1
		System.out.print("[");
		for(int i=days.length-1;i>=0;i--){
			System.out.print(days[i] + " ,");
		};
		System.out.println("\b]");
		
	}
}
