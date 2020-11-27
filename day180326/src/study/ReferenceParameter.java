package study;

public class ReferenceParameter {

	//// 참조의 의한 호출

	public void increase(int[] n) { /// void 참조의 의한 호출

		for (int i = 0; i < n.length; i++) {
			n[i]++;
		}
	}

	// 값에 의한 호출
	/*
	 * public int increase(int[] n) { /// int 참조의 의한 호출
	 * 
	 * for (int i = 0; i < n.length; i++) { n[i]++; } }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//// 참조의 의한 호출
		int ref[] = { 100, 200, 800, 500 };

		ReferenceParameter rp = new ReferenceParameter();

		rp.increase(ref);
		for (int i = 0; i < ref.length; i++) {
			System.out.println("ref[" + i + "] : " + ref[i]);
		}

		// 값에 의한 호출 하다 마심
		/*
		 * int ref[] = {100, 200, 800, 500};
		 * 
		 * ReferenceParameter rp = new ReferenceParameter();
		 * 
		 * rp.increase(ref); for(int i = 0; i < ref.length; i++) {
		 * System.out.println("ref[" + i + "] : " + ref[i]); }
		 */

		/*
		 * 메소드 호출시 전달하려는 인자를 참조(객체) 자료형을 사용할 경우를 의미함
		 * 
		 * 여기에는 기본 자료형이 아닌 참조형 (객체 또는 배열)이 속함.
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
