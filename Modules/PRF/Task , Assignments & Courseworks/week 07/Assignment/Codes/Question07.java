import java.util.*;
class Question07{
	public static void main(String args[]){
		
// I.
		char[] blockLetters={'A','B','C','D','E','F','G','H','I','J','K','L',
							'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
// II.
		System.out.println(Arrays.toString(blockLetters));
		
// III.
		System.out.print("[");
		for(int i=1;i<blockLetters.length;i++){
			if(i%2==0){
				System.out.print(blockLetters[i]+" ,");
			}
		}
		System.out.println("\b]");
		
// IV.
		System.out.print("[");
		for(int i=1;i<blockLetters.length;i++){
			if(i%2!=0){
				System.out.print(blockLetters[i]+" ,");
			}
		}
		System.out.println("\b]");
		
//V.
		System.out.print("[");
		for(int i=blockLetters.length-1;i>=0;i--){
				System.out.print(blockLetters[i]+" ,");
		}
		System.out.println("\b]");
	}
}
