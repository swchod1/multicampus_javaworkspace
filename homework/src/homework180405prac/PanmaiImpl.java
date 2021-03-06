package homework180405prac;

import java.util.*;

public class PanmaiImpl implements Panmai {
	
	private HashMap<String, ProductVO> map1 = new HashMap<String, ProductVO>();
	private HashMap<String, SaleVO> map2 = new HashMap<String, SaleVO>();
	private Vector< SaleVO> vec = new Vector< SaleVO>();
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void insertProduct() {
		// TODO Auto-generated method stub
		
		try {
		
		System.out.println("===상품등록===");
		
		String code;
		System.out.print("상품코드 : ");
		code = sc.next();
		
		if(map1.containsKey(code)) {
			System.out.println("이미 등록된 상품코드입니다.");
			return;
		}
		
		ProductVO pv = new ProductVO();
		
		System.out.print("상품명 : ");
		pv.setPname(sc.next());
		System.out.print("단가 : ");
		pv.setPrice(sc.nextInt());
		System.out.print("수량 : ");
		pv.setQuantity(sc.nextInt());
		
			map1.put(code, pv);

			System.out.println("===등록완료===");

		} catch (InputMismatchException im) {

			sc = new Scanner(System.in);
			System.out.println("형식에 맞지 않게 입력하셨습니다. 다시 시도하세요.");

		}

	}

	@Override
	public void insertQuantity() {
		// TODO Auto-generated method stub

		System.out.println("===수량등록===");
		System.out.print("상품코드 : ");
		String code = sc.next();

		if (!map1.containsKey(code)) {
			System.out.println("등록된 상품코드가 아닙니다.");
			return;
		}
				
		
		System.out.println("현재수량 : " + map1.get(code).getQuantity());
		System.out.print("추가 수량 : ");
		int x = sc.nextInt();
		
		if (x <= 0) {
			System.out.println("잘못된 정보를 입력하셨습니다.");
			return;
		}
		map1.get(code).setQuantity(map1.get(code).getQuantity()+x);
	}

	@Override
	public void searchProduct() {
		// TODO Auto-generated method stub

		System.out.println("===상품코드검색===");
		System.out.print("상품코드 : ");
		String code = sc.next();

		if (!map1.containsKey(code)) {
			System.out.println("등록된 상품코드가 아닙니다.");
			return;
		}

		System.out.println("코드 \t 상품명 \t 단가 \t 수량");

		System.out.println("--------------------------------------");

		System.out.println(code + " \t " + map1.get(code).getPname() + " \t " 
		+ map1.get(code).getPrice() + " \t " + map1.get(code).getQuantity());
	}

	@Override
	public void listProduct() {
		// TODO Auto-generated method stub

		System.out.println("===상품리스트===");
		
		Set<Map.Entry<String, ProductVO>> set = map1.entrySet();

		Iterator<Map.Entry<String, ProductVO>> it = set.iterator();

		System.out.println("코드 \t 상품명 \t 단가 \t 수량");
		
		System.out.println("--------------------------------------");
		
		while(it.hasNext()) {
			Map.Entry<String, ProductVO> me = it.next();
			System.out.println(me.getKey() + " \t " + me.getValue().getPname() + " \t " + me.getValue().getPrice()
					+ " \t " + me.getValue().getQuantity());
		}

	}


	
	@Override
	public void insertSale() {
		// TODO Auto-generated method stub
		
		////////////헤시맵으로 하다 실패 (중복안됨)/////////////
		/*
		System.out.println("===상품판매===");
		
		String code;
		System.out.print("상품 코드 : ");
		code = sc.next();
		
		if(!map1.containsKey(code)) {
			System.out.println("등록된 상품코드가 아닙니다.");
			return;
		}
		
		SaleVO sv = new SaleVO();
		
		sv.setCode(code);
		
		System.out.print("고객명 : ");
		sv.setSname(sc.next());
		System.out.print("판매일 : ");
		sv.setCreated(sc.next());
		System.out.print("판매수량 : ");
		sv.setQuantity(sc.nextInt());
		
		
		
		if(map2.containsKey(code)) {
			
		} else {
			
		}
		
		map2.put(code, sv);
		map1.get(code).setQuantity(map1.get(code).getQuantity()-map2.get(code).getQuantity());
				
		System.out.println("===판매완료===");
		*/
		//////////////////헤시맵으로 하다 실패 (중복안됨)//////////////////////
		
		
		//////////////////벡터로함/////////////////////

		String code;
		System.out.print("상품 코드 : ");
		code = sc.next();
		
		// 벡터로 구분하때
		/*SaleVO temp = readSale(code);

		if (temp == null) {
			System.out.println("등록된 상품코드가 없습니다.");
			return;
		}*/
		
		
		if (!map1.containsKey(code)) {
			System.out.println("등록된 상품코드가 없습니다.");
			return;
		}
		
		if(map1.get(code).getQuantity() == 0) {
			System.out.println("요청하신 상품의 재고가 없습니다.");
			return;
		}
				

		SaleVO sv = new SaleVO();

		sv.setCode(code);
		
		

		System.out.print("고객명 : ");
		sv.setSname(sc.next());
		System.out.print("판매일(yyyy/mm/dd) : ");
		
		String s = sc.next();
		
		if(dateCheck(s)) {
			return;
		}
		
		
		sv.setCreated(s);
		
		System.out.print("판매수량 : ");
		int x = sc.nextInt();
		if(map1.get(code).getQuantity() - x < 0) {
			System.out.println("요청하신 상품의 재고가 부족합니다.");
			return;
		}
		sv.setQuantity(x);
		
		
		map2.put(code, sv); // 거의 안해도 됌
		vec.add(sv);
		map1.get(code).setQuantity(map1.get(code).getQuantity() - x);
		
		///////////벡터로함////////////

	}
	
	
// 벡터로 구분	
public SaleVO readSale(String code) {// 위에꺼 끌고와서 적용
		
	SaleVO sv = null;
		
		for(SaleVO temp : vec) {
			if(temp.getCode().equals(code)) {
				sv = temp;
				break; 
			}
		}
		
		return sv;
		
	}
	
	
	
