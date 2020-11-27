package switchexam;

import java.util.*;

public class BreakEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 변수 설정
		int sum = 0;
		int i = 0;
		
		while (true) {
				System.out.print("점수 입력 : ");
				i = sc.nextInt();
				
				if (i <0 ) { // 입력받은 값이 0보다 작으면
					break; // 중지
				}
				
				sum += i; 
				// 0보다 큰값들이 들어오면 계속 누적하여 합계 계산
				//i++;
				// 값을 입력받기 때문에 평균 구할 때 외 합계 구할 때는 상관 없음
				
		}
		
		System.out.println("입력받은 값들의 합계 : " + sum);
		//System.out.println("입력받은 값을의 평균 : " + sum/i);
		
		
		
		// while 문 무한 루프
		/*while (true) {
			
		}*/
		
		// for문 무한 루프
/*		for ( ; ; ) {
			System.out.println("사랑합니다.");
		}*/
		

	}

}
