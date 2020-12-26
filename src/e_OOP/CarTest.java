package e_OOP;

public class CarTest {
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
//		c1.color = "black";
//		c1.gearType = "stick";
//		c1.door = 4;
//		옵션의 갯수 만큼 추가추가추가 해줘야 한다.-->불편하다
		
		Car c2 = new Car();
		
//		c2.color="Black";
//		c2.gearType="stick";
//		c2.door=4;
		
		Car c3 = new Car("red","auto",2);
		System.out.println(c3.color+" "+c3.gearType+" "+c3.door);	
		
		Car c4 = new Car("auto");
		System.out.println(c4.color+" " +c4.gearType+" "+c4.door);
		
	}
}


class Car{
	String color;
	String gearType;
	int door;
	
	Car(){//기본 차량 셋팅을 수행
		color = "black";
		gearType = "stick";
		door=4;
	}
	
	
	Car(String color, String gearType, int door){
//		color = color;
//		gearType = gearType;
//		door = door;
		
		//null null 0  : 지역변수 내에서 자기 자신의 값에 넣어준다.
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		//지역변수 명과 인스턴스 변수의 이름이 같을 때 this. 활용하여 구분해준다.
	}
	
	Car(String gearType){
//		Car();
//		this.gearType = gearType;		//색상과 문이 기본값(null,0)
		
		this();							//생성자 내부에서 다른 생성자 호출 ---> 가장 첫 줄에서만 사용할 수 있다.
		this.gearType = gearType;
	}
}