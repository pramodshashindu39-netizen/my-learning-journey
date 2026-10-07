import java.io.*;
class Demo{
	public static void main(String[] args) {
		try{
			FileWriter fw=new FileWriter("Test.txt",true);
			fw.write("Hello java"+"\n");
			//fw.flush(); 
			fw.close();
		}catch(IOException ex){
			
		}
	}
}
