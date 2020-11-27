package switchexam;

public class WhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1, y=1;
		while (x <= 10) {
			y *= x;
			x++;
		}
		System.out.println("1~10까지의 곱셈의 합은 "+ y + " 이다.");

	}

}
