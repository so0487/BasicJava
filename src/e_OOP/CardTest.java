package e_OOP;

public class CardTest {
	public static void main(String[] args) {
		// 1. Card 클래스의 너비를 출력하여라.
		System.out.println(Card.width);
		// 너비 = 250

		// 2. Card 클래스의 높이를 출력하여라.
		System.out.println(Card.height);
		// 높이 = 100

		// 3. Card1의 객체를 만드시오(cd1)
		Card cd1 = new Card();

		// 4. cd1의 종류를 SPADE로 변경해주세요.
		cd1.kind = "SPADE";

		// 5. cd1의 숫자를 7로 변경해주세요.
		cd1.number = 7;

		// 6. Card2의 객체를 만드시오(cd2)
		Card cd2 = new Card();

		// 7. Card2의 종류를 HEART로 변경해주세요
		cd2.kind = "HEART";

		// 8. cd2의 숫자를 3으로 변경해주세요
		cd2.number = 3;

		// 9. 아래와 같이 출력
		// cd1의 모양 : XXX, 숫자 : XXX, 너비 : XXX, 높이 : XXX
		System.out.print("cd1의 모양 : " + cd1.kind + ", 숫자 : " + cd1.number
				+ ", 너비 : " + cd1.width + ", 높이 : " + cd1.height);
		// (출력예상 : 모양-SPADE 숫자-7 너비-250 높이-100)
		// cd2의 모양 : XXX, 숫자 : XXX, 너비 : XXX, 높이 : XXX
		System.out.println();
		System.out.print("cd2의 모양 : " + cd2.kind + ", 숫자 : " + cd2.number
				+ ", 너비 : " + cd2.width + ", 높이 : " + cd2.height);
		// (출력예상 : 모양-HEART 숫자-3 너비-250 높이-100)

		// 10. cd1의 너비를 70으로 변경해주세요.
		cd1.width = 70;

		// 11. cd1의 높이를 90으로 변경해주세요.
		cd1.height = 90;

		// 12. 아래와 같이 출력
		// cd1의 모양 : XXX, 숫자 : XXX, 너비 : XXX, 높이 : XXX
		System.out.println();
		System.out.print("cd1의 모양 : " + cd1.kind + ", 숫자 : " + cd1.number
				+ ", 너비 : " + cd1.width + ", 높이 : " + cd1.height);
		// (출력예상 : 모양-SPADE 숫자-7 너비-70 높이-90)
		// cd1의 모양 : XXX, 숫자 : XXX, 너비 : XXX, 높이 : XXX
		System.out.println();
		System.out.print("cd2의 모양 : " + cd2.kind + ", 숫자 : " + cd2.number
				+ ", 너비 : " + cd2.width + ", 높이 : " + cd2.height);
		// (출력예상 : 모양-HEART 숫자-3 너비-70 높이-90) : Card인스턴스인 c1과 c2는 클래스변수인 width와
		// height를 공유 --> c1의 값이 변경되면 c2도 변경
	}
}

class Card {
	static int width = 250; // 너비 //전역변수(멤버변수)&클래스 변수
	static int height = 100;// 높이

	String kind; // 종류 //인스턴스변수
	int number; // 숫자 //인스턴스 변수

	void method() {
		int v = 3; // v는 method()의 지역변수
	}
}
