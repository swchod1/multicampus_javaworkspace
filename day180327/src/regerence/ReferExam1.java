package regerence;

public class ReferExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReferEx1 re1; // 레퍼런스 변수 선언
		re1 = new ReferEx1(); // 레퍼런스 변수 생성 
		// 선언 생성 동시 가능 ReferEx1 re = new ReferEx1();
		
		ReferEx1 re2 = new ReferEx1();
		
		int a, b;
		
		re1.setData(10, 5);
		re2.setData(50, 60); // void 메소드에 10, 5   50, 60 이 저장되어 있음.
		
		// 
		a = re1.area(); // 50  // .(도트)는 참조 연산자
		b = re1.length(); // 220
		System.out.printf("가로 : %d, 세로 : %d, 넓이 : %d, 둘레 : %d\n", re1.width, re1.height, a, b);
		
		
		a = re2.area(); // 50  // .(도트)는 참조 연산자
		b = re2.length();
		System.out.printf("가로 : %d, 세로 : %d, 넓이 : %d, 둘레 : %d", re2.width, re2.height, a, b);
		

	}

}
