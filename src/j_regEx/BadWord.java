package j_regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BadWord {
	public static void main(String[] args) {
		String text = "야이 개나리 십장생야.. 이런 조카신발 같은 경우를 봤나...";
		String result = fileterText(text);
		System.out.println(result);
	}
	
	
	
	static String fileterText(String text){
		
		Pattern p = Pattern.compile("개나리|십장생|조카신발|병1신",Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(text);
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()){
			maskWord(m.group());
			m.appendReplacement(sb, maskWord(m.group()));
		}
		m.appendTail(sb);
		return sb.toString();
	}
	
	

	static String maskWord(String word){
		char [] ch = word.toCharArray();	//개		나		리
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<ch.length;i++){
			if(i==0){
				sb.append(ch[i]);
			}else
				sb.append("*");
		}
	return sb.toString();
	}
}