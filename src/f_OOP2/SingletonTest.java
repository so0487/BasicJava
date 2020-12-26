package f_OOP2;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s = new Singleton();		--> 접근제어자가 private이므로 private Singleton에서는 사용할 수 없다.--> 클래스()로 만들어주어야 한다.
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	}

}



class Singleton{
	static Singleton s;		//-->클래스 내에서 사용하는 변수는 클래스 변수여야 함...--> static이 필요
	private Singleton() {	//인스턴스가 한 번만 이용되어야 할 때 private가 필요
		
	}
	
	public static Singleton getInstance(){
		if(s==null){
			s=new Singleton();
		}
		return s;
	}
}