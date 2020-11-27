package array;

/*
 * 배열 : 같은 자료형들 끼리 모아놓은 하나의 묶음이다.
 * 자바에서 하나의 배열은 하나의 객체로 인식한다.
 * 동일한 자료형이 여러개 반복될 때 하나의 변수명으로 관리
 * 각각의 구분은 순차적인 첨자(index)를 사용함
 * 참조자료형 크기 : 4byte
 * 
 * new 라는 연산자에 의해 할당되면 자동초기화 된다.
 * 
 */


class AAA {
	
	public int aa(int a, int b) {
		int sum = 0;
		sum = a + b;
		return sum;
	}
	
	
	
}


public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AAA a1 = new AAA();
		AAA a2 = new AAA();
		AAA a3 = new AAA();
		AAA a4 = new AAA();
		AAA a5 = new AAA();
		
		int j, k, l, m, n;
		
		j = a1.aa(10, 20);
		k = a2.aa(10, 20);
		l = a3.aa(10, 20);
		m = a4.aa(10, 20);
		n = a5.aa(10, 20);
		
		System.out.print(j);
		
		
		
		
		
		
		
		
		
		
		
		//1차원 배열
		
		int a[] ; // 배열 선언
		a = new int[3]; // 배열 크기 할당
		
		// int a[] = new int [3]; 위의 것을 이 한줄로 대체 가능 이꼬르
		
		// 배열에 값 할당
		a[0] = 100;  // a[i] = 100
		a[1] = 200;
		a[2] = 300;
		
		int i;
		
		/*for (i = 0; i < a.length; i++) { // a.length = 3 = 배열 길이(크기), i <= 2, i < a.length, i < 3
			System.out.print(a[i]+"\t");			
		}*/
		
		for(int aa : a) {
			System.out.print(aa + "\t");
		}
		
		
		
		
		
		
		

	}

}
