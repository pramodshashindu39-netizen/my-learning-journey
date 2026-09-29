class Box{
	private int length;
	private int width;
	private int height;

	public void printVolume(){
		System.out.println("Volume of the box : "+getVolume());
	}
	public int getVolume(){
		return length*width*height;
	}
	public void setSize(int length, int width, int height){
		setLength(length); 	//this.length=length;
		setWidth(width);	//this.width=width;
		setHeight(height);	//this.height=height;
	}
	public void setLength(int length){
		this.length=length;
	}
	public int getLength(){
		return length;
	}
	public void setWidth(int width){
		this.width=width;
	}
	public int getWidth(){
		return width;
	}
	public void setHeight(int height){
		this.height=height;
	}
	public int getHeight(){
		return height;
	}
}
class Demo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume(); //180
		System.out.println();
		b1.setLength(120);	//b1.length=120;
		b1.setWidth(50);	//b1.width=50;
		b1.setHeight(30);	//b1.height=30;
		b1.printVolume(); //180000
		System.out.println("New Length : "+b1.getLength());
		System.out.println("New Width  : "+b1.getWidth());
		System.out.println("New Height : "+b1.getHeight());
    }
}
