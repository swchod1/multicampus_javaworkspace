package whileexam;

public class WhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2; // 바깥 쪽의 초기값 선언
		
		while(i <= 9 ) {
			// 안쪽에서 사용할 변수의 초기값 선언
			int j = 1;
			while (j <= 9) {
				System.out.printf("%d X %d = %d\n", i, j, (i*j));
				j++; // 안쪽에서 사용한 변수 j값을 하나 증가시킴
			}
			
			System.out.println();
			i++; // i갑을 증가시킴 (단을 의미함)
		}

	}

}
