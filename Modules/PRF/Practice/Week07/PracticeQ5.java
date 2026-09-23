import java.util.*;
class PracticeQ5{
	public static void printArrayFromTo(int a,int b,int[] c){
		for(int i=a;i<=b;i++){
			System.out.println(c[i]);
		}
	}
	public static void main(String args[]){
		int[] a={10,20,30,40,50,60,70};
		
		printArrayFromTo(2,5,a);
	}
}
