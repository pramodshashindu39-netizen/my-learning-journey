import java.util.*;
class Question15{
	public static void main(String args[]){
		Random random=new Random();
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter the number of elements you need : ");
		int sizeOfArray=input.nextInt();
		
		int[] numbers=new int[sizeOfArray];
		
		for(int i=0;i<numbers.length;i++){
			numbers[i]=random.nextInt(100)+1;
		}
//I.
		System.out.println("\n"+Arrays.toString(numbers));
//II.
		int oddNumbersCount = 0;
		for(int i=0;i<sizeOfArray;i++){
			if(numbers[i]%2!=0){
				oddNumbersCount++;
			}
		}
//III.
		boolean presentNumber100=true;
		for(int i=0;i<sizeOfArray;i++){
			if(numbers[i]==100){
				presentNumber100=true;
			}else{
				presentNumber100=false;
			}
		}
		System.out.println("\n"+presentNumber100);
//IV.
		int minNumber=numbers[0],maxNumber=numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(minNumber>numbers[i]){
				minNumber=numbers[i];
			}
			if(maxNumber<numbers[i]){
				maxNumber=numbers[i];
			}
		}
		System.out.println("\nThe maximum value : "+maxNumber+"\nThe minimum value : "+minNumber);
	}
}
