package e_OOP;

public class PrintCall {
	int a1 = 3;
	int a2 = 5;
	
	long a3 = 6L;
	long a4 = 8L;


	//1. 메서드명 add, 매개변수 없음. a1과 a2의 합을 반환하는 메서드
	
	int add(){
		int result = a1+a2;
		return result;
	}
	//2. 메서드명 add, 매개변수 int 1, a1,a3와 매개변수의 합을 반환하는 메서드
	
	long add(int x){
		long result = a1+a3+x;
		return result;
	}

	//3. 메서드명 add, 매개변수 int 1, a3,a4와 매개변수의 합을 반환하는 메서드
	
//	long add(int x){//2번 예제와 비교하여 add일 경우 메서드명, 매개변수의 갯수와 타입 모두 같으므로 사용할 수 없다.
//		long result = a3+a4+x;
//		return result;
//	}
	//4. 클래스 메서드명 add, 매개변수 int 2, 매개변수의 합을 반환하는 메서드
	
	static int add(int x, int y){
		int result = x+y;
		return result;
	}

	//5. 메서드명 add, 매개변수 int 1와 long 1, 매개변수의 합을 반환하는 메서드
	long add(int x, long y){
		long result = x+y;
		return result;
	}

	//6. 클래스 메서드명 add, 매개변수 long 1와 int 1, 매개변수의 합을 반환하는 메서드
	static long add(long x, int y){
		long result = x+y;
		return result;
	}

	//7. 메서드명 add, 매개변수 long 1, a3,a4,매개변수의 합을 반환하는 메서드
	long add(long x, long y){
		long result = a3+a4+x+y;
		return result;
	}

	//8. 클래스 메서드명 add, 매개변수 int 2, 매개변수의 합을 반환하는 메서드, 반환타입 float
//	static float add(int x, int y){//4번의 예제와 비교하였을 때 메서드의 이름, 매개변수의 타입과 갯수 모두 동일--> 오류 발생
//		float result = x+y;
//		return result;
//	}

	
}
