class A{
	int a;
}
class B{
	int b;
	B(int i){
		b=i;
	}
}
class Demo {
	public static void main(String[] args) {
		A a1=new A();
		A a2=new A(100);
		
		B b1=new B();
		B b2=new B(100);
    }
}
