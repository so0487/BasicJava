package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {
		TimeVO time = new TimeVO();
		time.setHour(21);
		time.setMinute(220);
		time.setSeconds(91830);
		
		int hour = time.getHour();
		System.out.println("시간은 "+hour);
		
		//분 : 220분		//0:40
		int minute = time.getMinute();
		System.out.println("분은 "+minute);
			
		//초 : 91830초 = 90000(25시간) + 1800(30분) +30*60초
		int seconds = time.getSeconds();
		System.out.println("초는 "+seconds);
		
		
		//최종결과 : 2:10:30
	}
}
class TimeVO{//시간 바구니
	private int hour;
	private int minute;
	private int seconds;
	
	void setHour(int hour){
			this.hour = hour%24;
	}
	
	int getHour(){
		return hour;
	}
	
	void setMinute(int minute){
		setHour(hour+minute/60);
		this.minute=minute%60;
	}
	
	int getMinute(){
		return minute;
	}
	
	void setSeconds(int seconds){
		setMinute(minute+seconds/60);
		this.seconds = seconds%60;
	}
	
	int getSeconds(){
		return seconds;
	}
}

