import java.util.*;
class PracticeQ7{
	public static void printArray(int [] a){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

	public static void main(String args[]){
		int[] a={10,20,30,40,50,60,70};
		int[] b=new int[a.length];
		
		printArray(a);
		printArray(b);
		
		for(int i=0;i<a.length;i++){
			b[i]=a[i];
		}
		
		printArray(a);
		printArray(b);

	}
}
