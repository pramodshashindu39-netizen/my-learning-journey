import java.time.*;
class Date{
	private int year;
	private int month;
	private int day; 
	
	Date(){
		this(1970,1,1);
	}
	public Date(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}	
	public void printDate(){
		System.out.println(toString());
	}

	public Date set(int year, int month, int day){
		return new Date(year,month,day);
	}
	public Date setYear(int year){
		return new Date(year,this.month,this.day);
	}
	public  Date setMonth(int month){
		return new Date(this.year,month,this.day);
	}
	public Date setDay(int day){
		return new Date(this.year,this.month,day);
	}
	public String toString(){
		return year+"-"+month+"-"+day;
	}
	public Date set(Date date){
		return new Date(date.year, date.month, date.day);
	}
	public static Date getDateInstance(){
		LocalDate d1=LocalDate.now();
		return new Date(d1.getYear(),d1.getMonthValue(),d1.getDayOfMonth());
	}
}
class Demo {
	public static void main(String[] args) {
		Date d1=Date.getDateInstance();
		System.out.println(d1); //2026-9-17
		
		d1.setYear(1999);
		System.out.println(d1); //2026-9-17
		
		Date d2=d1.setYear(1999);
		System.out.println(d2); //1999-9-17
		
		Date d3=d1.set(1970,1,1);
		System.out.println(d1); //2026-9-17
		System.out.println(d3); //1970-1-1
	}
}
