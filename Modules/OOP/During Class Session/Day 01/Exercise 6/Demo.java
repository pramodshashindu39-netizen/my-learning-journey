class Box{
	int length;
	int width;
	int height;
	//------------methods declarations------------------
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
	public void setSize(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Demo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.setSize(12,5,3);
		System.out.println("Length : "+b1.length);
		System.out.println("Width  : "+b1.width);
		System.out.println("Height : "+b1.height);

		b1.printVolume(); //
    }
}
