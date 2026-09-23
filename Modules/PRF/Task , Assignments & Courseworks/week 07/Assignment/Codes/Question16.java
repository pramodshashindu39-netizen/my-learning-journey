//I.
	/*output
        
        7
	    Element at index 0 is 10
	    Element at index 1 is 20
	    Element at index 2 is 30
	    Element at index 3 is 40
	    Element at index 4 is 50
	    Element at index 5 is 60
	    Element at index 6 is 70
	    Runtime error--reason is there are no  index number 7 in this array.
	                   But in For loop
    */

//II. Correct code 

import java.util.*;
class Question16{
	public static void main(String args[]){
		int[] num={10,20,30,40,50,60,70};
		System.out.println("Length : "+num.length);
		for(int i=0 ;i<num.length;i++){
			System.out.println("Element at index " +i+" is "+num[i]);
		}
	}
}
