import java.util.*;

public class CourseWork01{
	
	public static Student [] studentArray ={ 
		new Student("PR24100001", "200012345678", "Amal Perera", 85, 78, 100),
		new Student("PR24100002", "200187654321", "Nimal Silva", 90, 82, 100),
		new Student("OR24100003", "199923456789", "Kamal Fernando", 75, 88, 101),
		new Student("PR24101001", "200234567890", "Sunil Jayasinghe", 68, 70, 101),
		new Student("PR24102001", "200045678901", "Ruwan Kumara", 92, 95, 102),
		new Student("PR24103001", "200156789012", "Samanthi Dias", 80, 84, 102),
		new Student("PR24100004", "199867890123", "Priyantha Bandara", 72, 65, 103),
		new Student("PR24100005", "200378901234", "Kavindi Wijesinghe", 88, 91, 104),
		new Student("OR24100001", "200089012345", "Kasun Rajapaksha", 64, 73, 105),
		new Student("OR24105001", "200290123456", "Dilini Perera", 95, 89, 105) 
	};
	
	public static Bacth   [] batchArray ={new Bacth(100,0),new Bacth(101,1),new Bacth(103,1),new Bacth(104,1),new Bacth(105,1)};
	
	
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

	//EXIT
    public static void exit() {
        clearConsole();
        System.out.println("\n\t\tYou left the program...\n");
        System.exit(0);
    }
	
	//LINES
	public static void boarderLines(){
		System.out.println("-".repeat(65));
	}
	
