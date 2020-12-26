package chapter6;

class Tv{
	//Tv의 속성을 관리하는 변수 color, power, channel을 선언
	String color;
	boolean power;
	int channel;
	
	//Tv의 기능을 관리하는 메서드 power, channelUp, channelDown을 생성 
	//power은 power라는 전원 관리, channelUp은 채널 증가, channelDown은 채널 감소
	void power(){
		power=!power;
	}
	void channelUP(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}



public class Ch6_2_Tvtest2 {
	public static void main(String[] args) {
		//Tv클래스의 참조변수 t1과 t2를 출력하고 인스턴스를 생성
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		//t1과 t2의 채널을 출력
		System.out.println("t1의 채널은 : "+t1.channel);
		System.out.println("t2의 채널은 : "+t2.channel);
		
		
		//t1의 채널을 7로 변경
		t1.channel=7;
		
		System.out.println("t1의 채널을 변경");
		
		//t1과 t2의 값을 출력
		System.out.println("t1의 채널은 : "+t1.channel);
		System.out.println("t2의 채널은 : "+t2.channel);
	
	}
}
