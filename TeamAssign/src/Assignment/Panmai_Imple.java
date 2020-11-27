package Assignment;

import java.util.*;

public class Panmai_Imple implements Panmai {

	private Scanner sc = new Scanner(System.in);
	private Vector<SaleVO> sVO = new Vector<SaleVO>();
	private Vector<ProductVO> pVO = new Vector<ProductVO>();
	private HashMap<String, String> map = new HashMap<String, String>();
	
	////////////////////////////////////////////////////////////////////////
	
	public ProductVO findPname(String name) {
		
		ProductVO vo = null;
		
		for(ProductVO temp : pVO) {
			if(temp.getPname().equals(name)) {
				vo = temp;
				break;
			}
		}
		return vo;
	}
////////////////////////////////////////////////////////////////////////
	public void findSale(String code, String pname) {
		
		SaleVO sv = null;
		System.out.println("코드\t상품명\t판매날짜\t판매량");
		System.out.println("===================================");
		for(SaleVO temp : sVO) {
			if(temp.getCode().equals(code)) {
				sv= temp;
				System.out.println(sv.getCode()+"\t"+pname+"\t"+sv.getCreated()+"\t"+sv.getQuantity());
			}
		}
		System.out.println("검색완료!");
	}
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////		
	@Override
	public void insertQuantity() {
	
		String key,product;
		int q;  // update할 수량
		
		System.out.println("    [수량등록]");
		System.out.print("수량을 등록하실 상품 Code 입력 : ");
		key = sc.next();
		product = map.get(key);	// 상품이름을 검색하여 객체를 불러온다.
		
		if(map.equals(key)) 
		{
			ProductVO pv = findPname(product);
			System.out.print("등록하실 수량을 입력 : ");
			q = sc.nextInt();
			pv.setQuantity(q);
		
			System.out.println("수량 업데이트 완료!");
			System.out.println("===========================");
		}
		else {
			System.out.println("해당상품 없어여");
			return;
		}
	}
			
	@Override
	public void insertProduct() {
	
		ProductVO pv = new ProductVO();
		SaleVO sv = new SaleVO();
		
		String code, product;
		
		System.out.println("    [상품등록]");
		System.out.print("상품 코드 : ");
		code = sc.next();
////////////////////////////////////////////////////////////////////////
		if(map.containsKey(code)) 
		{
			System.out.println("해당상품이 존재합니다.");
			return;
		}
////////////////////////////////////////////////////////////////////////
		sv.setCode(code);
		
		System.out.print("상품명     : ");
		product = sc.next();
		pv.setPname(product);
		
		map.put(code, product); // Mapping해서 code를 찾으면 product를 알수있게
		
		System.out.print("단가        : ");
		pv.setPrice(sc.nextInt());
		System.out.print("수량        : ");
		pv.setQuantity(sc.nextInt());
		
		pVO.add(pv);		
		
		System.out.println("상품 등록 완료");
		System.out.println("===========================");
		
	}

	@Override
	public void searchProduct() {
		
		String code,product;
		
		System.out.println("\n    [상품코드검색]");
		System.out.print("상품 코드 : ");
		code = sc.next();
		if(map.containsKey(code)) 
		{
			product = map.get(code);	// 상품이름을 검색하여 객체를 불러온다.
			ProductVO pv = findPname(product);
		
			System.out.println("\n[검색결과]");
		
			System.out.println("상품명\t단가\t수량");
			System.out.println("===========================");
			System.out.print(pv.getPname()+"\t"+pv.getPrice()+"\t"+pv.getQuantity()+"\n");
			System.out.println("===========================");
		}
		else 
		{
			System.out.println("해당상품 없어여");
			return;
		}
	}

	@Override
	public void listProduct() {
	
		Iterator<ProductVO> it = pVO.iterator();
		Iterator<SaleVO> it1 = sVO.iterator();
		System.out.println("코드\t상품명\t단가\t수량");
		System.out.println("===========================");
		
		while(it.hasNext()) {
			SaleVO sv = it1.next();
			System.out.print(sv.getCode()+"\t");
			ProductVO vo = it.next();
			System.out.print(vo.getPname()+"\t"+vo.getPrice()+"\t"+vo.getQuantity());
			System.out.println();
		}
		System.out.println("===========================");
	}
	
////////////////////////////// 판         매 //////////////////////////////////////////
	@Override
	public void insertSale() {
		
		String code,product;
		String name;
		SaleVO sv = new SaleVO();
				
		System.out.println("\n    [상품판매]");
		System.out.print("상품 코드 : ");
		code = sc.next();
		sv.setCode(code);
		product = map.get(code);	// 상품이름을 검색하여 객체를 불러온다.
		/////////////////////////////////////////////////////////////////////
		ProductVO pv = findPname(product);
		
		System.out.println("상품명\t단가\t수량");
		System.out.println("===========================");
		System.out.println(pv.getPname()+"\t"+pv.getPrice()+"\t"+pv.getQuantity());
		/////////////////////////////////////////////////////////////////////
		
		System.out.print("고객명    : ");
		name = sc.next();
		sv.setSname(name);
		System.out.print("등록일    : ");
		sv.setCreated(sc.next());
		System.out.print("판매수량 : ");
		int q = sc.nextInt();
		sv.setQuantity(q);
		
		sVO.add(sv);
		
		
		int o_q = pv.getQuantity();
		
		if(o_q < q) {
			System.out.println("수량이 부족합니다.");
			return;
		}
		pv.setQuantity((o_q - q ));
		
		System.out.println("\n상품판매완료");
		// 이름과 상품 코드를 맵핑하여 판매 현황을 검색할
		// 수 있도록 한다.
	}

	@Override
	public void searchSale() {
		
		String code,product;
				
		System.out.println("\n    [판매현황검색]");
		System.out.print("상품 코드 : ");
		code = sc.next();
		if(map.equals(code)) {
		product = map.get(code);
		
		ProductVO pv = findPname(product); // code에 해당하는 상품 객체
		findSale(code,pv.getPname());	// code에 해당하는 판매사항들
		}
		else {
			System.out.println("해당상품 없어여");
			return;
		}
	}

	@Override
	public void listSale() {
		
		String key,product;
		
		System.out.println("코드\t상품명\t고객명\t판매일자\t\t단가\t수량\t금액");
		System.out.println("==============================================================");
	
		for(SaleVO sv : sVO) {
						
			key = sv.getCode();
			product = map.get(key);	// 상품이름을 검색하여 객체를 불러온다.
			
			ProductVO po = findPname(product);
			
			System.out.println(sv.getCode()+"\t"+po.getPname()+"\t"
					+sv.getSname()+"\t"+sv.getCreated()+
					"\t"+po.getPrice()+"\t"+sv.getQuantity()+
					"\t"+(po.getPrice() * sv.getQuantity()));
		}
		System.out.println();
	}
}
