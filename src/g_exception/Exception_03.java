package g_exception;

public class Exception_03 {
	public static void main(String[] args) {
		
		Exception e1 = new Exception("오류가 생기는 이유");
		try {
			
			throw e1;
		} catch (Exception e) {
			e.printStackTrace();	//예외가 발생하였을 때 발생내용을 출력
			System.out.println(e.getMessage());		//예외가 발생하는 이유만 끌고와서 출력
		}
		
		System.out.println(12);
		
		
		
		RuntimeException rt = new RuntimeException("이유");
		
		try{			
			throw rt;
		}catch(RuntimeException e){
			e.printStackTrace();
		}
		System.out.println();
		
		/*
		 컴파일러가 예외처리를 강제하지 않는 경우
		 1. RuntimeException 클래스들
		 2. 에러와 그 자손들
		 이런 것들을 'unchecked'예외라고 한다.
		 */
	}
}
