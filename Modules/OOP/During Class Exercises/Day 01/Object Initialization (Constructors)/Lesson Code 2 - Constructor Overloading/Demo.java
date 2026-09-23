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
	public Box(int length){
		this.length=length;
		this.width=length;
		this.height=length;
		System.out.println("Box(int)");
	}
	public Box(){
		this.length=1;
		this.width=1;
		this.height=1;
		System.out.println("Box()");
	}
	public void printVolume(){
		System.out.println("Volume of the box : "+(length*width*height));
	}
}
class Demo {
	public static void main(String[] args) {
		Box b1=new Box(); //calling default constructor
		b1.printVolume();
		
		Box b2=new Box(10);
		b2.printVolume();
		
		Box b3=new Box(12,5,3);
		b3.printVolume();
    }
}
