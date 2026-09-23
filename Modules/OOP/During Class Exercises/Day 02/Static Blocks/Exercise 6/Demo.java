class Box{
	private int length;
	private int width;
	private int height;
	
	public Box(){
		this(1);
	}
	public Box(int length){
		this(length,length,length);
	}
	public Box(int length, int width, int height){
		set(length,width,height);
	}
	public void printVolume(){
		System.out.println("Volume of the box : "+getVolume());
	}
	public int getVolume(){
		return length*width*height;
	}
	public void set(int length, int width, int height){
		setLength(length); 
		setWidth(width);
		setHeight(height);
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
	public static Box getInstance(){
		return new Box();
	} 
	public void set(Box box){
		set(box.length, box.width, box.height);
	}
}
class Demo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.set(12,5,3);
		b1.printVolume(); //180
		System.out.println();
		
		Box b2=new Box(10);
		b2.printVolume(); //1000
		System.out.println();
		
		Box b3=new Box(120,50,30);
		b3.printVolume(); //180000
		System.out.println();
		
		Box b4=Box.getInstance();
		b4.printVolume(); //1
		System.out.println();
		
		b4.set(b3);
		b4.printVolume(); //180000
		System.out.println();
    }
}
