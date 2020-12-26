package h_javaLang;

import static java.lang.Math.*;

public class MathTest {
	public static void main(String[] args) {
		double d = 25.1492;
		
		//반올림
		System.out.println(Math.round(d));		//25출력 double --> long으로 출력
		
		//올림
		System.out.println(Math.ceil(d));		//26.0출력
		
		//버림
		System.out.println(Math.floor(d));		//25.0출력
		
		//제곱
		System.out.println(pow(2, 4));			//16.0출력
		
		//루트
		System.out.println(sqrt(d));
		
		
		
		Point2 a = new Point2(2, 5);
		float b = a.getDistance(new Point2(10,15));
		System.out.println(b);
	}

}


class Point2{
	int x;
	int y;
	
	public Point2(int x, int y) {
		this.x=x;
		this.y=y;
		
	}

	@Override
	public String toString() {
		return "Point2 [x=" + x + ", y=" + y + "]";
	}
	float getDistance(Point2 p){
		double a = sqrt(pow((p.x-x),2)+pow((p.y-y),2));
		
		float b = round(a*100)/100f;
		return b;
		
		
	}
}