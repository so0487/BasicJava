package f_OOP2;

public class PointTest {
	public static void main(String[] args) {
		
	}
}



class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2{
	int z;
	Point3D(int x, int y, int z){
		super(x,y);					//super() : 기본생성자 호출----> 위에 기본생성자가 없다.--> x,y의 값을 써주어야 한다.
	}
}