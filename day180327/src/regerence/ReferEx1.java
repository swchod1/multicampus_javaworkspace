package regerence;

public class ReferEx1 { // 참조 변수 --- 이 클래스를 대신하는 변수???

	int width, height; // 인스턴스 변수

	public int area() { // 인스턴스 메소드 ... 자료형 int 등이 있으면

		return width * height; // return 값이 있어야 함.

	}

/*	public void area(int width, int height) { // 인스턴스 메소드 ... void 이면

		System.out.println(width * height); // return 값이 없음. 바로 출력

	}*/
	
	
	public int length() { // 인스턴스 메소드
		
		return (width+height)*2;
		
	}
	
	public void setData(int width, int height) { // 인스턴스 메소드
		this.width = width;
		this.height = height;
	}
	

}
