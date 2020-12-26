package z_exam;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

public class Exam05 {
	public static void main(String[] args) {
		
//	1-1
//	2-1
//	3-1
//	4-2
//	5-3
//	6-3
//	7-5
//	8-3
//	9-4
//	10 안해도 됨
//	11-5
//	12 안해도 됨
//	13 안해도 됨
		
//		[5-1]다음은 배열을 선언하거나 초기화 한 것이다 잘못된 것을 고르고 그 이유를 설명 .
//			하시오.
//		a. int[]arr[];
//		b. int[]arr = {1,2,3}; : arr의 길이는 3 --> 뒤에 숫자가 없으면 없는 것으로 간주
//		c. int[]arr = new int[5]; 
//		d. int[]arr = new[5]{1,2,3,4,5};	--> {}에 값을 지정할 경우 []에 숫자를 넣으면 안 됨
//		e. int ar[5];			//배열을 선언할 때에는 숫자를 넣으면 안 됨
//		f. int[]arr[] = new int[3][];
//		정답 : d,e		
		
//		[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
//		int[][] arr = {
//					{5, 5, 5, 5, 5},
//					{10, 10, 10},
//					{20, 20, 20, 20},
//					{30, 30}
//				};
		
//		arr[3]은 {30,30}	--> 이차원 배열의 길이는 2

		
//		[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.

		System.out.println("===================");
		System.out.println("[연습문제5-3]");
		int[] arr3 = {10, 20, 30, 40, 50};
		int sum3 = 0;
		
		for(int i=0;i<arr3.length;i++){
			sum3 +=arr3[i]; 
		}
		System.out.println("sum="+sum3);
		
		
//		[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.

		System.out.println("=====================");
		System.out.println("[문제5-4]");
		
		int[][] arr4 = {
					{ 5, 5, 5, 5, 5},
					{10,10,10,10,10},
					{20,20,20,20,20},
					{30,30,30,30,30}
				};
				int total4 = 0;
				float average4=0;
				int count=0;
				

				for(int i=0;i<arr4.length;i++){
					for(int j=0;j<arr4[i].length;j++){
						System.out.print(arr4[i][j]+" ");
						total4+=arr4[i][j]; // 배열의 합계
						count++; //반복을 1회 수행할 때 마다 1을 증가
					}//반복횟수 count를 계산
					System.out.println(" ");
				}	 
				System.out.println("count "+count);
				average4 = (int)((float)total4/count*100f+0.5)/100f; //배열의 평균
				
				System.out.println("total="+total4);
				System.out.println("average="+average4);
				
				
//		[5-5] 	다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
//				로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//				[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
				
				System.out.println("======================\n[연습문제5-5]");
				int[] ballArr = {1,2,3,4,5,6,7,8,9};	//ballArr값 저장
				int[] ball3 = new int[3];
				
				// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
				for(int i=0; i< ballArr.length;i++) {
					int j = (int)(Math.random() * ballArr.length);
					int tmp = 0;
					
					tmp = ballArr[i];	//임시 값에 ballArr의 i번째 배열 값을 저장
					ballArr[i]=ballArr[j];	//ballArr의 i번째 배열 값을 j번째 배열값에 저장
					ballArr[j]=tmp;		//j번째 배열값을 임시값에 저장
				}
				
				// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
				for(int i=0;i<ball3.length;i++){
				ball3[i]=ballArr[i];
				}
				
				for(int i=0;i<ball3.length;i++) {
					System.out.print(ball3[i]);
				}
				System.out.println();
				
//		[5-6]	다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
//				수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
//				라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
//				프로그램을 완성하시오.
//				[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
				
				System.out.println("===============\n[연습문제5-6]");

				int[] coinUnit = {500, 100, 50, 10};
				int money = 2680;
				System.out.println("money="+money);
				for(int i=0;i<coinUnit.length;i++) {
					System.out.println(+coinUnit[i]+":"+money/coinUnit[i]);
					money = money%coinUnit[i];
				}
				
//		[5-7]	문제 5-6에 동전의 개수를 추가한 프로그램이다 커맨드라인으로부터 거슬러 줄
//				금액을 입력받아 계산한다 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
//				돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면 거스름돈을 지불
//				한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다 (1)에 알맞은 코드를 넣 
//				어서 프로그램을 완성하시오.
				System.out.println("==================\n[연습문제5-7]");
//				if(args.length!=1){
//					System.out.println("USAGE : Java Exercise5_7 3120");
//					System.exit(0);
//				}
				
				//문자열을 숫자로 변환한다. 입력한 값이 아닐 경우 예외가 발생
//				int money2 = Integer.parseInt(args[0]);
				int money2 = 3120;
				
				System.out.println("money"+money2);
				
				int [] coinUnit2 = {500,100,50,10};
				int [] coin2 = {5,5,5,5};
				
				for(int i=0;i<coinUnit2.length;i++){
					int coinNum=0;
//				m/cu[0] : 
//				if(num>c[0]){
//					num=c[0];//최대 갯수를 바꾼다. 
//				}
					coinNum = money2/coinUnit2[i];
					
					if(coinNum<coin2[i]){
						coin2[i]-=coinNum;
					}else{						
						coinNum=coin2[i];
					}
					money2 -= coinNum*coinUnit2[i];
					
					System.out.println(coinUnit2[i]+"원 : "+coinNum);
				}
				if(money2>0){
					System.out.println("거스름돈이 부족합니다");
					System.exit(0);	//프로그램을 종료한다.
				}
				System.out.println("=남은 동전의 개수=");
				
				for(int i=0;i<coinUnit2.length;i++){
					System.out.println(coinUnit2[i]+"원:"+coin2[i]);
				}
				
//		[5-8] 	다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
//				을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
				
				System.out.println("==================\n[연습문제5-8]");
				int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
				int[] counter = new int[4];
				
				for(int i=0; i < answer.length;i++) {
					counter[answer[i]-1]++;
				}
				for(int i=0; i < counter.length;i++) {
					System.out.print(counter[i]);
				for(int j=0; j < counter[i];j++) {
					System.out.print("*"); // counter[i]의 값 만큼 ‘*’을 찍는다.
					}
				System.out.println();
				}
				
//		[5-9]	주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
				System.out.println("==========================\n[연습문제5-9]");
				
//					좌표를 움직이는 것의 공통점
//					(0,0)-->(0,3) ----> 3-x
//					(1,0)-->(0,2)
//					(2,0)-->(0,1)
//					(3,0)-->(0,0)
				
				char[][] star = {
					{'*','*',' ',' ',' '},
					{'*','*',' ',' ',' '},
					{'*','*','*','*','*'},
					{'*','*','*','*','*'}
				};
				
				char[][] result9 = new char[star[0].length][star.length];
				
				for(int i=0;i<star.length;i++){
					for(int j=0;j<star[i].length;j++){
						System.out.print(star[i][j]);
					}
					System.out.println();				
				}
					for(int i=0;i<star.length;i++){
						for(int j=0;j<star[i].length;j++){
							int x9 = j;
							int y9 = star.length-1-i;
							
							result9[x9][y9]=star[i][j];
					}
				}
					
					for(int i=0;i<result9.length;i++){
						for(int j=0;j<result9[i].length;j++){
							System.out.print(result9[i][j]);
						}
						System.out.println();
					}

				
//		[5-11]	주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
//				의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
//				에 알맞은 코드를 넣어서 완성하시오.
				System.out.println("==========================\n[연습문제5-11]");	
				int [][]score = {
						{100,100,100},
						{20,20,20},
						{30,30,30},
						{40,40,40},
						{50,50,50}
				};
				
				int [][]result11 = new int[score.length+1][score[0].length+1];
				
				for(int i=0;i<score.length;i++){
					for(int j=0;j<score[i].length;j++){
						result11[i][j]=score[i][j];
						result11[i][score[0].length]+=result11[i][j];
						result11[score.length][j]+=result11[i][j];
						result11[score.length][score[0].length]+=result11[i][j];
					}
				}
				
				for(int i=0;i<result11.length;i++){
					for(int j=0;j<result11[i].length;j++){
						System.out.printf("%4d",result11[i][j]);
					}
					System.out.println();
				}

//					과목별, 사람별 합계 참고

	}
}