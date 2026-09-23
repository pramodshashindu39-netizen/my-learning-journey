class Demo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.length=12;
		b1.width=5;
		b1.height=3;
		System.out.println("Length : "+b1.length);
		System.out.println("Width  : "+b1.width);
		System.out.println("Height : "+b1.height);
		
		int volume;
		volume=b1.length*b1.width*b1.height;
		System.out.println("Volume of the box : "+volume); //180
    }
}

class Box{
	int length,width,height;
}
