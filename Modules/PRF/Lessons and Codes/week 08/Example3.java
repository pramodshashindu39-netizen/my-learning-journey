import java.util.*;
class Example3{
	public static void main(String args[]){	
		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		//Insert code here to add 60 as the first element
		int[] tempAr=new int[ar.length+1];
		for (int i = 1; i < tempAr.length; i++){
			tempAr[i]=ar[i-1];
		}
		tempAr[0]=60;
		ar=tempAr;
		System.out.println(Arrays.toString(ar));//[60,10,20,30,40,50]
	}
}
