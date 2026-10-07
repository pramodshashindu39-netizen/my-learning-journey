import java.io.*;
import java.util.*;
class Demo{
	public static void main(String[] args) {
		try{
			File f1=new File("Demo.java");
			
			Scanner input=new Scanner(f1);
						
						
			while(input.hasNext()){
				String line=input.nextLine();
				
				System.out.println(line);
			}

			
			
		}catch(IOException ex){
			
		}
	}
}
