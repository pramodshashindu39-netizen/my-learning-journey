import java.util.*;
class Question15{
	public static int[] reverseAnArray(int[] ar){
		int[]temp =new int[ar.length];
		for (int i = ar.length-1,j=0; i>=j ; i--,j++)
		{
			temp[j] = ar[i];
			temp[i] = ar[j];
			
	}
	return temp;
}
	public static void main(String args[]){ 
		int[] ar={10,20,30,40,50,60,70,80,90};  
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60,70,80,90] 
		int[] zr=reverseAnArray(ar); 
		System.out.println(Arrays.toString(zr));//[90,80,70,60,50,40,30,20,10] 
		} 
}
