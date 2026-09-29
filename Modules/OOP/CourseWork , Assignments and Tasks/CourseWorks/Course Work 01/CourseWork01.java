import java.util.*;

public class CourseWork01{
	
	public static Student [] studentArray ={};
	public static Bacth   [] batchArray ={new Bacth(100,1)};
	
	
	//CONSOLE CLEAR
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

	//LINES
	public static void boarderLines(){
		System.out.println("-".repeat(50));
	}
	
	//HOME PAGE
	public static void homePage() {
		do {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tiCET Student Management System\t\t|");
			System.out.println("-----------------------------------------------------------------\n");
			System.out.println("[1] Student Management");
			System.out.println("\n[2] Batch Management ");
			System.out.println("\n[3] Grade Management");
			System.out.println("\n[4] Report Generator");
			System.out.println("\n[5] Exit");

			Scanner input = new Scanner(System.in);
		  

				System.out.print("\n\nEnter an option to continue > ");
				int option = input.nextInt();

				switch (option) {
					case 1:
						clearConsole();
						studentManagement();
						break;
					case 2:
						clearConsole();
						//batchManagement();
						break;
					case 3:
						clearConsole();
						//gradeManagement();
						break;
					case 4:
						clearConsole();
						//reportGenerator();
						break;
					case 5:
						//exit();
						break;
				}
			break;
        } while (true);
    }
	
	//STUDENT MANAGEMENT
	public static void studentManagement(){
		do {
		boarderLines();
		System.out.println("|\t\t\tStudent Management\t\t\t|");
		boarderLines();
		System.out.println("[1] Add Student");
		System.out.println("\n[2] Update Student ");
		System.out.println("\n[3] View Student Profile");
		System.out.println("\n[4] Delete Student Profile");
		System.out.println("\n[5] Exit");

		Scanner input = new Scanner(System.in);
		
			System.out.print("\n\nEnter an option to continue > ");
			int option = input.nextInt();

			switch (option) {
				case 1:
					clearConsole();
					addStudent();
					break;
				case 2:
					clearConsole();
					//updateStudent();
					break;
				case 3:
					clearConsole();
					//viewStudentProfile();
					break;
				case 4:
					clearConsole();
					//deleteStudentProfile();
					break;
				case 5:
					homePage();
					break;
			}
		break;
	} while (true);
		
	}
	
	//STUDENT MANAGEMENT-->add student
    public static void addStudent(){
		Scanner input=new Scanner(System.in);
		
		L1:do{
			boarderLines();
			System.out.println("|\t\t\t\tAdd Student \t\t\t|");
			boarderLines();
			
			System.out.print("Enter Bacth Number (Student should be added) : ");
			int bacthNumber=input.nextInt();
			
			if(hasBacth(bacthNumber)){
				
				
			}else{
				System.out.print("\n\tStudent cannot be added to this bacth because this batch not found.");
				System.out.print("\n\nDo you want to add another student(Y/N):");
				char inputYesNo=input.next().charAt(0);
				
				if (isInputYes(inputYesNo)){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
			}
			
		} while (true);	
	}
	

	
		
    public static void main(String args[]){
		homePage();
	}
}
