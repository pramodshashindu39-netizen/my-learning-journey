import java.util.*;
class Question12{
	public static void main(String args[]){
		Scanner input=new Scanner (System.in);
		double [] marks=new double[9];
	
		double tot=0.0,avg=0.0,min=Double.MAX_VALUE,max=0.0;
		int count1=0,count2=0,count3=0;
		boolean isGets100=false;
		for(int i=0;i<marks.length;i++){
			System.out.print("Input Marks of Subject "+(i+1)+" : ");
			marks[i] = input.nextDouble();

//III.
			min=Math.min(min,marks[i]);
//IV.
			max=Math.max(max,marks[i]);
//I.
			tot+=marks[i];
//V.
			if(marks[i]>75){
				count1++;
//VI.
			}
			if(marks[i]<45){
				count2++;
//VII.
			}
			if(marks[i]==100){
				isGets100=true;
				count3++;
			}
		}
//II.
		avg=(tot/marks.length);
		System.out.println("\nTotal marks : "+tot);
		System.out.printf("\nAverage marks : %.2f",avg);
		System.out.printf("\nMinimum marks : %.2f",min);
		System.out.printf("\nMaximum marks : %.2f",max);
		System.out.printf("\nNumber of marks greater than 75 : %d",count1);
		System.out.printf("\nNumber of marks less than 45 : %d",count2);
		System.out.print("\nIs the student gets 100 marks in any subject : "+isGets100+" ( Count : "+count3+" )");
	}
}
