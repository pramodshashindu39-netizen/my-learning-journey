import java.util.*;
class Arrays05{
	public static void main(String args[]){
		int[] ar={10,20,30,40,50};
		int[] br=new int[ar.length];
		System.out.println("ar : "+Arrays.toString(ar)); //[10,20,30,40,50]
		System.out.println("br : "+Arrays.toString(br)); //[0, 0, 0, 0, 0 ]
		System.out.println(ar==br); //false
		//Insert code here to copy values from ar to br
		//
		//
		for(int i=0;i<ar.length;i++ ){
		br[i]=ar[i];
		}
		
		
		System.out.println("ar : "+Arrays.toString(ar)); //[10,20,30,40,50]
		System.out.println("br : "+Arrays.toString(br)); //[10,20,30,40,50]
		System.out.println(ar==br); //false
	}
}
