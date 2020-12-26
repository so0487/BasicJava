package f_OOP2;

public class Abstract01 {
	public static void main(String[] args) {
		
	}

}

//class Unit{
//	int x;
//	int y;
//	void move(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
//	void stop(){
//		
//	}
	abstract class Unit{
		int x;
		int y;
		abstract void move(int x, int y);
		void stop(){
			
		}

class Marine extends Unit{
//	int x;
//	int y;
//	void move(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
//	void stop(){
//		
//	}
	void stimPack(){
		
	}

	@Override
	void move(int x, int y) {
	// TODO Auto-generated method stub
	
	}
}

class Tank extends Unit{
//	int x;
//	int y;
//	void move(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
//	void stop(){
//		
//	}
	void changeMode(){
		
	}

	@Override
	void move(int x, int y) {
	
	}
}

class DropShip extends Unit{
//	int x;
//	int y;
//	void move(int x, int y){
//		this.x=x;
//		this.y=y;
//	}
//	void stop(){
//		
//	}
	void load(){
		
	}
	void unLoad(){
		
	}
	
	@Override
	void move(int x, int y) {
		
		
	}

}
}

	