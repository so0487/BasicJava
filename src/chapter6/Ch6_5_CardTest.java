package chapter6;
class Card{
	//Card클래스에 width,height, kind, number를 변수명으로 하여 선언
	//단, width,height는 클래스 변수이며 각각 100,250의 값을 갖는다.
	
	static int width = 100;
	static int height = 250;
	
	String kind = " ";
	int number = 0;
}
public class Ch6_5_CardTest {
	public static void main(String[] args) {
		//Card의 너비와 높이를 출력하여라
		System.out.println("width : "+Card.width);//클래스 변수는 객체생성 없이 클래스명.클래스변수로 직접 사용이 가능
		System.out.println("height : "+Card.height);
		
		//Card클래스를 참조하는 변수c1을 선언하고 종류는 Heart, 숫자는 7로 변경
		Card c1 = new Card();
		c1.kind = "HEART";
		c1.number = 7;
		
		//Card클래스를 참조하는 변수c2를 선언하고 종류는 SPADE, 숫자는 4로 변경
		Card c2 = new Card();
		c2.kind = "SPADE";
		c2.number = 4;
		
		//c1과 c2의 종류, 숫자, (너비, 높이)를 각각 출력
		System.out.print("c1의 종류 : "+c1.kind);
		System.out.print(" c1의 숫자 : "+c1.number);
		System.out.print(" c1의 너비 : "+c1.width);
		System.out.println(" c1의 높이 : "+c1.height);
		
		System.out.print("c2의 종류 : "+c2.kind);
		System.out.print(" c2의 숫자 : "+c2.number);
		System.out.print(" c2의 너비 : "+c2.width);
		System.out.println(" c2의 높이 : "+c2.height);
		
		//c1의 너비를 50, 높이를 80으로 변경
		c1.width = 50;
		c1.height = 80;
		
		//c1과 c2의 종류, 숫자, (너비, 높이)를 각각 출력
		System.out.print("c1의 종류 : "+c1.kind);
		System.out.print(" c1의 숫자 : "+c1.number);
		System.out.print(" c1의 너비 : "+c1.width);
		System.out.println(" c1의 높이 : "+c1.height);
		
		System.out.print("c2의 종류 : "+c2.kind);
		System.out.print(" c2의 숫자 : "+c2.number);
		System.out.print(" c2의 너비 : "+c2.width);
		System.out.println(" c2의 높이 : "+c2.height);
	}
}
