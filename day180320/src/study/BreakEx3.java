package study;

public class BreakEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, s;
		n=s=0;
		
		while (true) {// 무한루프
			n++; // n값을 하나씩 증가
			s += n; // 증가된 값을 하나씩 누적하여 합계를 구함
			
			if (n >= 10) { // n값이 10 또는 10이상이 되면 무한루프 탈출
				break;
			}
			
		}
		// 결과 출력
		System.out.println("결과 : " + s);

	}

}
