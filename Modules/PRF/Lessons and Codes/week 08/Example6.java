import java.util.*;
class Example6{

	public static int[] ar = new int[0];
	
	public static void addLast(int data){
		int[] tempAr = new int[ar.length+1];
		for (int i = 0; i < ar.length; i++){
			tempAr[i]= ar[i];
		}
		tempAr[tempAr.length-1]=data;
		ar=tempAr;
		
	}
	
	public static void main (String args[]){
	Scanner input = new Scanner(System.in);
	
	int num = 0;
	
	while(num!=-1){
		
		System.out.print("Input a integer (press -1 to terminate) : ");
		num=input.nextInt();
		if(num!=-1){
			addLast(num);
		}
		isDuplicate(num);
	}
	
	System.out.println(Arrays.toString(ar));
	
	}
}
