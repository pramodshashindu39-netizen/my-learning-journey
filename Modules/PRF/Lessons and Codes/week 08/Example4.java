import java.util.*;
class Example4{
	public static void main(String args[]){
	
		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		//Insert code here to remove first
		int  br[]=new int[ar.length-1];
		for (int i = br.length-1; i >=0; i--){
			br[i]=ar[i+1];
		}
		ar=br;
		System.out.println(Arrays.toString(ar));//[20,30,40,50]
	}
}


