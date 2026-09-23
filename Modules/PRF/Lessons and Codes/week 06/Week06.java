
import java.util.*;
class Week06{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Input an integer : ");
		int num=input.nextInt();
		int count=0;
		for(int i=2; i<num; i++){
			if(num%i!=0){
				count++; //count=count+1; //count+=1;
			}
		}
		if(count==(num-2)){
			System.out.println(num+" is a prime number...");
		}
	}
}
