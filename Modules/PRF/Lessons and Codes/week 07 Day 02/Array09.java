import java.util.*;
class Array09{
	public static int[] mergeTwoArrays(int[] ar,int[]br){
		
		int[] zr=new int[ar.length + br.length];
		
		for(int i=0;i<ar.length;i++){
			zr[i]=ar[i];
			}
		for(int i=0;i<br.length;i++){
			zr[ar.length+i]=br[i];
			}
		/*zr[0]=ar[0];
		zr[1]=ar[1];
		zr[2]=ar[2];
		zr[3]=ar[3];
		zr[4]=ar[4];
		zr[5]=ar[5];
		zr[6]=br[0];
		zr[7]=br[1];
		zr[8]=br[2];
		zr[9]=br[3];
		return zr;*/

		return zr;
		}
	
	public static void main(String args[]){
		int[] ar={10,20,30,40,50,60};
		int[] br={70,80,90,100};
		
		int[] cr=mergeTwoArrays(ar,br);
		
		System.out.println("ar : "+Arrays.toString(ar)); //[10,20,30,40,50,60]
		System.out.println("br : "+Arrays.toString(br)); //[70,80,90,100]
		System.out.println("cr : "+Arrays.toString(cr)); //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
	}
}
