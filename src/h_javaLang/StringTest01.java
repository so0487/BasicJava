package h_javaLang;

public class StringTest01 {
	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		String str2_1="ac";
		
		System.out.println(str1==str2);		//true출력	--> "abc"주소를 갖는 상수풀에 저장
		
		System.out.println(str1.equals(str2));
		
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3==str4);		//주소값을 비교 --> false를 비교
		System.out.println(str3.equals(str4));	//true 출력 --> equals.()가 오버라이드
		System.out.println(str3);	//abc값 출력 : toString()가 오버라이드
		
		System.out.println(str1.equals(str3));	//주소에 있는 값을 비교 --> 모두 abc로 같다.
		
		
		
		
	}
}