import java.util.*;
class PracticeQ9{
	
	public static void mergeTwoArrays(int[]a, int[]b){
		
		int [] z=new int[a.length + b.length];
		
		z[0]=a[0];
		z[1]=a[1];
		z[2]=a[2];
		z[3]=b[0];
		z[4]=b[1];
		z[5]=b[2];
		
		System.out.println(Arrays.toString(z));
		
	}
	
	public static void main(String args[]){
		int[] a={10,20,30};
		int[] b={40,50,60};
		
		mergeTwoArrays(a,b);
	}
}
