package b_operation;

public class Operation_02 {
	public static void main(String[] args) {
		/*
		 1. 증감연산자(++,--)
		 	- 증가연산자(++) : 피연산자의 값을 1 증가시킨다.
		 	- 감소연산자(--) : 피연산자의 값을 1 감소시킨다.
		 */

		// 변수 i1에 10의 값을 저장해주세요
		int i1 = 10;
		i1++; // i1 = 11출력
		System.out.println(i1);
		++i1; // i1 = 12출력

		// 변수 i1에 저장된 값을 출력해주세요.
		System.out.println(i1);

		int i2 = 15;
		int i3 = ++i2 + 7; // ++i2의 값 : 16 + 7 = 23
		int i3_1 = i2++ + 7; // i2++의 값 : 16(위에서 ++i2=16) --> (16)+7 = 23 출력

		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i3_1);

		int i4 = 24;
		int i5 = 33;
		int result = i4++ + 3 + ++i5 + ++i4;
		//연산자 우선 순위에 따라 +3이 우선 시행
		//i4++ = 24 --> 24가 출력 후 +1 값을 저장
		//++i5 = 33+1 = 34
		//++i4 = i4의 값에서 +1을 저장한 후 출력 --> 기존 24+1+1 = 26이 출력
		//정답 : 87출력


		System.out.println(result);

		char c1 = 'A';
		c1++; // c1+1;
		System.out.println(c1); // B출력 --> 단항계산에서는 자료형이 유지

		/*
		 2. 부호연산자(+,-)
		  - 기본 자료형 중 boodlean형과 char형에는 사용할 수 없다.
		 */

		// 1. -10의 값을 i6에 저장해주세요.
		int i6 = -10;

		// 2. i6에 -부호를 붙여서 그 결과를 i6에 저장해주세요.
		i6 = -i6;

		System.out.println(i6); // 10출력

		/*
		 3. 비트전환 연산자(~)
		  - 정수형과 char형에만 사용할 수 있다.
		  - 피연산자를 2진수로 표현하였을 때 1은 0으로 0은 1로 바꾼다.
		 */

		/*
		 
		 10 0 0 0 0 1 0 1 0 ~10 1 1 1 1 0 1 0 1 => -11(1의 보수) --> 10진수의 숫자 a의
		 1의 보수는 -a-1 ~10+1 1 1 1 1 0 1 1 0 => -10(2의 보수) --> 10진수의 숫자 a의 2의 보수는 -a
		 */

		byte b1 = 10;
		// byte b2 = (byte)~b1; //int를 기본 --> byte로 변환
		int b2 = ~b1;

		System.out.println(b2); // -11출력

		/*
		 4. 논리부정 연산자(!)
		  - boolean형에만 사용 가능하다.
		  - !true -> false, !false -> true
		  - TV의 전원버튼과 같은 논리구현에 사용된다.
		 */
		
		// 1. boolean형 변수 power를 선언하고 false의 값으로 초기화 하여라.
		boolean power = false;

		// 2. power를 부정하여 다시 power에 저장.
		power = !power;

		System.out.println(power);

		/*
		 5. 산술연산자(+,-,*,/,%,<<,>>,>>>)
		  - 사칙연산자(+,-,*,/), 나머지 연산자(%), 쉬프트연산자(<<,>>,>>>) : 이항연산자
		 */

		/*
		 6. 사칙연산자(+,-,*,/)
		  - 두 개의 피연산자 중 자료형의 범위가 큰 쪽에 맞춰서 형변환 후 연산을 진행한다.
		  	(int + float -> float + float -> float)
		  - 두 개의 피연산자 모두 4byte보다 작은경우에는 둘 다 4byte인 int형으로 형변환 후 연산을 수행한다. : char + byte -> int + int -> int
		 */
		// 1. aa와 bb의 합을 변수cc에 저장해주세요.
		byte aa = 1;
		short bb = 234;
		int cc = (int) aa + bb;

		// 2. aa와 dd의 합을 byte형 변수 ee에 저장해주세요.
		byte dd = 54;
		byte ee = (byte) ((byte) aa + dd);

		/*
		 7. 나머지 연산자(%)
		  - 왼쪽의 피연산자를 오른쪽의 피연산자로 나누고 난 나머지 값을 돌려준다.
		  - boolean형을 제외한 모든 기본자료형에 사용할 수 있다.
		 */
		int one = 10;
		int two = 8;
		int share = one / two; // 몫 --> 2.5가 아닌 int형태이므로 정수값만 가진다. --> 2만 출력
		int remain = one % two; // 10을 4로 나눈 몫은 2, 나머지는 2이다.
		System.out.println(share);
		System.out.println(remain);

