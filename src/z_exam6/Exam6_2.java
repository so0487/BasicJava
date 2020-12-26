package z_exam6;

/*[6-2] 문제6-1에서 정의한 SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행
결과와 같은 결과를 얻도록 하시오.*/

public class Exam6_2 {
	public static void main(String[] args) {
		
		
		SutdaCard card1 = new SutdaCard(3, false);	
		SutdaCard card2 = new SutdaCard();
			
		System.out.println(card1.info());	//3이 츌력된다
		System.out.println(card2.info());	//1k가 출력된다.
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard (int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	SutdaCard() {
		this(1,true);
	}
	
	String info(){
		return num+(isKwang?"K":"");	//숫자+isKwang이 true이면 K
	}
	

}