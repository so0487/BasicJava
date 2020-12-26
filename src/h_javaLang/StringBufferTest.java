package h_javaLang;

public class StringBufferTest {
	public static void main(String[] args) {
		/*
		 String str = 'a';
		 str +="a";
		 .
		 .
		str = new StringBuffer(str).append("a").toString();
		.
		.
		 */
		long start = System.currentTimeMillis();

		
		StringBuilder sb = new StringBuilder("a");	//동기화를 신경쓰지 않는다.(사용시 제약조건이 있다.)(속도가 가장 빠르다)
//		StringBuffer sb = new StringBuffer("a");	//동기화를 보장
//		String str = "a";							//속도가 가장 느림
		
		for(int i = 0;i<30000000;i++){
//			str+="a";
			sb.append("a");
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
