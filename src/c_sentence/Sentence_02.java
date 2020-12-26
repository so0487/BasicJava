package c_sentence;

import java.util.Scanner;



public class Sentence_02 {
	public static void main(String[] args) {
		/*
		 1. 반복문(for, while, do-while)
		 	- 어떤 작업이 반복적으로 수행되도록 할 때 사용된다.
		 	- 반복문은 주어진 조건을 만족하는 동안 주어진 문장들을 반복적으로 수행함으로 조건식을 포함한다.
		 	-for문은 반복횟수를 알고 있을 때 사용, while문은 반복횟수를 알 수 없을 때 사용된다.
		 
		 2. for문
		 	- 기본구조
		 		for(초기화;조건식;증감식){
		 			수행될 문장
		 		}
		 		
		 	초기화 -> 조건식 ->수행 ->증감식
		 	 	 -> 조건식 ->수행 ->증감식
		 */
				/*
				System.out.println(0);
				System.out.println(1);
				System.out.println(2);
				System.out.println(3);
				System.out.println(4);
				System.out.println(5);
				System.out.println(6);
				System.out.println(7);
				System.out.println(8);
				System.out.println(9);
				 */
			//1. 시작 0 끝 9 증가량 1
				for(int number=0;number<10;number++){
					System.out.println(number);
				}
			//1. 3~15까지의 합계를 구하고 싶어요.
				int sum = 0; //합계가 저장될 sum값 선언
				/* 반복이 수행된다. 
				sum +=3;
				sum +=4;
				sum +=5;
				sum +=6;
				sum +=7;
				sum +=8;
				sum +=9;
				sum +=10;
				sum +=11;
				sum +=12;
				sum +=13;
				sum +=14;
				sum +=15;
				*/
				for(int num=3;num<16;num++){
					sum +=num;
				}
				System.out.println(sum);
			
			//2. 5~37까지의 정수 중 짝수의 합을 구하여라
				int sum2=0;
				for(int num=5;num<38;num++){
					if(num%2==0){		//만약 num의 값이 짝수이면
					sum2+=num;			//5~37까지의 합계를 구한다.
					}
				}
				System.out.println(sum2);
				//합계 중 홀수의 합 뺀다.
			
			// 2 * 1 = 2 출력
		/*	
				System.out.println(""+2+"*"+1+"="+2*1+"");
				System.out.println(""+2+"*"+2+"="+2*2+"");
				System.out.println(""+2+"*"+3+"="+2*3+"");
				System.out.println(""+2+"*"+4+"="+2*4+"");
				System.out.println(""+2+"*"+5+"="+2*5+"");
				System.out.println(""+2+"*"+6+"="+2*6+"");
				System.out.println(""+2+"*"+7+"="+2*7+"");
				System.out.println(""+2+"*"+8+"="+2*8+"");
				System.out.println(""+2+"*"+9+"="+2*9+"");
			
				for(int gob=1;gob<10;gob++){
					System.out.println(""+2+"*"+gob+"="+2*gob+"");
				}
				
				System.out.println(""+3+"*"+1+"="+3*1+"");
				System.out.println(""+3+"*"+2+"="+3*2+"");
				System.out.println(""+3+"*"+3+"="+3*3+"");
				System.out.println(""+3+"*"+4+"="+3*4+"");
				System.out.println(""+3+"*"+5+"="+3*5+"");
				System.out.println(""+3+"*"+6+"="+3*6+"");
				System.out.println(""+3+"*"+7+"="+3*7+"");
				System.out.println(""+3+"*"+8+"="+3*8+"");
				System.out.println(""+3+"*"+9+"="+3*9+"");
			
				for(int gob=1;gob<10;gob++){
					System.out.println(""+3+"*"+gob+"="+3*gob+"");
				}
				
				System.out.println(""+4+"*"+1+"="+4*1+"");
				System.out.println(""+4+"*"+2+"="+4*2+"");
				System.out.println(""+4+"*"+3+"="+4*3+"");
				System.out.println(""+4+"*"+4+"="+4*4+"");
				System.out.println(""+4+"*"+5+"="+4*5+"");
				System.out.println(""+4+"*"+6+"="+4*6+"");
				System.out.println(""+4+"*"+7+"="+4*7+"");
				System.out.println(""+4+"*"+8+"="+4*8+"");
				System.out.println(""+4+"*"+9+"="+4*9+"");
			
				for(int gob=1;gob<10;gob++){
					System.out.println(""+4+"*"+gob+"="+5*gob+"");
				}
				
				System.out.println(""+5+"*"+1+"="+5*1+"");
				System.out.println(""+5+"*"+2+"="+5*2+"");
				System.out.println(""+5+"*"+3+"="+5*3+"");
				System.out.println(""+5+"*"+4+"="+5*4+"");
				System.out.println(""+5+"*"+5+"="+5*5+"");
				System.out.println(""+5+"*"+6+"="+5*6+"");
				System.out.println(""+5+"*"+7+"="+5*7+"");
				System.out.println(""+5+"*"+8+"="+5*8+"");
				System.out.println(""+5+"*"+9+"="+5*9+"");
			
				for(int gob=1;gob<10;gob++){
					System.out.println(""+5+"*"+gob+"="+5*gob+"");
				}
				
				System.out.println(""+6+"*"+1+"="+6*1+"");
				System.out.println(""+6+"*"+2+"="+6*2+"");
				System.out.println(""+6+"*"+3+"="+6*3+"");
				System.out.println(""+6+"*"+4+"="+6*4+"");
				System.out.println(""+6+"*"+5+"="+6*5+"");
				System.out.println(""+6+"*"+6+"="+6*6+"");
				System.out.println(""+6+"*"+7+"="+6*7+"");
				System.out.println(""+6+"*"+8+"="+6*8+"");
				System.out.println(""+6+"*"+9+"="+6*9+"");
			
				for(int gob=1;gob<10;gob++){
					System.out.println(""+6+"*"+gob+"="+6*gob+"");
				}
				
				System.out.println(""+7+"*"+1+"="+7*1+"");
				System.out.println(""+7+"*"+2+"="+7*2+"");
				System.out.println(""+7+"*"+3+"="+7*3+"");
				System.out.println(""+7+"*"+4+"="+7*4+"");
				System.out.println(""+7+"*"+5+"="+7*5+"");
				System.out.println(""+7+"*"+6+"="+7*6+"");
				System.out.println(""+7+"*"+7+"="+7*7+"");
				System.out.println(""+7+"*"+8+"="+7*8+"");
				System.out.println(""+7+"*"+9+"="+7*9+"");
			
				for(int gob=1;gob<10;gob++){
					System.out.println(""+7+"*"+gob+"="+7*gob+"");
				}
				
				System.out.println(""+8+"*"+1+"="+8*1+"");
				System.out.println(""+8+"*"+2+"="+8*2+"");
				System.out.println(""+8+"*"+3+"="+8*3+"");
				System.out.println(""+8+"*"+4+"="+8*4+"");
				System.out.println(""+8+"*"+5+"="+8*5+"");
				System.out.println(""+8+"*"+6+"="+8*6+"");
				System.out.println(""+8+"*"+7+"="+8*7+"");
				System.out.println(""+8+"*"+8+"="+8*8+"");
				System.out.println(""+8+"*"+9+"="+8*9+"");
			
				for(int gob=1;gob<10;gob++){
					System.out.println(""+8+"*"+gob+"="+8*gob+"");
				}
				
				System.out.println(""+9+"*"+1+"="+9*1+"");
				System.out.println(""+9+"*"+2+"="+9*2+"");
				System.out.println(""+9+"*"+3+"="+9*3+"");
				System.out.println(""+9+"*"+4+"="+9*4+"");
				System.out.println(""+9+"*"+5+"="+9*5+"");
				System.out.println(""+9+"*"+6+"="+9*6+"");
				System.out.println(""+9+"*"+7+"="+9*7+"");
				System.out.println(""+9+"*"+8+"="+9*8+"");
				System.out.println(""+9+"*"+9+"="+9*9+"");	
			 
				for(int gob=1;gob<10;gob++){
					System.out.println(""+9+"*"+gob+"="+9*gob+"");
				}
			*/
				for(int dan=2;dan<10;dan++){
					for(int gob=1;gob<10;gob++){
						System.out.println(""+dan+"*"+gob+"="+dan*gob+"");
					}
				}
				
		/*3. while문
		 	- 조건식과 블럭{}안으로 구성되어 있다.
		 	- 반복횟수를 모를 때 사용한다.
		 	- 기본구조
		 		while(조건식){
		 			조건식이 true일 때 수행될 문장
		 			}	
		 */
		
/*				for(int i =0;i<10;i++){
					System.out.println(i);
				}*/
				
				int i=0;
				while(i<10){
					System.out.println(i);
					i++; 
				}
				
			//1. 1~100까지의 합계를 구하세요.(단, while문을 사용)
				
				int num3=1;		//1~100 변하는 값
				int sum3 = 0;	//합계를 저장
				while(num3<101){
					sum3 += num3;
					num3++;
				}
				System.out.println(sum3);
			
			//2. 1~100중 홀수의 합계를 구하세요.(단, while문을 사용)	
				
				int num4=1;
				int sum4=0;
				
				while(num4<101){
					if(num4%2!=0){
						sum4+=num4;
					}
					num4++;
				}
				System.out.println(sum4);
				
				//2-2. 1~100중 짝수의 합계를 구하세요.(단, while문을 사용)	
				
				int num5=1;
				int sum5=0;
				
				while(num5<101){
					if(num5%2==0){
						sum5+=num5;
					}
					num5++;
				}
				System.out.println(sum5);
				
				
				//2단부터 구구단 출력(while문으로)

				int dan = 2;
				while(dan<10){
					int gob=1; //변수 선언 위치가 중요
					while(gob<10){
						System.out.println(""+dan+"*"+gob+"="+dan*gob+"");
						gob++;
					}
					dan++;
				}
				
				//1.1~?까지의 합계가 500이상이 되는 ?의 값은?
				//while 사용 / 시작 :1  끝:? / 증가량 : 1 / 합계가 500미만
				
				int num6=0; //1~?까지 증가
				int sum6=0;	// 합계를 저장
				
					while(sum6<500){
						num6++;			//필요에 따라 증감식의 위치를 조절할 수 있다.
						sum6+=num6;
						
					}
					System.out.println(num6);
					
					
				int num7 = 1;
				int sum7 = 0;
				
				while(true){
					sum7+=num7;
					if(sum7>=500){//sum7가 500이상이면 나가
						break;
					}
					num7++;
				}
				System.out.println(num7);
				
				for(int count2=0;count2<10;count2++){
					if(count2%2==0){
						System.out.println(count2);
					}
				}
				
				for(int count2=0;count2<10;count2++){
					if(count2%2!=0){
						continue;
					}
					System.out.println(count2);
				}
		/*
			4. do-while
			 - while문의 변형으로 기본구조는 while문과 유사하다.
			 - 최소 한 번은 블럭을 {} 수행한다.
			 - 구조
			 	do{
			 		
			 	}while();
		 */
				Scanner sc = new Scanner(System.in);
		//		System.out.println("입력하세요 : ");
		//		String input= sc.next();			//문자열을 입력 받음
		//		int input=sc.nextInt();				//숫자를 입력 받음
		//		System.out.println(input);
				
				String input = "";
				do{
					System.out.println("입력하세요 : (exit를 입력하면 종료됩니다.)");
					input = sc.next();
					System.out.println(input);
				}while(!"exit".equals(input)); //string은 참조형이라 ==으로 비교 할 수 없다. 따라서 "".equals(input)을 사용해주어야 한다.
	}
}
