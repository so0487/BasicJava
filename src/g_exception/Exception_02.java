package g_exception;

public class Exception_02 {
	public static void main(String[] args) {
		
		int number = 100;
		int result = 0;
		
		//10회 반복
		//number을 0~5사이의 임의의 값을 나눈 결과를 result에 저장
		//result를 출력
//		for(int i=0;i<10;i++){			
//			result = number/(int)(Math.random()*6); 
//			System.out.println(result);
//		}							--> 0으로 나눌 때 예외발생
		
		
		for(int i=0;i<10;i++){
			try{
				
				result = number/(int)(Math.random()*6); 
				System.out.println(result);
			}catch(ArithmeticException e){
				System.out.println("0으로 나누면 안됩니다");
			}
		}						
	}

}
