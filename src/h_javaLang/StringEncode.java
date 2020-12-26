package h_javaLang;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringEncode {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//String str = "ab";				//영어는 다 동일하게 출력
		String str = "가나";				
		
		
		byte[] stArr1 = str.getBytes("CP949");
		byte[] stArr2 = str.getBytes("MS949");
		byte[] stArr3 = str.getBytes("UTF-8");
		
		System.out.println(Arrays.toString(stArr1));
		System.out.println(Arrays.toString(stArr2));
		System.out.println(Arrays.toString(stArr3));
		
	
		

	}

}
