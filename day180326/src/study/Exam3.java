package study;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구현한 메소드 호출 및 출력
		
        Exam2 ee = new Exam2();
		
		int a1 = ee.add(10, 20);
		int a2 = ee.sub(10, 20);
		int a3 = ee.mul(10, 20);
		int a4 = ee.div(10, 20);
		
		System.out.println("덧셈 : " + a1);
		System.out.println("뺄셈 : " + a2);
		System.out.println("곱셈 : " + a3);
		System.out.println("나눗셈 : " + a4);
		
		

	}

}
