package c_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
		/*
		 1. 조건문(if, switch)
		 	- 조건식과 실행될 문장을 포함하는 블럭{}으로 구성되어 있다.
		 	- 조건식의 연산결과에 따라 프로그램의 흐름을 변경할 수 있다.
		 	
		 2. if문
		 	- 구조
		 		if(조건식){
		 			조건식이 true일 때 수행될 문장
		 		}
		 		
		 		
		 		if(조건식){
		 			조건식이 true일 때 수행될 문장
		 		} else{
		 			조건식이 false일 때 수행될 문장
		 		}
		 		
		 		
		 		if(조건식1){
		 			조건식1이 true일 때 수행될 문장
		 		} else if(조건식2){
		 			조건식1이 false이고 조건식2가 true일 때 수행될 문장
		 		} else{
		 			조건식1과 조건식2가 모두 false일 때 수행될 문장
		 		}
		 		
		 	*/
		 	//1. int타입의 변수 i1을 선언하고 20의 값으로 초기화 하여라.
		 	 int i = 20;
		 	//2. i1의 값이 0보다 크면 "i1은 양수이다"를 출력해주세요.
		 	 if(i>0){
				System.out.println("i1은 양수이다");
			}
			//3. i1의 값이 0보다 크면 "i1은 양수이다"를 출력하고 그렇지 않은 경우"i1은 양수가 아니다"를 출력
			 if(i>0){
			 	System.out.println("i1은 양수이다");
			 }else{
				 System.out.println("i1은 양수가 아니다");
			 }
			
			//1. 0~100사이의 임의의 정수값을 변수 score에 저장해주세요
			 int score = (int) (Math.random()*100+1);
			 
			 System.out.println("score = "+score);
			 
			//2.score의 값이 90이상이면 "A"를 출력해주세요.
			//	score의 값이 80이상이면 "B"를 출력해주세요.
			//	score의 값이 70이상이면 "C"를 출력해주세요. 
			//	score의 값이 60이상이면 "D"를 출력해주세요. 
			//	score의 값이 60미만이면 "나가"를 출력해주세요. 
			 
			 if(score>=90){
				 System.out.print("A");
				 if(score>=95){
					 System.out.println("+");
				 }else{
					 System.out.println("-");
				 }
			 } else if(score>=80){
				 System.out.print("B");
				 if(score>=85){
					 System.out.println("+");
				 }else{
					 System.out.println("-");
				 }
			 } else if(score>=70){
				 System.out.print("C");
				 if(score>=75){
					 System.out.println("+");
				 }else{
					 System.out.println("-");
				 }
			 } else if(score>=60){
				 System.out.print("D");
				 if(score>=65){
					 System.out.println("+");
				 }else{
					 System.out.println("-");
				 }
			} else{
					 System.out.println("나가");					 
			 }
			 
		/*
		 2. switch-case
		 	- 조건의 경우의 수가 많을 때는 if문 보다는 switch문을 사용하는 것이 좋다.
		 	- 조건의 결과값으로 int형 범위의 정수값을 허용한다.
		 	- 구조
		 	switch(조건식){
		 	case 값1 :
		 		수행될 문장
		 		break;
		 	case 값2 :
		 		조건식과 값2가 같을 때 수행될 문장
		 		break;	
		 		
		 	default : 
		 		조건식과 일치하는 값이 없을 때 수행
		 	}
		 */	 
			//1. 변수 random에 1~5사이의 임의의 정수값을 초기화 하여라.
			int random = (int)(Math.random()*5+1);
			System.out.println("random값은 "+random);
			
			//2.random의 값이 5이면 "영민빌딩 당첨"
			//	random의 값이 4이면 "38평 아파트 당첨"
			//	random의 값이 3이면 "rangerover풀옵션 당첨" 
			//	random의 값이 2이면 "맥북 당첨" 
			//	random의 값이 1이면 "교보생명빌딩 내놔" 
			
			switch(random){
				case 5 : 
					System.out.println("영민빌딩 당첨");
					break;
				case 4 :
					System.out.println("38평 아파트 당첨");
					break;
				case 3 :
					System.out.println("rangerover풀옵션 당첨");
					break;
				case 2 :
					System.out.println("맥북 당첨");
					break;
				//case 1 :
				default :	
					System.out.println("교보생명빌딩 내놔");
			}
			 

		/*
		 2. 반복문(for, while, do-while)
		 */
	}

}