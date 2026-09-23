import java.util.*;
class PracticeQ4{
	/*public static void reversePrintArray(int [] reverseArray){
		System.out.print("[");
		for(int i=reverseArray.length-1;i>=0;i--){
			System.out.print(reverseArray[i]+", ");
		}
		System.out.print("\b\b]");
	}
*/
	public static void main(String args[]){
		int[] a={10,20,30,40,50};
		
		reversePrintArray(a);
	}


	public static void reversePrintArray(int [] reverseArray){
		for(int i=reverseArray.length-1,j=0; i>j; i--,j++ ){
			int temp=reverseArray[j];
			reverseArray[j]=reverseArray[i];
			reverseArray[i]=temp;
			
		}
		System.out.print(Arrays.toString(reverseArray));
	}
}
