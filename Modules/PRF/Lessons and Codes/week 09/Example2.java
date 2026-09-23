import java.util.*;
class Example2{
	
	public static void duplicateRemoveArray(){}
	
	public static void main(String args[]){
 		int[] ar={40,10,20,70,80,40,50,30,20};
 		System.out.println(Arrays.toString(ar)); //[40,10,20,70,80,40,50,30,20]
 		
 		duplicateRemoveArray();
 		
 		int[] dupRemovedAr=new int[0];
 		L1:for (int i = 0; i < ar.length; i++) {
			L2:for(int j=0; j<dupRemovedAr.length; j++){
				if(ar[i]==dupRemovedAr[j]){
					continue L1;
				}
			}
			//extends array
			int[] tempAr=new int[dupRemovedAr.length+1];
			for(int j=0; j<dupRemovedAr.length; j++){
				tempAr[j]=dupRemovedAr[j];
			}
			dupRemovedAr=tempAr;
			dupRemovedAr[dupRemovedAr.length-1]=ar[i];
		}
		ar=dupRemovedAr;
 		System.out.println(Arrays.toString(ar)); //[40,10,20,70,80,50,30]
	}
}
