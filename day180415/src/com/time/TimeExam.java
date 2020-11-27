package com.time;

import java.time.*;

import javax.management.monitor.MonitorSettingException;

public class TimeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 현재 지역 시간
		
		// 시간 까지
		
		LocalDateTime timepoint = LocalDateTime.now();
		
		System.out.println(timepoint);
		
		// 위에서 날짜만 추출
		
		LocalDate ld = timepoint.toLocalDate();
		System.out.println(ld);
		
		LocalDate timepoint1 = LocalDate.now();
		System.out.println(timepoint1);
		
		// 달만 추출
		
		System.out.println(timepoint.getMonthValue()); // 4 // calender와 달리 +1을 하지 않아도 됨
		System.out.println(timepoint.getMonth()); // april
		System.out.println(timepoint1.getMonthValue()); // 4
		
		Month month = timepoint.getMonth();
		System.out.println(month.getValue()); // 4
		
		
		
		// 현재 지역 시간
		
		// 원하는 날짜 (2012년 12월 12일 경우)
		
		
		LocalDate ld1 = LocalDate.of(2012, Month.DECEMBER, 12);
		
		System.out.println(ld1); 
		
		

		// 원하는 날짜 (2012년 12월 12일 경우)
		
		// 원하는 시가 (17시 18분 경우)
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		
		LocalTime lt2 = LocalTime.parse("17:18:00");
		System.out.println(lt2);
		
		// 원하는 시가 (17시 18분 경우)
	}

}
