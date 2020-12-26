package e_OOP;

public class FactorialTest {
	public static void main(String[] args) {
		long result = factorial(5);
		
		System.out.println(result);
	}
	
	static long factorial(int number){
		long result = 0L;
		
		if(number==1){//1이 되었을 때 반복문을 나감
			result=1;
		}else{
			result = number*factorial(number-1);
		}
		
		return result;
	}

}
