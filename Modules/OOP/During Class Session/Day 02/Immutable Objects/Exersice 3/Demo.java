import java.time.*;
class A{
	private int a;
	private int b;
	
	public A(){

	}
	
	public A(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public A setA(int a){
		return new A(a,this.b);
	}
	
	public A setB(int b){
		return new A(this.a,b);
	}

	
	
	public String toString(){
		return a+","+b;
	}
	
	
}
class Demo {
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1); //0,0
		
		A a2=new A(10,20);
		System.out.println(a2); //10,20
		
		a2.setA(100);
		System.out.println(a2); //10,20
		
		
		a2.setB(200);
		System.out.println(a2); //10,20
		
		A a3=a2.setA(100);
		System.out.println("a3 : "+a3); //100,20
		
		a3=a2.setB(200);
		System.out.println("a3 : "+a3); //10,200
	}
}
