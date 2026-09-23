import java.util.*;
class Example2{
	public static void main(String args[]){	
		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		//Insert code here to remove 50
		int [] br=new int[ar.length -1];
		for (int i = 0; i < br.length; i++){
			br[i]=ar[i];
		}
		ar=br;
		System.out.println(Arrays.toString(ar));//[10,20,30,40]
	}
}
