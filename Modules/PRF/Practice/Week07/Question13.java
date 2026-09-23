import java.util.*;
class Question13{
	
	public static void isEquals(int[]a,int[]z){
		int count=0;
		boolean isEquals=false;
		if(a.length==z.length){
			for(int i=0;i<a.length;i++){
				if(a[i]==z[i]){
					count++;
				}
			}
		if(count==a.length){
			isEquals= true;
		}
		}
	System.out.println(isEquals);
	}
	public static void main(String args[]){
		int[] a={10,20,30,40}; 
		int[] b={10,20,30,40}; 
		int[] c={10,20,30,50}; 
		
		isEquals(a,b);
		isEquals(a,c);
	}
}
