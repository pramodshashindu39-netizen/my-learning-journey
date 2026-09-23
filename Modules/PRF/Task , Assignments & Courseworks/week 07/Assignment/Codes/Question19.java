import java.util.*;
class Question19{
	public static void main (String args[]){
		Random random=new Random();
		
		int[] randomArr=new int[50];
		for(int i=0;i<randomArr.length;i++){
			randomArr[i]=random.nextInt();
			System.out.println(randomArr[i]);
		}

//I.	

		int[] newRandomArr=new int[50];
		for(int i=0,j=49;i<j;i++,j--){
			int temp=randomArr[i];
			newRandomArr[i]=randomArr[j];
			newRandomArr[j]=temp;
		}
		System.out.println();
		for(int i=0;i<50;i++){
			System.out.println(newRandomArr[i]);
		}

//II.
		int negetiveNumbersCount=0;
		for(int i=0;i<randomArr.length;i++){
			if(newRandomArr[i]<0){
				negetiveNumbersCount++;
			}
		}
		System.out.println("\nCount of Negetive Numbers : "+negetiveNumbersCount);
		System.out.println("\nThe probability of getting negative numbers : "+negetiveNumbersCount*2+" %");
	}
}
