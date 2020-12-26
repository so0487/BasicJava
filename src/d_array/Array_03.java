package d_array;

public class Array_03 {
	public static void main(String[] args) {
		/*
		 1. 다차원 배열
		 	- 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열로 허용한다.
		 	- 2차원 배열의 선언
		 			선언방법						선언예
		 		타입[][] 변수명;				int[][] 변수형;
		 		타입[] 변수명[];				int[] 변수명[];
		 		타입 변수명[][];				int 변수명[][];
		 */
		int[][] doubleArray = new int[3][2];	//[층수][방수] 3층과 방2개
												//{(00 00 00)	--> [0]	[0][1]
												// (00 00 00)	-->	[1]	[0][1]
												// (00 00 00)}	-->	[2]	[0][1]
		
//		System.out.println(doubleArray[0][0]);
//		System.out.println(doubleArray[0][1]);
//		for(int j=0;j<doubleArray[0].length;j++){
//			System.out.println(doubleArray[0][j]);
//		}
		
//		System.out.println("=====================");
//		for(int i=0;i<doubleArray.length;i++){
//			for(int j=0;j<doubleArray[i].length;j++){
//				System.out.println(doubleArray[i][j]);
//			}
//		}
//		
//		int [][] doubleArayy2 = new int[3][];
//		
//		
		
		
		System.out.println("==============================");
		//3. 변수 names를 선언하고 주변 친구 6명의 이름으로 초기화 하여라
		String[] names = new String[]{"천의주","곽철용","정수영","강대윤","김판기","김선미"};
			
		//4. 과목명 입력
		String[] subject = new String[]{"국어","영어","수학","사회","과학","오라클","자바"};
	
		//1. 변수 score을 선언하고 6명의 7과목의 점수를 저장할 수 있도록 배열을 생성하세요
		//int score[][] = new int[6][7];
		int score[][] = new int[names.length][subject.length];
		for(int i=0;i<names.length;i++){
			for(int j=0;j<subject.length;j++){
				score[i][j] = (int) (Math.random() * 101 + 0);//점수를 저장
			}
		}
		
		//2. score각 방의 값을 0~100사이의 임의의 값을 저장하여라.
//		score[0][0] = (int) (Math.random()*101+0);
//		score[0][1] = (int) (Math.random()*101+0);
//		score[0][2] = (int) (Math.random()*101+0);
//		score[0][3] = (int) (Math.random()*101+0);
//		score[0][4] = (int) (Math.random()*101+0);
//		score[0][5] = (int) (Math.random()*101+0);
//		score[0][6] = (int) (Math.random()*101+0);
//			
//		for(int j=0;j<score[i].length;j++){
//			score[i][j] = (int)(Math.random()*101+0);
//			}
//			
//		score[1][0] = (int) (Math.random()*101+0);
//		score[1][1] = (int) (Math.random()*101+0);
//		score[1][2] = (int) (Math.random()*101+0);
//		score[1][3] = (int) (Math.random()*101+0);
//		score[1][4] = (int) (Math.random()*101+0);
//		score[1][5] = (int) (Math.random()*101+0);
//		score[1][6] = (int) (Math.random()*101+0);
//		score[1][7] = (int) (Math.random()*101+0);
			
//		for(int i=0;i<score.length;i++){
//			for(int j=0;j<score[i].length;j++)
//				score[i][j] = (int)(Math.random()*101+0);
//			}
		
		//5. 사람별 합계를 구하는 문장
		int nameSum[] = new int[names.length];		
		for (int i = 0; i < score.length; i++) { // i = 학생 수
			for (int j = 0; j < score[i].length; j++) { // j = 학생별 과목 점수
				nameSum[i]+=score[i][j];
			}
		}
	
		
		//6. 사람별 평균을 구하는 문장(소수 2째자리)
		float nameAvg[]=new float[names.length];
		for(int i=0;i<names.length;i++){
			nameAvg[i] = (int)(100f*nameSum[i]/subject.length+0.5)/100f;//평균을 구함			
		}
		
		//7. 과목합계를 구하는 문장
//		subjectSum[0]   += score[0][0] 		
//		subjectSum[0]	+= score[1][0]
//		subjectSum[0]	+= score[2][0]
//		subjectSum[0]	+= score[3][0]		
//		subjectSum[0]	+= score[4][0]		
//		subjectSum[0]	+= score[5][0]		
		int subjectSum[] = new int[subject.length];
		for(int i=0;i<subject.length;i++){
			for(int j=0;j<score.length; j++){
				subjectSum[i] += score[j][i];
			}
		}
		
		//8. 과목평균을 구하는 문장
		
		float subjectAvg[] = new float[subject.length];
		for(int i=0;i<subject.length;i++){
			for(int j=0;j<score.length;j++){
				subjectAvg[i] = (int)(100f*subjectSum[i]/names.length+0.5)/100f;
			}
		}
		
		//9. 석차를 구하는 문장
		int [] rank = new int []{1,2,3,4,5};
		if(nameSum[0]>nameSum[1]){
		}
		
			
		//0. 출력구문
//		System.out.print(score[0][0]);
//		System.out.print(score[0][1]);
//		System.out.print(score[0][2]);
//		System.out.print(score[0][3]);
//		System.out.print(score[0][4]);
//		System.out.print(score[0][5]);
//		System.out.print(score[0][6]);
			
		
		for (int i = 0; i < subject.length; i++) {
			System.out.print("\t" + subject[i]);
		}
		System.out.print("\t"+"총합");
		System.out.print("\t"+"평균");
		System.out.print("\t"+"석차");
		System.out.println();
		
		for (int i = 0; i < score.length; i++) { // i = 학생 수
			System.out.print(names[i] + "\t");
			for (int j = 0; j < score[i].length; j++) { // j = 학생별 과목 점수
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(nameSum[i]);
			System.out.print("\t"+nameAvg[i]);

			System.out.println();
		}
		System.out.print("과목합계");		
		for(int i=0;i<subject.length;i++){
			System.out.print("\t"+subjectSum[i]);
		}
		System.out.println();
		System.out.print("과목평균");
		
		for(int i=0;i<subject.length;i++){
			System.out.print("\t"+subjectAvg[i]);
		}
	}
}
