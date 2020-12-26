package h_javaLang;

public class JavaLangBasic {
	public static void main(String[] args) {
		/*
		1.java.lang 패키지
			- 자바프로그래밍에 기본이 되는 클래스들을 포함하고 있다.
			ex)String, System.....
			
		2.Object클래스
			- Object클래스는 멤버변수 없이 11개의 메서드로 이루어져 있다.
			
			- boolean equals(Object obj)
				: 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 돌려준다.
				: 참조변수에 저장된 주소값이 같은지를 판단할 수 밖에 없다.
				: 주소의 값이 아닌 멤버변수의 값을 비교하기 위해서는 equals()를 오버라이드 해야 한다.
				: equals메서드가 오버라이드 되어 있는 클래스들
					ex) String, Date, File, wrapper클래스...
					
			- hashCode() - 10진수로 이루어져 있다.
				: 객체의 주소를 이용하여 해시코드를 만들어 반환한다.
				: String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 hashCode()가
				 	오버라이드 되어 있다.
				 	
			- toString()
				: 인스턴스의 정보를 문자열로 제공할 목적으로 작성
				: 기본 toString메서드
					return getClass().getName()+"@"+Integer.toHexString(hashCode());
					
			- clone()
				: 얕은복사
					자신을 복제하여 새로운 인스턴스를 만든다.
					단순히 인스턴스변수의 값만을 복사한다.
					객체가 참조하고 있는 객체까지는 복제하지 않는다.
				: 깊은복사
			- getClass()
				: 자신이 속한 클래스의 Class객체를 반환하는 메서드
				: Class의 객체를 얻는 방법
					(1)생성된 객체로 부터 얻는 방법 
						Class obj = new Card().getClass();
					(2)클래스 리터럴로 부터 얻는 방법
						Class obj = Card.class;
					(3)클래스의 이름으로부터 얻는 방법
						Class obj = Class.forName("Card");
						
		3.String클래스
			- 다른 언어에서는 문자열 char형의 배열로 다루었으나, java에서는 문자열을 위한 클래스를 제공한다.
			- 문자열을 합치게 될 때 새로운 문자열을 가진 String인스턴스가 생성
			- 문자열간의 결합에는 StringBuffer클래스를 사용하는 것이 좋다.
			
			- 문자열의 비교
				: 문자열 리터럴을 저장하는 방법과 String클래스의 생성자를 사용하는 방법이 있다.
				: 문자열 리터럴은 클래스가 메모리에 로드될 때 자동적으로 생성된다.
			- String클래스의 메서들
			- 문자 인코딩 변환
				: 한글 윈도우 문자 인코딩 방식이 CP949 하지만 우리는 UTF-8을 사용
				
			- String format
				: 기본형 값을 String으로 변환
					1) 빈 문자열을 더하는 방식
						int a = 100;
						String b = a+""
					2) valueOf()를 이용하는 방식
						String c = String.valueOf(a);
				: String형을 기본값을 변환
					1) wrapper클래스를 이용하는 방법
						String s = "100";
						int a = Inter.parseInt(s);
						int b = Inter.valueOf(s);
					2) String을 기본형으로 변환시 결과는 10진수 이다.
						String s2 = "201";
						int a = Integer.parseInt(s2,16)		//s2가 16진수 입니다.
						int a = Integer.parseInt(s2,2)		//s2가 16진수 입니다.
						
		4.StringBuffer,StringBuilder클래스들
			- String 클래스는 인스턴스를 생성할 때 지정된 문장을 변경할 수 있다.
			- 문자열의 변경을 위해서는 StringBuffer클래스를 사용해야 한다.
		
		5.Math클래스
		
		6. 래퍼(wrapper)클래스
			- 객체지향의 개념은 모든것을 객체로 다루어야 한다.
			- 8가지 기본형 타입은 객체로 다루지 못한다.
			- 때로는 기본형도 어쩔 수 없이 객체로 다루어야 하는 경우가 있다.
				: 매개변수로 객체를 요구할 때  method(Object obj)
				: 기본형이 아닌 객체로 저장되어야 할 때 Object[] obj;
			이런경우 기본형 값들을 객체로 변환하는 작업을 수행해야 한다.
				
				기본형				wrapper클래스
				boolean		|		Boolean
				char		|		Character***
				byte		|		Byte
				short		|		Short
				int			|		Integer***
				long		|		Long
				float		|		Float
				double		|		Double
				
				
			- 오토박싱 : 기본형 값을 래퍼클래스의 객체로 변환해주는 것
			- 언박싱 : 래퍼클래스 객체를 기본으로 변환해 주는 것
			
		7. StringTokenizer클래스
			- 긴 문자열을 지정된 구분자를 기준으로 토근(token)이라는 여러개의 문자열로
				잘라내는데 사용된다.
			- 단 한 문자의 구분자만 사용할 수 있다.
			
			
			
			
							
		 */
	}

}
