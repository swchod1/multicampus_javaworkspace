package arrayexam;

import java.io.*;

public class ArrayEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//배열 선언
		
		// 이름
		String[] name = new String[5];
		// 총점
		int[] sum = new int[5];
		//평균
		int[] avg = new int[5];
		//등급
		char[] grade = new char[5];
		
		int i, j, k, h; //i, j 는 입력, k, h 는 출력
		
		String sub[] = {"국어", "영어", "수학", "사회", "과학"};
		
		int[][] soc = new int[5][5];
		int[] rank = new int[5];// 석차
		
		
		for(i = 0; i < name.length; i++) {
			// 이름 입력
			System.out.print("이름 입력 : ");
			name[i] = br.readLine(); 
			
			for (j = 0; j < sub.length; j++) {
				
				// 각 과목 점수 이력
				System.out.print(sub[j]+"점수 : ");
				soc[i][j] = Integer.parseInt(br.readLine());
				
				// 합계
				sum[i] += soc[i][j];
			}
			
			// 평균
			avg[i] += sum[i]/5;
			
			// 학점 구하기
			if (avg[i] >= 90) {
				grade [i] = 'A';
			} else if (avg[i] >= 80) {
				grade [i] = 'B';
			} else if (avg[i] >= 70) {
				grade [i] = 'C';
			} else if (avg[i] >= 60) {
				grade [i] = 'D';
			} else {
				grade [i] = 'F';
			}
			
			System.out.println();
			
		}
		
		// 석차 구하기
		
		for (i = 0; i < name.length; i++) { 
			rank[i] = 1;
			
			for (j = 0; j < name.length; j++) { 
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		// 석차 구하기는 공식처럼 외우기 ㅎ
		
		//출력
		
		System.out.println(
		"이름\t국어점수\t영어점수\t수학점수\t사회점수\t과학점수\t"
		+"총점\t평균\t학점\t석차");
		
		for (k = 0; k < name.length; k++) {
			System.out.print(name[k]); // 이름 출력
			for (h = 0; h < sub.length; h++) { // 이름 별 각 과목점수
				System.out.print("\t"+soc[k][h]);
			}
			System.out.println("\t"+sum[k]+"\t"+avg[k]+"\t"+grade[k]+"\t"+rank[k]);
		}
		
		

	}

}
