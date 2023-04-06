package studio8;

import java.util.Objects;
import java.util.HashSet;
import java.util.LinkedList;

public class Date {
	private int month;
	private int date;
	private int year;
	
	public Date (int month, int date, int year) {
		this.month = month;
		this.date=date;
		this.year=year;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDate() {
		return this.date;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public boolean isHoliday() {
		if (this.month == 4 && this.date == 27)
		{
			return true;
		}
		else if (this.month == 12 && this.date == 25)
		{
			return true;
		}
		else if (this.month == 10 && this.date == 8)
		{
			return true;
		}
		else if (this.month == 7 && this.date == 4)
		{
			return true;
		}
		else {
			return false;
		}
	}

	public String toString() {
		return getMonth()+"/"+getDate()+"/"+getYear();
	}
	
    public static void main(String[] args) {
    	Date date1 = new Date (4,27,1006);
    	Date date2=new Date (5,27,2007);
    	Date date3=new Date (9,10,1968);
    	Date date4 =new Date (10,8,2003);
    	Date date5 = new Date (2,7,2023);
    	
    	LinkedList<Date> list = new LinkedList<Date>();
    	list.add(date1);
    	list.add(date5);
    	list.add(date3);
    	list.add(date4);
    	list.add(date5);
    	System.out.println(list);
    	
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(date1);
    	set.add(date5);
    	set.add(date3);
    	set.add(date4);
    	set.add(date5);
    	System.out.println(set);
    }

    
	@Override
	public int hashCode() {
		return Objects.hash(date, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return date == other.date && month == other.month && year == other.year;
	}

}
