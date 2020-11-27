package comex.inher;

public class Exam {

	private String hak, name;

	private int kor, eng, mat;

	public Exam() {

	}

	public Exam(String hak, String name, int kor, int eng, int mat) {

		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	public void set(String hak, String name, int kor, int eng, int mat) {

		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	@Override // 오브젝트 클래스의 toString()메소드를 오버라이딩
	public String toString() { // 여기 있는 모든 문자열을 보낼 수 있음.
		// TODO Auto-generated method stub
		
		if(name == null) {
			return null;
		}
		
		String str = String.format("%s, 총점 : %d", name, (kor+eng+mat));
		// string.format 프린트f  비슷??
		// , 전에 포멧을 정하고 , 뒤에 입력값
				
		return str;
		
	}
	
	
	@Override // 
	public boolean equals(Object obj) { // 문자열이 맞는지 안맞는지 비교 했던거
		// TODO Auto-generated method stub
		
		boolean flag = false;
		
		Exam ee = null; // 새로 만듬
		
		// Exam이 객체인지 확인
		if(obj instanceof Exam) { // 객체가 맞으면 Exam 클래스에서 나온 객체가 맞니???
			ee = (Exam) obj; // 다운 캐스팅???,   맞으면 첫번재 생성자(public Exam())를 통해
		} else {
			return flag;
		}
		
		
		if(this.name.equals(ee.name) && hak.equals(ee.hak)) {
			flag = true;
		}
		
		return flag;
	}

}