	public boolean dateCheck(String date) {
		
		Calendar c = Calendar.getInstance(); 
				
		if (date.length() != 10) {
			System.out.println("입력하신 날짜가 형식에 맞지 않습니다.");
			return true;
		}

		StringTokenizer tokens = new StringTokenizer(date, ".");

		if (tokens.countTokens() != 3) {
			System.out.println("입력하신 날짜가 형식에 맞지 않습니다.");
			return true;
		}

		String temp[] = new String[tokens.countTokens()];

		for (int x = 1; tokens.hasMoreTokens(); x++) {
			temp[x - 1] = tokens.nextToken();
		}

		int yyyy = Integer.parseInt(temp[0]);
		int mm = Integer.parseInt(temp[1]);
		int dd = Integer.parseInt(temp[2]);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);

		int lastday;

		if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
			lastday = 30;
		} else if (mm == 2) {
			if (((yyyy % 4 == 0) && (yyyy % 100 != 0)) || (yyyy % 400 == 0)) {
				lastday = 29;
			} else {
				lastday = 28;
			}
		} else {
			lastday = 31;
		}

		if (yyyy > year || yyyy < 2000 || mm < 1 || dd < 1) {
			System.out.println("입력하신 날짜가 범위를 초과 합니다.");
			return true;
		} else if (yyyy == year) {
			if (mm > month) {
				System.out.println("입력하신 날짜가 범위를 초과 합니다.");
				return true;
			} else if (mm == month) {
				if (dd > day) {
					System.out.println("입력하신 날짜가 범위를 초과 합니다.");
					return true;
				}
			} else {
				if (dd > lastday) {
					System.out.println("입력하신 날짜가 범위를 초과 합니다.");
					return true;
				}
			}
		} else {
			if (mm > 12 || dd > lastday) {
				System.out.println("입력하신 날짜가 범위를 초과 합니다.");
				return true;
			}
		}
		return false;	
	}

	@Override
	public void searchSale() {
		// TODO Auto-generated method stub

		///////////////헤시맵으로 하다 실패 (중복안됨)/////////////////
		/*
		 System.out.println("===판매현황검색===");
		 System.out.print("상품코드 : "); String code = sc.next();
		 if(!map1.containsKey(code)) {
		 System.out.println("등록된 상품코드가 아닙니다."); return; }
		 if(!map2.containsKey(code)) { // or map2.get(code).getCode() != code
		 System.out.println("판매된 상품코드가 아닙니다.");
		 return; }
		 
		 System.out.println("코드 \t 금액 \t 상품명 \t 고객명 \t 판매일 \t 단가 \t 판매수량");
		 
		 System.out.println( "--------------------------------------------------------------------");
		 
		 System.out.println(code + " \t " + map1.get(code).getPrice() + " \t " +
		 map1.get(code).getPname() + " \t " + map2.get(code).getSname() + " \t " +
		 map2.get(code).getCreated() + " \t " + map1.get(code).getPrice() + " \t " +
		 map2.get(code).getQuantity());
		 */
		/////////////헤시맵으로 하다 실패 (중복안됨)///////////////
		
		
		/////////////벡터로함//////////////
		
		 System.out.println("===판매현황검색==="); 
		 System.out.print("상품코드 : ");
		 String code = sc.next();
		
		 if(!map1.containsKey(code)) {
		 System.out.println("등록된 상품코드가 아닙니다.");
		 return;
		 }
		 if(!map2.containsKey(code))
		 { // or map2.get(code).getCode() != code
		 System.out.println("판매된 상품코드가 아닙니다.");
		 return; }
		 
		 
		 ////////////강사님 출력 ///////
/*		 
		 System.out.println("코드 \t 금액 \t 상품명 \t 고객명 \t 판매일 \t 단가 \t 판매수량");
		 
		 System.out.println(
		 "--------------------------------------------------------------------");
		 
		 for (SaleVO temp : vec) {
				if (temp.getCode().equals(code)) {
					System.out.println(code + " \t " + map1.get(code).getPrice() + " \t " +
							 map1.get(code).getPname() + " \t " + temp.getSname() + " \t " +
							 temp.getCreated() + " \t " + map1.get(code).getPrice() + " \t " +
							 temp.getQuantity());
				}
			}

		 System.out.println();
		 
		 */
		 
		 ////////////강사님 출력 ///////
		 
		 
		 ////////// 내 맘데로 /////////
		 
		 System.out.println("코드 \t 고객명 \t 판매일 \t 수량");
			
			System.out.println("-----------------------------");
			
			for (SaleVO temp : vec) {
				if (temp.getCode().equals(code)) {
					System.out.println(temp);
				}
			}
			
			
			 ////////// 내 맘데로 /////////
		 
		 
		 
		 
		 
		 
		/////////////////벡터로함////////////////////// 
		 
		 
	}
	
	@Override
	public void listSale() {
		// TODO Auto-generated method stub
		
		///////////////헤시맵으로 하다 실패 (중복안됨)///////////////////
		/*
		System.out.println("===판매리스트===");

		Set<Map.Entry<String, ProductVO>> set1 = map1.entrySet();

		Iterator<Map.Entry<String, ProductVO>> it1 = set1.iterator();
		
		
		Set<Map.Entry<String, SaleVO>> set2 = map2.entrySet();
		
		Iterator<Map.Entry<String, SaleVO>> it2 = set2.iterator();
		
	
		
		
		System.out.println("코드 \t 금액 \t 상품명 \t 고객명 \t 판매일 \t 단가 \t 판매수량");
		
		System.out.println("--------------------------------------------------------------------");
		
		while(it1.hasNext() && it2.hasNext()) {
			Map.Entry<String, ProductVO> me1 = it1.next();
			Map.Entry<String, SaleVO> me2 = it2.next();
			System.out.println(me1.getKey() + " \t " + me1.getValue().getPrice() +
					" \t " + me1.getValue().getPname() + " \t " + me2.getValue().getSname() +
					" \t " + me2.getValue().getCreated() + " \t " + me1.getValue().getPrice() + 
					" \t " + me2.getValue().getQuantity());
		}
		*/
		////////////////헤시맵으로 하다 실패 (중복안됨)///////////////////
		
		/////////////////벡터로함///////////////////
		
		 ////////////강사님 출력 ///////
		/*
		System.out.println("===판매리스트===");
		

		System.out.println("코드 \t 금액 \t 상품명 \t 고객명 \t 판매일 \t 단가 \t 판매수량");

		System.out.println("--------------------------------------------------------------------");

		for (SaleVO temp : vec) {
				System.out.println(temp.getCode() + " \t " + map1.get(temp.getCode()).getPrice() + " \t " +
						 map1.get(temp.getCode()).getPname() + " \t " + temp.getSname() + " \t " +
						 temp.getCreated() + " \t " + map1.get(temp.getCode()).getPrice() + " \t " +
						 temp.getQuantity());
		}
		*/
		 ////////////강사님 출력 ///////
		
		
		 ////////// 내 맘데로 /////////
		
		System.out.println("===판매리스트===");
		
		System.out.println("코드 \t 고객명 \t 판매일 \t 수량");
		
		System.out.println("-----------------------------");
		
		Iterator<SaleVO> it = vec.iterator();
		
		while(it.hasNext()) {
			SaleVO sv = it.next();
			System.out.println(sv);
		}
		
		System.out.println();
		
		 ////////// 내 맘데로 /////////
		
		

		//////////////////벡터로함/////////////////////
		
	}

	public void productMainDsp() {

		while (true) {

			int x;

			do {
				System.out.print("||1.상품등록||2.수량등록||3.상품리스트||4.상품코드검색||5.복귀|| > ");
				x = sc.nextInt();

			} while (x < 1 || x > 5);

			switch (x) {
			case 1:
				insertProduct();
				break;
			case 2:
				insertQuantity();
				break;
			case 3:
				listProduct();
				break;
			case 4 :
				searchProduct();
				break;
			case 5 :
				return;
				
			}

		}

	}

	public void saleMainDsp() {
		
while (true) {
			
			int x;

			do {
				System.out.print("||1.상품판매||2.판매현황리스트||3.판매현황검색||4.복귀|| > ");
				x = sc.nextInt();

			} while (x < 1 || x > 4);

			switch (x) {
			case 1:
				insertSale();
				break;
			case 2:
				listSale();
				break;
			case 3:
				searchSale();
				break;
			case 4 :
				return;
				
			}

		}

	}

}
