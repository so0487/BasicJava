package j_regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_01 {
	public static void main(String[] args) {
		/*
		 1. 정규식이란?
		 	- 텍스트 내에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용하는 것.
		 	
		 2. 정규식의 구성
		 	- Pattern이라는 클래스를 이용하여 정규식을 정의한다.
		 	- Matcher클래스를 이용하여 Pattern과 데이터를 비교하는 역할을 한다.
		 	
		 */
		
		//패턴 등록
		Pattern p = Pattern.compile("[a-z]*[A-Z]");	//소문자가 0개 또는 무제한 있을 수 있으며 그리고 대문자가 나와야 한다.
		
		//정규식으로 대상비교
		Matcher m = p.matcher("aaa");	//괄호안 형식이 패턴에 맞는 형식????
		
		System.out.println(m.matches());		//정규식 결과 반환
		
	}

}
