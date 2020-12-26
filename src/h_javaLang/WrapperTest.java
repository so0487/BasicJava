package h_javaLang;

public class WrapperTest {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1);	//toString메서드가 오버라이드 --> 값출력
		System.out.println(i2);	//toString메서드가 오버라이드 --> 값출력
		
		System.out.println(i1);
		System.out.println(i1.equals(i2));	//equals메서드가 오버라이드
		
		
		//1.최대값
		System.out.println(Integer.MAX_VALUE);
		
		//2.최소값
		System.out.println(Integer.MIN_VALUE);
		
		//3.bit수
		System.out.println(Integer.SIZE);
		
		//4.byte
//		System.out.println(Integer.BYTES);		//1.7버전에서는 없다.......
		
		Integer i3 = 100;	//auto boxing	--> 자동으로 객체처럼 다룰 수 있다. new를 안 써도 된다.
		
		Integer[] iArr = new Integer[3];
		iArr[0]=10;					//auto boxing으로 값이 자동으로 저장  --> 캐스팅이 필요없다.
		
		
		method(10);
		
		int a = new Integer(40);	//auto-unboxing : 자동으로 언박싱을 해준다.
	}
	
	static void method(Object obj){
		System.out.println(obj);
	}

}
