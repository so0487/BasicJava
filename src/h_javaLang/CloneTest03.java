package h_javaLang;

public class CloneTest03 {
	public static void main(String[] args) {
		//Circle 객체 c1
		Circle c1 = new Circle(new Point(100,100),100);
		
		//c1을 복사하여 c2에 저장
		
//		Circle c2 = (Circle)c1.shallowCopy();
		Circle c2 = (Circle)c1.deepCopy();
		
		//c1과 c2의 값을 출력
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		c1.r = 30;
		c1.p.y = 1000;
		
		System.out.println(c1);
		System.out.println(c2);
	}

}


class Circle implements Cloneable{
	Point p;
	int r;
	
	
	//Circle 생성자 매개변수 2개
	
	Circle(Point p, int r){
		this.p=p;
		this.r=r;
	}

	//toString() override

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

		
	//clone()오버라이드 - 기본
	protected Object shallowCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj; 
	}
	
	//c1에 있는 x,y가 바뀌어도 c2의 좌표는 바뀌지 않도록 수정
	protected Object deepCopy() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		Point p2 = new Point(p.x, p.y);
		((Circle)obj).p=p2;
		return obj; 
	}


	
}
