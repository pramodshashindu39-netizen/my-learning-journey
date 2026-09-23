import java.util.*;

class StudentManagementSystem {
    
    // Batch status
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;

    // Batch data
    public static int[] batchNameArray = { 105, 106, 107, 108, 109, 110 };
    public static int[] batchStatusArray = { 0, 0, 0, 0, 1, 1 };
    
    public static String[] regNoArray = {
            "PR24105001", "PR24105002", "PR24105003", "PR24105004", "PR24105005",
            "PR24105006", "PR24105007", "PR24105008", "PR24105009", "PR24105010",
            "OR24105011", "OR24105012", "OR24105013", "OR24105014", "OR24105015",
            "PR24105016", "PR24105017", "PR24105018", "OR24105019", "OR24105020",
            "PR24105021", "PR24105022", "OR24105023", "OR24105024", "PR24105025",
            "PR24106001", "PR24106002", "PR24106003", "PR24106004", "PR24106005",
            "PR24106006", "PR24106007", "PR24106008", "PR24106009", "PR24106010",
            "OR24106011", "OR24106012", "OR24106013", "OR24106014", "OR24106015",
            "PR24106016", "PR24106017", "PR24106018", "OR24106019", "OR24106020",
            "PR24106021", "PR24106022", "OR24106023", "OR24106024", "PR24106025",
            "PR24107001", "PR24107002", "PR24107003", "PR24107004", "PR24107005",
            "PR24107006", "PR24107007", "PR24107008", "PR24107009", "PR24107010",
            "OR24107011", "OR24107012", "OR24107013", "OR24107014", "OR24107015",
            "PR24107016", "PR24107017", "PR24107018", "OR24107019", "OR24107020",
            "PR24107021", "PR24107022", "OR24107023", "OR24107024", "PR24107025",
            "PR24108001", "PR24108002", "PR24108003", "PR24108004", "PR24108005",
            "PR24108006", "PR24108007", "PR24108008", "PR24108009", "PR24108010",
            "OR24108011", "OR24108012", "OR24108013", "OR24108014", "OR24108015",
            "PR24108016", "PR24108017", "PR24108018", "OR24108019", "OR24108020",
            "PR24108021", "PR24108022", "OR24108023", "OR24108024", "PR24108025",
            "PR24109001", "PR24109002", "PR24109003", "PR24109004", "PR24109005",
            "PR24109006", "PR24109007", "PR24109008", "PR24109009", "PR24109010",
            "OR24109011", "OR24109012", "OR24109013", "OR24109014", "OR24109015",
            "PR24109016", "PR24109017", "PR24109018", "OR24109019", "OR24109020",
            "PR24109021", "PR24109022", "OR24109023", "OR24109024", "PR24109025",
            "PR24110001", "PR24110002", "PR24110003", "PR24110004", "PR24110005",
            "PR24110006", "PR24110007", "PR24110008", "PR24110009", "PR24110010",
            "OR24110011", "OR24110012", "OR24110013", "OR24110014", "OR24110015",
            "PR24110016", "PR24110017", "PR24110018", "OR24110019", "OR24110020",
            "PR24110021", "PR24110022", "OR24110023", "OR24110024", "PR24110025"

    };

    public static String[] nicArray = {
            "199501012345", "199503153872", "199506202198", "199509102983", "199511258739",
            "199512303498", "199502183764", "199504223198", "199508153210", "199510293417",
            "199601102375", "199604182938", "199606243879", "199608142178", "199610312475",
            "199611173452", "199603293481", "199605083217", "199607232198", "199609192375",
            "199701212483", "199703132487", "199706253478", "199708083298", "199710243651",
            "199712152983", "199702182734", "199704293187", "199705142375", "199709083751",
            "199801032874", "199803232871", "199806193428", "199808013764", "199810242374",
            "199812302984", "199802152348", "199805213471", "199807172398", "199811283472",
            "199901122471", "199903052984", "199906213874", "199908093412", "199910273894",
            "199912153482", "199902202394", "199904163874", "199907293481", "199911083479",
            "200001112374", "200003143478", "200006293874", "200008103471", "200010252984",
            "200012043894", "200002193874", "200004212374", "200005183492", "200007153871",
            "200101232984", "200103083471", "200106273894", "200108123984", "200110043728",
            "200112213874", "200102253471", "200104103874", "200105293784", "200107202983",
            "200201013874", "200203253471", "200206143874", "200208083471", "200210293874",
            "200212183471", "200202103874", "200204123894", "200205283471", "200207153874",
            "200301093874", "200303283471", "200306153874", "200308123471", "200310083874",
            "200312243471", "200302273874", "200304203471", "200305123874", "200307213471",
            "200401153874", "200403123471", "200406293874", "200408083471", "200410213874",
            "200412153471", "200402203874", "200404273471", "200405143874", "200407183471",
            "200501023874", "200503193471", "200506153874", "200508213471", "200510083874",
            "200512293471", "200502123874", "200504153471", "200505283874", "200507173471"
            ,"200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678"
        };

