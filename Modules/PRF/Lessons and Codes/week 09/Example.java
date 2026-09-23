import java.util.*;
class Example{
	public static void main(String args[]){
 		int[] ar={40,10,20,70,80,40,50,30,20};
 		System.out.println(Arrays.toString(ar)); //[40,10,20,70,80,40,50,30,20]
 		int[] br=new int[0];
 		int[] cr=new int[0];
 		for (int i = 0; i < ar.length; i++){
			 for (int j = 1; j < ar.length -1; j++){
				 if(ar[i]==ar[j]){
					int[] tempbr=new int[br.length+1];
					tempbr[i]=ar[i];
					br=tempbr;
					
				 }else{
					int[] tempbr=new int[br.length+1]; 
					tempbr[i]=ar[i];
					cr=tempbr;
				 }
			 }
			 
		 }
		 int[] temp=new int[cr.length+br.length];
		 
		for(int i=0; i<br.length; i++){
			temp[i]=br[i];
		}
		for(int i=0; i<cr.length; i++){
			temp[ar.length+i]=cr[i];
		}

		ar=temp;

		 
		 
 		
 		 
 		System.out.println(Arrays.toString(ar)); //[40,10,20,70,80,50,30]
	}
}
