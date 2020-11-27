package exam;

/*
 * char 자료형의 배열에 알파벳 대문자를 채우고
 * 채워진 배열 전체 요소를 출력
 * 
 * 단, char 자료형의 배열을 구성하는 과정에서
 * 반복문을 통하여 초기화
 * 
 * 
 */



public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 내가 한거
/*		char ap[] = new char [26];
		
		for (int i = 0; i < ap.length; i++) {
				ap[i] = (char) (i + 65);
		}
		
		System.out.println("알파벳 대문자 : ");
		for (char i : ap) {
			System.out.print(i + "\t");
		}*/
		
		
		
		
		//강사님이 하신거
		char arphar[] = new char[26];
				
				
		/*for(int i = 0, b = 65; i < arphar.length; i++, b++) {
			arphar[i] = (char)b;
		}*/
				
		
		for (int i = 0; i < arphar.length; i++) {
			arphar[i] = (char)(i + 65);			
		}
		
		System.out.println("알파벳 대문자 : ");
		for (int i = 0; i < arphar.length; i++) {
			System.out.print(arphar[i] + " ");
		}
		System.out.println();

	}

}
