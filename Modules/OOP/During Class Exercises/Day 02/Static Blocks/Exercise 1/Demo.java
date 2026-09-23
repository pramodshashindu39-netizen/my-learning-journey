class Date{
	private int year;
	private int month;
	private int day; 
	
	public Date(){
		year=1970;
		month=1;
		day=1;
	}
	
	public void printDate(){
		System.out.println(year+" - "+month+" - "+day);
	}
	
	public void set(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;	
	}
	
	Date(int year,int month,int day){
		this.year=year;
		this.month=month;
		this.day=day;		
	}
	
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public  void setDay(int day){
		this.day=day;
	}
	public String toString(){
		String date= year+" - "+ month+" - " +day;
		return date;
	}
	
}

class Demo {
	public static void main(String[] args) {
		Date d1=new Date();
		d1.printDate(); //1970-1-1 (Default date);
		
		d1.set(1999,12,31);	
		d1.printDate(); //1999-12-31
		
		Date d2=new Date(2020,3,14);
		d2.printDate(); //2020-3-14
		
		Date d3=new Date();
		
		d3.setYear(2026);
		d3.setMonth(9);
		d3.setDay(17);
		System.out.println(d3.toString());//2026-9-17

	}
}
