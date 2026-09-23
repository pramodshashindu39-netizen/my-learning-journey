class Demo {
	public static void main(String[] args) {
		int[] ar;
		ar=new int[3];
		System.out.println(ar); //
		ar[0]=100;
		System.out.println(ar[0]); //prints 100
		//-------------------------------------
		Student s1; //Create a reference variable type "Student"
		s1=new Student();//Create an Object type "Student"
		System.out.println(s1); //prints reference/address of s1
		s1.id="S001"; //s1[0]
		s1.name="Niroth";
		s1.prf=45;
		s1.dbms=65;
		
		System.out.println("St Id : "+s1.id);
		System.out.println("Name  : "+s1.name);
		System.out.println("PRF   : "+s1.prf);
		System.out.println("DBMS  : "+s1.dbms);
    }
}

class Student{
	String id;
	String name;
	int prf;
	int dbms;
	
}
