package g_exception;

public class Exception_01 {
	public static void main(String[] args) {
		/*
		1. 프로그램 오류
			- 프로그램이 실행 중 어떤 원인에 의해서 오작동하거나 비정상적으로 종료되는 경우
			- 컴파일 에러 : 컴파일 할 때 발생하는 오류
			- 런타임 에러 : 실행시에 발생하는 오류
			- 에러 : 프로그램 코드에 의해서 수습할 수 없는 심각한 오류들 Error
			- 예외 : 프로그램 코드에 의해서 수습될 수  있는 경미한 오류
		
		2. RuntimeException클래스와 그 외 클래스
			- 모든 예외의 최고 조상은 Exception이다.
			- RuntimeExcption클래스들은 주로 프로그래머의 실수에 의해 발생하는 예외
				: IndexOutofBoundsException, NullPointException
			- 그 외 Exception 클래스들은 외부의 영향으로 발생할 수 있는 것들
				: FileNotFoundException, classNotFoundException
				
		3. 예외처리(try-catch)
			- 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
			- 작성방법 
				try{
					//예외가 발생할 가능성이 있는 문장
				} catch(Exception1 e){
					//Exception1이 발생하였을 때 처리할 문장
				} catch(Exception2 e){
					//Exception2이 발생하였을 때 처리할 문장
				} catch(Exception3 e){
					//Exception3이 발생하였을 때 처리할 문장
				}
				
		4. 예외발생시키기
			- 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다.
				Exception e1 = new Exception();
			- 키워드 throw를 이용해서 예외를 발생시킨다.
				throw e1;
				
			throw new Exception();
			
		5. 예외 던지기
			- 메서드 예외 던지기
				: 메서드의 선언부 마지막에 'throws'를 사용해서 메서드 내에서 발생할 수 있는
				 	예외를 적어주기만 하면 된다. 처리는 해당 메서드를 호출한 쪽에서 처리하면 된다.
				 	
		6. finally
			- try-catch블럭의 예외발생에 상관없이 실행되어야 하는 코드를 포함한다.
			
			try{			
				//예외가 발생할 가능성이 있는 문장
			} catch{
				//Exception1이 발생하였을 때 처리할 문장
			} finally{
				//예외발생에 상관없이 실행되어야 하는 문장
			}
			
			순서
				try --> catch --> finally
				try-------------> finally
		*/
	}

}