    public static String[] nameArray = {
            "Gunawardena Weerasinghe", "Senanayake Silva", "Silva Kumara", "Kumara Herath", "Rathnayake Herath",
            "Wijesinghe Bandara", "Rajapaksha Herath", "Senanayake Karunaratne", "Karunaratne Jayasinghe",
            "Gunawardena Silva",
            "Weerasinghe Rajapaksha", "Silva Rathnayake", "Fernando Perera", "Kumara Abeysekera",
            "Ekanayake Rathnayake",
            "Herath Gunawardena", "Abeysekera Silva", "Weerasinghe Silva", "Jayasinghe Dias", "Bandara Rathnayake",
            "Silva Perera", "De Silva Dias", "Abeysekera Jayasinghe", "Rajapaksha Senanayake", "Kumara Karunaratne",
            "Silva Abeysekera", "Jayasinghe Bandara", "Rathnayake Kumara", "Weerasinghe Rajapaksha",
            "Senanayake Herath",
            "Perera Ekanayake", "Herath Jayasinghe", "Kumara Gunawardena", "Abeysekera Silva", "Dias Fernando",
            "Karunaratne Weerasinghe", "Ekanayake Bandara", "Rajapaksha Kumara", "Silva De Silva",
            "Gunawardena Rathnayake",
            "Bandara Karunaratne", "Fernando Perera", "De Silva Silva", "Rajapaksha Gunawardena", "Herath Weerasinghe",
            "Karunaratne Dias", "Jayasinghe Silva", "Senanayake Abeysekera", "Silva Jayasinghe", "Rathnayake Kumara",
            "Gunawardena Kumara", "Rajapaksha Silva", "Perera Jayasinghe", "Silva Ekanayake", "Dias Senanayake",
            "Herath Abeysekera", "Rathnayake Fernando", "Kumara Herath", "Weerasinghe Silva", "Senanayake Karunaratne",
            "Abeysekera Silva", "Bandara Gunawardena", "Karunaratne Weerasinghe", "Perera Herath", "Fernando Dias",
            "Weerasinghe Gunawardena", "Rathnayake Kumara", "Senanayake Fernando", "Silva Bandara", "Herath Rajapaksha",
            "Kumara Jayasinghe", "Abeysekera Perera", "Rathnayake Jayasinghe", "Kumara Weerasinghe",
            "Rajapaksha Ekanayake",
            "Fernando Rajapaksha", "Silva Gunawardena", "Perera Wijesinghe", "Herath Abeysekera",
            "Rajapaksha Ekanayake",
            "Karunaratne Silva", "Weerasinghe Fernando", "Silva Bandara", "Abeysekera Weerasinghe",
            "Kumara Karunaratne",
            "Dias Rajapaksha", "Herath Perera", "Rathnayake Gunawardena", "Ekanayake Jayasinghe", "Gunawardena Silva",
            "Rajapaksha Perera", "Karunaratne Jayasinghe", "Weerasinghe Abeysekera", "Rathnayake Fernando",
            "Kumara Herath",
            "Silva Weerasinghe", "Herath Karunaratne", "Abeysekera Silva", "Gunawardena Ekanayake",
            "Weerasinghe Kumara",
            "Weerasinghe Kumara", "Rajapaksha Abeysekera", "Gunawardena Perera", "Karunaratne Silva",
            "Herath Wijesinghe",
            "Rathnayake Ekanayake", "Silva Fernando", "Abeysekera Rajapaksha", "Fernando Bandara", "Perera Herath",
            "Weerasinghe Jayasinghe", "Silva Karunaratne", "Rathnayake Gunawardena", "Herath Kumara",
            "Abeysekera Silva",
            "Ekanayake Bandara", "Rajapaksha Fernando", "Gunawardena Weerasinghe", "Kumara Karunaratne", "Silva Dias",
            "Perera Weerasinghe", "Karunaratne Rajapaksha", "Jayasinghe Silva", "Rathnayake Perera", "Silva Ekanayake",
            "Silva Karunaratne", "Herath Fernando", "Kumara Jayasinghe", "Weerasinghe Perera", "Abeysekera Rajapaksha",
            "Rathnayake Karunaratne", "Ekanayake Bandara", "Gunawardena Perera", "Silva Wijesinghe",
            "Rajapaksha Jayasinghe",
            "Rathnayake Fernando", "Karunaratne Kumara", "Perera Silva", "Gunawardena Ekanayake", "Bandara Rajapaksha",
            "Silva Herath", "Rathnayake Weerasinghe", "Perera Gunawardena", "Herath Karunaratne", "Silva Rajapaksha",
            "Ekanayake Kumara", "Bandara Herath", "Weerasinghe Rajapaksha", "Karunaratne Abeysekera", "Perera Dias",

    };

    public static int[] prfArray = {
            85, 39, -1, 72, 44,
            91, 60, 38, 95, 49,
            -1, 67, 23, 58, 88,
            81, 73, 29, 62, -1,
            79, 53, 94, 47, 35,
            93, 15, -1, 82, 45,
            88, 23, 79, 37, -1,
            68, 100, 59, 29, 92,
            12, 77, 38, 66, 9,
            84, 51, 32, -1, 97,
            95, -1, 63, 88, 32,
            76, 97, 54, -1, 23,
            90, 35, 81, 61, 44,
            67, 100, 17, 85, 29,
            70, 42, -1, 60, 86,
            86, 57, 91, 35, -1,
            76, 48, 94, 23, 69,
            -1, 80, 55, 88, 32,
            100, 67, 43, -1, 90,
            60, 77, 25, 71, 84,
            92, 68, 59, 85, 63,
            76, 91, 70, 84, 63,
            72, 89, 45, 81, 77,
            68, 63, 88, 75, 90,
            57, 79, 92, 62, 100,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2

    };

    public static int[] dbmsArray = {
            66, 45, 93, 58, -1,
            37, 88, 21, 79, 40,
            76, 54, -1, 69, 92,
            25, 84, 33, 60, 71,
            59, -1, 98, 27, 48,
            35, 91, 60, -1, 72,
            49, 26, 80, 14, 89,
            67, -1, 31, 94, 53,
            78, 5, 90, 24, 86,
            39, -1, 61, 73, 100,
            38, 91, -1, 74, 55,
            82, 66, 49, 99, 13,
            80, 70, 93, 36, 59,
            85, 47, 90, -1, 22,
            77, 34, 63, 100, 29,
            79, 62, 87, -1, 54,
            46, 99, 39, 70, -1,
            75, 83, 58, 92, 30,
            91, 40, 63, 95, 68,
            -1, 66, 21, 88, 37,
            67, 91, 85, 73, 70,
            63, 76, 88, 55, 64,
            79, 80, 59, 92, 68,
            100, 77, 83, 45, 62,
            66, 59, 78, 85, 56,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2
    };

    // tempary arrays for sorting 
   	public static   String[] tempregNoArray=new String[regNoArray.length],
							 tempnicArray=new String[nicArray.length],
							 tempnameArray=new String[nameArray.length];
					
