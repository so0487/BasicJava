package z_exam;

public class Exam02 {
	public static void main(String[]args) {
		/*
		[2-1] 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알맞은 자리에 넣으시오.
					1byte		2byte		3byte		4byte
		논리형	   boolean     
		문자형 					 char
		정수형		byte		short		  int		 long
		실수형 								 float      double
		*/
		
		/*
		[2-2] 주민등록번호를 숫자로 저장하고자 한다. 이 값을 저장하기 위해서는 어떤 자료형
			(data type)을 선택해야 할까? regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
			초기화 하는 한 줄의 코드를 적으시오.
			
			변수는 변수타입 + 변수명으로 선언된다.
			선언된 변수에는 =를 이용하여 "변수타입+변수명 = 값"의 형태로 변수 값을 지정할 수 있다.
			주어진 변수 regNo는 정수인 주민번호를 저장한다.
			변수의 타입 중 정수형 타입은 byte, short, int, long이 있다. 이 중 기본형은 int이다.
			타입에 따른 변수의 최소 최대값은 1btye(=8bit)를 기준으로 하여
			정수형의 경우 -2^(n-1)~2^(n-1)-1 까지의 범위를 가진다. 
			여기서, (n-1)의 지수값을 갖는 이유는 1bit의 값은 부호자리로 활용되기 때문이다.
			
			 이에 따라 변수를 선언하면
			 int regNO = 9410271171211로 선언할 수 있다.  
			 
			*/
			long regNo = 9410271171211L; 
			//9410271171211의 값이 int의 최대값 보다 크기 때문에 long타입을 사용하고 int가 정수형의 기본이므로 뒤에 "L"을 붙여준다.

			
		/*
		[2-3] 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오.
               int i = 100;
               long l =100L;
               final float PI = 3.14f;
               - 리터럴 : 100, 100L, 3.14f
               - 변수 : i,l
               - 키워드 : int, long, final, float
               - 상수 : PI
               
               	변수 : 하나의 값을 저장하기 위한 공간
               	상수 : 값을 한번만 저장할 수 있는 공간
               	리터럴 : 그 자체로 값을 의미하는 것
               	키워드 : 프로그래밍언어의 구문에 사용되는 단어(이클립스에서 한글로 입력했을 때 자주색) ex) int, long...
         */
			
		/*
		[2-4] 다음 중 기본형(primitive type)이 아닌 것은?
           a. int
           b. Byte
           c. double
           d. boolean
           
           	정답 : b
           	
           	변수 선언 시 대소문자를 구분하므로 Byte가 아닌 byte가 기본형 타입이다.
		 */

			
		/*
		[2-5] 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 ‘오
			    류’라고 적으시오.
		System.out.println(“1” + “2”) → (12) String + String -> String -> "12"로 출력
		
		System.out.println(true + “”) → (true) 논리형 + 문자열 -> 값의 범위가 문자열이 더 크므로 true이 문자열로 변환되어 "true"로 출력
		
		System.out.println('A' + 'B') → (131) 문자형 + 문자형 -> 값의 범위가 동일
											    문자형의 경우 문자를 유니코드를 변경하여 저장
											    즉 A=65, B=66이 된다. 
											  (JVM은 기본을 4byte로 한다. --> 이보다 작은 경우 4byte로 계산 --> 문자형 + 문자형인 경우
											  16진수의 값으로 변환하여 계산)
											    
		System.out.println('1' + 2) → (51)   문자형 + 정수형 : 정수형의 범위가 더 크므로 정수형으로 출력된다.
		                                                                          문자형 1은 10진수 49의 값을 가진다.
		                                                                          
		System.out.println('1' + '2') → (99) 문자형 + 문자형 = 문자형
		                                                                          문자형 1은 10진수로 49
		                                                                          문자형 2는 10진수로 50의 값을 가진다. 
		                                                                                                                          
		System.out.println('J' + “ava”) → (Java) 문자형 + 문자열 의 경우 문자열의 범위가 더 크므로 문자열이 출력
		 
		System.out.println(true + null) → ( ) true와 null 모두 예약어 이므로 오류발생
		                                      --> 문자형으로 출력하기 위해 ""가 필요 
		*/
		
		//null : 참조어의 기본형
		
		System.out.println("1" + "2");
		System.out.println(true + ""); 
		System.out.println('A' + 'B');
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava");
		//System.out.println(true + null)
		
		/*
		[2-6] 다음 중 키워드가 아닌 것은?(모두 고르시오)
             a. if : 키워드
             b. True : 키워드 아님 (true가 키워드)
             c. NULL : 키워드 아님(null이 키워드)
             d. Class : 키워드 아님(class가 키워드)
             e. System : 키워드 아님(대문자로 시작하는 경우 클래스명)
             
            	정답 : b,c,d,e	
		 */
	
		/*
		[2-7] 다음 중 변수의 이름으로 사용할 수 있는 것은? (모두 고르시오)
              a. $ystem		: 사용가능(특수문자는 $과 _사용가능)
              b. channel#5 	: 사용불가(특수문자는 $과 _사용가능)
              c. 7eleven	: 사용불가(숫자로 시작할 수 없음)
              d. If			: 사용가능(if가 예약어이므로 앞글자가 대문자인 If는 사용할 수 있다.)
              e. 자바		: 사용가능(하지만, 되도록 변수의 이름을 한글로 사용하지 않는다.)
              f. new		: 사용불가(new는 예약어 이므로 사용할 수 없음)
              g. $MAX_NUM	: 사용가능(특수문자는 $과 _사용가능, 상수의 경우 모두 대문자)
              h. hello@com	: 사용불가(특수문자는 $과 _사용가능)
              
              	정답 : a,d,e,g 
               
               	※ 변수명명 규칙
               	 - 1. 대소문자가 구분되며 길이의 제한이 없다.
               	 - 2. 예약어(key word, reserved word)는 사용할 수 없다.
               	 - 3. 숫자로 시작해서는 안된다.
               	 - 4. 특수문자는 '_'와'$'만 사용가능하다. 
              	※ 암묵적인 규칙
              	 - 1. 클래스의 명칭은 대문자로 시작해야 한다.(변수명과 메서드명은 소문자로 시작)
              	 - 2. 여러단어로 이루어진 경우 첫번째 이후 단어의 첫글자는 대문자로 써야한다.
              	 - 3. 상수의 경우 모두 대문자로 써야한다.
              	 - 4. 한글은 사용하지 않는다.   	
		 */
		
		/*
		[2-8] 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은?
		      (모두 고르시오)
				a. int(4byte)
				b. long(8byte)
				c. short(2byte)
				d. float(4byte)
				e. double(8byte)
				
				정답 : a,d
				참조형 변수의 경우 4byte를 기본으로 한다. 
		 */
		
		/*
		[2-9] 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
			byte b = 10;
			char ch = 'A';
			int i = 100;
			long l = 1000L;
			
			
			a. b = (byte)i;			b의 변수타입 byte(1byte) < i의 변수타입 int(4byte)  --> 생략해서는 안 된다. 
			b. ch = (char)b;		ch의 변수타입 문자열 크기(2byte) > b의 변수타입 byte의 크기(1byte)
			                         --> 문자형과 정수형 형태가 다르므로 (char)필요
			c. short s = (short)ch;	short의 변수타입 크기(2byte) = ch의 변수타입 char의 크기(2byte)이나, 
						                        문자형과 정수형 형태가 다르므로 (char)필요
			d. float f = (float)l;	float의 변수타입 크기(4byte) < l의 변수타입 long의 크기(8byte) --> 생략가능
			e. i = (int)ch;			i의 변수타입 int의 크기(4byte) > ch의 변수타입 char의 크기(2byte) --> 생략가능
			
				정답 : d,e
		 */

		/*
		[2-10] char타입의 변수에 저장될 수 있는 정수 값의 범위는? (10진수로 적으시오)
		
		 		char의 변수타입 크기는 2byte(=16bit)를 가진다.
		 		문자형은 부호를 가질 필요가 없으므로 2byte 모두 문자형으로 저장할 수 있다.
		 		따라서 0~2^16-1개의 크기 만큼의 크기인 0~65535만큼의 크기를 가진다. 
		*/
		
		/*
		[2-11] 다음중 변수를 잘못 초기화 한 것은? (모두 고르시오)
				a. byte b = 256;
					byte는 1byte(=8bit)의 크기를 가지므로 -2^7(-128) ~ 2^7-1(127)까지의 크기를 가진다.
					따라서 256은 저장할 수 없다.
				b. char c = '';
					문자형 char은 반드시 한 가지 문자를 가져야 한다.
				c. char answer = 'no';
					char은 한 가지 문자만을 가질 수 있다. 문자열 "no"로 표기하면 올바르게 초기화가 가능하다. 
				d. float f = 3.14
					float은 소수점 7가지 까지 표현 가능	
					하지만, 실수형의 기본은 double을 사용하기 때문에 float f = 3.14F;가 되어야 한다.				
				e. double d = 1.4e3f;
					double은 소수점 15자리 까지 표현 가능
					
					정답 : a,b,c,d
		 */
		
		
		/*
		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은? (모두 고르시오)
				a. boolean - false
					논리형 타입 booleand은 false를 기본값으로 가진다. 
				b. char - '\u0000'
					문자형 타입 char은 0을 기본으로 가진다. 
				c. float - 0.0
					실수형의 기본형은 double --> float의 경우 0.0F; 
				d. int - 0
					정수형 변수 int는 0을 기본값으로 한다. 
				e. long - 0
					정수형 변수 int는 0을 기본값으로 한다. --> long의 경우 0L;로 사용하여야 한다.
				f. String - ""
					String은 참조형 변수로 null값을 기본형으로 가진다.
					
					정답 : a,b,d,f
		*/
		
	}
}