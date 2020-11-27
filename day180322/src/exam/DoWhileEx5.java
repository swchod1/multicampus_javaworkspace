package exam;

/*
 * -50에서 1까지의 수를 출력하는 프로그램을 작성
 * 이떄 한줄에 5개의 수씩문 출력
 * 수와 수사이의 간격은 탭으로 설정
 */



public class DoWhileEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 내꺼
		/*int x=-50;
		do {
			System.out.print(x +"\t");
			if ((x-4)%5 == 0) {
				System.out.println();
			}
			x++;
		} while (x <= 1);*/
		
		// 강사님이 하신거
		
		int i = -50;
		
		do {
			System.out.printf("\t%d", i);
			i++;
			if (-i % 5 == 0)
				System.out.println();
		} while (i <= 1);
		System.out.println();
		
		
		

	}

}
