package h_javaLang;

public class EqualsTest_01 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1==v2);			//객체 인스턴스가 다르니 false 출력
		System.out.println(v1.equals(v2));	//주소를 비교 ---> false 출력
		
		Person p1 = new Person(9410271171211L);
		Person p2 = new Person(9410271171211L);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}

}


class Value{
	
	int value;
	
	Value(int value){
		this.value=value;
	}
	
}


class Person{
	
	long regNo;
	
	Person(long regNo){
		this.regNo=regNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		//1.obj가 null인지 확인
		//2.obj가 Person의 인스턴스 인지 확인
		
		//p1의 regNo와 p2의 regNo가 같으면 결과 값 true 출력
		boolean result = false;
//		방법 1
		
//		if(regNo==((Person)obj).regNo){
//			
//			result = true;
//		}
	
		
//		방법 2
		
		if(obj!=null&&obj instanceof Person){
			result = regNo==((Person)obj).regNo;
		}
		
		return result;
	}
}
