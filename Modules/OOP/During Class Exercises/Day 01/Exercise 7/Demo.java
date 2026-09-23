class Box{
	int length;
	int width;
	int height;
	
	//------------methods declarations----------------
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
	public int getVolume(){
		//int volume=length*width*height;
		//return volume;
		return length*width*height;
	}
	
}

class Demo {
	public static void main(String[] args) {
		Box b1=new Box();
		b1.setSize(12,5,3);
		b1.printVolume(); //180
		
		b1.setSize(120,50,30);
		int volume=b1.getVolume(); //
		System.out.println("New Volume : "+volume); //180000
    }
}
