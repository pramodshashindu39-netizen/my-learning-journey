import java.util.*;
class Question10{
	public static void main(String args[]){
//I.
		int[] array={6 ,3 ,3 ,2 ,4 ,1 ,6 ,6 ,2 ,4};
//II.
		int count1=0,count2=0,count3=0;
//IV.
		boolean isRolled5=false;
		
		for(int i=0;i<array.length;i++){
			if(array[i]==3){
				count1++;
			}else if(array[i]==6){
				count2++;
//III.
			}else if(array[i]%2!=0){
				count3++;
//IV.
			}else if(array[i]==5){
				isRolled5 = true;
				}
				
		}
		System.out.println("The number of times 3 : "+count1);
		System.out.println("The number of times 6 : "+count2);
		System.out.println("The number of times odd numbers : "+count3);
		System.out.println("Number 5 are Rolled  : "+isRolled5);
	}
}
