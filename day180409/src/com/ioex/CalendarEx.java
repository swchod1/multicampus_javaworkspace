package com.ioex;

import java.util.*;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("년중");
		
		Calendar now = Calendar.getInstance();
		
		int week__yy = now.get(now.WEEK_OF_YEAR); // 1년(52주) 의 몇 째 주인지?
		int yy = now.get(now.YEAR); // 년은 197? 년이 기준임
		int mm = now.get(now.MONTH) + 1; // 달이 0부터 시작하기 때문에 +1 해주어야 함.
		int dd = now.get(now.DAY_OF_MONTH); // 그 달의 몇일인지
		
		sb.append(week__yy);
		sb.append("주 째인 ");
		sb.append(yy);
		sb.append("년 ");
		
		sb.append(mm);
		sb.append("월 ");
		sb.append(dd);
		sb.append("일 "
				+ "");
		
		System.out.println(sb.toString());
		
		

	}

}
