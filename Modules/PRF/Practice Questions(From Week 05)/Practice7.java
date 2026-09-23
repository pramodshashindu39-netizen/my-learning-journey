import java.util.*;

class Practice7 {
    public static void main(String args[]) {
        
        for (int i = 1; i <= 1000; i++) {
            int start_to_end = i; 
            int end_to_start = 0; 

            int temp = i; 
            while (temp != 0) {
                int digit = temp % 10;
                end_to_start = (end_to_start * 10) + digit; 
                temp /= 10;
            }

            
            if (start_to_end == end_to_start) {
                System.out.print(start_to_end + "\n "); 
            }
        }
    }
}

/*  import java.util.*;
class Practice5{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int start_to_end = 0,end_to_start=0;
		
		for(int i=1 ;i>=1 && i<=1000;i++){
			
			start_to_end = i;
			
			int digit = 0;
			while(i!=0){
				digit = i%10;
				i/=10;
				end_to_start +=digit; 
			}
			
			if(start_to_end == end_to_start){
					System.out.print(start_to_end);
			}
			
		}
	}
}
 */