		// 10을 8로 나눈 몫은 1, 나머지는 2이다. 출력
		System.out.println(one + "을 " + two + "로 나눈 몫은" + share + "이고 나머지는 "
				+ remain + "이다.");

		/*
		 8. 쉬프트 연산자(<<,>>,>>>)
		  - 정수형에만 사용이 가능하다.
		  - 피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다.
		  
		 10 0 0 0 0 1 0 1 0 10<<3 0 1 0 1 0 0 0 0(왼쪽으로 3칸 이동) = 80 = 10*2^3
		 10>>3 0 0 0 0 0 0 0 1(오른쪽으로 3칸 이동) = 1 = 10/2^3 10<<11 : 오버플로우 발생
							--> 계속 돈다(8바퀴+3바퀴) = 3바퀴 이동한 것과 같다(byte타입 기준)
		 */
		byte b8 = 10;
		int result1 = b8 << 33; // 20 출력
		long result1_1 = (long) b8 << 33; // long타입으로 변환되어 큰 값 출력

		System.out.println(result1);
		System.out.println(result1_1);

		System.out.println(10 / 8); // int 출력
		System.out.println((float) 10 / 8); // float 출력(소수점 까지 출력)

		/*
		 9. 비교연산자
		  - 두 개의 변수 또는 리터럴을 비교하는데 사용되는 연산자.
		  - 주로 조건문과 반복문의 조건식에 사용되며 연산결과가 true 또는 false이다.
		 */

		/*
		 10. 대소비교연산자(<,>,<=,>=)
		  - boolean을 제외한 모든 기본자료형에 사용할 수 있다.
		 */

		/*
		 11. 등가비교연산자(==,!=)
		  - 모든 자료형에 사용이 가능하다.
		  - 수식 연산결과
		  	x<y | x가 y보다 작을 때만 true, 그 외에는 false
		  	x>y | x가 y보다 클 때만 true, 그 외에는 false
		  	x<=y | x가 y보다 작거나 같을 때만 true, 그 외에는 false
		  	x>=y | x가 y보다 크거나 같을 때만 true, 그 외에는 false
		  	x==y | x와 y가 같을 때만 true, 그 외에는 false
		  	x!=y | x와 y가 다를 때만 true, 그 외에는 false
		 */
		System.out.println("5<10의 결과 : " + (5 < 10));
		System.out.println('0' == 0); // 문자형 '0'의 값 == 0
		System.out.println(0.5f == 0.5); // true
		System.out.println(0.1f == 0.1); // false
										// float + double
										// float(0.1) + double(0.1에 근접한 값)
										// 2^n일 떄 float == double이 같을 수 있다.

		/*
		 12. 비트연산자(&, |, ^)
		  - 이진 비트연산을 수행한다.
		  - float과 double을 제외한 기본형에 사용이 가능하다.
		  
		  &(AND연산자)
		  - 피연산자 양쪽 모두 1이면 1의 결과를 얻는다.
		  |(OR연산자) - 피연산자 중 한쪽만 1이면 1의 결과를 얻는다.
		  ^(XOR연산자) - 피연산자의 값이 서로 다를 때만 1의 결과를 얻는다.
		  
		  예)	3 - 0 0 0 0 0 0 1 1
		   	5 - 0 0 0 0 0 1 0 1
		  AND - 0 0 0 0 0 0 0 1
		   OR - 0 0 0 0 0 1 1 1
		  XOR - 0 0 0 0 0 1 1 0
		 */

		byte b9 = 3;
		byte b10 = 5;

		System.out.println("b9&b10 :" + (b9 & b10));
		System.out.println("b9|b10 :" + (b9 | b10));
		System.out.println("b9^b10 :" + (b9 ^ b10));

		/*
		 13. 논리연산자(&&, ||)
		  - 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만 허용한다.
		  - 조건문과 반복문에서 조건식의 결합에 사용된다. 5<=x&&x<15 --> 5<=x<15(true+true=true)
		  - '&&'연산이 '||'연산보다 연산우선순위가 높다.
		
		 	&&(AND결합) : 피연산자 양쪽 모두 true일때만 true의 결과를 얻는다.
		 	||(OR결합) : 피연산자 중 어느 한쪽이 true이면 true의 결과를 얻는다.
		 */

