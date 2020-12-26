package chapter6;
class MyMath2{
	//long 타입 변수 a,b선언
	long a;
	long b;
	
	//두 수의 덧셈을 수행하는 add 메서드 생성(매개변수 없음,long으로 반환)
	long add(){
		return a+b;
	}
	
	//두 수의 뺄셈을 수행하는 subtract메서드 생성(매개변수 없음, long으로 반환)
	long subtract(){
		return a-b;
	}
	
	//두 수의 곱셈을 수행하는 multiply메서드 생성(매개변수 없음, long으로 반환)
	long multiply(){
		return a*b;
	}
	
	//두 수의 나눗셈을 수행하는 divide메서드 생성(매개변수 없음, double로 반환)
	double divide(){
		return a/b;
	}
	
	//두 숫자의 합을 구하는 클래스메서드 add를 생성(매개변수 : long2개, long으로 반환)
	static long add(long a, long b){
		return a+b;
	}
	
	//두 숫자의 뺄셈을 구하는 클래스메서드 substract 생성(매개변수 : long2개, long으로 반환)
	static long subtract(long a, long b){
		return a-b;
	}
	
	//두 숫자의 곱셈을 구하는 클래스메서드 multipiy를 생성(매개변수 : long2개, long으로 반환)
	static long multiply(long a, long b){
		return a*b;
	}
	
	//두 숫자의 나눗셈을 구하는 클래스메서드 divide를 생성(매개변수 : double2개, double로 반환)
	static double divide(double a, double b){
		return a/b;
	}
}

public class Ch6_19_MyMathTest2 {
	public static void main(String[] args) {
		//add~divide까지 클래스메서드를 호출한 후 출력(인스턴스 생성 없이)
		//인자값은 200, 100
		
		System.out.println("add : "+MyMath2.add(200,100));
		System.out.println("subtract : "+MyMath2.subtract(200, 100));
		System.out.println("multiply : "+MyMath2.multiply(200,100));
		System.out.println("divide : "+MyMath2.divide(200,100));
		
		//MyMath2 클래스를 참조하는 변수 mm을 선언하고 인스턴스 생성
		MyMath2 mm = new MyMath2();
		
		//mm의 a값은 200, b값은 100
		mm.a=200;
		mm.b=100;
		
		//add~divide까지 인스턴스 메서드 호출
		System.out.println("add : "+mm.add());
		System.out.println("subtract : "+mm.subtract());
		System.out.println("multiply : "+mm.multiply());
		System.out.println("divide : "+mm.divide());
	}

}
