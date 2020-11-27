package bank;

import java.io.*;


public class Banking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Account na = new Account("홍길동");
		// Account(); 는 생성자가 이렇게 없기 때문에 안됌. 
		
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		
		String strWork;
		do {
			System.out.println("\n 선택하실 메뉴를 고르세요");
			System.out.println("=========================");
			System.out.println("입              금 =============> 1");
			System.out.println("출              금 =============> 2");
			System.out.println("잔 액 조 회 ===============> 3");
			System.out.println("종              료 =============> 0");
			System.out.println("=========================");
			System.out.print("메뉴를 선택하세요 : ");
			strWork = br.readLine();
			
			int switchInt = 0;
			
			if (strWork != null) {
				switchInt = Integer.parseInt(strWork);
			} else {
				System.out.println("메뉴를 고르지 않았습니다.");
				System.exit(0);
			}
			
			switch(switchInt) {
			
			case 0 : 
				break;
			
			case 1 : // 입금 금액 입력
				System.out.println("\n =====================");
				
				System.out.print("입금하실 금액 입력 : ");
				String strdepositIn = br.readLine();
				long depositLong = Long.parseLong(strdepositIn);
				na.deposit(depositLong);
				break;
				
				
			case 2 : // 출금 금액 입력
                System.out.println("\n =====================");
				
				System.out.print("출금하실 금액 입력 : ");
				String strwithdrawIn = br.readLine();
				long withdrawLong = Long.parseLong(strwithdrawIn);
				na.withdraw(withdrawLong);
				break;
				
				
			case 3 : // 잔고 확인
				
				System.out.println(na.getName() + "님의 잔액은 " + na.getBalance() + "원 입니다.");
				
				break;
				
			default :
				System.out.println("0 ~ 3 사이의 숫자를 입력해 주세요\n");
			
			}
			
			
			
		} while (!strWork.equals("0")); // 문자열을 비교할 때 는 equals 라는 메소드를 활용
		
		
		
		
		
		
		

	}

}
