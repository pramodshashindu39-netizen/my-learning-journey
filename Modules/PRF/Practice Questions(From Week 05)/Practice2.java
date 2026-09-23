import java.util.*;
class Practice2{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Print Number(Print only an integer number) : ");
		int num = input.nextInt();
		
		if(num<0){
			num*=(-1);
		}
		
		int count=0,digit=0;
		
		while(num>0){
			digit=num%10;
			num=num/10;
			count+=digit;	
		}
		System.out.println(count);
	}
}
