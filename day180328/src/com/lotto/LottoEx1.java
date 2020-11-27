package com.lotto;

import java.util.*;


public class LottoEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// 램덤 클래스를 이용하여 램덤으로 숫자를 얻음
		Random rnd = new Random();
		
		// 번호를 저장할 변수를 배열로 선언
		int num[] = new int[6];
		
		int cnt; // 구매할 개수
		
		do {
			System.out.print("로또 구매 개수 : ");
			cnt = sc.nextInt();
			
		} while (cnt < 1 || cnt > 5);
		
		for (int i = 1; i <= cnt; i++) { // 구매한 개수 만큼 번호를 받는다.
						
			for(int j = 0; j < num.length; j++) {
				num[j] = rnd.nextInt(45)+1; // 램덤은 0에서 부터 --- 그래서 +1
				// 중복제거
			    for (int k = 0; k < j; k++) {
			    	if(num[j] == num[k]) {
			    		j--;
			    		break;
			    	}
			    }
			}
			
			// 정렬함
			Arrays.sort(num);		
			System.out.println(i + "번째 : ");
			
			for(int n : num) {
				System.out.printf("%4d", n);
			}
			
			System.out.println();
			
			
		}
		
		
		

	}

}
