class MyClass{
	int a;
	static int b;
	static{
		System.out.println("static block...");
	}
	{
		System.out.println("instance block...");
	}
	public static void staticMethod(){
		System.out.println("static Method");
	}
	public void instanceMethod(){
		System.out.println("instance Method");
	}
}
class Demo {
	public static void main(String[] args) {
		new MyClass();
		new MyClass();
		new MyClass();
	}
}
