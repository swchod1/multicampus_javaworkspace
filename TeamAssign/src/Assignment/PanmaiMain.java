package Assignment;

import java.util.*;
public class PanmaiMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void Mainmenu() {
		
		System.out.println("   [메인메뉴]");
		System.out.println("--------------");
		System.out.println("1. 상품등록\n2. 상품판매\n3. 종료");
		System.out.print("--------------\n선택 ==>");
		
	}
	
	public static int Select1() {
		
		int n = 0;
		
		System.out.println("   [상품등록화면]");
		System.out.println("--------------");
		System.out.println("1. 상품등록\n2. 수량등록\n3. 상품리스트"
				+ "\n4. 상품코드검색\n5. 복귀");
		System.out.print("--------------\n선택 ==>"); 
		n =sc.nextInt();
		
		return n;
	}
	
	public static int Select2() {
		int n = 0;
		
		System.out.println("   [상품판매화면]");
		System.out.println("--------------");
		System.out.println("1. 상품판매\n2. 판매현황리스트\n3. 판매현황검색"
				+ "\n4. 복귀");
		System.out.print("--------------\n선택 ==>"); 
		n = sc.nextInt();
		
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Panmai_Imple PI = new Panmai_Imple();
	
		while(true) {
		
		Mainmenu();		// 메인 메뉴 출력
		
		int num = sc.nextInt();
		int num_2=0;
				
			switch(num) {
		
			case 1 :	
							do{
							num_2 = Select1();
							switch(num_2) 
							{
								case 1: PI.insertProduct(); break;
								case 2: PI.insertQuantity(); break;
								case 3: PI.listProduct(); break;
								case 4: PI.searchProduct(); break;
								case 5: break;
							}
							}while(num<1 || num>5);
							break;
							
			case 2 :   
							do{
							num_2 = Select2();
		
							switch(num_2) 
							{
								case 1: PI.insertSale(); break;
								case 2: PI.listSale(); break;
								case 3: PI.searchSale(); break;
								case 4: break;
							}
							}while(num_2 <1 || num_2>4);
							break;
						
			case 3:   System.out.println("종료되었습니다."); return;
			}
		
		}
		
	}

}
