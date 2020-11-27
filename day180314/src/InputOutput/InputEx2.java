package InputOutput;

/*
 * 문자열을 출력하는 방법 (문자 2개 이상)
 * 
 */



import java.io.*;

public class InputEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

/*		try {
			
		} catch(IOException e) {
		                ~~~~~~~~~~~~~~~~~
		}*/
		
		String name;
		String age;
		String addr;
		String tel; 
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("이름 : ");
		name = br.readLine();
		
		System.out.print("나이 : ");
		age = br.readLine();
		
		System.out.print("주소 : ");
		addr = br.readLine();
		
		System.out.print("전화번호 : ");
		tel = br.readLine();
		
				
		System.out.println();// 한 줄 삽입
		System.out.print("당신의 이름은 " + name + "님 이시군요.");
		System.out.println("나이는 " + age + "이고, ");
		System.out.print("사는 곳은 " + addr +"이며, ");
		System.out.println("전화번호는 " + tel + "이군요.");
		
		
	}

}
