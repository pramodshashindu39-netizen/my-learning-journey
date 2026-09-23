import java.time.*;
class Date{
	public static final int YEAR=0;
	public static final int MONTH=1;
	public static final int DAY=2;
	
	private int year;
	private int month;
	private int day; 
	
	Date(){
		this(1970,1,1);
	}
	public Date(int year, int month, int day){
		set(year,month,day);
	}	
	public void printDate(){
		System.out.println(toString());
	}

	public void set(int field, int value){
		switch(field){
			case YEAR:
				setYear(value);
				break;
			case MONTH:
				setMonth(value);
				break;
			case DAY:
				setDay(value);
		}
	}
	public void set(int year, int month, int day){
		setYear(year);//this.year=year;
		setMonth(month);//this.month=month;
		setDay(day);//this.day=day;
	}
	public void setYear(int year){
		this.year=year;
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day){
		this.day=day;
	}
	public String toString(){
		return year+"-"+month+"-"+day;
	}
	public void set(Date date){
		set(date.year, date.month, date.day);
	}
	public static Date getDateInstance(){
		LocalDate d1=LocalDate.now();
		return new Date(d1.getYear(),d1.getMonthValue(),d1.getDayOfMonth());
	}
}
class Demo {
	public static void main(String[] args) {
		Date d1=Date.getDateInstance();
		System.out.println(d1);//2026-9-17
	}
}

