package g_exception;

import sun.print.resources.serviceui;

public class Exception_04 {
	public static void main(String[] args) {
		//view
		Controller.controllerMethod();
	}

}


class Controller{
	static void controllerMethod(){
		Service.serviceMethod();
		
	}
}


class Service{
	static void serviceMethod() {
		try{
			
			Dao.daoMethod();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}

class Dao{
	static void daoMethod() throws Exception{

			
			throw new Exception("Dao에서 발생함");

	}
}
