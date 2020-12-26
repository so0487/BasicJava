package e_OOP;

public class MyMathTest {
	public static void main(String[] args) {
		//1. MyMath의 클래스 add에서 호출
		MyMath mm = new MyMath();
		
		
		int add = mm.add(1,1);
		System.out.println(add);
		
		mm.add2();
		//add3	
		int result1 = mm.add3();
		System.out.println(result1);
		
		int result2 = mm.add4(1);
		System.out.println(result2);
		
		long result3 = mm.add5(1,1L);
		System.out.println(result3);
		
		long result4 = mm.add6(1L,1);
		System.out.println(result4);
		
		long result5 = mm.add7(1L, 1L);
		System.out.println(result5);
		
		float result6 = mm.add8(1, 1);
		System.out.println(result6);
	
	}
}

class MyMath {
	int a = 10;
	int b = 20;

	int add(int x, int y) {
		int result = x + y;
		return result;
	}

	// 1. 메서드명은 add2, 매개변수는 없음, 인스턴스변수 a와 b의 합을 출력하는 메서드
	void add2() {
		int result = a+b;
	}
	// 2. 메서드명은 add3, 매개변수는 없음, 인스턴스변수 a와 b의 합을 반환하는 메서드
	int add3(){
		int result = a+b;
		return result;
	}
	// 3. 메서드명은 add4, 매개변수는 int타입 1개, 인스턴스변수 a와b 그리고 매개변수의 합을 반환하는 메서드
	int add4(int x){
		int result = a+b+x;
		return result;
	}

	// 4. 메서드명은 add5, 매개변수는 int타입 1개, long타입1, 매개변수의 합을 반환하는 메서드
	long add5(int x, long y){
		long result = x+y;
		return result;
	}
	// 5. 메서드명은 add6, 매개변수는 long타입 1개, int타입 1 매개변수의 합을 반환하는 메서드
	long add6(long x, int y){
		long result = x+y;
		return result;
	}
	// 6. 메서드명은 add7, 매개변수는 long타입 2개, 매개변수의 합을 반환하는 메서드
	long add7(long x, long y){
		long result = x+y;
		return result;
	}
	// 7. 메서드명은 add8, 매개변수는 int타입 2개, 매개변수의 합을 반환하는 메서드 반환타입은 float
	float add8(int x, int y){
		float result = x+y;
		return result;
	}
}