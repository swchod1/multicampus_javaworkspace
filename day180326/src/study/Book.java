package study;

public class Book {
	
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn; //// 멤버필드 --- 인스턴스
	
	//// 생성자
	public Book() { /// 컨트로 스페이스 하고 클래서 명
		// TODO Auto-generated constructor stub
		
		
	}
	///// 생성자
	
	//// 메소드
	public void nextPage() {
		
		nowPage++;
				
	}
	
	public void previousPage() {
		
		nowPage--;
	}
	/// 메소드
	
	
	

}
