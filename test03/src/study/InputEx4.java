package study;

import java.io.*;

public class InputEx4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//국어, 영어. 수학 세 과목의 점수를 입력받아 합계를 구하시오.
		
		int kor, eng, mat;
		int sum=0;
		
		System.out.println("국어 점수는: ");
		kor = Integer.parseInt(br.readLine());
		System.out.println("영어 점수는: ");
		eng = Integer.parseInt(br.readLine());
		System.out.println("수학 점수는: ");
		mat = Integer.parseInt(br.readLine());
		
		sum = kor + eng + mat;
		
		System.out.println("세 과목의 합계는: " + sum + "입니다.");
	}
}
