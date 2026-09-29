class Box{
	int length;
	int width;
	int height;
	
	public Box(){
		length=12;
		width=5;
		height=3;
		System.out.println("Constructor... Box()");
	}	
	public 	void setSize(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Demo {
	public static void main(String[] args) {
		Box b1=new Box();

		System.out.println("New Length : "+b1.length);	//12
		System.out.println("New Width  : "+b1.width);	//5
		System.out.println("New Height : "+b1.height);	//3
    }
}
