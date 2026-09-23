import java.util.*;
class Example7{
	public static void strArray(String[] strArray){
		for(int i=strArray.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(strArray[j]>strArray[j+1]){
					int temp=strArray[j];
					strArray[j]=strArray[j+1];
					strArray[j+1]=temp;
				}
				System.out.println(Arrays.toString(strArray));
				try{Thread.sleep(500);}catch(Exception ex){}
			}
		}
	}
	
	public static void main(String args[]){
		String[] strArray={"F","D","S","A","C","B","E"};
 		System.out.println(Arrays.toString(strArray)); //[F,D,S,A,C,B,E]
 		sortArray(strArray);
 		System.out.println(Arrays.toString(strArray)); //[A,B,C,D,E,F,S]
	}
}
