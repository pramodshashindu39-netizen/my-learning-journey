import java.util.*;
class Array12{
	public static boolean isDuplicate(int [] ar){
		for(int i=0;i<ar.length-1; i++){
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]==ar[j]){
					return true;
				}
				}
		}
			return false;
	}
		
		
	public static void main(String args[]){
 		int[] ar={10,20,30,40,50,60};
 		int[] br={60,30,10,40,20,50};
 		int[] cr={60,30,50,40,20,50};
		System.out.println("ar : "+isDuplicate(ar)); //false
		System.out.println("ar : "+isDuplicate(br)); //false
		System.out.println("ar : "+isDuplicate(cr)); //true
	}
}
