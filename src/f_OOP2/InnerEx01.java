package f_OOP2;

public class InnerEx01 {
	public static void main(String[] args) {
		
	}
}


class Out{
	class InstanceInner{//인스턴스 클래스, 외부클래스의 인스턴스가 만들어질 때 사용할 수 있다.
		int iv = 30;
//		static int cv = 50;	-->외부클래스의 인스턴스관련한 역할을 수행 --> 클래스변수를 사용할 수 없다.(상수는 제외)
		static final int CON = 60;
	}
	
	static class StaticClass{//static class, 클래스 안에 클래스 영역을 또 가짐
		static int cv = 70;
		int iv = 100;		//자체적으로 인스턴스를 만들어 쓸 수 있기 때문에 가능
	}
	void method(){
		class LocalClass{//메서드가 메모리에 올라갈 때 클래스가 로드. 그 메서드가 사라지면 같이 사라짐//static : 호출이 되어야 사용할 수 있기 때문에 붙일 수 없다.
			
		}
	}
}