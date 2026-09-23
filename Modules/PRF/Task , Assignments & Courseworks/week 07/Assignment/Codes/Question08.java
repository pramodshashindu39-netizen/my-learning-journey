import java.util.*;
class Question08{
	public static void main(String args[]){
		
//I.
	int[] rainfall={2346, 1945, 2060, 1781, 2365, 1005, 1162, 1016, 1512, 2231, 1903, 12061, 1005, 1545, 
					2156, 2037, 1583, 3668 };
					
//II.
	System.out.println("Number of District :"+rainfall.length);
	
//III. 
	int count1=0,count2=0,tot=0;
	for(int i=0;i<rainfall.length;i++){
//V.
		tot+=rainfall[i];
		
		if(rainfall[i]>2000){
			count1++;
//IV.
		}else if(rainfall[i]<1000){
			count2++;
		}
	}
	System.out.println("\nThe number of districts with more than 2000mm of annual rainfull : "+count1);
	System.out.println("\nThe number of districts with less than 1000mm of annual rainfall : "+count2);
	System.out.println("\nThe average annual rainfall value : "+(tot/rainfall.length));
	}
}
