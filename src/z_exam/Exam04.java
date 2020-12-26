package z_exam;

public class Exam04 {
	public static void main(String[] args) {
		/*
		 1-1--ok				11-5----
		 2-1				12-1
		 3-3 3단 계산			13-4
		 4-3				14-4----
		 5-2				15-4
		 6-2
		 7-0 ok
		 8-2
		 9-3
		 10-4----
		 */
		
	//	[4-1] 다음의 문장들을 조건식으로 표현하라.
	//		1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
				//10<x&&x<20
		
	//		2. char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
				//!(ch==' ' || ch=='\t') 
		
	//		3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
				//ch=='x' || ch=='X'
		
	//		4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
				//'0'<=ch&&ch<='9'
		
	//		5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
				//('A'<=ch&&ch<='Z')||('a'<=ch&&ch<='z')
		
	//		6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
	//			않을 때 true인 조건식
				//(year%400==0) || (year%4==0&&year%100!=0)
		
	//		7. boolean형 변수 powerOn가 false일 때 true인 조건식
				//powerOn==false
				//!powerOn(boolean의 기본형은 false --> !powerOn 하면 조건식은 true)
		
	//		8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
				//str == "yes" --> 문자열이므로 .equals()사용
				// 정답 : "yes".equals(str)
		
	/*	
		[4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
	*/
				System.out.println("[연습문제4-2]");
				int sum2=0;
				for(int a2=1;a2<21;a2++){
					if(a2%2!=0 && a2%3 !=0){	//2또는3의 배수가 아닌 수를 판별
						sum2+=a2;				//sum의 값을 a에 저장
					}
				}
				
				System.out.println(sum2);
		
	/*	[4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
	 */
				System.out.println("[연습문제4-3]");
				//풀이방법 1 : 이중 for문을 사용
				int sum3=0;
				for(int bundle=1;bundle<11;bundle++){
					for(int j3=1;j3<=bundle;j3++){
						sum3+=j3;
					}
				}
				System.out.println(sum3);
				
				//풀이방법 2 : for문 한 번 사용
				int bundleSum=0;
				int allSum=0;
				
				for(int bundle=1;bundle<11;bundle++){
					bundleSum+=bundle;
					allSum+=bundleSum;
				}
				
				System.out.println(allSum);
				//풀이방법 3 : 첫 값과 끝 값을 더하면 11(1+10 = 11 / 2+9 = 11......)
				int allSum2=0;
				for(int i=1;i<11;i++){
					allSum2+=i*(11-i);
				}
				System.out.println(allSum2);
	 /* 
	 	[4-4] 	1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
				100이상이 되는지 구하시오.
	*/
				System.out.println("[연습문제4-4]");
				
				int sum4 = 0; //합을 저장
				int buho = 1; //부호를 저장
				int num4 = 0; //숫자를 저장
				
				for(int i=1;true;i++,buho=-buho){
					num4=buho*i;
					sum4+=num4;
					
					if(sum4>=100){
						break;
					}
				}
				System.out.println(num4);
				System.out.println(sum4);
				
	 /*			
	 	[4-5] 다음의 for문을 while문으로 변경하시오.
	*/
				
		System.out.println("[연습문제4-5]");
		int i=0;
			while(i<=10) {
				int j=0;
				while(j<=i) {
					System.out.print("*");
					j++;
				}
				System.out.println();
				i++;
			}
				
	/*			
	 	[4-6] 	두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
				로그램을 작성하시오.	 			
	*/
				System.out.println("[연습문제4-6]");
				for(int i6=1;i6<=6;i6++){//1번 주사위를 던졌을 때 나오는 수
					for(int j6=1;j6<=6;j6++){//2번 주사위가 던졌을 때 나오는 수
					if(i6+j6==6){//주사위 2개의 합이 6이 되는 경우 반복종료 및 출력
					System.out.println(i6+"+"+j6+"="+(i6+j6));
						}
					}
				}
				
	/*
	 	[4-7]	Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는
				코드를 완성하라. (1)에 알맞은 코드를 넣으시오.;
	 */
					System.out.println("[연습문제4-7]");
					int value = (int)(Math.random()*6)+1; //random값을 value에 저장
					
					System.out.println("value:"+value);
				
	 /*	
	 	[4-8]	방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는
				0<=x<=10, 0<=y<=10 이다.
	  */
				System.out.println("[연습문제4-8]");
				for(int x=0; x <=10;x++) {//x값의 범위
					for(int y=0; y <=10;y++) {//y값의 범위
						if(2*x+4*y==10) {//방정식의 해를 구하는 수식
							System.out.println("x="+x+", y="+y);
							}
						}
					}
	/*	
	 	[4-9]	숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
				드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
				어야 한다. (1)에 알맞은 코드를 넣으시오.
	*/
				System.out.println("[연습문제4-9]");
				
				String str9 = "12345";
				
				int sum9=0;
				int c1;
				
				for(int strIndex=0;strIndex<str9.length();strIndex++){
					c1=str9.charAt(strIndex)-'0';
					//charAt() : 문자열을 추출할 때 사용
					//Java는 문자열 값을 숫자로 반환
					//문자열 0 만큼의 숫자를 빼주어야 추출된 문자의 합을 구할 수 있다.
					sum9 +=c1;
				}
				
				System.out.println("sum은  "+sum9);
				
				
	/*
	 	[4-10] 	int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를
				완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라.
				(1)에 알맞은 코드를 넣으시오.
	 */
					System.out.println("[문제4-10]");
		
					int num10=12345;
					int sum10 = 0;
					System.out.println("입력된 값은 "+num10);
					while(num10!=0){
						sum10=sum10+(num10%10);
						num10=num10/10;
					}
					//12345를 계속해서 10으로 나누면 가장 끝자리는	5
					//									4
					//									3
					//									2
					//									1 이된다.
					//sum4_10의 값을 10으로 나눈 후 남는 나머지 값을 계속 더해준다.
					System.out.println("sum의 값은 " +sum10);
	
		/*
		 [4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
				는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는
				1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터
				시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
				
				//	Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.				
		 */
		  System.out.println("[문제4-11]");
					int num11_1 = 1;	//첫번째 숫자 저장
					int num11_2 = 1;	//두번째 숫자 저장
					int num11_3 = 0;	//세번째 숫자 저장
					
					System.out.print(num11_1+","+num11_2);
					
					for(int i11 = 0; i11 < 8 ; i11++) {
						
						num11_3 = num11_1+num11_2; 
						System.out.print(","+num11_3);
						
						num11_1 = num11_2;
						num11_2 = num11_3;
					}					
					
					/*
					피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
					는 수열
					--> 일단 num1과 num2를 더해 num3를 만든 후
						num2의 값에 num1을, num3의 값에 num2를 넣어준 후 이 둘을 더하면 만들어진다.
					*/
		/*
		 [4-12] 구구단의 일부분을 다음과 같이 출력하시오.
		 */
					System.out.println("\n[연습문제4-12]");
					
					for (int i12 = 1; i12 < 10; i12 += 3) {//단을 구하기 위한 반복문
						for (int j12 = 1; j12 < 10; j12++) {//곱을 구하기 위한 반복문
							for (int k12 = i12; k12 < i12 + 3; k12++)//단이 3번 반복될 때 마다 줄 바꿈
								System.out.print(k12 + "*" + j12 + "=" + k12 * j12 + "\t");
								System.out.println();
						}
						System.out.println();
					}

		/*
		[4-13] 	다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
				은 코드를 넣어서 프로그램을 완성하시오.
				
		 */
					System.out.println("[연습문제4-13]");
					String value13 = "12o34";
					char ch13 = ' ';
					boolean isNumber = true;
					// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
					// 하나씩 읽어서 검사한다.
					for(int i13=0; i13 < value13.length() ;i13++) {

								//하나씩 꺼낸다 1) for사용
								//charAt(0)='1' --> 숫자형('0'~'9') 판단 --> 맞으면 통과
								//									----> 아니면 isNumber를 false로	
					}
					if (isNumber) {
						System.out.println(value+"는 숫자입니다.");
					} else {
						System.out.println(value+"는 숫자가 아닙니다.");
						}

					
		/*
		[4-14] 	다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
				해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
				신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면
				게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
				로그램을 완성하시오.
				
		 */
					System.out.println("연습문재[4-14]");
					// 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
					int answer = (int) (Math.random()*100+1); //랜덤 값!!
					int input = 0; // 사용자입력을 저장할 공간
					int count = 0; // 시도횟수를 세기위한 변수
					// 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
					java.util.Scanner s = new java.util.Scanner(System.in);
					System.out.println("입력된 값은 : "+answer);
					
					do {
						count++;
						System.out.print("1과 100사이의 값을 입력하세요 :");
						input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
							if(input<answer){
								System.out.println("더 큰 수를 입력하세요");
							}else if(input>answer){
								System.out.println("더 작은 수를 입력하세요");
							}else{
								System.out.println("정답");
								break;
							}
						} while(true); // 무한반복문
					System.out.println("시도횟수는 "+count);
					
					/*
					랜덤값을 저장 -> 스캐너로 값을 입력 -> 값을 판단(랜덤으로 저장된 값과 입력받은 값을 비교)
					-> 비교를 위해 if를 사용
					-> 랜덤 값<입력받은 값 : "더 큰 수를 입력" 출력
						이 값에 반대되는 랜덤 값>입력받은 값을 비교하였을 때
						이와 일치하면 "더 작은 수를 출력"
						이와 일치하지 않으면 정답이므로 "정답"을 출력
					-> 위 과정을 정답이 나올 때 까지 지속적으로 반복하며
						변수 count를 활용하여 반복한 횟수를 출력
					 */ 
							
					
			/*
			[4-15] 	다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
					어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
					다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
					//한 칸 씩 미룬다!!!
					[Hint] 나머지 연산자를 이용하시오.	
			 */
					System.out.println("[연습4-15]");
					
						int number15 = 12321;
						int tmp = number15;
						int result15 =0; // 변수 number를 거꾸로 변환해서 담을 변수
						while(tmp !=0) {
					
							result15=result15*10+tmp%10;
							tmp/=10;

						}
						if(number15 == result15)
							System.out.println( number15 + "는 회문수 입니다.");
						else
							System.out.println( number15 + "는 회문수가 아닙니다.");
					
/*					12321 --->int 타입
					tmp%10 : 1의 자리
					위의 값을 num+= 
					남은 값을 tmp/=10;
					가장 뒤로 보내려면 num*=10;*/
	}
}
