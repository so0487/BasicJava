package e_OOP;

public class TvTest {
	public static void main(String[] args) {
				
		System.out.println(Tv.model); // null 출력 : String 기본 값이 null

		Tv.model = "SamsungTv";
		System.out.println(Tv.model); // tv명 변경

		Tv.changeModel();
		System.out.println(Tv.model); // 다시 SIGNITURE로 변경

		Tv t = new Tv(); // 인스턴스화
							// Tv클래스의 인스턴스 주소를 tv타입의 참조변수 t에 저장

		t.channel = 10; // 채널을 10번으로 변경
		System.out.println(t.channel);

		t.channelUp(); // channelUp메서드 호출 --> 채널을 1 증가
		System.out.println(t.channel);

		System.out.println(t.power); // t.power값 출력 --> 논리형의 기본 값은 false
		t.power(); // power상태를 변경하는 power()메서드 호출 --> !power 실행
		System.out.println(t.power);
	}

}

class Tv {
//	Tv(){//TV클래스 안에 생성자가 없을 때 컴파일러가 자동으로 생성하는 기본 생성자
		
//	}
	static String model;// 클래스 변수(static이 붙는다.) --> 인스턴스 변수는 static이 붙지 않는다.
	int channel;
	boolean power;

	static void changeModel() {// 클래스 메서드 --> static이 붙는다.
		model = "SIGNITURE";
	}

	void channelUp() {
		channel++;
	}

	void power() {
		power = !power;
	}
}