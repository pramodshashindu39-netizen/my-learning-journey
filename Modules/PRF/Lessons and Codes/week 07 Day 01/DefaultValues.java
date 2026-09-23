import java.util.*;
class DefaultValues{
	public static void main(String args[]){
		int[] a=new int[4];
		System.out.println("int  type  : "+a[0]+", "+a[1]+", "+a[2]+", "+a[3]); //0 0 0 0
		
		long[] b=new long[4];
		System.out.println("long type  : "+b[0]+", "+b[1]+", "+b[2]+", "+b[3]); //0 0 0 0
		
		float[] c=new float[4];
		System.out.println("float type : "+c[0]+", "+c[1]+", "+c[2]+", "+c[3]); //0.0 0.0 0.0 0.0
		
		double[] d=new double[4];
		System.out.println("double type: "+d[0]+", "+d[1]+", "+d[2]+", "+d[3]); //0.0 0.0 0.0 0.0
		
		boolean[] e=new boolean[4];
		System.out.println("boolean type: "+e[0]+", "+e[1]+", "+e[2]+", "+e[3]); //false, false, false, false
		
		char[] f=new char[4];
		System.out.println("char type: "+f[0]+", "+f[1]+", "+f[2]+", "+f[3]); //nothing--null character
		
		String[] g=new String[4];
		System.out.println("String type: "+g[0]+", "+g[1]+", "+g[2]+", "+g[3]); //null null null null
}
