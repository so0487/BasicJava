package f_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		
		//1. SmartTv 3대를 저장해주세요
		SmartTv st1 = new SmartTv();
		SmartTv st2 = new SmartTv();
		SmartTv st3 = new SmartTv();
//		
//		SmartTv[]st = new SmartTv[3];
//		
//		st[0]=st1;
//		st[1]=st2;
//		st[2]=st3;
		
		SmartTv[]st = {st1,st2,st3};
		
		//2. AfreecaTv 2대를 저장해주세요
		AfreecaTv at1 = new AfreecaTv();
		AfreecaTv at2 = new AfreecaTv();
		
//		AfreecaTv[]at = new AfreecaTv[2];
//		at[0]=at1;
//		at[1]=at2;
		AfreecaTv[]at = {at1,at2};
		
		//3. RollrableTv 4대를 저장해주세요.
		RollrableTv rt1 = new RollrableTv();
		RollrableTv rt2 = new RollrableTv();
		RollrableTv rt3 = new RollrableTv();
		RollrableTv rt4 = new RollrableTv();
		
//		RollrableTv[]rt = new RollrableTv[4];
//		rt[0]=rt1;
//		rt[1]=rt2;
//		rt[2]=rt3;
//		rt[3]=rt4;
		
		RollrableTv[]rt = {rt1,rt2,rt3,rt4};
		
		
		
		Tv[]t = new Tv[9];		//다형성을 하면 객체 하나로 데이터를 저장할 수 있다.
		t[0]=st1;	//up-casting
		t[1]=st2;
		t[2]=st3;
		
		t[3]=at1;
		t[4]=at2;
		
		t[5]=rt1;
		t[6]=rt2;
		t[7]=rt3;
		t[8]=rt4;
		
//		Tv a1=t[0];	//SmartTv가 Tv타입으로 줄어든다---> internet을 쓸 수 없다.
		SmartTv a1 = (SmartTv)t[0];		//SmartTv a1 = t[0]		--> 형을 맞추기 위해 캐스팅이 필요--> down-casting 진행
		a1.interNet();		//interNet()을 사용할 수 있다.
		
//		SmartTv st5 = (SmartTv)new Tv();	//문법상으로는 문제가 없지만 부모객체는 부모의 인스턴스 밖에 모른다. 이것을 st의 인스턴스를 인지하지 못한다.--> 넣을 곳을 찾지 못한다. 
	}

}



class Tv{
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	
	void channelUp(){
		channel++;
	}
}

class SmartTv extends Tv{
	void interNet(){
		
	}
}

class AfreecaTv extends Tv{
	void starBallon(){
		
	}
}

class RollrableTv extends Tv{
	void roll(){
		
	}
}