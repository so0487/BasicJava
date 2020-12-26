package f_OOP2;

import z_exam.ProtectedTest_03;

public class ProtectedTest_01 extends ProtectedTest_03{
	public static void main(String[] args) {
		ProtectedTest_02 pt2 = new ProtectedTest_02();
//		pt2.	//a,b,c를 호출할 수 있다.(같은 페키지)
		
		ProtectedTest_03 pt3 = new ProtectedTest_03();
//		pt3.	//a만 호출할 수 있다.
		
		ProtectedTest_01 pt1 = new ProtectedTest_01();
//		pt1.	//a,b만 호출할 수 있다.
		
	}
}
