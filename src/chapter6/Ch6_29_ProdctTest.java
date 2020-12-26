package chapter6;

class Product{
	//생성된 인스턴스 수를 저장하는 클래스변수 count를 선언하고 0으로 초기화
	static int count =0;
	
	//생성된 인스턴스를 관리하는 serialNo선언
	int serialNo;
	
	//product가 생성될 때 마다 생성된 인스턴스의 수를 serialNo에 저장
	{
		++count;
		serialNo=count;
	}
	//product 기본 생성자 선언
	public Product(){
		
	}
}
public class Ch6_29_ProdctTest {
	public static void main(String[] args) {
		//p1~p3제품생산하는 인스턴스 생성
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		//p1~p3의 값과 총 생산된 제품 수 출력
		System.out.println("p1의 제품번호 : "+p1.serialNo);
		System.out.println("p2의 제품번호 : "+p2.serialNo);
		System.out.println("p3의 제품번호 : "+p3.serialNo);
		
		System.err.println("총 생산된 제품 수 : "+Product.count);
		
	}

}
