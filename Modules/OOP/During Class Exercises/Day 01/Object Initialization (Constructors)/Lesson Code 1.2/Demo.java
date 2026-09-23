class Box{
	int length;
	int width;
	int height;
	
	public Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
		System.out.println("Box(int,int,int)");
	}
}
class Demo {
	public static void main(String[] args) {
		Box b1=new Box(12,5,3);
		Box b2=new Box(1,2,1);
		Box b3=new Box(120,50,30);

		System.out.println("Length of b1 : "+b1.length);	//12
		System.out.println("Width  of b1 : "+b1.width);		//5
		System.out.println("Height of b1 : "+b1.height);	//3
		System.out.println();
		
		System.out.println("Length of b2 : "+b2.length);	//1
		System.out.println("Width  of b2 : "+b2.width);		//2
		System.out.println("Height of b2 : "+b2.height);	//1
		System.out.println();
		System.out.println("Length of b3 : "+b3.length);	//120
		System.out.println("Width  of b3 : "+b3.width);		//50
		System.out.println("Height of b3 : "+b3.height);	//30
    }
}
