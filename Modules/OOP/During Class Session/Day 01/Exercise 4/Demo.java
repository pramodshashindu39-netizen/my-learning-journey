class Box{
	//------------attribute declarations----------------
	int length;
	int width;
	int height;
	
	//------------methods declarations----------------
	public void printVolume(){
		int volume;
		volume=length*width*height;
		System.out.println("Volume of the box : "+volume);
	}
	public void setSize(int l, int w , int h ){
		 length=l;
		 width=w;
		 height=h;
	}
}

class Demo {
	public static void main(String[] args) {
		Box b1=new Box();
		/*b1.length=12;
		b1.width=5;
		b1.height=3;*/
		b1.setSize(12,5,3);
		b1.printVolume(); //180
    }
}
