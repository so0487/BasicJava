package h_javaLang;

import java.io.Serializable;
import java.util.Arrays;

public class GetClassTest {
	public static void main(String[] args) throws ClassNotFoundException {
		//객체로 부터 얻는 방법
		Class c1 = new Card("SPADE",1).getClass();		
		System.out.println(c1.getName());
		System.out.println(Arrays.toString(c1.getInterfaces()));
		
		//클래스 리터럴로 부터 얻는 방법
		Class c2  = Card.class;
		System.out.println(c2.getName());
		System.out.println(Arrays.toString(c2.getInterfaces()));
		
		//클래스의 이름으로 부터 얻는 방법
		Class c3 = Class.forName("h_javaLang.Card");	//패키지명.클래스명 형태로 써야 한다.
		System.out.println(c3.getName());
		System.out.println(Arrays.toString(c3.getInterfaces()));
		
	}
}


class Card implements Serializable{
	String kind;
	int num;
	
	Card(String kind, int num){
		this.kind=kind;
		this.num=num;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", num=" + num + "]";
	}
	
}