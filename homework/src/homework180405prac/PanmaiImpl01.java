package homework180405prac;

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class PanmaiImpl01 implements Panmai {
	
	Scanner sc = new Scanner(System.in);
	
	private HashMap<String, ProductVO> map1 = new HashMap<String, ProductVO>();
	private HashMap<String, SaleVO> map2 = new HashMap<String, SaleVO>();
	private ArrayList<SaleVO> arr1 = new ArrayList<SaleVO>();
	
	@Override
	public void insertProduct() {
		// TODO Auto-generated method stub
		
		
		
		try {
			
			System.out.println("==상품등록==");

			
			System.out.print("상품코드 > ");
			String code = sc.next();
			
			if(map1.containsKey(code)) {
				
				System.out.println("이미 등록된 상품입니다.");
				return;
			}
			
			ProductVO pv = new ProductVO();
			
			System.out.print("상품명 > ");
			pv.setPname(sc.next());
			System.out.print("단가> ");
			pv.setPrice(sc.nextInt());
			System.out.print("수량> ");
			pv.setQuantity(sc.nextInt());
			
			map1.put(code, pv);
			
			System.out.println("==등록완료==");
			
		} catch (InputMismatchException ime) {
			// TODO: handle exception
			
			sc = new Scanner(System.in);
			System.out.println("형식에 맞지않게 입력하셨습니다. 다시 입력하세요.");
			
		}
		
	}
	
	
	@Override
	public void insertQuantity() {
		// TODO Auto-generated method stub
		
		
		try {
			
			System.out.println("==수량등록==");
			
			System.out.print("상품코드> ");
			String code = sc.next();
			
			if(!map1.containsKey(code)) {
				System.out.println("등록된 상품이 아닙니다.");
				return;
			}
			
			System.out.println("현재 수량 : " + map1.get(code).getQuantity());
			
			System.out.print("추가 수량> ");			
			map1.get(code).setQuantity(map1.get(code).getQuantity()+sc.nextInt());
			
		} catch (InputMismatchException ime) {
			// TODO: handle exception
			
			sc = new Scanner(System.in);
			System.out.println("형식에 맞지않게 입력하셨습니다. 다시 입력하세요.");
			
		}
		
	}
	
	
	@Override
	public void listProduct() {
		// TODO Auto-generated method stub
		
		System.out.println("==상품리스트==");
		
		Set<Map.Entry<String, ProductVO>> set1 = map1.entrySet();
		Iterator<Map.Entry<String, ProductVO>> it1 = set1.iterator();
		
		
		
		
		
		
	}
	@Override
	public void searchProduct() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertSale() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void listSale() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void searchSale() {
		// TODO Auto-generated method stub
		
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
