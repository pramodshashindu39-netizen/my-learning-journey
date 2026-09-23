import java.util.*;
class JavaFlowControlQuestion4{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);	
		System.out.print("Number of classes held : ");
		int numberOfClassesHeld=input.nextInt();
		
		System.out.print("Number of classes attended : ");
		int numberOfClassesAttended=input.nextInt();
		
		double  attendancePercentage = (((double)numberOfClassesAttended / numberOfClassesHeld )*100);
		
		if (attendancePercentage>70.0){
			System.out.printf("\n\n\tAttendance Percentage : %.2f %% ",attendancePercentage);
			System.out.println("\n\n\tThis is student eligibility for the PRF exam.");
		}else{
			
			System.out.printf("\n\n\tAttendance Percentage : %.2f %% ",attendancePercentage);
			System.out.print("\n\nHe/She has a medical cause or not(Y/N) :");
			char hasMedicalCause = input.next().charAt(0);
			
			if ( hasMedicalCause == 'Y' || hasMedicalCause == 'y'){
				System.out.println("\n\n\tThis student is eligibility for the PRF exam.");
			}else{
				System.out.println("\n\n\tThis student is not eligibility for the PRF exam.");
			}
		
		}
	
	}

}
