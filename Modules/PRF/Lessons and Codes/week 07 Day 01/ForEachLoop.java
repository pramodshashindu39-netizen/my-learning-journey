import java.util.*;
class ForEachLoop{
	public static void main(String args[]){
		int[] ar={76,56,45,89,90,65,34,12,53};
		int total=0;
		for(int a : ar){
			System.out.print(a+" ");
			total+=a;
		}
		System.out.println("\n\nTotal : "+total);
	}
}
