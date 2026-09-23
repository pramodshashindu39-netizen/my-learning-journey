class Box{
	private int length;
	private int width;
	private int height;
	
	public Box(){

	}
	public Box(int length, int width, int height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
}
class Demo {
	public static void main(String[] args) {
		Box[] br=new Box[3]; //Reference array, Box type
		System.out.println(br[0]+" "+br[1]+" "+br[2]); //null null null
		br[0]=new Box(12,5,3);
		br[1]=new Box(120,50,30);
		br[2]=new Box(1,2,3);
		
		
		for (int i = 0; i < 3; i++){
			System.out.println(br[i]);
		}
		
		System.out.println("");
		for(Box i : br){
			System.out.println(br);
		}
		
		System.out.println("");
		for(Box i : br){
			System.out.println(i);
		}
		
	}
}
