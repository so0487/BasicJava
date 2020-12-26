package chapter6;

class Car{
	//차의 기본적인 구성을 저장하는 color, gearType, door 생성
	String color;
	String gearType;
	int door;
	
	//car의 정보를 호출
	//기본값을 white,auto,4로 변경
	Car(){
		this("white","auto",4);
	}
	
	//clolr의 값을 color의 값으로 변경
	Car(String color){
			this(color,"auto",4);
	}
	//car를 호출하고 color, gearType, door값으로 변경
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType=gearType;
		this.door=door;
	}
	
}
public class Ch6_25_CarTest2 {
	public static void main(String[] args) {
		//car크래스를 참조하는 변수c1을 선언하고 인스턴스 생성
		Car c1 = new Car();
		
		//car클래스를 참조하는 변수c2를 선언하고 인스턴스 생성
		//c2의 색상은 blue
		Car c2 = new Car("blue");
		
		//c1과 c2의 color, gearType, door각각 출력
		System.out.println("c1의 color : "+c1.color+" / gearType : "+c1.gearType+" / door : "+c1.door);
		System.out.println("c2의 color : "+c2.color+" / gearType : "+c2.gearType+" / door : "+c2.door);
		
	}
	
}
