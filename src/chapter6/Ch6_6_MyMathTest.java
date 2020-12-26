package chapter6;

public class Ch6_6_MyMathTest {
	public static void main(String[] args) {
		//MyMath클래스를 참조하는 mm을 선언하고 인스턴스 생성
		MyMath mm = new MyMath();
		
		//add메서드를 호출하고 인자값을 5,3으로 하여 result1에 저장
		long result1 = mm.add(5L,3L);
		
		//subtract메서드를 호출하고 인자값을 5,3으로 하여 result2에 저장
		long result2 = mm.subtract(5L, 3L);
		
		//multiply메서드를 호출하고 인자값을 5,3으로 하여 result3에 저장
		long result3 = mm.multipit(5L, 3L);
		
		//divide메서드를 호출하고 인자값을 5,3으로 하여 result4에 저장
		double result4 = mm.divide(5, 3);
		
		//result1~4를 출력
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
	}
}

class MyMath{
	//두 숫자의 합을 연산하는 add메서드 생성(long타입 2개, 반환타입 long)하고 갑을 result에 저장
	long add(long a, long b){
		long result = a+b;
		return result;
	}
	
	//두 숫자의 뺄셈을 연산하는 subtract메서드를 생성(long타입 2개, 반환타입 long)하고 값을 result에 저장
	long subtract(long a, long b){
		long result = a-b;
		return result;
	}
	
	//두 숫자의 곱셈을 연산하는 multiply메서드 생성(long타입 2개, 반환타입 long)하고 값을 result에 저장
	long multipit(long a, long b){
		long result = a*b;
		return result;
	}
	
	//두 숫자의 나눗셈을 연산하는  divide메서드를 생성(double타입 2개, double로 반환)하고 값을 result에 저장
	double divide(double a, double b){
		double result = a/b;
		return result;
	}
}