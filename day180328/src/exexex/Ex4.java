package exexex;

public class Ex4 {
	
	/*
	1. 메서드명 : getTotal
	기 능 : 국어(kor), 영어(eng), 수학(math)의 점수를 모두 더해서 반환한다.
	반환타입 : int
	매개변수 : 없음
	2. 메서드명 : getAverage
	기 능 : 총점(국어점수+영어점수+수학점수)을 과목수로 나눈 평균을 구한다.
	소수점 둘째자리에서 반올림할 것.
	반환타입 : float
	매개변수 : 없음
	*/
	
	
	/// 내가한거 /////
	
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
	
	
	///// 정답 ///////
	
    /*	
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() { //////// 반올림
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	*/
		
		/*	
		총점과 평균을 구하는 문제인데 평균을 구할 때 소수점 둘째 자리에서 반올림을 ,
		하는 부분에서 생각을 좀 해야 할 것이다.
		총점의 타입이 이기 때문에 으로 나누면 와 간의 연산이므로 결과를 로 얻 int 3 int int int
		는다 즉 소수점 이하의 값은 버려지게 된다 그래서 타입의 리터럴인 로 나누어 . , . float 3f
		야 소수점 이하의 값들을 얻을 수 있다 그리고 소수점 둘째 자리에서 반올림하려면 . , 10
		을 곱하고 를 더한 다음 다시 로 나누면 된다 0.5 10f .
		*/
		
		
        /*	
	    236 / 3 → 78 78
        236 / 3f → 78.666664 
        236 / 3f * 10 → 786.66664
        236 / 3f * 10 + 0.5 → 787.16664
        (int)(236 / 3f * 10 + 0.5) → (int)787.16664 → 787
        (int)(236 / 3f * 10 + 0.5) / 10 → 78 
        (int)(236 / 3f * 10 + 0.5) / 10f → 78.7
		
		
		
	}
	*/
	//////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex4 s = new Ex4();
		s.name = "홍길동";
		
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:"+s.name);
		System.out.println("총점:"+s.getTotal());
		System.out.println("평균:"+s.getAverage());
		

	}

}
