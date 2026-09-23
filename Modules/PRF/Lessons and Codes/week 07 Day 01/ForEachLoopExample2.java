
import java.util.*;
class ForEachLoopExample2{
	public static void main(String args[]){
		int[] ar={100,200,300};
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
		
		for(int a : ar){
			a++;
		}
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
		
		for(int i=0; i<3; i++){
			ar[i]++;
		}
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
	}
}
