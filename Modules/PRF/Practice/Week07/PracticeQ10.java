import java.util.*; 
class PracticeQ10{ 
	public static void reverseAnArray(int[] ar){
		for(int i=ar.length-1,j=0;i>j;i--,j++){
			int temp=ar[j];
			ar[j]=ar[i];
			ar[i]=temp;
			
		}
		
	}
	public static void main(String args[]){
		int[] ar={10,20,30,40,50,60,70,80,90}; 
		System.out.println(Arrays.toString(ar));
		
		reverseAnArray(ar); 
		System.out.println(Arrays.toString(ar));
	}
}
