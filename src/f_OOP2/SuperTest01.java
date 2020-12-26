package f_OOP2;

public class SuperTest01 {
	public static void main(String[] args) {
		
	}
}


class Parent2{
	int x = 10;
	int y = 20;
	
	int getAdd(){
		return x+y;
	}
}

class Child2 extends Parent2{
	int x = 30;
	int y = 40;
	
	int getAdd(int x){
		System.out.println(x);				//넘어온 인자값 출력
		System.out.println(this.x);			//30 출력(자식의 x값)
		System.out.println(super.x);		//10출력(부모의 x값)
		return 0;
	}
}
