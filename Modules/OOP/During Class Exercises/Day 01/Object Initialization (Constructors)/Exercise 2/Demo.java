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
	public void set(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
