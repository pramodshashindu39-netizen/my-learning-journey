import java.util.*;
class Example11{
	public static void main(String args[]){
		Random input=new Random();

		for(int i=0; i<100; i++){
			int num=input.nextInt(100); //0 to 99
			System.out.println(num);
		}
	}
}
