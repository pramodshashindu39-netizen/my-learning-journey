import java.util.*;
class MethodOverloading{
	public static int abs(int a){
		return a<0?-a:a;
		}
	public static long abs(long b){
		return b<0?-b:b;
		}
	public static float abs(float c){
		return c<0?-c:c;
		}
	public static double abs(double d){
		return d<0?-d:d;
		}
		
	public static void main(String args[]){
		int x=-130;
		long y=-2323;
		float f=-13.2323f;
		double d=-5645.344;
		x=abs(x);
		y=abs(y);
		f=abs(f);
		d=abs(d);
		System.out.println("abs x : "+x);
		System.out.println("abs y : "+y);
		System.out.println("abs f : "+f);
		System.out.println("abs d : "+d);
	}
	

}
