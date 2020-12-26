package z_exam6;

public class Exam6_6 {
	//두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	//[Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
	//두 점 사이의 거리를 구하는 공식 : √(x-x1)²+(y-y1)²
	static double getDistance(int x, int y, int x1, int y1){
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}




	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}
