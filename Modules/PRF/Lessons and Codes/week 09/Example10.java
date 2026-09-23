import java.util.*;
class Example10{
	public static void sortArray(String[] strArray){
		for(int i=strArray.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(strArray[j].compareTo(strArray[j+1])>0){
					String s1=strArray[j];
					strArray[j]=strArray[j+1];
					strArray[j+1]=s1;
				}
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
