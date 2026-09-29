class Demo {
	public static void main(String[] args) {
		Date d1=new Date();
		d1.year=1999;
		d1.month=12;
		d1.day=31; //day of month
		System.out.println("Year : "+d1.year);
		System.out.println("Month: "+d1.month);
		System.out.println("Day : "+d1.day);
    }
}

class Date{
	int year,month,day;
}
