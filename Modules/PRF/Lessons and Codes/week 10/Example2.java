import java.util.*;
class Example2{
	public static int[] ar={60,20,10,40,90,80,100,50,30};
	
	public static void sortArray(){
		for(int i=ar.length; i>0; i--){
			int max=ar[0];
			int index=0;
			for(int j=0; j<i; j++){
				if(ar[j]>max){
					max=ar[j];
					index=j;
				}
			}
			ar[index]=ar[i-1];
			ar[i-1]=max;
		}
	}
	public static void main(String args[]){	
		System.out.println(Arrays.toString(ar));//[60,20,10,40,90,80,100,50,30,70]
		sortArray();
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60,70,80,90,100]
	}
}
