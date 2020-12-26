package h_javaLang;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String text = "100,200,300,400";
		
		StringTokenizer st = new StringTokenizer(text, ",");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());		//한번돌아가면 다시 시작되지 않는다.
		}
		
		String data = "100,,200,,300,,400";
		
//		String[]dataArr = data.split(",");
		String[]dataArr = data.split("0,");
		System.out.println("=======================================");
		for(int i=0;i<dataArr.length;i++){
			System.out.println(dataArr[i]);
		}
		System.out.println("=======================================");
//		StringTokenizer st2 = new StringTokenizer(data,",");
		StringTokenizer st2 = new StringTokenizer(data,"0,");
		
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
	}

}
