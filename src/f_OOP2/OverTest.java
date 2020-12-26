package f_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo();
		
		String result = og.upMethod();		//upMethod()호출
		System.out.println(result);
		
		String resutlt2 = og.superUpMethod();	//부모의 upMethod()호출
		System.out.println(resutlt2);
		
	}
}

class OverUp{
	int x = 10;
	int y = 20;
	
	String upMethod(){
		return x+y+"upMethod";
	}
}

class OverGo extends OverUp{
	int z = 50;
	@Override
	String upMethod(){
		return x+y+z+"OverGo";
	}
	
	String upMethod(String name){
		return z+name;
	}
	
	String superUpMethod(){
		return super.upMethod();
	}
}