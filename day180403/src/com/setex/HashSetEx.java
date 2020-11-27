package com.setex;

import java.util.*;




class AData {
	
	int x;
	int y;
	
	public AData(int x, int y) {
		// TODO Auto-generated constructor stub
		
		this.x = x;
		this.y = y;
		
	}
	
	public void disp() {
		
		System.out.println("x = " + x + " y = " + y);
		
	}
	
}


public class HashSetEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AData ap = new AData(10,20);
		AData bp = new AData(20,30);
		AData cp = new AData(30,40);
		
		HashSet hs = new HashSet();
		
		// 해시셋에 데이터 추가 ---> 셋은 순서가 없다
		hs.add(ap);
		hs.add(bp);
		hs.add(cp);
		
		// 크기 알아보기
		System.out.println("총 데이터의 크기 : " + hs.size());
		
		// 이터레이터 생성자,   <>들어가는 것은
		Iterator it = hs.iterator();
		
		// Iterator<I> it = hs.iterator()
		
		while(it.hasNext()) {
			
			((AData)it.next()).disp(); // ???????
		}
	}

}
