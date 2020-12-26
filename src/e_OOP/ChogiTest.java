package e_OOP;

public class ChogiTest {
	public static void main(String[] args) {
//		Init i = new Init();
//		
//		System.out.println(i.action2);		//Init(action2를 지우고 수행하면)11출력

		
		
		System.out.println(Init.action);	//클래스 로드 ==> 클래스초기화 블럭
		
		Init i = new Init(7);				//인스턴스화 ==> 초기화블럭 ==> 생성자
		
		System.out.println(i.action2);		//7출력
		
		
	}
}



class Init{
	static int action;
	int action2 = 11;	//명시적 초기화
	
	static{
		action = 8;
	}
	
	{
		action = 100;
	}
	
	Init(int action2){
		this.action2 = action2;
	}
}