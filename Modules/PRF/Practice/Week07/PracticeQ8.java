import java.util.*;
class PracticeQ8{
	
	public static void indexOf(int a,int[] b){
		int index=0;
		for(int i=0;i<b.length;i++){
			if(b[i]==a){
			System.out.println(i);
			return;
			}
		}
		System.out.println(-1);
}
	public static void main(String args[]){
		
		int[] a={10,20,30,40,50,60,70};
		indexOf(60,a);//2
		}
	
}
		/*int count=0;
		for(int g:b){
			System.out.println(g);
			if(){}
		}
	}*/
