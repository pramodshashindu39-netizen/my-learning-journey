import java.util.*;
class RandomNum{
	public static void main(String args[]){
		Random input=new Random();
		
		for(int i=0; i<100; i++){
			int num=input.nextInt(100)+1; //1 to 100
			System.out.println(num);
		}
	}
}
