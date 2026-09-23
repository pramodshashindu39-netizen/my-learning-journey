import java.util.*;
class Question14{
	public static void reverseAnArray(int[]a){
		for(int i=0,j=a.length-1;i<j;i++,j--){
			int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String args[]){
		int[] a={10,20,30,40,50};
		reverseAnArray(a);
	
		}
	}
}
