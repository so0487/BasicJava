package e_OOP;

public class MemberCall {
	
	int iv = 10;		//인스턴스변수는 10
	static int cv = 20;		//클래스 변수는 10
	
	
	static int cv2 = cv;
	
//	static int cv2 = iv;//인스턴스화가 되어야 불를 수 있다.
	int iv2=cv;
	//int iv2=iv;		//호출 가능
	
	
	static void method(){//클래스 메서드
		cv = 40;		//가능
//		iv = 40;		//인스턴스화 되어야 한다. (클래스 멤버가 인스턴스 변수를 호출할 때만 불가능)
	}

}
