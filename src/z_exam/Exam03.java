package z_exam;

public class Exam03 {
	public static void main(String[]args) {
	
	/*
	 3-1	2
	 3-2	2
	 3-3	2
	 3-4	1
	 3-5	1
	 3-6	3
	 3-7	5
	 3-8	2
	 3-9	1
	 3-10	3
	 */
		
	/*
	 [3-1] 다음 연산의 결과를 적으시오. 
	 */
		
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
	
		System.out.println(1 + x << 33); //정답 6
			/*
	 		1+x = 3 --> 3<<33이 된다.
	 		3을 2진수로 표현하면 11,
	 		33은 8비트인 int를 기준으로 했을 때 오버플로우가 일어나며 결국엔 1번 움직인 것과 같다.
	 		결과적으로 3<<1이 되고 3*2^1을 하면 6이된다. 
			 */
		System.out.println(y >= 5 || x < 0 && x > 2); //true
			/*
		 	y>=5 	: true
		 	x<0 	: false
		 	x>2		: false가 된다.
		 
		 	우선순서에 의해 &&가 먼저 시행되며
		 	false and false = false 
		 	true or false는 true가 된다. 
			 */
		System.out.println(y += 10 - x++); //13출력
			/*
			 10-x++ 먼저 수행
			 10-2=8
			 이후 y=y+8을 계산
			 이 결과 y=5+8 = 13
			 (이후 x에 1을 증가 --> x=3)
			 
			 정답 : 13
			 */
		System.out.println(x+=2);
			/*
			 x+=2 = x+2
			 이전 계산 x++에 의해 x=3이 저장
			 이를 x+=2를 하면 5가 된다. 
			 */
		System.out.println( !('A' <= c && c <='Z') ); //false가 출력
			/*
			 연산 순서에 의해 괄호먼저 계산
			 'A'< = c : 문자열 A는 c(='A')와 같으므로 ture
			 c < = 'Z' : c(='A')보다 문자열 Z의 값이 크므로 true
			 --> 괄호안의 계산은 true&&true 이므로 true
			 --> 이후 괄호 밖 !을 해주면 false
			 
			 */
		System.out.println('C'-c); // = 2
			/*
		 	4바이트를 자바에서는 기본으로 계산하므로 문자형은 int로 변환하여 계산
		 	'C'의 값은 67이 되고 c의 값은 65 이므로 2가 된다. 
			 */
		System.out.println('5'-'0'); // = 5
			/*
		 	자바는 4바이트를 기본으로 계산하므로 정수형으로 바꿔서 계산
		 	0과 5가 5차이 이므로 5
			 */
		System.out.println(c+1); // = 66 
			/*
		 	c+1 : 자바에서는 4byte를 기본으로 하므로 문자열 기본인 char을 16진수 코드로 계산
		 			따라서 문자열 c의 값은 65가 되며 여기에 +1을 해주면 66이 된다. 
			 */
		System.out.println(++c); // = B
			/*
		 	증감연산자 ++c의 경우 c+1의 값을 저장한 후 출력한다. 
		 	또한 단항계산에서는 자료형이 유지되므로 B가 출력
			 */
		System.out.println(c++); // = B
			/*
		 	증감연산자 c++는 c의 값을 저장한 이후 계산에서 증가
		 	앞선 연산 결과값인 B를 저장한 후 출력
			 */
		System.out.println(c); // = C
			/*
		 	앞선 계산인 c++값을 통해 B를 저장 후 1만큼 증가 --> C를 출력
			 */
	
	/*
	 [3-2]	아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
	 		사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
	 		가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
	 		
    */
				int numOfApple = 123;		//사과의 개수
				int sizeOfBucket = 10;		//바구니의 크기(바구니에 담을 수 있는 사과의 개수)
				int numOfBucket = numOfApple%sizeOfBucket==0?(numOfApple/sizeOfBucket):(numOfApple/sizeOfBucket+1);
				//모든 사과를 담는데 필요한 바구니의 수
				
				/*
				 사과의 갯수를 바구니의 갯수로 나눈 후 남는 사과를 담기 위해 1개의 여분 바구니가 필요
				 따라서 numOfApple/sizeOfBucket +1 이 필요
				 사과를 모두 바구니에 담을 수 있으면 여분 바구니가 필요 없음
				 
				 따라서
				 numOfApple%sizeOfBucket==0이면 바구니 갯수+0
				 numOfApple%sizeOfBucket!=0이면 바구니 갯수+1
				 */
	
				System.out.println("필요한 바구니의 수 :"+numOfBucket);
				
				
	/*
	 [3-3]	아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
	 		자를 이용해서 (1)에 알맞은 코드를 넣으시오.
	 		[Hint] 삼항 연산자를 두 번 사용하라
				
	 */			
				int num3_3 = 10;

				//System.out.println("입력된 숫자 "+num3_3+"은 " +(num3_3<0?"음수":(num3_3==0?"0":"양수")));
				System.out.println("입력된 숫자 "+num3_3+"은 " +(0<num3_3?"양수":(num3_3==0?"0":"음수")));
				//삼항연산자 : (연산식)?(식1):(식2)
				//			--> 연산식이 true이면 식1 진행 아니면 식2 진행
				//조건식이 true --> 양수를 표현
				//조건식이 false일 때 	0이면 0을 표현
				//					0이 아니면 음수를 표현
				
	/*
	 [3-4] 	아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
			의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
			시오.
	 */
				int num3_4 = 456;
				System.out.println(num3_4/100*100);
				
				//num3_4를 100으로 나눈 값의 몫을 통해 100의 자리 숫자까지 계산할 수 있다. 
				//그리고 다시 100을 곱해주면 100자리 이하 수는 버려지게 된다.
				
				
	/*	
	[3-5]	아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
			값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.

	*/
				int num3_5 = 333;
				System.out.println(num3_5/10*10+1);
				//num3_5를 10으로 나누면 10의 자리 숫자 까지 계산을 할 수 있다. 
				//이 값에서 +1을 해주면 1의 자리 숫자를 1로 변경할 수 있다. 
				
				
	/*
 	[3-6] 	아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
			뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
			다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
			수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
	 */
				int num3_6 = 24;
								
				//변수 값을 10으로 나눴을 때 --> 나머지가 0이면 
				System.out.println(num3_6%10==0?(0):(num3_6/10+1)*10-num3_6);
				//System.out.println((num3_6/10+1)*10-num3_6);
				
	/*
	[3-7]	아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
			5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
			셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
	*/
				int fahrenheit = 100;
				/*
					5/9*(화씨-32)의 값을 소수점 셋째자리에서 반올림
				 	5/9*(화씨-32)를 결과값 result라고 한다면,
				 	result *100 을 한 후 이 값을 int처리 해주면 소수점 셋째자리까지의 숫자를 정수형태로 만들 수 있다.
				  	이 후 +0.5를 해준 후 
				  	이 값을 다시 100으로 나눠준 후 float형으로 표시해주면 소수점 셋째자리까지 표현할 수 있다. 
				  	그리고 5/9의 값을 소수점 형태로 표현해주어야 하기 때문에 5f/9를 우선적으로 해주어야 한다.
				 */
				float celcius = (int)(5f/9*100*(fahrenheit-32)+0.5)/100f;
				System.out.println("Fahrenheit:"+fahrenheit);
				System.out.println("Celcius:"+celcius);
				
				
	/*
	[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
			byte a = 10;
			byte b = 20;
			byte c = a + b;
			char ch = 'A';
			ch = ch + 2;
			float f = 3 / 2;
			long l = 3000 * 3000 * 3000;
			float f2 = 0.1f;
			double d = 0.1;
			boolean result = d==f2;
			
			System.out.println("c="+c);					//c=30
			System.out.println("ch="+ch);				//ch=C
			System.out.println("f="+f);					//f=1.5
			System.out.println("l="+l);					//l=27000000000
			System.out.println("result="+result);		//result=true
	 */
				
			byte a3_8 = 10;
			byte b3_8 = 20;
			byte c3_8 = (byte)(a3_8 + b3_8);			//자바에서는 4바이트 크기인 int를 정수형의 기본으로 사용 --> (byte)가 필요
			char ch3_8 = 'A';
			ch3_8 = (char)(ch3_8 + 2);					//자바에서는 문자형은 4바이트 크기 정수형 int로 변환하여 계산 --> (char)이 필요
		//	ch3_8 +=2;									//op연산자도 사용 가능
			float f = 3f / 2;							//입력된 두 값이 int --> float형이라는 f를 마지막에 적어주어야 한다.
			long l = 3000L * 3000 * 3000;				//int형에서 최대로 나타낼 수 있는 값의 범위는 2^31-1 까지 표현 가능
														// --> 27000000000의 숫자는 int 값으로 표현할 수 없으므로 이보다 더 큰 범위까지 
														//표현가능한 long타입을 사용해주어야 한다.
														//정수형에선 int가 기본형 --> long이라는 타입을 맞춰주기 위해 L을 마지막에 적어줘야 한다.	
														//또한 오버플러우 발생하는 것을 막기 위해 연산순서 가장 앞에 L을 써준다.
			float f2 = 0.1f;
			double d = 0.1;
			boolean result = d==f2;
			
			System.out.println("c="+c3_8);				//c=30
			System.out.println("ch="+ch3_8);			//ch=C
			System.out.println("f="+f);					//f=1.5
			System.out.println("l="+l);					//l=27000000000
			System.out.println("result="+result);		//result=true
			
			
		/*
		[3-9]	다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
				의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오
				
		 */
					char ch3_9 = 'z';
					boolean b3_9 = 'A'<=ch3_9&&ch3_9<='Z'||'a'<=ch3_9&&ch3_9<='z'||'0'<=ch3_9&&ch3_9<='9';
						//ch가 소문자 or 대문자 일 때 b의 값의 true
					System.out.println("입력된 값은 : "+ch3_9+"이며 이 값은 "+b3_9);
			
		/*
		[3-10]	다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
				인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
				들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.  
				
		 */	
					
					char ch3_10 = 'A';
					char lowerCase = (char) (('A'<=ch3_10&&ch3_10<='Z') ? (ch3_10)+32 : ch3_10);
						//ch3_10이 대문자 이면 ch3_10+32를 해주어 소문자 값으로 변환
						//ch3_10이 대문자가 아니면 ch3_10의 값을 그대로 저장
					System.out.println("ch3_10:"+ch3_10);
					System.out.println("ch3_10 to lowerCase:"+lowerCase);
	}
}
