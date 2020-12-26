package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame{
	public static void main(String[] args) {
//		DrawShape ds = new DrawShape();
		DrawShape ds = new DrawShape("ssss");	//---> 타이틀 변경
		
//		ds.paint(그래픽의 객체);
	}
	@Override
	public void paint(Graphics g) {
		//1. 매개변수가 두개인 생성자를 호출하여 Circle객체를 만들어주세요
		Point p1 = new Point(100,100);
		Circle c = new Circle(p1, 50);
		
		//2. g.drawOval() 이용하여 원을 그려주세요

		g.drawOval(c.p.x, c.p.y, c.r*2, c.r*2);
		
		//3. 매개변수가 하나인 생성자를 호출하여 Triangle객체를 만들어주세요
		//   100,100  200,200  200,100
		
		Point p2 = new Point(100,100);
		Point p3 = new Point(200,200);
		Point p4 = new Point(200,100);
		
		Point[] p = new Point[3];
		p[0]=p2;
		p[1]=p3;
		p[2]=p4;
		
		Triangle t = new Triangle(p);

		
		//4. g.drawLine() 3개를 이용하여 삼각형을 그려주세요
		g.drawLine(t.p[0].x, t.p[0].y, t.p[1].x, t.p[1].y);
		g.drawLine(t.p[1].x, t.p[1].y, t.p[2].x, t.p[2].y);
		g.drawLine(t.p[2].x, t.p[2].y, t.p[0].x, t.p[0].y);

	}
	
	
	DrawShape() {
		super("수영이가 잘못했네");    // 부모에 있는 생성자를 호출 --> 타이틀을 변경
		setSize(500, 500);       // 너비 , 높이
		setBackground(Color.MAGENTA);  // 바탕색
		setVisible(true);
		setResizable(false);
	}
	
	DrawShape(String title){
		super(title);    // 부모에 있는 생성자를 호출 --> 타이틀을 변경
		setSize(500, 500);       // 너비 , 높이
		setBackground(Color.lightGray);  // 바탕색
		setVisible(true);
		setResizable(false);
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle{
	//1. 점 하나를 저장할 수 있는 변수 p를 선언
	Point p;
	//2. 반지름(정수)을 저장할 수 있는 변수 r을 선언
	int r;
	//3. 매개변수가 2개인 생성자를 만들어주세요
	//   단, 매개변수로 p와 r을 초기화할 수 있어야합니다
	Circle(Point p, int r){
		this.p = p;	
		this.r = r;
	}
	//4. 기본생성자를 만들어주세요
	//   단, 매개변수가 두개인 생성자를 호출하여 중심점 100,100 반지름 50으로 초기화 해주세요
	
	Circle(){
		this(new Point(100,100), 50);
	}
}

class Triangle{
	//5. 점 3개를 저장할 수 있는 변수 p를 선언해주세요
	Point[] p;
	
	//6. 매개변수가 하나인 생성자를 만들어주세요
	Triangle(Point[] p){
		this.p = p;
	}
	//7. 매개변수가 3개인 생성자를 이용해 p를 초기화해주세요
	Triangle(Point a, Point b, Point c){
		p = new Point[3];
		p[0] = a;
		p[1] = b;
		p[2] = c;
	}
}