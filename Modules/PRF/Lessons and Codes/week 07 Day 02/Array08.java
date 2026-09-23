import java.util.*;
class Array08{
	
	public static int copyValuesFromTo(int[] ar,int[] zr){
		
		

	}
	public static void main(String args[]){
		int[] ar={10,20,30,40,50};
		int[] br=new int[ar.length];
		int[] cr=new int[ar.length+3];
		int[] dr=new int[ar.length-3];
		System.out.println("ar : "+Arrays.toString(ar)); //[10,20,30,40,50,60]
		System.out.println("br : "+Arrays.toString(br)); //[0, 0, 0, 0, 0, 0]
		System.out.println("cr : "+Arrays.toString(cr)); //[0, 0, 0, 0, 0, 0, 0, 0, 0]
		System.out.println("dr : "+Arrays.toString(dr)); //[0, 0, 0]
		
		copyValuesFromTo(ar,br);
		copyValuesFromTo(ar,cr);
		copyValuesFromTo(ar,dr);
		System.out.println("ar : "+Arrays.toString(ar)); //[10,20,30,40,50,60]
		System.out.println("br : "+Arrays.toString(br)); //[10,20,30,40,50,60]
		System.out.println("cr : "+Arrays.toString(cr)); //[10,20,30,40,50,60, 0, 0, 0]
		System.out.println("dr : "+Arrays.toString(dr)); //[10,20,30]
	}
}
