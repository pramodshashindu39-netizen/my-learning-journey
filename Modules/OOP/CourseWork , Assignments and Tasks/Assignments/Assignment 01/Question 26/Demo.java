class Date{
	int year=1970;
	int month=1;
	int day=1;
	
	void printDate(){
		System.out.println(year+" - "+month+" - "+day+" - ");
	}
	void setYear(int year){
		this.year=year;
	}
	void setMonth(int month){
		this.month=month;
	}
	void setDay(int day){
		this.day=day;	
	}
	int getYear(){
		return year;
	}
	int getMonth(){
		return month;
	}
	int getDay(){
		return day;
	}
}

class Demo{
	public static void main(String args[]){
		Date d1=new Date();
		d1.printDate(); //1970-1-1
		d1.year=2016;//Illegal
		d1.month=5;//Illegal
		d1.day=30;//Illegal
		//year, month and day attributes cannot be accessed to another class
		d1.setYear(2016);
		d1.setMonth(5);
		d1.setDay(31);
		System.out.println("Year: "+d1.getYear());
		System.out.println("Month :"+d1.getMonth());
		System.out.println("Day: "+d1.getDay());
	}
}
