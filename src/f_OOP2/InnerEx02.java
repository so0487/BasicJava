package f_OOP2;

public class InnerEx02 {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.method(30);
	}

}


class Outer{
	int value = 10;
	
	class Inner{
		int value = 20;
		void method(int value){
//			System.out.println(value);				//넘어온 인자값 출력
			System.out.println(this.value);			//20을 출력
			System.out.println(Outer.this.value);	//10을 출력
			
		}
	}
}