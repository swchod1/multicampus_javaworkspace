package InputOutput;

import java.util.*;// 스캐너 사용

public class OperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//스캐너 인스턴스 생성
		
		int a, b; // 두개의 수를 입력받을 변수 지정
		
		int c, d, e, f, g;
		
		// 각각 연사자를 누적합계를 저장할 변수
		
		System.out.print("첫번째 수 입력 : ");
		a= sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		b= sc.nextInt();
		
		c = a + b;
		d = a - b;
		e = a * b;
		f = a / b;
		g = a % b;
		
		System.out.printf("%4d + %4d =%4d\n", a, b, c); // %3d - 3 글 간격
		System.out.printf("%3d - %3d =%3d\n", a, b, d);
		System.out.printf("%3d * %3d =%3d\n", a, b, e);
		System.out.printf("%3d / %3d =%3d\n", a, b, f);
		System.out.printf("%3d %% %3d =%3d\n", a, b, g); //%%을 해야함 앞은 서식문자
		                                                                       //뒤에가 연산자 - 어짜피 여기는
		                                                                       //연산이 아니라 표현문자
		
		

	}

}
