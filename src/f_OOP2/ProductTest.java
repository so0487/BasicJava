package f_OOP2;

import java.util.Vector;

public class ProductTest {
	public static void main(String[] args) {
		Tv3 t = new Tv3("t", 300);
		Microwave mi = new Microwave("mi", 50);
		Notebook n = new Notebook("n", 200);
		
		Buyer b = new Buyer("b", 1000);
		
		//t=3 / n=1 / mi=7 구입
		
		b.buy(t);
		b.buy(t);
		b.buy(t);
		b.buy(n);
		b.buy(mi);
		b.buy(mi);
		b.buy(mi);
		b.buy(mi);
		b.buy(mi);
		b.buy(mi);
		b.buy(mi);
		
		b.refund(mi);
		b.summary();
		
		
	}
}


class Product{
	String name;
	int price;
	int mileage;
	
	
	public Product(String name, int price) {
		this.name = name;
		this.price  = price;
		mileage = price/100;
	}
}


class Tv3 extends Product{

	Tv3(String name, int price){
		super(name, price);
	}
	@Override
	public String toString() {
		return "Tv3";
	}
}

class Microwave extends Product{
	public Microwave(String name, int price) {
		// TODO Auto-generated constructor stub
		super(name, price);
	}
	@Override
	public String toString() {
		return "Microwave ";
	}
}

class Notebook extends Product{
	public Notebook(String name, int price) {
		// TODO Auto-generated constructor stub
		super(name,price);
	}
	@Override
	public String toString() {
		return "Notebook";
	}
}


class Buyer{
	String name;
	int money;
	int mileage;
	
	Vector<Product> item = new Vector<>();	//Object타입으로 저장	//product타입만 받는다.
	
	Buyer(String name, int money){
		this.name = name;
		this.money = money;
	}
//	void buy(Tv3 t){
//		if(t.price<=money){
//			money-=t.price;
//			mileage+=t.mileage;
//			System.out.println(t+"를 구매하셨습니다.");
//		}else
//			System.out.println("결제 실패");
//	}
//	
//	void buy(Microwave t){
//		if(t.price<=money){
//			money-=t.price;
//			mileage+=t.mileage;
//			System.out.println(t+"를 구매하셨습니다.");
//		}else
//			System.out.println("결제 실패");
//	     }
//	
//	void buy(Notebook t){
//		if(t.price<=money){
//			money-=t.price;
//			mileage+=t.mileage;
//			System.out.println(t+"을 구입하셨습니다.");
//		}else
//			System.out.println("결제 실패");
//	}
	
	void buy(Product t){//매개변수의 다형성을 활용!!!
		if(t.price<=money){
			money-=t.price;
			mileage+=t.mileage;
			boolean result = item.add(t);
			if(result){
				System.out.println(t+"을 구입하셨습니다.");				
			}else{
				System.out.println("구매실패");
			}
		}else{
			System.out.println("결제 실패");
		}
	}
	//반품(refund)를 구현해주세요

	void refund(Product p){
		if(item.isEmpty()){
			System.out.println("물품을 구매하신적이 없습니다");
			return;
		}
		for(int i=0;i<item.size();i++){
			Product p2 = (Product)item.get(i);
			if(p2.name==p.name){
				item.remove(i);
				money+=p.price;
				mileage-=p.mileage;
				break;
			}
		}
	}
	
	
	//summary를 구현해주세요
	void summary(){
		System.out.println("\t영\t수\t증");
		System.out.println("구매목록");
		int sum=0;
		for(int i = 0;i<item.size();i++){
			Product p = (Product)item.get(i);
			System.out.println("\t"+p.name+"\t"+p.price+"만원");
			sum+=p.price;
		}
		System.out.println("총합 : "+sum+"만원");
		System.out.println("잔액 "+money+"만원\t마일리지 "+mileage+"만원");
		System.out.println("감사합니다.");
	}
	/*
	 			영		수		증
	 	
	 	구매목록 : 
	 	 		Tv			300만원
	 	 		Tv			300만원
	 	 		mirco		50만원
	 	 		micro		50만원
	 	 		총 합			700만원
	 	 		
	 	 고객님의 잔액은 300만원이고 마일리지는 7만점 입니다.
	 	 감사합니다.
	 */
}


class DBclass{
	private Vector<Buyer>buyerList = new Vector<>();
	private Vector<Product>productList = new Vector<>();
}
