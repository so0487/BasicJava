package z_exam6;



public class Exam6_5 {
	public static void main(String args[]) {
		Student5 s = new Student5("홍길동",1,1,100,60,76);
		System.out.println(s.info5());
	}
}

class Student5{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student5(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	//합계를 구하는 함수
	int getSum(){
		return kor+eng+math;
	}
	//평균을 구하는 함수
	float getAvg(){
		return (int)(getSum()/3f*10+0.5f)/10f;
	}

	public String info5(){
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+getSum()+","+getAvg();
	}
}

