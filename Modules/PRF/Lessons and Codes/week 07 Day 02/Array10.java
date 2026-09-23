import java.util.*;
class Array10{
	
	public static boolean equals(int[] ar,int[] zr){
		if(ar.length!=zr.length){
			return false;
		}
		for(int i=0;i<ar.length;i++){
			if
		}
			
				ar[i]==zr[i];
				
			
		}
		
		}
	public static void main(String args[]){
		int[] ar={10,20,30,40,50,60};
		int[] br={10,50,20,60,40,30};
		int[] cr={10,20,30,40,50,60};
		int[] dr={10,20,30,40,50,60,70};
		
		System.out.println("ar== br : "+equals(ar,br)); //false
		System.out.println("ar== cr : "+equals(ar,cr)); //true
		System.out.println("ar== dr : "+equals(ar,dr)); //false
	}
}
