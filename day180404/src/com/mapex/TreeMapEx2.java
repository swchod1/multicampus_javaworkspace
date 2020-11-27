package com.mapex;

import java.io.*;
import java.util.*;


public class TreeMapEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		TreeMap<String, SungRec> map = new TreeMap<String, SungRec>();
		
		map.put("3333", new SungRec("홍길동", 80, 50, 90));
		map.put("2222", new SungRec("동길동", 80, 50, 90));
		map.put("1111", new SungRec("서길동", 80, 50, 90));
		map.put("5555", new SungRec("남길동", 80, 50, 90));
		map.put("4444", new SungRec("북길동", 80, 50, 90));
		
		String key;
		
		Set set = map.keySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			
			key = (String)it.next();
						
			SungRec data = map.get(key);
			
			// 출력문
			
			
			System.out.printf("%7s %10s %5d %5d %5d %5d \n", key, data.getName(), 
					data.getKor(), data.getEng(), data.getMat(), data.getTot());
			
		}
		
		
		
		
		
		
		

	}

}
