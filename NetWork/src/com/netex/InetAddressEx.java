package com.netex;

import java.net.*;

public class InetAddressEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// InetAddress : ip 정보와 host 정보를 가지는 객체
		// InetAddress 객체는 생성자가 아닌 static 매소드를 이용해서 생성됨
		
		try {
			// host 이름에 해당하는 ip정보를 가진 InetAddress 객체를 얻어옴.
			
			InetAddress ipInfo1 = InetAddress.getByName("www.daum.net");
			
			// ip 주소 얻기
			String ip = ipInfo1.getHostAddress(); // 네이버의 ip주소
			System.out.println(ip);
			
			InetAddress[] ipArray = InetAddress.getAllByName("www.daum.net");
			
			for(InetAddress tempip : ipArray) {
				System.out.println(tempip);
			}
			
			// 자신의 컴퓨터 ip 정보 알아보기
			InetAddress myhost = InetAddress.getLocalHost();
			System.out.println("host : " + myhost.getHostName());
			System.out.println("host Ip: " + myhost.getHostAddress());
			
			
		} catch (UnknownHostException ue) {
			// TODO: handle exception
			ue.printStackTrace();
		}
		
	}

}
