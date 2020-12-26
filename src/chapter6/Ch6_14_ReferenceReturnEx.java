package chapter6;

//Data클래스를 만들고 정수형 변수 x를 선언
class Data{
	int x;
}

public class Ch6_14_ReferenceReturnEx {
	public static void main(String[] args) {
		//Data클래스를 참조하는 변수 d를 선언하고 인스턴스 생성
		Data d = new Data();
		//d의 x값을 10으로 변경
		d.x = 10;
		//copy클래스의 호출결과를 저장하는 변수 d2를 선언
		Data d2 = copy(d);
		
		//d의 x값과 d2의 x값 출력
		System.out.println("d : "+d.x);
		System.out.println("d2 : "+d2.x);
		
	}
	
	static Data copy(Data d){
		//Data클래스를 참조하는 변수 tmp를 선언하고 인스턴스 생성
		Data tmp = new Data();
		
		//tmp의 x값에 d의 x값을 저장 후 반환
		tmp.x = d.x;
		return tmp;
	}
}
