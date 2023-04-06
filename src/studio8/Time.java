package studio8;


public class Time {
	private int hour;
	private int minute;
	private boolean militaryTime;
	
	public Time (int hour, int minute, boolean militaryTime) {
		this.hour = hour;
		this.minute=minute;
		this.militaryTime=militaryTime;
	}
	
	public int getHour (){
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public String toString() {
		if (militaryTime==true) {
			return getHour()+":"+getMinute();
		}
		else {
			if (this.hour>=12) {
				return (this.hour-12)+":"+getMinute();
			}
			else {
				return (this.hour)+":"+getMinute();
			}
		}
	}
	
	public static void main(String[] args) {

    	
    }

}