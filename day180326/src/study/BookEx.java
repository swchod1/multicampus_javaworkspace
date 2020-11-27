package study;

class MaxEx {
	
	 public static int max (int num1, int num2) {
		  int result;
		  if (num1 > num2) {
		  result = num1;
		  } else {
		  result = num2;
		  }

		  return result;
		 }
	
}





public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//////////////////////// 필드 //////////////////////
		
		Book bb = new Book();
		
		
		// Book 클래스의 객체 생성 --- new 연산자 사용 --- 생성자를 불러옴???
		
		bb.name = "정의란 무엇인가?";
		bb.writer = "마이클 샌델";
		bb.price = 15000;
		bb.isbn = "12345";
		
		////////////////////// 메소드 ///////////////////////
		
		/// MaxEx me = new MaxEx();
		
		int dd = MaxEx.max(10, 20); /// static 이라 가능
		
		
		
		System.out.println("최대값 : " + dd);
		
		

	}

}
