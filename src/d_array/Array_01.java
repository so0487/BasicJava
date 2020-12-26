package d_array;

public class Array_01 {
	public static void main(String[] args) {
		
		/*
		 1. 배열(Array)란?
		 	- 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것(포인트는 같은 타입)
		 	
		 	int korScore = 0;
		 	int engScore = 0;
		 	int mathScore = 0;
		 	int socScore = 0;
		 	
		 2. 배열의 선언
		 	- 원하는 변수의 타입을 선언하고 변수 또는 타입에 배열임을 의미하는 []를 붙이면 된다.
		 	
		 	int[] score;	--> 대부분 이렇게 사용한다.
		 	int score[];
		 	
		 3. 배열의 생성
		 	- 배열을 선언한 다음에 배열을 생성해야 한다.
		 	- 배열 생성을 위해서는 연산자 'new'와 함께 배열의 타입과 크기를 지정해 주어야 한다.		 	
		 	ex) int[] score = new int[3];
		 							(int형의 주소값을 저장)
		 */
		// int형 배열 score를 선언하고 5개의 방으로 방을 생성하여라.
			int[] score = new int[5];
			/*System.out.println(score[0]);
			System.out.println(score[1]);
			System.out.println(score[2]);
			System.out.println(score[3]);
			System.out.println(score[4]);*/	
			//System.out.println(score[5]);	--> 배열의 범위를 벗어남 --> 0~4번 방 까지 필요한 것
			
			
			for(int i=0;i<score.length;i++){
			;
				System.out.println(score[i]);
			}
			
/*		//1. score의 0번방에 0을 저장해주세요.
		score[0]=0;
		//2. score의 1번방에 10을 저장해주세요.
		score[1]=10;
		//3. score의 2번방에 20을 저장해주세요
		score[2]=20;
		//4. score의 3번방에 30을 저장해주세요
		score[3]=30;
		//5. score의 4번방에 40을 저장해주세요
		score[4]=40;*/
			
			for(int i=0;i<score.length;i++){
				score[i]=i*10;
				
				System.out.println(score[i]);
			}
		
		int[] score1 = new int[]{1,2,3,4,5}; // 원하는 값을 한 번에 초기화 가능
		
		int[] score2 = {1,2,3,4,5};
		
		
/*		int[] score3;
		score3 = {1,2,3,4};*/	//new int[]가 생략된 경우 선언과 생성을 따로할 수 없다.
		
		
		//1. 배열 number를 선언하고 6개의 방으로 초기화 하여라. (정수형)
		int[] number= new int[6];
		System.out.println("===========");
		
		//2. number의 각 방에 0~100점 사이의 임의의 정수값을 저장해주어라.
//		number[0] = (int)(Math.random()*101);
//		number[1] = (int)(Math.random()*101);
//		number[2] = (int)(Math.random()*101);
//		number[3] = (int)(Math.random()*101);
//		number[4] = (int)(Math.random()*101);
//		number[5] = (int)(Math.random()*101);
		
		for(int i=0;i<number.length;i++){
			number[i]=(int)(Math.random()*101);
		}

		//3. number에 저장된 값을 출력하여라.
/*		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		System.out.println(number[5]);*/
		
		for(int i=0;i<number.length;i++){
			System.out.println(number[i]);
		}
		
		//4. number모든 방의 합계를 구하여라
		System.out.println("===========");
		int numberSum=0;
		for(int i=0;i<number.length;i++){			
			numberSum+=number[i];
		}
		System.out.println("합계는"+numberSum);
		
		//5. number의 모든방의 평균을 구하여라.
		System.out.println("===========");
		
		float numberSum2 = 0;

		for(int i=0;i<number.length;i++){
			numberSum2+=number[i];
		}
			//float numberAvg = (int)(numberSum2/number.length+0.5f*100)/100f;
			float numberAvg = (int)(numberSum2/number.length*100f+0.5f)/100f;
			System.out.println("평균은 "+numberAvg);
			
		//6. number의 값 중 최대값을 구하여라.
			System.out.println("===========");
			int maxNum = number[0];
			for(int i=0;i<number.length;i++){
				if(maxNum<number[i]){
					maxNum=number[i];
				}
			}
			System.out.println("최대값은 : "+maxNum);
			
		//7. number의 값 중 최소값을 구하여라	
			System.out.println("===========");
			
			int minNum = number[0];
			for(int i=0;i<number.length;i++){
				if(minNum>number[i]){
					minNum=number[i];
				}
			}
			
			System.out.println("최소값은 : "+minNum);
	}
}
