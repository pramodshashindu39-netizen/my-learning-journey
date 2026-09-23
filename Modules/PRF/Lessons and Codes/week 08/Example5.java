import java.util.*;
class Example5{
	public static int[] addLast(int[] ar, int num ){
		int [] br = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++){
			br[i]= ar[i];
		}
		br[br.length-1] = num; 
		return br;
	}
	
	public static void main(String args[]){	
		int[] ar={10,20,30,40,50};
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50]
		ar=addLast(ar,60);
		//ar = br;
		System.out.println(Arrays.toString(ar));//[10,20,30,40,50,60]
	}
}
