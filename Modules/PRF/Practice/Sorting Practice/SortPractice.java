import java.util.*;
class SortPractice{
	
public static String [] name = {"Chamod bhasuru","Abishek Jyathilaka","Binura fernando","Aniththara Sewwandi","Charitha Athalage"};

public static void main(String args[]){
	
	
	//Arrays.sort(name);
	//System.out.println(Arrays.toString(name));
	
	sortArray();
	for (int i = 0; i < name.length; i++){
		System.out.println(name[i]);	
	}
	
	
}

public static void sortArray(){
		for (int i = 0; i < name.length-1 ; i++){
			for (int j = 0; j < name.length-1-i; j++){
				int length=name[j].length();
				if (name[j+1].length()<name[j].length()){
					length=name[j+1].length();
				}
				for (int k = 0; k < length; k++){
					if(name[j].charAt(k)>name[j+1].charAt(k)){
						String temp=name[j];
						name[j]=name[j+1];
						name[j+1]=temp;
						break;
					}else if(name[j].charAt(k)<name[j+1].charAt(k)){
						break;
					}else if(k==length-1){
						if(name[j+1].length() < name[j].length()){
							String temp=name[j];
							name[j]=name[j+1];
							name[j+1]=temp;
							break;
						}
					}
				}
				
			}
			
		}
	
	}
}
	
	

	
	

