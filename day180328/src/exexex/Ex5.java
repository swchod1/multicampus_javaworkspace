package exexex;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex s = new Ex("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s.info());

	}

}

class Ex {
	
	
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	
	
	
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	public float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f; /// 반올림???
	}

		
	public Ex(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
			return name + ", " + ban + ", " + no + ", " + kor + ", " + eng 
					+ ", " + math + ", " + getTotal() + ", " + getAverage();
	}
	
}


