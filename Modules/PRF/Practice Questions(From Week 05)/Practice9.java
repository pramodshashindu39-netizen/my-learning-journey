import java.util.*;
class Practice9{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		int beforeNum = 0;
		int fabNum = 1;
		int temp;
		for(int i=0;i<10;i++){
			
			temp=fabNum;
			fabNum = beforeNum+fabNum;
			beforeNum=temp;
			System.out.println(fabNum);
		}
	}
}
