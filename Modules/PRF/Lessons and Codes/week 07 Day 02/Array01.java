import java.util.*;
class Array01{
	
	public static void printArray(int[] ar){
		Arrays.sort(ar);
		System.out.println(ar[0]);
	}
	public static void main(String args[]){
		int[] ar={60,30,50,70,23,75,72,84,83,46};
		printArray(ar);
	}
}	
	
	
	
	
	
	/*public static void printArray(int[] ar){
		for(int i=0;i<ar.length;i++){
		System.out.println(ar[i]);
		}
	}
}*/
