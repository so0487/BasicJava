//package e_OOP;
//
//import java.util.Scanner;
//
//public class CalcTest {
//	public static void main(String[] args) {
//		//5.
//		//5-1. 사용자로 부터 정수 하나를 입력받으세요.
//		//int result[]=new;
//		while(true){
//		System.out.println("첫번째 값을 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		//5-2. 사용자로 부터 사칙연산을 입력받으세요.
//		System.out.println("연산자를 입력하세요");
//		String op = sc.next();
//		//5-3. 사용자로 부터 정수하나를 입력받으세요.
//		System.out.println("두번째 값을 입력하세요");
//		int num2 = sc.nextInt();
//		//5-4. 사용자로 부터 받은 사칙연산에 따라 호출되는 메서드를 달리하여 해당 결과를 출력해주세요.
//		//		단, 사용자가 사칙연산이 아닌 다른 문자를 입력하게 되면 프로그램을 종료해주세요.
//		Calc cc = new Calc();
//		int addResult = cc.add(num1,num2);
//		int subResult = cc.subtract(num1,num2);
//		long mulResult = cc.multiply(num1,num2);
//		float divResult = cc.divide(num1,num2);
//		
//			if(op.equals("+")){
//				System.out.println(addResult);
//			}else if(op.equals("-")){
//				System.out.println(subResult);
//			}else if(op.equals("*")){
//				System.out.println(mulResult);
//			}else if(op.equals("/")){
//				System.out.println(divResult);
//			}else{
//				break;
//			}
//		}
//		System.out.println("잘못입력하였습니다");
//
//	}
//}
//
//
//class Calc{//계산기의 기능
//	//1. 메서드명 add, int타입 2개를 받아 매개변수의 합을 반환하는 메서드
//	int add(int x, int y){
//		int result = x+y;
//		return result;
//	}
//	//2. 메서드명 subtract, int타입 2개를 받아 앞의 값에서 뒤의 값을 뺀 결과를 반환하는 메서드
//	int subtract(int x, int y){
//		int result = x-y;
//		return result;
//	}
//	//3. 메서드명 multiply, int타입 2개를 받아 두개의 곱을 반환하는 메서드
//	//		단,overflow를 고려하여 만들어주세요
//	long multiply(int x, int y){
//		long result = (long)x*(long)y;
//		return result;
//	}
//	//4. 메서드명 divide, int타입 2개를 받아서 앞의 값을 뒤의 값으로 나눈 결과를 반환하는 메서드
//	//		단, 소수점 세번째 자리에서 반올림하여 두번째 자리까지 표현해주세요.
//	float divide(int x, int y){
//		float result = (int)((float)x/(float)y*100f+0.5)/100f;
//		return result;
//	}
//}


















//////////////////////////////////////////////////////
/////////////////////////////////////////////////////

package e_OOP;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		//5.
		//5-1. 사용자로 부터 정수 하나를 입력받으세요.
		
			System.out.println("첫번째 값을 입력하세요");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			
			while(true){
			//5-2. 사용자로 부터 사칙연산을 입력받으세요.
			System.out.println("연산자를 입력하세요");
			String op = sc.next();
			//5-3. 사용자로 부터 정수하나를 입력받으세요.
			System.out.println("두번째 값을 입력하세요");
			int num2 = sc.nextInt();
			//5-4. 사용자로 부터 받은 사칙연산에 따라 호출되는 메서드를 달리하여 해당 결과를 출력해주세요.
			//		단, 사용자가 사칙연산이 아닌 다른 문자를 입력하게 되면 프로그램을 종료해주세요.
			Calc cc = new Calc();
			int addResult = cc.add(num1,num2);
			int subResult = cc.subtract(num1,num2);
			long mulResult = cc.multiply(num1,num2);
			float divResult = cc.divide(num1,num2);
			
			if(op.equals("+")){
				System.out.println(num1+op+num2);	
				System.out.println(addResult);
				num1=addResult;
			}else if(op.equals("-")){
				System.out.println(num1+op+num2);
				System.out.println(subResult);
				num1=subResult;
			}else if(op.equals("*")){
				System.out.println(num1+op+num2);
				System.out.println(mulResult);
				num1 = (int)mulResult;
			}else if(op.equals("/")){
				System.out.println(num1+op+num2);
				System.out.println(divResult);
				num1 = (int)divResult;
			}else{
				break;
			}
	
		}
	System.out.println("잘못입력하였습니다");
		
	
	}
}


class Calc{//계산기의 기능
	//1. 메서드명 add, int타입 2개를 받아 매개변수의 합을 반환하는 메서드
	int add(int x, int y){
		int result = x+y;
		return result;
	}
	//2. 메서드명 subtract, int타입 2개를 받아 앞의 값에서 뒤의 값을 뺀 결과를 반환하는 메서드
	int subtract(int x, int y){
		int result = x-y;
		return result;
	}
	//3. 메서드명 multiply, int타입 2개를 받아 두개의 곱을 반환하는 메서드
	//		단,overflow를 고려하여 만들어주세요
	long multiply(int x, int y){
		long result = (long)x*(long)y;
		return result;
	}
	//4. 메서드명 divide, int타입 2개를 받아서 앞의 값을 뒤의 값으로 나눈 결과를 반환하는 메서드
	//		단, 소수점 세번째 자리에서 반올림하여 두번째 자리까지 표현해주세요.
	float divide(int x, int y){
		float result = (int)((float)x/(float)y*100f+0.5)/100f;
		return result;
	}
}