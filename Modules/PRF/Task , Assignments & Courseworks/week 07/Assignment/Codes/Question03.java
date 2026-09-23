import java.util.*;
class Question03{
	public static void main(String args[]){
		int[] exchange={2362,2311,1917,1812,1887,1854,1817,1717,1779,1705,1806,1896};
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};

		System.out.printf("\n Month %10s  USD Million   \n","");
		System.out.printf("\n %-14s    %d   ",months[3],exchange[3]);
		System.out.printf("\n %-14s    %d   ",months[6],exchange[6]);
	}
}
