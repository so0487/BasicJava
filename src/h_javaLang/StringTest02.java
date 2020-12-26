package h_javaLang;

import java.util.Arrays;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class StringTest02 {
	public static void main(String[] args) {
		//oracle에서도 사용되는 것들
		//1. String concat : 문자열을 뒤에 덧붙인다.
		String s1 = "Hello";
		String s2 = s1.concat("Oracle");
		System.out.println(s2);
		
		//2.boolean contains():문자열이 포함되어있는지 확인
		System.out.println(s2.contains("o O"));	//false
		System.out.println(s2.contains("oO"));	//true
		
		
		//확장자 처리에 유용한 것들
		//1.boolean endsWith : 해당 문자열로 끛나는지 검사한다.
		String s3 = "ㅇㅇㅇㅇㅇㅇ.hwp";
		System.out.println(s3.endsWith(".hwp"));
		
		//그 외
		//1. int lastIndexOf();  
		//: 지정된 문자 또는 문자코드를 오른쪽 끝에서 부터 찾아서 해당 index를 반환하여 준다.
		int indexof = s2.lastIndexOf("J");		//없으면 -1
		int indexof2 = s2.lastIndexOf("H");		//있으면 index반환(0부터 시작)
		
		System.out.println(indexof);
		System.out.println(indexof2);
		
		//2. String replace() : 문자열 중의 문자를 새로운 문자로 변환
		String s4 = s2.replace("Oracle", "Java"); //Oracle --> Java
		System.out.println(s4);
		
		//3. String[] split() : 문자열을 지정된 분리자로 나누어 문자열 배열에 저장한다.
		String s5 = "aa,44,ddfd,255dd";
		String[] s5Arr = s5.split(",");
		System.out.println(Arrays.toString(s5Arr));
		
		
		//4. String subString() : 주어진 문자열을 시작부터 끝 위치 범위에 포함된 문자열을 얻는다.
		//		begin <=x<end
		
		String s6 = s4.substring(2, 5);
		System.out.println(s6);	 //HelloJava 중 llo출력
		
		//5. String trim() : 문자열의 양끝의 공백을 제거한다.
		String s7="my		trim		";
		String s8=s7.trim();
		System.out.println(s8);
		
	}
	

}
