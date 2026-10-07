import java.io.*;
class Demo{
	public static void main(String[] args) {
		try{
			File f1=new File("E:/iCET/Modules/OOP/During Class Session/Day 05/IO Files/Test.docx");//absolute path
			FileWriter fw=new FileWriter(f1,true);
			fw.write("Hello java"+"\n");
			fw.flush(); 
			fw.close();
			Thread.sleep(5000);
			f1.delete();
		}catch(IOException ex){
			
		}catch(InterruptedException ex){
			
		}
	}
}
