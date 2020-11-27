package InputOutput;


import java.io.*;

// 숫자 두개 이상 입력 받을 경우

import java.io.IOException;
import java.io.InputStreamReader;

public class InputEx4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		//국영수 세 과목의 점수를 입력받아 합계를 구하시오.
		
		int kor, eng, mat, sum = 0;
		
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());
				
		sum = kor + eng + mat;
		
		System.out.println("세 과목의 합계는 " + sum + "입니다.");

	}

}
