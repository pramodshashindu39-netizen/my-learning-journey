import java.util.*;
class Question18{
	public static void main(String args[]){
		String[] month={"January","February","March","April","May","June",
						"July","August","September","October","November","December"};
		String[] arrMonth=new String[month.length];

//I.
		for(int i=0;i<arrMonth.length;i++){
			arrMonth[i]=month[i];
		}
	}
}

//II.
		/*
         ----output----
         month==arMonth??? false
         
         ----reason----
         month kiyana variable eke athule thiyenne months tika store karala thiyena 
         objet eke address eka , prasne kiyala thibba arrmonth array varibale ekata
         assign kale aluthma object ekaka address ekk , ethakota month kiyana array 
         variable ekai arrmonth kiyna array variable ekai represent karanne object dekk ,
         ethakota month == arrmonth kiyala ahanne month kiyana varable kata assign karapu
         object eke address eka arrmonth kiyana varibale ekata assign karapu obect ek address
         ekata samanada kiyala , object dekk ee nisa addresses dekk nisa pilithura false
         
       */
