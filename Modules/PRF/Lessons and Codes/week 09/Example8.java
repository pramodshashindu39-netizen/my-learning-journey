import java.util.*;
class Example8{
	public static String[] id={"S001","S002","S003","S004","S005","S006","S007"};
	public static int[] marks={50,20,90,100,30,80,45};
	
	public static void main(String args[]){
		for(int i=marks.length-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(marks[j]<marks[j+1]){
					int temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]=temp;
					
					String tempName=id[j];
					id[j]=id[j+1];
					id[j+1]=tempName;
					
				}
				//System.out.println(Arrays.toString(marks));
				
				//try{Thread.sleep(500);}catch(Exception ex){}	
			}
		}
		
		
		
		System.out.println("StID"+"		"+"marks");
		System.out.println("========================\n");
		for (int i = 0; i < marks.length; i++){
			
			System.out.println(marks[i] +"		"+id[i]);
		}
	}
}
/*
StID	marks
=============
S004	100
S003	90
S006	80
S001	50
S007	45
S005	30
S002	20
*/
