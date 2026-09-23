import java.util.*;
class Example1{
	public static int[] ar={60,20,10,40,90,80,100,50,30};
	
	public static void sortArray(){
		int max=ar[0];
		int index=0;
		for(int j=0; j<ar.length; j++){
			if(ar[j]>max){
				max=ar[j];
				index=j;
			}
		}
		ar[index]=ar[ar.length-1];
		ar[ar.length-1]=max;
		
		 max=ar[0];
		 index=0;
		for(int j=0; j<ar.length-1; j++){
			if(ar[j]>max){
				max=ar[j];
				index=j;
			}
		}
		ar[index]=ar[ar.length-2];
		ar[ar.length-2]=max;
	}
		
	public static void main(String args[]){	
		System.out.println(Arrays.toString(ar));//[60,20,10,40,90,80,100,50,30,70]
		sortArray();
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60,70,80,90,100]
	}
}
