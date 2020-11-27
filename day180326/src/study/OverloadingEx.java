package study;

public class OverloadingEx { /// 오버로딩 동일한 클래스 안에서 중복
	
	// 1
	public void getLength(int n) {
		
		String s = String.valueOf(n);
		getLength(s);
		
		
	}
	
	/// 메인에서 n 값(int 100) - valueOf해서 100 문자로, getLength(s)로 3번으로
	/// 3에서 sysout 된 결과를 다시 받음
	
	/// 경로 메인에서 n 값 받음 - 8번 줄에서 문자열로 전환 - 9번 줄에서 3번으로 - 3번에서 길이 출력
    /// return 0; 으로 출력 값을 돌려 받음 - 메인으로 결과를(출력 값을) 보냄 - 메인에서 실행되서 console에 표기
	
	
	// 2
	void getLength (float n) {
		String s = String.valueOf(n);
		getLength(s);
	}
	
	/// 메인에서 n 값(float 3.14f) - valueOf해서 3.14 문자로, getLength(s)로 3번으로 
	/// 3에서 sysout 된 결과를 다시 받음
	
	
	// 3
     private int getLength(String str) {
    	 
 		System.out.println("입력한 문자열의 길이 : " + str.length());
 		return 0; /// 값을 호출받은 부분으로 돌려 보냄
 	}
     
     /// 1에서 받은거 2에서 받은거 혹은 메인에서 바로 받은거  str.length()로 길이를 받음
     // int로 (private int getLength(String str)) 길이를 int 값으로 받음.
     // 1 혹은 2에서 받은 값의 결과(길이를 sysout 한 결과)return 0;으로 값을 1 혹은 2로 돌려 보냄

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingEx ov = new OverloadingEx();
		
		ov.getLength(100);
		ov.getLength(3.14f);
		ov.getLength("홍길동");
		
		

	}

}
