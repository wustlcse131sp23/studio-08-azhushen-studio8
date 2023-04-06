package studio8;

import java.util.Objects;
import java.util.LinkedList;
import java.util.HashSet;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date=date;
		this.time=time;
	}
	
	
	public String toString() {
		return this.date+ " at "+ this.time;
	}

	
	public static void main(String[] args) {
		Date date1 = new Date (4,27,1006);
    	Date date2=new Date (5,27,2007);
    	Time time1=new Time (5,30,false);
    	Time time2=new Time (6,21,false);
		Appointment appointment1 = new Appointment (date1, time1);
		Appointment appointment2 = new Appointment (date2, time2);
		
		HashSet<Appointment> set = new HashSet<Appointment>();
		set.add(appointment1);
		set.add(appointment2);
		System.out.println(set);
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

}
