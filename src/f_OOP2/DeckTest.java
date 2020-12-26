package f_OOP2;

import java.util.Arrays;



public class DeckTest {
	public static void main(String[] args) {
		Card c = new Card();
		
		System.out.println(c.toString());			//주소 출력-----> SPADE A가 출력되도록
		
		Card c2 = new Card(3,5);
		System.out.println(c2);						//HEART : 5 출력
		
		
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));
		
		Card pick1 = d.pick(0);
		System.out.println("pick1의 값 : "+pick1);
		
		Card a = d.pick();
		System.out.println("a의 값 : "+a);
		
		d.shuffle();
		
		Card ca = d.pick();
		System.out.println("ca의 값 : "+ca);
		
		d.shuffle(50);
		Card ca2 = d.pick(0);
		System.out.println("ca2의 값 : "+ca2);
	}
}


class Card{
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE_MAX=1;	//--> 의미를 저장해서 변수를 만든다.
	static final int DIAMOND=2;
	static final int HEART=3;
	static final int CLOVER=4;
	
	int kind;
	int number;
	
	Card(int kind, int number){
		this.kind = kind;
		this.number=number;
	}
	
	Card(){
		this(1,1);
//		this(SPADE,1)				--> 의미를 저장해서 변수를 만든다.
	}
	@Override
	public String toString(){
		String kind = "";
		String number = "";
		//카드종류를 저장
		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;
		default:
			kind = "CLOVER";			
			break;
		}
		
		//숫자를 저장
		switch (this.number) {
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
		default:
			number = ""+this.number;
			break;
		}
		
		return kind + " : "+number;
	}
}

class Deck{
	//1. 카드의 수량을 저장할 수 있는 변수 CARD_NUM을 선언하고 Card클래스의 상수를 이용하여 초기화
	static final int CARD_NUM = Card.NUM_MAX * Card.KIND_MAX;	//상수는 공통부분, 고칠수없는 부분이기 때문에 static final을 붙여준다.
	//2. Card 52장을 저장할 수 있는 변수 c를 선언 및 생성
	Card [] c = new Card[CARD_NUM];
	//3. 기본 생성자를 만들어 주세요
	//	카드 52장을 각각 생성하여 인스턴스변수 c에 저장하여라.
	Deck(){
//		c[0] = (1,1);
//		c[1] = (1,2);
//		:		:
//		c[51]= (4.13);
		int i=0;
		for(int j=1;j<Card.KIND_MAX+1;j++){
			for(int k=1;k<Card.NUM_MAX+1;k++){
				c[i++] = new Card(j,k);		//새로운 방을 만들어주기 위해 i++
			}
		}
	}
	//4. c의 카드 중 사용자로부터 입력받은 index번째 카드 한 장을 반환하는 메서드(pick)
	Card pick(int index){
		Card card = c[index];
		return card;
	}
	//5. c의 카드를 임의의 한장을 반환하는 메서드(pick)
	//		단, 4변의 pick메서드를 활용해주세요
	Card pick(){
		int random = (int)(Math.random()*CARD_NUM);
		Card a = pick(random);
		return a;
		
	}
	//6. c의 카드를 섞어주세요(shuffle)
	//		단, 연습문제 5-5를 응용해주세요
	void shuffle(){										//반환 값이 없으므로 void
		for(int i=0;i<CARD_NUM;i++){
			int random = (int)(Math.random()*CARD_NUM);
			Card tmp=c[i];
			c[i] = c[random];
			c[random]=tmp;
		}
	}
	
	//7. c의 카드를 섞어주세요(shuffle)
	//		단, 임의의 카드 두 장의 위치를 바꿔주세요, 이 때 사용자로부터 받은 수 만큼 반복해주세요
	void shuffle(int number){
		int card1 = (int)(Math.random()*CARD_NUM);
		int card2 = (int)(Math.random()*CARD_NUM);
		for(int i=0;i<number;i++){
			Card tmp=c[card1];
			c[card1]=c[card2];
			c[card2]=tmp;
		}
	}
}