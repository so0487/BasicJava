package f_OOP2;

public class InstanceofTest {
	public static void main(String[] args) {
		
		FireCar2 fc = new FireCar2();
		
		if(fc instanceof FireCar2){
			System.out.println("fc는 FireCar2의 인스턴스이다.");
			FireCar2 fc2 = fc;
		}
		if(fc instanceof Car2){
			System.out.println("fc는 Car2의 인스턴스이다.");
			Car2 c2 = fc;
		}
		if(fc instanceof Object){
			System.out.println("fc는 Object의 인스턴스이다.");
			Object o2 = fc;
		}
		
		Car2 c2 = new Car2();
		if(c2 instanceof FireCar2){
			System.out.println("c2는 FireCar의 인스턴스이다");		//false
			
			FireCar2 f2 = (FireCar2)c2;
			if(c2 instanceof Object){
				System.out.println("fc는 Object의 인스턴스이다.");	//flase	
			}
		}
		Car2 c = fc;
		System.out.println(fc.a);
		System.out.println(c.a);
		
		System.out.println(fc.b);
		System.out.println(c.b);
		
		fc.method2();
		c.method2();	//인스턴스메서드가 오버라이드 되었을 때 자삭의 것을 우선, 객체의 타입을 따라감
			
	}

}


class Car2{
	static int a = 10;
	int b = 30;
	static void method(){
		System.out.println("car2 method");
	}
	
	void method2(){
		System.out.println("car2 instanceMethod");
	}
}


class FireCar2 extends Car2{
	
	static int a = 20;
	int b = 40;
	static void method(){
		System.out.println("FireCar2 Method");
	}
	
	void method2(){
		System.out.println("FireCar2 instanceMethod");
	}
	
}
