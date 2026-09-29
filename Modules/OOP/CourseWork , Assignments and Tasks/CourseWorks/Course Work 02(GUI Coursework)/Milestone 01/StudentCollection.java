public class StudentCollection {
    public static Student[] studentArray = new Student[0];

    public static void addNewStudent(Student student) {
        extendsStudentArray();
        studentArray[studentArray.length - 1] = student;
    }

    private static void extendsStudentArray() {
        Student[] tempStudentArray = new Student[studentArray.length + 1];
        for (int i = 0; i < studentArray.length; i++) {
            tempStudentArray[i] = studentArray[i];
        }
        studentArray = tempStudentArray;
    }

    public static Student searchStudent(String id) {
        for (int i = 0; i < studentArray.length; i++) {
            String currentId = studentArray[i].getId();
            if (currentId.equalsIgnoreCase(id)) {
                return studentArray[i];
            }
        }
        return null;
    }

    public static int search(Student student) {
        for (int i = 0; i < studentArray.length; i++) {
            if (student.getId().equalsIgnoreCase(studentArray[i].getId())) {
                return i;
            }
        }
        return -1;
    }

    public static boolean updateStudent(Student student) {
        int index = search(student);
        if (index != -1) {
            studentArray[index] = student;
            return true;
        }
        return false;
    }

    public static boolean deleteStudent(String id) {
        int index = -1;
        for (int i = 0; i < studentArray.length; i++) {
            if (id.equalsIgnoreCase(studentArray[i].getId())) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            Student[] tempStudentArray = new Student[studentArray.length - 1];
            int newIndex = 0;
            for (int i = 0; i < studentArray.length; i++) {
                if (i != index) {
                    tempStudentArray[newIndex] = studentArray[i];
                    newIndex++;
                }
            }
            studentArray = tempStudentArray;
            return true;
        }
        return false;
    }

	public static String createRegistrationNo(String lectureMode,String bacthNumber){
		
		int stuCount=0;

		String registrationNo="";
		if(lectureMode.equals("1")){
			registrationNo="PR24" + bacthNumber + String.format("%03d",stuCount+1);
		}else{
			registrationNo="OR24" + bacthNumber + String.format("%03d",stuCount+1);
		}
		return registrationNo;
	}
}
