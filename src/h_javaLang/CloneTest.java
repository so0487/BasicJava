package h_javaLang;

public class CloneTest {
	public static void main(String[] args) {
		Clone c = new Clone(1,2);
		Clone c2 = (Clone)c.clone();		//CloneNotSupportedException: 발생 --> implements Cloneable 사용해야 한다.

		System.out.println(c);
		System.out.println(c2);
	}

}


class Clone implements Cloneable{
	int x;
	int y;
	
	public Clone(int x,int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	protected Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj; 
	}
	
	@Override
	public String toString() {
		return "Clone [x=" + x + ", y=" + y + "]";
	}
}
