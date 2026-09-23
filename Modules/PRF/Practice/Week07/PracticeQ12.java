import java.util.*;
class PracticeQ12{
	
	public static boolean isAscending(int[] zr){
		for(int i=0;i<zr.length-1;i++){
			if(zr[i]>=zr[i+1]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		int[] ar={60,20,50,100,90,70,30,40,80,10};
		int[] br={10,20,30,40,50,60,70,80,90,100};
		int[] cr={10,20,30,40,50,50,70,80,90,100};
		System.out.println("ar : "+Arrays.toString(ar));
		System.out.println("br : "+Arrays.toString(br));
		System.out.println("cr : "+Arrays.toString(cr));
		System.out.println();
		priint.out.println();
		System.out.println("ar : "+isAscending(ar)); //false
		System.out.println("br : "+isAscending(br)); //true
		System.out.println("cr : "+isAscending(cr)); //false
		
	}
}
