package j_regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_02 {
	public static void main(String[] args) {
		/*
		 ^	: 문자열의 시작
		 $	: 문자열의 끝
		 .	: 임의의 한 문자, '\'는 넣을 수 없기 때문(\을 특수문자로 인식하기 때문)
		 *	: 문자가 없을수도 무한정 있을수도 있다.
		 +	: 앞에 문자가 하나 이상
		 ?	: 앞문자가 없거나 하나
		 []	: 문자열의 집합이나 범위를 나타내며 문자 사이의  - 기호로 범위를 나타낸다. 
		 {}	: 횟수 또는 범위를 나타낸다.
		 ()	: 소괄호 안의 문자들을 하나의 문자로 인지한다. ex(ab)* : ababab......여러번 반복
		 |	: 패턴 안에서 or연산을 수행한다.
		 \s	: 공백문자
		 \S	: 공백을 제외한 모든문자
		 \w	: 알파벳이나 숫자
		 \W	: 알파벳이나 숫자를 제외한 모든 문자
		 \d	: 숫자[0-9]
		 */
		
		
		
		//1.소문자가 2~3회 반복
		Pattern p = Pattern.compile("[a-z]{2,3}");
		Matcher m = p.matcher("aba");	//true
//		Matcher m = p.matcher("abaaaa");	//false
		System.out.println(m.matches());
		
		
		String regEx01 = "[a-z]{2,3}";
		System.out.println(Pattern.matches(regEx01, "ads"));
		
		
		//2.영문자가 3개 그리고 숫자가 하나 이상 존재해야 한다.
		String regEx02 = "[A-Za-z]{3}[0-9]+";
		System.out.println(Pattern.matches(regEx02, "aaa2"));
		
		//3.핸드폰번호
		//숫자3개-숫자4개-숫자4개
		
		String regEx03 = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		System.out.println(Pattern.matches(regEx03, "010-1234-5678"));
		
		//4.핸드폰번호 upgrade
		/*
		 010 - 1~9숫자1개 + 3개 - 숫자 4개
		 011
		 016
		 017
		 018
		 019
		 */
		String regEx04 = "^(01)[016789]-[1-9][0-9]{3}-[0-9]{4}";
		System.out.println(Pattern.matches(regEx04, "019-1234-4567"));
		
		//5.주민등록번호 확인
		//941027-1171211
		/*
		 숫자2자리 0 1-9 0 1-9	- 1~4 숫자6자리
		 		1 0-2 1 0-9
		 		      2 0-9
		 		      3 0-1
		 */
		
//		String regEx05 = "[0-9]{2}([0][1-9]|[1][0-2])([0][1-9]|[12][0-9]|[3][01])-[1-4][0-9]{6}";
		String regEx05 = "\\d{2}([0][1-9]|[1][0-2])([0][1-9]|[12]\\d|[3][01])-[1-4]\\d{6}";
		System.out.println(Pattern.matches(regEx05, "941027-1171211"));

		//6.이메일 정규식
		
		//시작은 영문자, 그 외 문자는 영문자 또는 숫자이여야 하고 특수기호는 -_\. 있을 수도 있다.
		//@ 이후에는 영어 대소문자가 1~7개가 있다. 
		//.이후에 영문자가 2~3자가 올 수 있다.
		//.kr이 있을수도 있고 없을수도 있다.
		
		String regEx06 = "^[A-Za-z]([-_.\\\\]?|\\w)*@[A-Za-z]{1,7}[.][A-Za-z]{2,3}([.]kr)?";
//		System.out.println(Pattern.matches(regEx06, "so04870487@hanmail.net"));
		System.out.println(Pattern.matches(regEx06, "so0487\\0487@hanmail.net"));
		
	}

}