		// 1. 변수 ch4를 선언하고 원하는 문자로 초기화 하여라.
		char ch4 = '2';
		// 2. ch4에 저장된 문자가 영어 대문자일때 true를 출력하도록 만들어주세요.
		/*
		 	1) 영어대문자 'A'~'Z' : 'A'<=ch4<='Z'
		 	2) and 연산을 이용 'A'<=ch4&&ch4<='Z'
		 */
			System.out.println("ch의 값은 : " + ch4);
			System.out.println("ch가 영어 대문자인지 판단 : " + ('A' <= ch4 && ch4 <= 'Z'));

		// 3. ch4에 저장된 문자가 영어 소문자일 때 true를 출력하도록 만들어 주세요.
		/*
		 	1 영어 소문자 'a'~'b' 2. and연산 이용 'a'<=ch4&&ch4<='z'
		 */
			System.out.println("ch가 영어 소문자인지 판단 : " + ('a' <= ch4 && ch4 <= 'z'));
		// 4. ch4에 저장된 문자가 영문자일 때 true를 출력하도록 만들어주세요.
			System.out.println("ch가 영문자인지 판단 : "
				+ ('A' <= ch4 && ch4 <= 'Z' || 'a' <= ch4 && ch4 <= 'z')); 
			// 대문자인 경우 OR 소문자인 경우

		// 5. ch4에 저장된 문자가 숫자형이면 true를 출력하도록 만들어주세요.
		//(ch로 저장될 수 있는 숫자의 범위 : 0~9)

			System.out.println("ch가 숫자인지 판단 : " + ('0' <= ch4 && ch4 <= '9'));

		// 6. ch4가 영문자 또는 숫자인 경우 true 출력
			System.out.println("ch가 영문자 또는 숫자인지 판단 : "+ ('A' <= ch4 && ch4 <= 'Z'
								|| 'a' <= ch4 && ch4 <= 'z'
								|| '0' <= ch4&& ch4 <= '9'));

		/*
		 14. 삼항연산자
		 	-  세 개의 피연산자를 필요로 하기 때무에 삼항연산자로 이름 지어 졌다.
		 	- 삼항연산자는 조건식의 연산결과가 true, false인 식이 사용 되어야 한다.
		 	- 기본구조 (조건식) ? 식1 : 식2
		 */
		// 1. 변수 x를 선언하고 -10으로 초기화 하여라.
		int x = -10;

		int result2 = x > 0 ? x : -x;

		System.out.println("x의 값은 : " + result2); // 절대값을 구하는 프로그램

		// 2. 변수 result3를 선언하고 x의 값이 짝수이면 "짝수", 홀수이면 "홀수"로 초기화 하여라
		int x2 = 5;

		String result3 = (x2 % 2 == 0 ? "짝수" : "홀수");

		System.out.println("입력된 x의 값은 : " + x2);
		System.out.println("x는 " + result3);

		/*
		 15. 대입연산자(=, op=)
		 	- 변수에 값 또는 수식의 연산결과를 저장하는데 사용한다.
		 	- 연산 우선순위가 가장 낮다.
		 */
		int i = 0;
		// i = i+10;
		i = +10; // i=i+10을 함축하여 사용할 수 있다. --> 자기자신의 타입을 항상 유지(캐스팅을 할 필요가 없다.)
		System.out.println("입력된 i의 값은 : " + i);

		/*
		 반올림
		 */
		float pi = 3.141592F;
		// 소수점 4자리에서 반올림하여 세번째 자리에서 표현하여라.
		// pi*1000 = 3141.592
		// +0.5 = 3142.092
		// (int) = 3142
		// /1000f = 3.142

		float result5 = (int) (pi * 1000 + 0.5) / 1000f;

		System.out.println(result5);

		// 1. 변수 rou를 선언하고 586.8459로 초기화 하여라.
		float rou = 586.8459F;
		// 2. rou의 값을 소수점 세번째 자리에서 반올림하여 소숫점 두번째 자리까지 표현하여라.
		float result6 = (int) (rou * 100 + 0.5) / 100f;

		System.out.println(result6);

		/*
		 Math.random() 함수를 통해 double 타입의 숫자 중 하나를 선택 하여 나타낸다.
		 */
		// 주사위 함수
		int dice = (int) (Math.random() * 6 + 1);

		System.out.println(dice);

		// 37이상 45이하의 값 중 임의의 정수값을 변수 result7에 저장해주세요.
		int result7 = (int) (Math.random() * 9 + 37);
		System.out.println(result7);

		// lotto

		int lotto = (int) (Math.random() * 45 + 1);

		System.out.println(lotto);

	}

}
