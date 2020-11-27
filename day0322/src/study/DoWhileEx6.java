package study;

import java.util.Scanner;

public class DoWhileEx6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		String str="";
		
		do {
			System.out.print("1:짜장면 2:짬뽕 3:우동 4탕수육 0:종료 :");
			n = sc.nextInt();
			
			switch(n) {
			case 0 :
				System.exit(0);
				break;
			case 1 :
			    str ="짜장면";
				break;
			case 2 :
				  str ="짬뽕";
					break;
			case 3 :
				  str ="우동";
					break;
			case 4 :
				  str ="탕수육";
					break;
		   	default :
				System.out.println("선택하신 메뉴가 없습니다.");
				break;
			}
			System.out.printf("당신이 선택한 메뉴는 %s 입니다.\n", str);
			
		}while(n >=1 && n <=4);
		
	}

}
