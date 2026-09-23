import java.util.*;
class Array02{
	
	public static void reversePrintArray(int[] ar){
		System.out.print("[");
		for(int i=ar.length-1;i>=0;i--){
		System.out.print(ar[i]+",");
		}
		System.out.println("\b\b]");
		
	}
	public static void main(String args[]){
		int[] ar={60,30,50,70,23,75,72,84,83,46};
		reversePrintArray(ar);//[46,83,84,72,75,23,70,50,30,60]
	}
}