	//HOME PAGE
	public static void homePage() {
		do {
			boarderLines();
			System.out.println("|\t\t\tiCET Student Management System\t\t|");
			boarderLines();
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
						exit();
						break;
				}
			//break;
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
					updateStudent();
					break;
				case 3:
					clearConsole();
					viewStudentProfile();
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
			
			int bacthStatus=checkBacthNumberAndBatchStatus(bacthNumber);
			if(bacthStatus==1){
					System.out.print("\nEnter Student NIC : ");
					String stuNIC=input.next();
						if(hasNotNIC(stuNIC)){
							input.nextLine();
							System.out.print("\nEnter Student Name: ");
							String stuName=input.nextLine();
							
							System.out.print("\nEnter Lecturer Mode (1-PHYSICAL 0-ONLINE): ");
							int lectureMode=input.nextInt();
							
							String regNum=createRegistrationNo(lectureMode, bacthNumber);
							System.out.println("\nStudent Registration No - "+regNum);
							
							updateStudentArray();
							studentArray[studentArray.length-1]=new Student(regNum,stuNIC,stuName,-2, -2 , bacthNumber);
							
							System.out.println("\n\tStudent was successfully added to the system.");
							
							System.out.print("\n\nDo you want to add another student(Y/N):");
							String inputYesNo=input.next();
							
							if (isInputYes(inputYesNo)){
								clearConsole();
								continue L1;
							}else{
								clearConsole();
								return;
							}
							
						}else{
							System.out.print("\n\tThis student already added to the system");
							
							System.out.print("\n\nDo you want to add another student(Y/N):");
							String inputYesNo=input.next();
							
							if (isInputYes(inputYesNo)){
								clearConsole();
								continue L1;
							}else{
								clearConsole();
								return;
							}	
						}	
				
			}else if (bacthStatus==0){
				System.out.println("\n\tStudent cannot be added to this bacth because enrollment is closed.");
				System.out.print("\n\nDo you want to add another student(Y/N):");
				String inputYesNo=input.next();
				
				if (isInputYes(inputYesNo)){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
				
			}else{
				System.out.print("\n\tStudent cannot be added to this bacth because this batch not found .");
				System.out.print("\n\nDo you want to add another student(Y/N):");
				String inputYesNo=input.next();
				
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
	
	//
	public static void updateStudentArray(){
		Student[] tempStudentArray=new Student[studentArray.length+1];
		for (int i = 0; i < studentArray.length; i++){
			tempStudentArray[i]=studentArray[i];
		}
		studentArray = tempStudentArray;	
	}
	
	//
	public static int studentCount(int bacthNumber){
		int stuCountForEachBatch=0;
		for (int i = 0; i < studentArray.length; i++){
			if (bacthNumber==Integer.parseInt(studentArray[i].getRegNo().substring(4,7))){
				stuCountForEachBatch++;
			}
		}
		return stuCountForEachBatch;
	}
	
	//
	public static String createRegistrationNo(int lectureMode,int  bacthNumber){
		
		int stuCount=studentCount(bacthNumber);

		String registrationNo="";
		if(lectureMode==1){
			registrationNo="PR24" + bacthNumber + String.format("%03d",stuCount+1);
		}else{
			registrationNo="OR24" + bacthNumber + String.format("%03d",stuCount+1);
		}
		return registrationNo;
	}

	//
	public static boolean hasNotNIC(String stuNIC){
		for (int i = 0; i < studentArray.length; i++){
			if (stuNIC.equals(studentArray[i].getNic())){
				return false;
			}
		}
		return true;
	}
	
	//Check Batch
	public static int checkBacthNumberAndBatchStatus(int bacthNumber){
		for (Bacth batch: batchArray){
			if (batch.getBatchName()==bacthNumber){
				if (batch.getBatchStatus()==1){
					return 1;//has batch and enrollment open
				}else return 0;//has batch and enrollment close
			}
		}
		return -2;//no batch
	}
	
	//
	public static boolean isInputYes(String inputYesNo){
		return inputYesNo.equalsIgnoreCase("Y") || inputYesNo.equalsIgnoreCase("Yes");
	}
	
	//
	public static void updateStudent(){
		L1:while(true){
				Scanner input=new Scanner(System.in);
				System.out.println(" Update Student");
				System.out.println("========================\n");
				System.out.print("Enter student registration No : ");
				String regNo=input.next();
				
				int index=checkRegNo(regNo);
				
				if(index >= 0 ){
					System.out.println("\nWhat do you want to update ? ");
					System.out.println("\t\t(01) Student Name ");
					System.out.println("\t\t(02) Student NIC  ");
					
					System.out.print("\nEnter your option - ");
					int option = input.nextInt();
					
					switch (option){
						case 1:
								clearConsole();
								studentNameUpdate(index,regNo);
								break;
						case 2:
								clearConsole();
								studentNICupdate(index,regNo);
								break;
					}
					
				}else{
					System.out.println("\n\t\tThis student does not in the system.");		
				}
				
				System.out.print("\n\nDo you want to update another student details(Y/N): ");
				String inputYesNo=input.next();
				
				if (isInputYes(inputYesNo)){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					return;
				}
				
			}
	
		}
	
	//
	public static int checkRegNo(String regNo){
		for (int i = 0; i < studentArray.length; i++){
			if (studentArray[i].getRegNo().equalsIgnoreCase(regNo)){
				return i;
			}
		}
		return -1;//no registration Number
		
	}
	
	//STUDENT MANAGEMENT-->update student-->student name update
	public static void studentNameUpdate(int index,String regNo){
		Scanner input=new Scanner(System.in);
		System.out.println("\nUpdate Student Name");
		System.out.println("========================");

		viewInfoFromRegNo(regNo);
		
		System.out.print(" \n\nEnter student name to update - ");
		String newName=input.nextLine();
		
		studentArray[index].setName(newName);
		
		System.out.println("\n\t\tStudent name updated successfully...");
		
	}
		
    //STUDENT MANAGEMENT-->update student-->student NIC update
	public static void studentNICupdate(int index,String regNo){
		Scanner input=new Scanner(System.in);
		System.out.println("\nUpdate Student NIC");
		System.out.println("========================");

		viewInfoFromRegNo(regNo);
				
		System.out.print(" \n\nEnter student NIC to update - ");
		String newNIC=input.nextLine();
		
		studentArray[index].setNic(newNIC);
		
		System.out.println("\n\t\tStudent NIC updated successfully...");
	}
    
    //STUDENT MANAGEMENT-->view student profile
	public static void viewStudentProfile(){
		L1:while(true){
			boarderLines();
			System.out.println("|\t\t\tView Student's Detail\t\t\t|");
			boarderLines();
			
			Scanner input=new Scanner(System.in);
			System.out.print("Enter student registration No	: ");
			String regNo=input.next();
			
			clearConsole();
			viewInfoFromRegNo(regNo);
			
			System.out.print("\n\nDo you want to view another student details(Y/N): ");
			String inputYesNo=input.next();
			
			if (isInputYes(inputYesNo)){
				clearConsole();
				continue L1;
			}else{
				clearConsole();
				return;
			}
		}
	} 
    
  	//STUDENT MANAGEMENT-->view student profile-->submethod 
	public static void viewInfoFromRegNo(String regNo){
		
		int index = checkRegNo(regNo);
		
		if(index>=0){
			System.out.println("\n\n\t\t\tStudent Profile");
			System.out.println("============================================================");
			System.out.println("\n\t\tRegistration No		: "+studentArray[index].getRegNo());
			System.out.println("\t\tStudent Name		: "+studentArray[index].getName());
			System.out.println("\t\tStudent NIC		: "+studentArray[index].getNic());
			
			if(studentArray[index].getPrf()==-1){
				System.out.println("\t\tStudent PRF Marks	: Absent");
			}else if(studentArray[index].getPrf()==-2){
				System.out.println("\t\tStudent PRF Marks	: Not Conducted");
			}else{
				System.out.println("\t\tStudent PRF Marks	: "+studentArray[index].getPrf());
			}

			
			if(studentArray[index].getDbms()==-1){
				System.out.println("\t\tStudent DBMS Marks	: Absent");
			}else if(studentArray[index].getDbms()==-2){
				System.out.println("\t\tStudent DBMS Marks	: Not Conducted");
			}else{
				System.out.println("\t\tStudent DBMS Marks	: "+studentArray[index].getDbms());
			}
			
			double totgpa=totalGPA(index);
		
			System.out.println("\t\tStudent GPA		: "+totgpa);
			
			System.out.println("\n============================================================");
			
		}else{
			System.out.println("\n\t\tThis student does not in the system.");
		}
	}
	
	//Find Total GPA
	public static double totalGPA(int index){
		double prfGPA  = findGPA(studentArray[index].getPrf());
		double dbmsGPA = findGPA(studentArray[index].getDbms());
		
		double totgpa=(dbmsGPA+prfGPA)/2.0;	
		
		return totgpa;
	}
	
	//Find Each Subject GPA
	public static double findGPA(int marks){
		double marksGPA =
			marks>=90?4.25:
			marks>=80?4.00:
			marks>=75?3.70:
			marks>=70?3.30:
			marks>=65?3.00:
			marks>=60?2.70:
			marks>=55?2.30:
			marks>=50?2.00:
			marks>=45?1.70:
			marks>=40?1.30:
			marks>=30?1.00:
			marks>=20?0.70:0.0;	
			
			return marksGPA;
	}
  
  
    public static void main(String args[]){
		homePage();
	}
}
