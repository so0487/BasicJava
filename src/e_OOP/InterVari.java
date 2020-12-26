package e_OOP;

class Data{
	int x;
}

public class InterVari {
	public static void main(String[] args) {
		//1. Data클래스의 객체를 만들어 주세요(d1)
		Data d1 = new Data();
		//2. d1의 x값을 10으로 변경해주세요.
		d1.x=10;
		//3. d1의 x값을 출력해주세요.			//연산결과 10
		System.out.println(d1.x); 
		//4. change메서드를 호출해주세요.(단 인자값 : d1의 x값-------> int 값)
		InterVari.change(d1.x);			// 연산결과 : change 기본 : 1000
		
		change(d1.x);					//같은 클래스 내에 있는 메서드를 호출할 때에는 생략할 수 있다 
										//매개변수의 이름, 갯수, 타입으로 메서드구분 --> 모두 같아야 하나의 메서드로 인지
		//5. d1의 x값을 출력해주세요
		System.out.println(d1.x);		//연산결과 : 10
		//6. Data클래스의 객체를 만들어주세요(d2)
		Data d2 = new Data();
		//7. d2의 x값을 10으로 변경해주세요
		d2.x=10;								
		//8. d2의 x값을 출력해주세요
		System.out.println(d2.x);		//연산결과 : 10	
		//9. change메서드를 호출해주세요(단 인자값 : d2 ------> 객체의 주소)
		InterVari.change(d2);			//change 참조형 : 1000
		//10. d2의 x값을 출력해주세요
		System.out.println(d2.x);		//연산결과 : 1000
	}
	
	
	static void change(int x){
		x=1000;
		System.out.println("change 기본형 : "+x);
	}
	
	static void change(Data d1){
		d1.x=1000;
		System.out.println("change 참조형 : "+d1.x);
	}
}