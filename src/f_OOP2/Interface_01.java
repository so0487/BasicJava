package f_OOP2;

public class Interface_01 {
	public static void main(String[] args) {
		Fight f = new Fight();
		
		if(f instanceof Fight){
			System.out.println("f는 Fight의 인스턴스이다.");
			Fight f2 = f;
		}
		
		System.out.println(f instanceof Unit2);
		
		if(f instanceof Fightable){
			System.out.println("f는 Fightable의 구현체이다");
			Fightable f2 = f;
		}
	}

}

class Fight extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {
		
		
	}

	@Override
	public void attack(Unit2 u) {
		
	}
	
}

class Unit2{
	int x;
	int y;
	int currentHp;
}

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit2 u);
}


interface Fightable extends Movable,Attackable{//인터페이스는 다중 상속이 가능
	
}