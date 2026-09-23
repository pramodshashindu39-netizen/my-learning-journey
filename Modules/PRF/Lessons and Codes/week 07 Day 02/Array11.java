import java.util.*;
class Array11{
	
	public static int[] reverseAnArray(int [] ar){
		for (int i=0,j=ar.length-1;i<j;i++,j--){
			int t=ar[i];
			ar[i]=ar[j];
			ar[j]=t;
		}
		return ar;
		
		
	}
	public static void main(String args[]){
		int[] ar={10,20,30,40,50,60,70,80,90};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60,70,80,90]
		
		reverseAnArray(ar);
		System.out.println(Arrays.toString(ar));//[90,80,70,60,50,40,30,20,10]
	}
}
