import java.util.*;
class Array03{
	public static void printArrayFromTo(int start){
		System.out.print("[");
		for(int i=3;i>=ar.lenght-4; i++){
			System.out.print(ar[i]+", ");
		}
		System.out.println("\b\b]");

		}
	public static void main(String args[]){
		int[] ar={60,30,50,70,23,75,72,84,83,46};
		printArrayFromTo(3,6,ar);//[72,75,23,70]
	}
}
