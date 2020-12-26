package a_basic;

/**
 * 변수의 타입을 공부하기 위한 클래스
 * 
 * @author PC16
 * @since 2020.04.13
 */
public class VariableType {
	public static void main(String[] args) {
		/*
		  변수의 타입
		  
		 1. 기본형타입(primitive type) - boolean, char, byte, short, int, long, float, double
		
		 2. 참조형타입(reference type)
		 
		 3. 기본형 타입의 종류
		 	- 논리형 : true,false 중 하나의 값을 가진다. ex) boolean
		 	- 문자형 : 문자하나를 저장하는데 사용된다. ex) char
		 	- 정수형 : 정수값을 저장하는데 사용된다. ex) byte, short, int(대표자료형), long
		 	- 실수형 : 실수값을 저장하는데 사용된다. ex) float, double(대표자료형)
		  
		 4. 기본형 타입의 크기 - 1byte(=8bit) : boolean, byte
		 	- 2byte : char, short -
		 	- 4byte : int, float - 8byte : long,double
		 	- 참조형은 일반적으로 4byte 크기로 저장
		 
		 5. 논리형 - boolean(기본값 : false)
		 	- boolean형 변수에는 true와 false 중 하나의 값을 저장할 수 있다.
		 	- boolean형 변수는 대답, 스위치 등의 논리구현에 주로 사용된다.
		 	- 데이터를 다루는 최소단위가 1byte임으로 1byte의 크기를 가진다.
		 */

			// 변수 power를 선언하고 false의 값으로 초기화 하여라.
			boolean power = false;

			// power의 값을 ture로 변경하여라.
			power = true; // 같은 변수타입+변수명(boolean power)은 쓸 수 없다.

		/*
		 6. 문자형 - char
		 	- 문자하나를 저장하는 데 사용한다.
		 	- java는 Unicode(16진수)문자 체계를 사용하기  때문에 2byte의 크기를 가진다.
		 	-'문'
		 */
			// 변수ch를 선언하고 원하는 문자 하나로 초기화 하세요.
			char ch = '\t'; // 반드시 한 개의 문자를 가져야 한다. \t:tab \n:enter

			// ch의 값을 A로 변경
			ch = 'A';

			char ch2 = '\u0041'; // \\u:unicode(16진수)
			System.out.println(ch2); // 출력값 A(A=65=\u0041)

			char ch3 = 65;

			System.out.println(ch3); // 출력값 A(A=65=\u0041)

		/*
		 7. 정수형 - byte, short, int(대표 자료형), long
		 	- 대표자료형은 int이다.
		 	- 변수의 저장하려는 정수값의 범위에 따라 4가지 정수형 중 하나를 선택한다.
		 */

			// 1. byte형 변수 b1에 30의 값을 저장해주세요.
			byte b1 = 30;
			// 2. short형 변수 s1에 40000을 저장해주세요.

			// short s1 = 40000; //short가 저장할 수 있는 최대값 보다 큰 숫자는 저장할 수 없다. --> short
			// s1 = 30000으로 변경
			short s1 = 30000;

			// 3. long형 변수 l1에 50억을 저장해주세요.
			// long l1 = 5000000000;
			// JVM은 int형을 기본으로 계산 --> int의 저장범위를 벗어나는 숫자는 오류가 발생 --> 숫자 뒤 "L"을 붙여준다.

			long l1 = 5000000000L;

		/*
		 8. 실수형 - float, double
		  - 실수형 값을 저장하는데 사용된다.
		  - 대표자료형은 double이다.
		  - float : 1+8+23(일반적으로 소수점 7자리 까지 표현)
		  - double : 1+11+52(일반적으로 소수점 15자리 까지 표현)
		  - 실수형 중 자료형을 선택할 때에는 값의 범위뿐만 아니라 정밀도도 중요한 요소가 된다.
		 */

			// 1. float형 변수 f1에 3.14159274894값을 저장하여라.
			// float f1 = 3.14159274894; 실수형의 대표자료형인 double로 인지 --> 숫자 뒤에 "F"를 붙여준다.
			float f1 = 3.14159274894F;

			System.out.println(f1); // 출력 값 : 3.1415927

			// 2. double형 변수 d1에 3.14159274894값을 저장하여라
			double d1 = 3.14159274894;

			System.out.println(d1); // 출력 값 : 3.14159274894

		/*
		 9. overflow - 변수 자신이 저장할 수 있는 최대값을 넘어 섰을 때 최소값으로 돌아가는 현상
		 */
			// 1. byte형 변수 b2에 126의 값을 저장해주세요.
			byte b2 = 126;
			b2++; // b2의 값이 127인 경우(저장할 수 있는 값이 최대값을 넘어설 경우) 최소값 부터 시작
			System.out.println(b2);

		/*
		 10. 캐스팅(casting) - 기본형 끼리는 형태 변환 가능
		 */
			byte b4 = 35;
			char c4 = '힣';
			short s4 = 56;
			int i4 = 500000;

			// 1. i4의 값을 short형 변수 s5에 저장해주세요.
			// short s5 = i4; --> //= (변경하고 싶은 타입)로 변경
			short s5 = (short) i4;
			System.out.println(s5);
			// 2. c4의 값을 int형 변수 i5에 저장해주세요.(문자가 가지고 있는 10진수 값을 취득)
			int i5 = c4; // char<int의 범위 --> 캐스트연산자 생략 가능
			// ※변수타입의 범위 크기 : byte<short<char일부<int<long<float<double
			System.out.println(i5);

			// 예제문제
			double aa = 3.14;
			int bb = (int) aa;

			System.out.println(bb); // 3만 출력이 된다

		/*
		 11. String
		  - 문자열을 다루기 위해 사용한다.
		  - " "을 사용
		  - " " 사이에 아무것도 없어도 된다. --> 참조형은 기본형이 NULL
		 */
			String name = "정수영";
			System.out.println(name); // "정수영" 출력

			String name2 = "";
			System.out.println(name2); // 공백출력

			String name3 = null;
			System.out.println(name3); // 공백출력

			String name4 = "dddddddddddd\naaaaaaaaa\t";
			System.out.println(name4);

			System.out.println(4 + 5); // 9출력

			char c6 = 'A';
			
			System.out.println(c6 + 3);
			// ('A'+3)형태를 맞추기 위해 char과 int 비교 --> int가 더 크므로 int값에 맞춰 계산

			System.out.println("4" + 3);
			// ("4"+3) : String + int -> String + String -> "4"+"3" = "43"으로 출력

			System.out.println(" " + 7); // String + String ->" 7"로 출력
			System.out.println(7 + " "); // String + String ->"7 "로 출력
			System.out.println(" " + true); // String + String ->" ture"로 출력

	}

}
