package z_exam;
//JVM 순서대로 진행하면서 순서를 적는다
public class TotalTest {//TotalTest클래스가 호출되어 메서드 영역에 로드되고, 클래스변수는 없고 클래스 메서드는 main메서드가 같이 업로드 된다.
	public static void main(String[] args) {

		TvMaker.color = "Blue"; //TvMaker라는 클래스가 있는지 여부 판단 --> TvMaker를 메서드 영역에 올린 후 클래스변수와 클래스 메서드를 함께 찾아 올린다.(TvMaker클래스에는 클래스 변수만 존재) --> TvMaker의 클래스 변수인 color를 Blue로 변경해준다.
		TvMaker tm = new TvMaker();//대입연산자의 경우 왼쪽 부터 수행 --> TvMaker클래스가 이미 있으며, main의 지역변수 tm이 callstack에 로드된다. 이후 인스턴스화 과정을 통해 인스턴스를 생성하며 그 주소를 Heap영역에 저장한다.
		tm.age = 30; //tm의 주소에서 인스턴스 변수인 age를 30으로 변경
		// 3. 메서드 호출
		// 3.1
		System.out.println(TvControll.channel);	//TvControll이라는 클래스가 있는지 판단.--> TvControll를 메서드 영역에 올린 후 클래스 변수와 클래스 메서드를 같이 올려준다.--> 클래스 변수 MAX_CHANNEL과 MIN_CHANNEL, channel, 클래스 메서드VloumeDown()가 올라간다 --> 클래스 변수 channel값 출력
		TvControll.volumeDown();				//TvControll이라는 클래스의 VolumeDown 메서드를 참조 
		System.out.println(TvControll.channel);	//TvControll의 channel값을 출력

		// 3.2
		TvControll tc; //TvControll을 참조하는 지역변수 tc를 생성
		tc = new TvControll(); //인스턴스화 진행을 통해 tc라는 지역변수를 Heap영역에 올려준다.
		System.out.println(tc.volume);//tc를 참조하여 볼륨값 99출력
		tc.volumeUp();				//volumeUp메서드 수행
		System.out.println(tc.volume);//volume 값 출력(이전 볼륨 값이 99, 최대 볼륨값이 100이므로 볼륨값 +1이 가능하므로 100출력)
		tc.volumeUp();				//volumeUp메서드 수행
		System.out.println(tc.volume);//최대 볼륨값이 100, 현재 볼륨값이 100 --->최소 볼륨인 0 출력

		//
		Calc cc = new Calc();		//Calc라는 클래스가 메서드 영역에 로드 --> 클래스변수와 클래스 메서드 또한 함께 올라간다.-->Calc클래스의 참조변수cc가 인스턴스화를 통해 인스턴스로 생성되며, 이를 Heap영역에 올려준다. 
		System.out.println(cc.add(Integer.MAX_VALUE, 4));	// Calc클래스의()값에 최대볼륨값 100과 4를 넣어 계산한 값을 출력한다.
		System.out.println(cc.add(3L, Integer.MAX_VALUE));//Calc의 add()의 각 값에 3과 최대볼륨값 100의 계산 값을 출력한다.

	}
}

class TvMaker {//TvMaker라는 클래스가 메소드 영역에 올라간다.
	// 1.
	// 1.1
	static String color;	//TvMaker 클래스 안에 클래스 변수인 color과 inch또한 메서드 영역에 같이 올라간다.
	static int inch;
	// 1.2
	String name = "";		//인스턴스 변수 name를 선언해주고 초기값은 ""이다.
	int age;				//인스턴스 변수 age를 선언

	// 2.
	// 2.1
	TvMaker() {
		this("man", 25);	//TvMaker메서드 내에서 이미 생성된 man의 변수를 25로 설정
	}

	// 2.2
	TvMaker(String name, int age) {		//TvMaker메서드 내의 값을 호출
		this.name = name;
		this.age = age;
	}
}

class TvControll {
	final int MAX_VOLUME = 100;		//TvConroll의 인스턴스 변수 MAX_VOLUME의 값을 선언하고 100으로 값을 초기화
	final int MIN_VOLUME = 0;		//TvConroll의 인스턴스 변수 MIN_VOLUME의 값을 선언하고 0으로 값을 초기화
	static final int MAX_CHANNEL = 50;	//
	static final int MIN_CHANNEL = 1;

	static int channel = 15;
	int volume = 99;

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;
	}
}

class Calc {
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}