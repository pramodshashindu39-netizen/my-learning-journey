import java.util.*;
class Practice8{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
				for(int num=2;num<=1000;num++){
					int devisionCount=0;
					
					for(int beforeNum=2;beforeNum<num;beforeNum++){
						
						if((num%beforeNum)==0){
							devisionCount++;
						}
					}
					
					if(devisionCount==0){	
						System.out.println(num);
					}			
				
				}
	}
}


