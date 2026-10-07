import java.io.*;
class Demo{
	public static void main(String[] args) {
		try{
			File f1=new File("Test.txt");
			FileReader fr=new FileReader(f1);
			BufferedReader br=new BufferedReader(fr);
			
			String line=br.readLine();
						
						
			while(line!=null){
				System.out.println(line);
				line=br.readLine();
			}

			
			
		}catch(IOException ex){
			
		}
	}
}
