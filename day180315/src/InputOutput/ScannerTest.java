package InputOutput;

// 스캐너 사용시 항상 추가해야 함 둘 중에 하나만 쓰면됨
import java.util.Scanner;
import java.util.*;


public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		// 스캐너 클래스의 인스턴스를 생성한다.
		// 여기서 인스턴스는 sc 를 의미함
		
		int a, b;
		char op;
		String name;
		
		System.out.print("첫번째 수 : ");
		a = sc.nextInt();
		System.out.print("연산자 입력 : ");
		op = sc.next().charAt(0);
		//공백도 문자로 인식 (0)은 입력한 것의 첫번째를 가져온다는 것(문자 하나)
		//(1) 두번째
		// next 말고 line 함수를 쓰면 한 라인을 다 읽음(문자열)
		System.out.print("두번째 수 : ");
		b = sc.nextInt();
		/* next()는 공백에 상관 없이 문자 혹은 문자열 하나(공백사이)만 입력서
		 * next() 밑에 next()가 와도 상관없이 입력됨
		 * 하지만, next() 밑에 nextLine()이 있으면 엔터키 (버퍼 2개 먹음) 때문에 입력이 안됌
		 * nextLine()은 공백도 입력되기 때문에 next()후 엔터키에 남아있는 공백을 처리
		 * 버퍼와 달리 스캔에서는 System.out.println();으로 공백을 처리
		 * 
		 */
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.println(a + b + name + op);
		

	}

}
