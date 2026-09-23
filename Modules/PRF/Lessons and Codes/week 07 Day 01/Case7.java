import java.util.*;
class Case7{
	public static void main(String args[]){
		int[] ar=new int[3];
		ar[0]=100;
		ar[1]=200;
		ar[2]=300;
		ar[3]=400; //throws ArrayIndexOutOf
		
		System.out.println(ar[0]+" "+ar[1]+" "+" "+ar[2]+" "+ar[3]);
	}
}