	public static 	int[] tempdbmsArray=new int[dbmsArray.length],
						  tempprfArray=new int[prfArray.length],
						  tempbatchNameArray=new int[batchNameArray.length],
						  tempbatchstatusArray=new int[batchStatusArray.length];
    

    
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
						batchManagement();
						break;
					case 3:
						clearConsole();
						gradeManagement();
						break;
					case 4:
						clearConsole();
						reportGenerator();
						break;
					case 5:
						exit();
						break;
				}
			break;
        } while (true);
    }


	//do you want
	public static void optionYesorNo(char optionYesorNo){
		if(optionYesorNo=='Y'||optionYesorNo=='y'){
			clearConsole();
			return;
		}else if(optionYesorNo=='N'||optionYesorNo=='n'){
			clearConsole();
			homePage();
		}else{
			clearConsole();
			exit();
		}
		
	}



    //STUDENT MANAGEMENT & BATCH MANAGEMENT-->add student (check batch number ) & add batch
    public static boolean checkBacthNumber(int inputBacthNo){
        for (int i = 0; i < batchNameArray.length; i++){
			if(batchNameArray[i]==inputBacthNo){
				return true;
			}
		}
		return false;
	}

    //STUDENT MANAGEMENT
    public static void studentManagement() {
		do {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\tStudent Management\t\t\t|");
			System.out.println("-----------------------------------------------------------------\n");
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
						deleteStudentProfile();
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
		L1:do{
			System.out.println("-----------------------------------------------------------------");
			System.out.println("|\t\t\t\tAdd Student \t\t\t|");
			System.out.println("-----------------------------------------------------------------\n");
			
			Scanner input=new Scanner(System.in);
			System.out.print("Enter Bacth Number (Student should be added) : ");
			int bacthNumber=input.nextInt();
			
			if(checkBacthNumber(bacthNumber)){
				if(checkBacthStatus(bacthNumber)){
					System.out.print("\nEnter Student NIC : ");
					String stuNIC=input.next();
						if(checkNIC(stuNIC)==false){
							input.nextLine();
							System.out.print("\nEnter Student Name: ");
							String stuName=input.nextLine();
							
							System.out.print("\nEnter Lecturer Mode (1-PHYSICAL 0-ONLINE): ");
							int lectureMode=input.nextInt();
							
							String regNum=createRegistrationNo(lectureMode, bacthNumber);
							System.out.println("\nStudent Registration No - "+regNum);
							
							updateArrays(stuNIC,stuName,regNum);
							
							System.out.println("\n\tStudent was successfully added to the system.");
							
							System.out.print("\n\nDo you want to add another student(Y/N):");
							char optionYesorNo=input.next().charAt(0);
							
							optionYesorNo(optionYesorNo);
							continue L1;
							
						}else{
							System.out.print("\n\tThis student already added to the system");
							
							System.out.print("\n\nDo you want to add another student(Y/N):");
							char optionYesorNo=input.next().charAt(0);
							
							optionYesorNo(optionYesorNo);
							continue L1;	
						}
				}else{
					System.out.print("\n\tStudent cannot be added to this bacth because enrollment is closed.");
					System.out.print("\n\nDo you want to add another student(Y/N):");
					char optionYesorNo=input.next().charAt(0);
					
					optionYesorNo(optionYesorNo);
					continue L1;
				}
			}else{
				System.out.print("\n\tStudent cannot be added to this bacth because this batch not found.");
				System.out.print("\n\nDo you want to add another student(Y/N):");
				char optionYesorNo=input.next().charAt(0);
				
				optionYesorNo(optionYesorNo);
				continue L1;	
			}
		}while(true);
	}
	
	//STUDENT MANAGEMENT-->update student-->update arrays
	public static void updateArrays(String stuNIC,String stuName,String regNum){
		String tempregNoArray[]=new String[regNoArray.length+1];
		String tempnicArray[]=new String[nicArray.length+1];
		String tempnameArray[]=new String[nameArray.length+1];
		int tempprfArray[]=new int[prfArray.length+1];
		int tempdbmsArray[]=new int[dbmsArray.length+1];
		
		for (int i = 0; i < regNoArray.length; i++){
				tempregNoArray[i]=regNoArray[i];
				tempnicArray[i]=nicArray[i];
				tempnameArray[i]=nameArray[i];
				tempprfArray[i]=prfArray[i];
				tempdbmsArray[i]=dbmsArray[i];
				
			}
		tempregNoArray[tempregNoArray.length-1]=regNum;
		tempnameArray[tempnameArray.length-1]=stuName;
		tempnicArray[tempnicArray.length-1]=stuNIC;
		tempprfArray[tempprfArray.length-1]=-2;
		tempdbmsArray[tempdbmsArray.length-1]=-2;
		
		regNoArray=tempregNoArray;
		nicArray=tempnicArray;
		nameArray=tempnameArray;
		prfArray=tempprfArray;
		dbmsArray=tempdbmsArray;
	}
	
	//STUDENT MANAGEMENT-->add student-->registration number create
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
	
	//STUDENT MANAGEMENT-->add student-->student count 
	public static int studentCount(int bacthNumber){
		int stuCountForEachBatch=0;
		for (int i = 0; i < regNoArray.length; i++){
			if (bacthNumber==Integer.parseInt(regNoArray[i].substring(4,7))){
				stuCountForEachBatch++;
			}
		}
		return stuCountForEachBatch;
	}
	
	//STUDENT MANAGEMENT-->add student-->check nic
	public static boolean checkNIC(String stuNIC){
		boolean check=false;
		for (int i = 0; i < nicArray.length; i++){
			if(nicArray[i].equals(stuNIC)){
				check=true;
			}
		}
		return check;
	}
	
	//STUDENT MANAGEMENT-->add student-->check batch status
	public static boolean checkBacthStatus(int BacthNo){

		for (int i = 0; i < batchNameArray.length; i++){
			if(batchNameArray[i]==BacthNo){
				if(batchStatusArray[i]==1){
					return true;
				}
			}	
		}
		return false;
	}
	
	//STUDENT MANAGEMENT-->update student
	public static void updateStudent(){
		while(true){
			Scanner input=new Scanner(System.in);
			System.out.println(" Update Student");
			System.out.println("========================\n");
			System.out.print("Enter student registration No : ");
			String regNo=input.next();
			
			int index = checkRegNo(regNo);
			if(index!=-1){
				System.out.println("\nWhat do you want to update ? ");
				System.out.println("\t\t(01) Student Name ");
				System.out.println("\t\t(02) Student NIC  ");
				
				System.out.print("\nEnter your option - ");
				int option = input.nextInt();
				
				switch (option){
					case 1:
							clearConsole();
							studentNameUpdate(regNo);
							break;
					case 2:
							clearConsole();
							studentNICupdate(regNo);
							break;
				}
			}else{
				System.out.println("\n\t\tThis student does not in the system.");
				System.out.print("\n\nDo you want to update another student details(Y/N): ");
				char optionYesOrNo=input.next().charAt(0); 
				
				if(optionYesOrNo=='Y'||optionYesOrNo=='y'){
					clearConsole();
					continue;
				}else{
					clearConsole();
					studentManagement();
				}				
			}
		}
	}
	
	//STUDENT MANAGEMENT-->update student-->student name update
	public static void studentNameUpdate(String regNo){
		Scanner input=new Scanner(System.in);
		System.out.println("\nUpdate Student Name");
		System.out.println("========================");
	
		for (int i = 0; i < regNoArray.length ; i++){
			if (regNo.equals(regNoArray[i])){
				System.out.println(" \n Registration No :"+regNo);
				System.out.println(" Student NIC 	: "+nicArray[i]);
				System.out.println(" Student Current Name : "+nameArray[i]);
				
				System.out.print(" \n\nEnter student name to update - ");
				String newName=input.nextLine();
				
				nameArray[i]=newName;
				
				System.out.println("\n\t\tStudent name updated successfully...");
				System.out.print("\n\nDo you want to update another student details(Y/N): ");
				char optionYesOrNo=input.next().charAt(0); 
			
				optionYesorNo(optionYesOrNo);
				return;
			}
		}
	}
	
	//STUDENT MANAGEMENT-->update student-->student NIC update
	public static void studentNICupdate(String regNo){
		Scanner input=new Scanner(System.in);
		System.out.println("\nUpdate Student NIC");
		System.out.println("========================");
		int count=0;

		for (int i = 0; i < regNoArray.length ; i++){
			if (regNo.equals(regNoArray[i])){
				System.out.println(" \n Registration No :"+regNo);
				System.out.println(" Student Current Name : "+nameArray[i]);
				System.out.println(" Current Student NIC 	: "+nicArray[i]);
				
				System.out.print(" \n\nEnter student NIC to update - ");
				String newNIC=input.nextLine();
				
				nicArray[i]=newNIC;
				
				System.out.println("\n\t\tStudent NIC updated successfully...");
				System.out.print("\n\nDo you want to update another student details(Y/N): ");
				char optionYesorNo=input.next().charAt(0); 
				
				optionYesorNo(optionYesorNo);
				return;
			}
		}
	}
	
	//STUDENT MANAGEMENT-->view student profile
	public static void viewStudentProfile(){
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\tView Student's Profile\t\t\t|");
		System.out.println("-------------------------------------------------------------------------\n");
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter student registration No	: ");
		String regNo=input.next();
		
		clearConsole();
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\tView Student's Profile\t\t\t|");
		System.out.println("-------------------------------------------------------------------------\n");
		
		viewInfoFromRegNo(regNo);
		
		System.out.print("\n\nDo you want to view another student details(Y/N): ");
		char optionYesOrNo=input.next().charAt(0); 
		
		if(optionYesOrNo=='Y'||optionYesOrNo=='y'){
			clearConsole();
			viewStudentProfile();
		}else{
			clearConsole();
			studentManagement();		
		}
	} 
	
	//STUDENT MANAGEMENT-->view student profile-->submethod 
	public static void viewInfoFromRegNo(String regNo){
		Scanner input=new Scanner(System.in);
		int checkRegNoArraycount=0;
		
		int index = checkRegNo(regNo);
		if(index!=-1){
			for(int i=0;i<regNoArray.length;i++){
				if(regNo.equals(regNoArray[i])){
					System.out.println("\n\t\tRegistration No		: "+regNoArray[i]);
					System.out.println("\t\tStudent Name		: "+nameArray[i]);
					System.out.println("\t\tStudent NIC		: "+nicArray[i]);
					
					if(prfArray[i]==-1){
						System.out.println("\t\tStudent PRF Marks	: Absent");
					}else if(prfArray[i]==-2){
						System.out.println("\t\tStudent PRF Marks	: Not Conducted");
					}else{
						System.out.println("\t\tStudent PRF Marks	: "+prfArray[i]);
					}

					
					if(dbmsArray[i]==-1){
						System.out.println("\t\tStudent DBMS Marks	: Absent");
					}else if(dbmsArray[i]==-2){
						System.out.println("\t\tStudent DBMS Marks	: Not Conducted");
					}else{
						System.out.println("\t\tStudent DBMS Marks	: "+dbmsArray[i]);
					}
					
					double totgpa=totalGPA(dbmsArray[i],prfArray[i]);
				
					System.out.println("\t\tStudent GPA		: "+totgpa);
					
					return;
				
				}
				
				checkRegNoArraycount++;
			}
		}else{
			System.out.println("\n\t\tThis student does not in the system.");
			System.out.print("\n\nDo you want to view another student details(Y/N): ");
			char optionYesOrNo=input.next().charAt(0); 
			
			if(optionYesOrNo=='Y'||optionYesOrNo=='y'){
				clearConsole();
				viewStudentProfile();
			}else{
				clearConsole();
				studentManagement();
			}		
		}
	}
	
	//Find Total GPA
	public static double totalGPA(int prfMarks,int dbmsMarks){
		double prfGPA  = findGPA(prfMarks);
		double dbmsGPA = findGPA(dbmsMarks);
		
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
	
	//STUDENT MANAGEMENT-->delete profile
	public static void deleteStudentProfile(){
    Scanner input = new Scanner(System.in);
    do {
        System.out.println("-".repeat(100));
        System.out.printf("%25sDelete Student Profile\n", " ");
        System.out.println("-".repeat(100));
        System.out.println("\n");    
    
        System.out.print("Enter student registration No    : ");
        String regNo = input.next();
        
        int foundIndex = -1;
        for (int i = 0; i < regNoArray.length; i++) {
            if (regNo.equals(regNoArray[i])) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("\n\tThis student not in the system..");
            System.out.print("\nDo you want to search another student profile(Y/N) : ");
            char optionYesorNo = input.next().charAt(0);
            optionYesorNo(optionYesorNo);
            clearConsole();
            continue;
        }

        
        viewInfoFromRegNo(regNo);
        System.out.print("\nDo you want to delete this student profile(Y/N) : ");
        char deleteProfile = input.next().charAt(0);
        
        if (deleteProfile == 'Y' || deleteProfile == 'y') {
            
            String[] tempRegNoArray = new String[regNoArray.length - 1];
            String[] tempNicArray = new String[nicArray.length - 1];
            String[] tempNameArray = new String[nameArray.length - 1];
            int[] tempPrfArray = new int[prfArray.length - 1];
            int[] tempDbmsArrayArray = new int[dbmsArray.length - 1];
            
            for (int i = 0, j = 0; j < regNoArray.length; j++) {
                if (!regNo.equals(regNoArray[j])) { 
                    tempRegNoArray[i] = regNoArray[j];
                    tempNicArray[i] = nicArray[j];
                    tempNameArray[i] = nameArray[j];
                    tempPrfArray[i] = prfArray[j];
                    tempDbmsArrayArray[i] = dbmsArray[j];
                    i++;
                }
            }
            
            regNoArray = tempRegNoArray;
            nicArray = tempNicArray;
            nameArray = tempNameArray;
            prfArray = tempPrfArray;
            dbmsArray = tempDbmsArrayArray;
            
            System.out.println("\n\n\t\tStudent was successfully deleted from the system.");
            
        } else if (deleteProfile == 'N' || deleteProfile == 'n') {
            System.out.println("\nDeletion canceled.");
        } else {
            clearConsole();
            exit();
            return; 
        }
        
        
        System.out.print("\nDo you want to delete another student profile(Y/N) : ");
        char optionYesorNo = input.next().charAt(0);
        
        optionYesorNo(optionYesorNo);
        clearConsole();
        
    } while(true);
}

    
    
    //BATCH MANAGEMENT
    public static void batchManagement() {
        Scanner input=new Scanner(System.in);

        
        do {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|\t\t\t\tBatch Management\t\t\t|");
            System.out.println("-------------------------------------------------------------------------\n");
         
            System.out.println("[1] Add Batch");
            System.out.println("\n[2] Update Batch");
            System.out.println("\n[3] View Batch");
            System.out.println("\n[4] Exit");

            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    addBatch();
                    break;
                case 2:
                    clearConsole();
                    updateBatch();
                    break;
                case 3:
                    clearConsole();
                    viewBatch();
                    break;
                case 4:
                    exit();
                    break;
            }
        } while (true);
    }
   
    //BATCH MANAGEMENT-->add batch
    public static void addBatch(){
		Scanner input=new Scanner(System.in);
		L1:while(true){
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\t\tAdd Batch \t\t\t\t|");
			System.out.println("-------------------------------------------------------------------------\n\n");
			System.out.print("Enter Batch Number : ");
			int inputBacthNo=input.nextInt();
        
			if(checkBacthNumber(inputBacthNo)){
				System.out.println("\n\tBacth is already added to the system.");
				System.out.println("\nDo you want to add another batch to the system(Y/N) : ");
				char addAnotherBacth=input.next().charAt(0);
				if(addAnotherBacth=='Y'){
					continue;
				}else{
					break;
				}
			
			}else{
				int[] tempbatchNameArray=new int[batchNameArray.length+1];
			
				for (int i = 0; i < batchNameArray.length; i++){
					tempbatchNameArray[i]=batchNameArray[i];
				}
				
				tempbatchNameArray[tempbatchNameArray.length-1]=inputBacthNo;
				batchNameArray=tempbatchNameArray;
				System.out.println("\n\tBatch was successfully added to the system.");

				System.out.print("\nDo you want to add another batch to the system(Y/N) : ");
				char addAnotherBacth=input.next().charAt(0);
				
				if(addAnotherBacth=='Y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					break;
				}
			} 
		}
	}
    
    //BATCH MANAGEMENT-->update batch
    public static void updateBatch(){
		Scanner input=new Scanner(System.in);
		L1:while(true){
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\t\tUpdate Batch \t\t\t\t|");
			System.out.println("-------------------------------------------------------------------------\n\n");		 
			System.out.print("Enter Batch Number : "); 
			int inputBatchNo=input.nextInt();
			
			int count=1;
			for (int i = 0; i < batchNameArray.length; i++){
				if(inputBatchNo==batchNameArray[i]){
					if(checkBacthCurrentStatus(inputBatchNo,i)){
						System.out.print("\nDou want to change the batch status to ENROLLMENT CLOSED(Y/N): ");
						char inputYesOrNo=input.next().charAt(0);
						if(inputYesOrNo=='Y'|| inputYesOrNo=='y'){
							batchStatusArray[i]=0;
							System.out.println("\n\t\tBatch Status updated successfully...");
							System.out.print("\nDo you want to update another batch(Y/N) : ");
							char inputYesOrNo2=input.next().charAt(0);
							if(inputYesOrNo=='Y'||inputYesOrNo=='y'){
								continue L1;
							}else{
								break L1;
							}
						}else break L1;
					}else{
						System.out.println("\nBatch status already ENROLLMENTCLOSED.");
						System.out.print("\nDo you want to update another batch(Y/N) : ");
						char inputYesOrNo=input.next().charAt(0);
						if(inputYesOrNo=='Y'|| inputYesOrNo=='y'){
							clearConsole();
							continue L1;
						}else{
							clearConsole();
							break L1;
						}
					}
				}else if(count==batchNameArray.length){
					System.out.println("\nThis batch does not exist in the system . ");
					System.out.print("\nDo you want to update another batch(Y/N) : ");
					char inputYesOrNo=input.next().charAt(0);
					if(inputYesOrNo=='Y'|| inputYesOrNo=='y'){
						clearConsole();
						continue L1;
					}else{
						clearConsole();
						break L1;
					}
				}
				count++;
			}
		}
	}
  
    //BATCH MANAGEMENT-->update batch-->check current status
    public static boolean checkBacthCurrentStatus(int inputBatchNo,int i){
			
			if(batchStatusArray[i]==1){
				return true;
			}
		return false;
	}

    //BATCH MANAGEMENT-->viewBatch(NOT COMPLETED--student count,string format)
    public static void viewBatch(){
		Scanner input=new Scanner(System.in);
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\t\tView Batch \t\t\t|");
		System.out.println("-------------------------------------------------------------------------\n"); 
		System.out.println("\n---------------------------------------------------------");
		System.out.printf(" No%3s Batch No%4s Student Count%4s Status","","","");
		System.out.println("\n---------------------------------------------------------");
		String status="";
		for (int i = 0; i < batchNameArray.length; i++){
			if(batchStatusArray[i]==0){
				status = "ENROLLMENT CLOSED";
			}else{
				status = "ENROLLMENT OPEN";
			}
			System.out.printf(" %-5d %-3d  \t\t25\t  %6s",(i+1),batchNameArray[i],status);
			System.out.println("\n---------------------------------------------------------");
		}
		
		System.out.print("Do you want to the home page(Y/N) : ");
		char optionYesorNo=input.next().charAt(0);
		
		if (optionYesorNo=='Y'||optionYesorNo=='y'){
			clearConsole();
			homePage();
		}else{
			clearConsole();
			exit();
		}
		
	}



     //GRADE MANAGEMENT
    public static void gradeManagement(){
		while(true){
			Scanner input=new Scanner(System.in);
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\t\tGrade Management\t\t\t|");
			System.out.println("-------------------------------------------------------------------------\n");
			System.out.println("[1] PRF Marks Update");
			System.out.println("\n[2] DBMS Marks Update ");
			System.out.println("\n[3] Exit");
			System.out.print("\nEnter an option to continue > ");
			int gradeManagementSelection=input.nextInt();
			
			switch(gradeManagementSelection){
				case 1:
						clearConsole();
						prfMarksUpdate();
						break;
				case 2:
						clearConsole();
						dbmsMarksUpdate();
						break;
				case 3:
						homePage();
						break;
			}
			break;
		}
	}
	
    //GRADE MANAGEMENT-->prf marks update
    public static void prfMarksUpdate(){
		Scanner input=new Scanner(System.in);
		L1:while(true){
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\t\tPRF Marks Update\t\t\t|");
			System.out.println("-------------------------------------------------------------------------\n");
			System.out.print("Enter Student Registration No : ");
			String regNo = input.next();
			clearConsole();
			
			int index = checkRegNo(regNo);
			
			if(index!=-1){
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("|\t\t\t\tPRF Marks Update\t\t\t|");
				System.out.println("-------------------------------------------------------------------------\n");
		
				System.out.println(" Registration No	: "+regNo);
				System.out.println(" Student  Name   	: "+nameArray[index]);
				System.out.println(" Student NIC 		: "+nicArray[index]);
				
				if(prfArray[index]>0){
					System.out.println("\nThis student has already completed the PRF module.");
					System.out.println("\n\t\tPRF Marks : "+prfArray[index]);
					
					System.out.print("\n\nDo you want to update this student's PRF marks ?  ");
					char inputYesOrNo=input.next().charAt(0);
					
					if (inputYesOrNo=='Y'||inputYesOrNo=='y'){
						System.out.print("\n\t\tEnter PRF Marks : ");
						int updatedPrfMarks=input.nextInt();
						
						prfArray[index]=updatedPrfMarks;
						
						System.out.println("\n\n\tThis student PRF Marks updated successfully...");
						System.out.print("\nDo you want to update another student PRF marks(Y/N) : ");
						char inputYesOrNo2=input.next().charAt(0);
						
						if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
							clearConsole();
							continue L1;
						}else{
							clearConsole();
							homePage();
						}
					}else{
						System.out.println("\n\t\twrong input...");
						System.out.print("\nDo you want to update another student PRF marks(Y/N) : ");
						char inputYesOrNo2=input.next().charAt(0);
						
						if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
							clearConsole();
							continue L1;
						}else{
							clearConsole();
							homePage();
						}						
					}
				}else if(prfArray[index]==-2){
					System.out.println(" Registration No	: "+regNo);
					System.out.println(" Student  Name   	: "+nameArray[index]);
					System.out.println(" Student NIC 		: "+nicArray[index]);
					System.out.print(" Enter PRF Marks	: ");
					int updatedPrfMarks=input.nextInt();
					
					prfArray[index]=updatedPrfMarks;
					
					System.out.println("\n\n\tThis student PRF Marks updated successfully...");
					System.out.print("\nDo you want to update another student PRF marks(Y/N) : ");
					char inputYesOrNo2=input.next().charAt(0);
						
					if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
						continue L1;
					}else{
						clearConsole();
						homePage();
					}
				}else if(prfArray[index]==-1){
					System.out.println(" Registration No	: "+regNo);
					System.out.println(" Student  Name   	: "+nameArray[index]);
					System.out.println(" Student NIC 		: "+nicArray[index]);
					System.out.println("This student was about fromthe exam. You can upate the marks if they participate in it..");
					System.out.print("\n\t\tEnter PRF Marks	: ");
					int updatedPrfMarks=input.nextInt();
					
					prfArray[index]=updatedPrfMarks;
					
					System.out.println("\n\n\tThis student PRF Marks updated successfully...");
					System.out.print("\n\nDo you want to update another student PRF marks(Y/N) : ");
					char inputYesOrNo2=input.next().charAt(0);
						
					if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
						clearConsole();
						continue L1;
					}else{
						clearConsole();
						homePage();
					}
				}else{
					clearConsole();
					homePage();
				}
			}else{
				System.out.println("This Student does not in the system. ");
				System.out.print("\nDo you want to update another student PRF marks(Y/N) : ");
				char inputYesOrNo2=input.next().charAt(0);
				
				if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					homePage();
				}
			}		
		}
	}

    //GRADE MANAGEMENT-->dbms marks update
    public static void dbmsMarksUpdate(){
		Scanner input=new Scanner(System.in);
		L1:while(true){
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\t\tDBMS Marks Update\t\t\t|");
			System.out.println("-------------------------------------------------------------------------\n");
			System.out.print("Enter Student Registration No : ");
			String regNo = input.next();
			clearConsole();
			
			int index = checkRegNo(regNo);
			
			if(index!=-1){
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("|\t\t\t\tDBMS Marks Update\t\t\t|");
				System.out.println("-------------------------------------------------------------------------\n");
		
				System.out.println(" Registration No	: "+regNo);
				System.out.println(" Student  Name   	: "+nameArray[index]);
				System.out.println(" Student NIC 		: "+nicArray[index]);
				
				if(prfArray[index]>0){
					System.out.println("\nThis student has already completed the DBMS module.");
					System.out.println("\n\t\tDBMS Marks : "+dbmsArray[index]);
					
					System.out.print("\n\nDo you want to update this student's DBMS marks ?  ");
					char inputYesOrNo=input.next().charAt(0);
					
					if (inputYesOrNo=='Y'||inputYesOrNo=='y'){
						System.out.print("\nt\tEnter DBMS Marks : ");
						int updateddbmsMarks=input.nextInt();
						
						dbmsArray[index]=updateddbmsMarks;
						
						System.out.println("\n\n\tThis student DBMS Marks updated successfully...");
						System.out.print("\nDo you want to update another student DBMS marks(Y/N) : ");
						char inputYesOrNo2=input.next().charAt(0);
						
						if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
							clearConsole();
							continue L1;
						}else{
							clearConsole();
							homePage();
						}
					}else{
						System.out.println("wrong input...");
						System.out.print("\nDo you want to update another student DBMS marks(Y/N) : ");
						char inputYesOrNo2=input.next().charAt(0);
						
						if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
							clearConsole();
							continue L1;
						}else{
							clearConsole();
							homePage();
						}						
					}
				}else if(dbmsArray[index]==-2){
					System.out.println(" Registration No	: "+regNo);
					System.out.println(" Student  Name   	: "+nameArray[index]);
					System.out.println(" Student NIC 		: "+nicArray[index]);
					System.out.print(" Enter DBMS Marks	: ");
					int updateddbmsMarks=input.nextInt();
					
					dbmsArray[index]=updateddbmsMarks;
					
					System.out.println("\n\n\tThis student PRF Marks updated successfully...");
					System.out.print("\nDo you want to update another student PRF marks(Y/N) : ");
					char inputYesOrNo2=input.next().charAt(0);
						
					if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
						continue L1;
					}else{
						clearConsole();
						homePage();
					}
				}else if(dbmsArray[index]==-1){
					System.out.println(" Registration No	: "+regNo);
					System.out.println(" Student  Name   	: "+nameArray[index]);
					System.out.println(" Student NIC 		: "+nicArray[index]);
					System.out.println("This student was about fromthe exam. You can upate the marks if they participate in it..");
					System.out.print("\n\t\tEnter DBMS Marks	: ");
					int updateddbmsMarks=input.nextInt();
					
					dbmsArray[index]=updateddbmsMarks;
					
					System.out.println("\n\n\tThis student DBMS Marks updated successfully...");
					System.out.print("\n\nDo you want to update another student DBMS marks(Y/N) : ");
					char inputYesOrNo2=input.next().charAt(0);
						
					if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
						clearConsole();
						continue L1;
					}else{
						clearConsole();
						homePage();
					}
				}else{
					clearConsole();
					homePage();
				}
			}else{
				System.out.println("This Student does not in the system. ");
				System.out.print("\nDo you want to update another student DBMS marks(Y/N) : ");
				char inputYesOrNo2=input.next().charAt(0);
				
				if (inputYesOrNo2=='Y'||inputYesOrNo2=='y'){
					clearConsole();
					continue L1;
				}else{
					clearConsole();
					homePage();
				}
			}		
		}
	}	   

    //
    public static int checkRegNo(String regNo){
	    for(int i=0;i<regNoArray.length;i++){
			if(regNo.equals(regNoArray[i])){
				return i;
			}
		}
	   return -1;
	}
    
    //ORGINAL ARRAY VALUES COPY TO TEMPARY ARRAYS
	public static void tempArrays(){
		for (int i = 0; i < regNoArray.length; i++){
			tempregNoArray[i]=regNoArray[i];
			tempnicArray[i]=nicArray[i];
			tempnameArray[i]=nameArray[i];
			tempprfArray[i]=prfArray[i];
			tempdbmsArray[i]=dbmsArray[i];
		}
		
		for (int i = 0; i < batchNameArray.length; i++){
			tempbatchNameArray[i]=batchNameArray[i];
			tempbatchstatusArray[i]=batchStatusArray[i];
		}
	}
    
    //TEMPARY ARRAYS SORTING 
    public static void sortingAndPrint(){
		for (int i = 0; i < tempnameArray.length-1; i++){
			for(int j=0;j < tempnameArray.length-1-i;j++){
				if(tempnameArray[j].compareTo(tempnameArray[j+1])>0){
					
					String tempRegNo = tempregNoArray[j];
					tempregNoArray[j] = tempregNoArray[j+1];
					tempregNoArray[j+1] = tempRegNo;
					
					String tempname = tempnameArray[j];
					tempnameArray[j] = tempnameArray[j+1];
					tempnameArray[j+1] = tempname;
					
					String tempNIC = tempnicArray[j];
					tempnicArray[j] = tempnicArray[j+1];
					tempnicArray[j+1] = tempNIC;
					
					int tempDBMS = tempdbmsArray[j];
					tempdbmsArray[j] = tempdbmsArray[j+1];
					tempdbmsArray[j+1] =  tempDBMS;
					
					int tempPRF = tempprfArray[j];
					tempprfArray[j] = tempprfArray[j+1];
					tempprfArray[j+1] = tempPRF;
					
				}
			}
		}
	}
	
    
    
    //REPORT GENERATOR 
    public static void reportGenerator() {
			
		tempArrays();	
		sortingAndPrint();
		
		while(true){
			Scanner input=new Scanner(System.in);
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("|\t\t\t\tReport Generator\t\t\t\t|");
			System.out.println("-------------------------------------------------------------------------\n");
			System.out.println("[1] Student Registration Report");
			System.out.println("\n[2] Batch-wise Student Report");
			System.out.println("\n[3] Industry Training Eligibility Report");
			System.out.println("\n[4] Exit");
			
			System.out.print("\nEnter an option to continue : ");
			int reportSelection=input.nextInt();
			
			switch( reportSelection){
				case 1:
						clearConsole();
						studentRegistrationReport();
						break;
				case 2:
						clearConsole();
						batchWiseStudentReport();
						break;
				case 3:
						clearConsole();
						IndustryTrainingEligibilityReport();
						break;
				case 4:
						clearConsole();
						exit();
						break;
			}
		}
	}
   
    //REPORT GENERATOR-->Student Registration Report
    public static void studentRegistrationReport(){
		
		Scanner input=new Scanner(System.in);
		System.out.println("-".repeat(120));
		System.out.printf("%25sStudent Registration Report \n"," ");
		System.out.println("-".repeat(120));
		System.out.println("\n");
		System.out.println("-".repeat(120));
		System.out.printf("%-4s %-25s %-32s %-15s %-13s %-17s %-10s \n","No","Registration No","Student Name","NIC","PRF Marks","DBMS Marks","GPA");
		System.out.println("-".repeat(120));
		
		for (int i = 0; i < tempregNoArray.length; i++){
			double totGPA=totalGPA(tempprfArray[i],tempdbmsArray[i]);
			System.out.printf("%-7d %-20s %-30s %-22s %-14d %-12d %-10.2f ",(i+1),tempregNoArray[i],tempnameArray[i],tempnicArray[i],tempprfArray[i],tempdbmsArray[i],totGPA);
			System.out.println();
		}
		
		System.out.print("Do you want another report(Y/N) > ");
		char optionYesorNo=input.next().charAt(0);
		if (optionYesorNo=='Y'||optionYesorNo=='y'){
			clearConsole();
			return;
		}else if (optionYesorNo=='N'||optionYesorNo=='n'){
			clearConsole();
			homePage();
		}else{
			clearConsole();
			exit();
		}
	}
	
    //REPORT GENERATOR-->Batch-wise Student Report
    public static void batchWiseStudentReport(){
		Scanner input = new Scanner(System.in);
		System.out.println("-".repeat(120));
		System.out.printf("|%45s Batch-wise Stuent Report %48s|","  ","  ");
		System.out.println();
		System.out.println("-".repeat(120));
		
		for (int i = 0; i < batchNameArray.length; i++){
			System.out.printf("[%d] %5d Batch ",(i+1),batchNameArray[i]);
			System.out.println("\n");
			
			if(i==batchNameArray.length-1){
				System.out.printf("[%d]   Exit ",(i+2));
				System.out.println("\n");
	
			}
		}
		
		System.out.print("Enter an option to continue > ");
		int option=input.nextInt();
		
		int batchNo=selectBatchFromRegNo(option);
		
		clearConsole();
		
		eachBatchReport(batchNo);
		
	}
   
	//REPORT GENERATOR-->Batch-wise Student Report-->select batch
    public static int selectBatchFromRegNo(int option){
		int batchNo=105;
		for (int i = 0; i < batchNameArray.length ; i++){
			if(option==(i+1)){
				return batchNo;
			}
			batchNo++;
		}	
		return -1;
	}
	
	//REPORT GENERATOR-->Batch-wise Student Report-->each batch report
	public static void eachBatchReport(int batchNo){
		Scanner input=new Scanner(System.in);
		System.out.printf("-".repeat(120));
		System.out.println();
		System.out.printf("%-4s %-25s %-32s %-15s %-13s %-17s %-10s","No","Registration No","Student Name","NIC","PRF Marks","DBMS Marks","GPA");
		System.out.println();
		System.out.printf("-".repeat(120));
		System.out.println("\n");
		
		int noCount=0;
		for (int i = 0; i < tempregNoArray.length; i++){
			int batchno=Integer.parseInt(tempregNoArray[i].substring(4,7));
			if(batchno==(batchNo)){
				double totGPA=totalGPA(tempprfArray[i],tempdbmsArray[i]);
				System.out.printf("%-7d %-20s %-30s %-22s %-14d %-12d %-10.2f ",++noCount,tempregNoArray[i],tempnameArray[i],tempnicArray[i],tempprfArray[i],tempdbmsArray[i],totGPA);
				System.out.println("\n");
			}
		}
		
		System.out.println("Do you want to another batch report(Y/N) : ");
		char optionYesorNo=input.next().charAt(0);
		
		if(optionYesorNo=='Y'|| optionYesorNo=='y'){
			clearConsole();
			return;
		}else if (optionYesorNo=='N'||optionYesorNo=='n'){
			clearConsole();
			homePage();
		}else{
			clearConsole();
			exit();
		}
		
	}
	
    //REPORT GENERATOR-->Industry Training Eligibility Report
    public static void IndustryTrainingEligibilityReport(){
		Scanner input = new Scanner(System.in);
		System.out.println("-".repeat(120));
		System.out.printf("|%45s Industry Training Eligibility Report %48s|","  ","  ");
		System.out.println();
		System.out.println("-".repeat(120));
		System.out.println("");
		System.out.printf("-".repeat(120));
		System.out.println();
		System.out.printf("%-4s %-25s %-32s %-15s %-13s %-17s %-10s","No","Registration No","Student Name","NIC","PRF Marks","DBMS Marks","GPA");
		System.out.println();
		System.out.printf("-".repeat(120));
		System.out.println("\n");
		
		int noCount=0;
		for (int i = 0; i < tempregNoArray.length; i++){
			
			double totGPA=totalGPA(tempprfArray[i],tempdbmsArray[i]);

			if(totGPA>3.25 && tempprfArray[i]>50 && tempdbmsArray[i]>50){
				
				System.out.printf("%-7d %-20s %-30s %-22s %-14d %-12d %-10.2f ",++noCount,tempregNoArray[i],tempnameArray[i],tempnicArray[i],tempprfArray[i],tempdbmsArray[i],totGPA);
				System.out.println("");
			}
			
			System.out.println("\n\nDo you want to another batch report(Y/N) : ");
			char optionYesorNo=input.next().charAt(0);
			
			if(optionYesorNo=='Y'|| optionYesorNo=='y'){
				clearConsole();
				return;
			}else if (optionYesorNo=='N'||optionYesorNo=='n'){
				clearConsole();
				homePage();
			}else{
				clearConsole();
				exit();
			}
		}
	}

   
   
    //MAIN METHOD
    public static void main(String args[]) {
        homePage();
    }

}


