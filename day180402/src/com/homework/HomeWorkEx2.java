package com.homework;


/*문2]






사용자로부터 입력받은 변수의 갯수만큼

 난수를 발생시켜 배열에 담고 배열에 담겨있는 데이터들 중

 가장 큰 값과 가장 작은 값을 출력하는 프로그램을 구현한다.




 실행 예

 발생할 난수의 갯수 : 3

 53 46 92

 가장 큰값 : 92, 가장 작은값 : 46*/



import java.util.*;


public class HomeWorkEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////////////// 일단 끝낸거 //////////////
		Scanner sc = new Scanner(System.in);
		
		
		Random rnd = new Random();
		
		System.out.print("받을 난수의 수 : ");
		int x = sc.nextInt();
		
		int arr[] = new int[x];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(100) + 1;
		}

		// 구한 난수
		System.out.print("구해진 난수 : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
		// 내림차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int temp;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;				
				}
			}
		}
		
		
		System.out.println();
		
		
		System.out.print("내림차순 정렬 : ");
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n가장 큰 값 : " + arr[0] + "가장 작은 값 : " + arr[arr.length-1]);

		//////////////일단 끝낸거 //////////////
		
		

		

	}

}
