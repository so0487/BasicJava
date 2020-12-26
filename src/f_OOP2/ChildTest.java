package f_OOP2;

public class ChildTest {
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println(c.volume);	//볼륨 기본값 0
		c.volumeUp();					//볼륨 1이 증가
		System.out.println(c.volume);	//볼륨 1 출력
		
		System.out.println(c.channel);	//채널 기본값0
		c.channelUp();					
		System.out.println(c.channel);	//0
		
	}
}

class Parent{
	int channel;
	void channelUp(){
		channel++;
	}
}

class Child extends Parent{
	int volume;
	int channel;
	
	void volumeUp(){
		volume++;
	}
}
