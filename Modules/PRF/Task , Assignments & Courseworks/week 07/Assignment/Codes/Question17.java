//I.
    /*OUTPUT
      [10,20,30,40,50,60,70]
      [10,20,30,40,50,60,70]
      num==arr??? true
      [I@83498   (object address) 
   */



import java.util.*;
class Question17{
public static void main(String args[]){
	int[] arr={10,20,30,40,50,60,70}; 
	int[] num=arr; 
	System.out.println(Arrays.toString(num)); //Line 1 
	System.out.println(Arrays.toString(arr));   //Line 2 
	System.out.println("num == arr ??? "+ (num==arr));  //Line 3   
	System.out.println(arr); //Line 4
	
	
	
	}
}
