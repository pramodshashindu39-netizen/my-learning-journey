import java.util.*;
class Question14{
	public static void main(String args[]){
		Random random=new Random();
//I.
		int[] marks=new int[20];
		
		for(int i=0;i<20;i++){
			int temp=random.nextInt(101);
			marks[i]=temp;
		}
		
		int minMark=101;
		String stuID="";
		
		for(int i=0;i<20;i++){
			//System.out.println(Arrays.toString(marks));
			System.out.printf("Student ID - STU%04d : "+ marks[i],i+1);
			System.out.println();
			if(minMark>marks[i]){
				minMark=marks[i];
				stuID="Student ID - STU00"+(i+1);
			}
		}
		System.out.println("\n\n\nMinimum Mark ("+ stuID +" ) : " + minMark );
//II.
		int passCount=0;
		for(int i=0;i<20;i++){
			if(marks[i]>=50){
				passCount++;
			}
		}
		if(passCount==1){
			System.out.println("\nThere is "+passCount+" student pass the assigment.");
		}else{
			System.out.println("\nThere are "+passCount+" students pass the assigment.");
		}
//III.
		int countMarksAbove90=0;
		for(int i=0;i<20;i++){
			if(marks[i]>90){
				countMarksAbove90++;
			}
		}
		if(countMarksAbove90==1){
			System.out.println("\nThere is "+countMarksAbove90+" Student get more than 90.");
		}else{
			System.out.println("\nThere are "+countMarksAbove90+" Students get more than 90.");
		}
	}
}
