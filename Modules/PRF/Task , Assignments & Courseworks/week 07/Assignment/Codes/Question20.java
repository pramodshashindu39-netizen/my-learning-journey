import java.util.*;
class Question20{
	public static void main (String args[]){
		char[] vowels1 ={ 'A' , 'E' , 'I' , 'O' , 'U' }; 
		char[] vowels2 ={ 'a' , 'e' , 'i' , 'o' , 'u' };
		
		for(int i=0;i<vowels1.length;i++){
			System.out.print(vowels1[i]+" ");
		}
		System.out.print(" ");
		
		for(int i=0;i<vowels2.length;i++){
			System.out.print(vowels2[i]+" ");
		}
		
		char[] newVowels=new char[vowels1.length+vowels2.length];
		for(int i=0,j=0;i<newVowels.length && j<vowels1.length;i++,j++){
			if(i%2==0){
				newVowels[i]=vowels1[j];
			}else{
				newVowels[i]=vowels2[j];
			}
		}
		System.out.print(Arrays.toString(newVowels));
	}
}
