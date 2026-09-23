import java.util.*;
class Example10{
	public static void increment(int a, int b, int c){
		a++;
		b++;
		c++;
	}
	
	public static void increment(int[] ar){
		
		ar[0]++;
		ar[1]++;
		ar[2]++;
		}
		
	public static void main(String args[]){
		int[] ar={100,200,300};
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]); //100 200 300
		
		increment(ar[0],ar[1],ar[2]); //Call by values
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]); //100 200 300
		 
		increment(ar); //Call by reference
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]); //101 201 301
	}
}
