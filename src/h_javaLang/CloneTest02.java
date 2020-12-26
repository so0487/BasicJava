package h_javaLang;

import java.util.Arrays;

public class CloneTest02 {
	public static void main(String[] args) {
		//point 3개 (1,1),(2,2),(3,3) 출력
		Point[] arr = new Point[3];
		arr[0] = new Point(1,1);
		arr[1] = new Point(2,2);
		arr[2] = new Point(3,3);
		
		arr.clone();
		
		Point[] arrClone = arr.clone();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		arr[0].x=50;
		arr[0].y=70;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
	}

}



class Point{
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}