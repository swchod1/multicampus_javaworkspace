package dowhileexam;

// do ~~ while 문을 이용하여 1~100 까지의 합계를 구하시오.


public class DoWhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수의 초기값 설정
		int i = 0, sum = 0;
		do {
			sum += i; //sum = sum + i;
			i++;
		} while (i <= 100);
		
		System.out.println("1qnxj 100까지의 합계 : " + sum);

	}

}
