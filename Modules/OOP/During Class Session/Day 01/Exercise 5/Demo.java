class Box{
	int length;
	int width;
	int height;
	
	public void print(){
		System.out.println(this);
	}
}
class Demo {
	public static void main(String[] args) {
		Box b1=new Box();
		System.out.println(b1);
		b1.print();
		
		System.out.println();
		Box b2=new Box();
		System.out.println(b2);
		b2.print();
		
    }
}
