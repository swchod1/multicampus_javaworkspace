package comex.inher;

public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = new String("test"); // String 클래스는 오브젝트에 있음??
		String str2 = new String("test");
		
		System.out.println("str1 과 str2의 주소값은 같나요? : " + (str1 == str2)); // 다름
		System.out.println("str1 과 str2의 해시코드는 같나요? : " + (str1.hashCode() == str2.hashCode())); // 같음

		
		System.out.println("str1의 해시코드 : " + str1.hashCode()); // 3556498
		System.out.println("str2의 해시코드 : " + str2.hashCode()); // 3556498
		
		
		
		// 주소 해시코드
		
		/* 
		 * 
		 * 주소는 객체를 따름 new ~~ 객체를 새로 생성함 그래서 new 할때마다 다 다름
		 * 
		 * 해시코드 : 주소를 정수값으로 바꾼값??
		 * 
		 * 참조 자료형(배열, 스트림)의
		 * 해시코드는 객체가 따라 가는 곳을 가르킴 같은 클래스를 따라가면 같음??
		 * 참조하고자 하는게 같으면???
		 */
		
		HashCodeEx h1 = new HashCodeEx();
		HashCodeEx h2 = new HashCodeEx();
		
		System.out.println("h1 과 h2의 주소값은 같나요? : " + (h1 == h2)); // 다름
		System.out.println("h1 과 h2의 해시코드는 같나요? : " + (h1.hashCode() == h2.hashCode())); // 다름

		/*
		 * 주소는 객체를 따름 new ~~ 객체를 새로 생성함 그래서 new 할때마다 다 다름
		 * 
		 * 
		 * 참조 자료형(배열 스트림)이 아니라 해시코드가 다름
		 * 
		 * 
		 * 
		 */
		
		System.out.println("h1의 해시코드 : " + h1.hashCode()); // 366712642
		System.out.println("h2의 해시코드 : " + h2.hashCode()); // 1829164700
		
	}

}
