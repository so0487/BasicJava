package e_OOP;



class Dice{
	//1. throwDice메서드 생성
	 int throwDice(){
		 //	1.1. 주사위 두 개를 던져서 그 합을 반환하는 메서드
		int dice1=(int)(Math.random()*6)+1;
		int dice2=(int)(Math.random()*6)+1;
		System.out.println("dice 1 : "+dice1);
		System.out.println("dice 2 : "+dice2);
		int result = dice1+dice2;
		
		
		
		if(dice1==dice2){
			result+=throwDice();
		//			(단, 주사위의 눈이 같으면 한번 더 던진다.)
			
			}
		return result;
		}
	 
}
public class DiceTest {
	public static void main(String[] args) {
		Dice d = new Dice();
		int result = d.throwDice();
		System.out.println(result);
		
	}
}

