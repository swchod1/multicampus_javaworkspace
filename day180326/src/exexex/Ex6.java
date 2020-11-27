package exexex;

/*
 * [6-4] 문제6-3에서 정의한 Student클래스에 다음과 같이 정의된 두 개의 메서드
getTotal()과 getAverage()를 추가하시오.
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

public class Ex6 {
	
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	
	public int getTotal() {
		int result;
		result = kor + eng + math;
		return result;
	}
	
	public float getAverage() {
		float result;
		result = (int)(getTotal() / 3f*10+0.5f)/10f;/// 소수점 둘째 자리에서 반올림
        return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex6 ee = new Ex6();
		
		ee.name = "려두냑";
		ee.ban = 5;
		ee.no = 15;
		ee.kor = 70;
		ee.eng = 80;
		ee.math = 50;
		
		System.out.println("이름 : " + ee.name);
		System.out.println("반 : " + ee.ban);
		System.out.println("번호 : " + ee.no);
		System.out.println("총점 : " + ee.getTotal());
		System.out.println("평균 : " + ee.getAverage());
		

	}

}
