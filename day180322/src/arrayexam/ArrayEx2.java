package arrayexam;

import java.util.*;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[][] score; // 학생수에 따른 과목별 점수
		String[] name;
		String[] grade;
		double[] avg;
		int[] rank;
		
		
		int total = 0, student, subnum, sco;
		String Sname;
		
		System.out.print("학생 수 입력 : ");
		student = sc.nextInt();
		
		score = new int[student][];
		// 입력받은 학생수 만큼 배열의 크기 할당
		
		name = new String[student];
		avg = new double[student];
		grade = new String[student];
		rank = new int[student];
		
		for (int i = 0; i < score.length; i++) { // for 1
			System.out.print((i+1)+"번 학생 이름 입력 : ");
			
			// 이름 입력
			/*Sname = sc.next();
			name[i] = Sname;*/
			
			name[i] = sc.next();
			
			// 과목수
			System.out.print((i+1)+"번 학생의 과목수 입력 : ");
			subnum = sc.nextInt();
			
			// 여기가 래기드(가변) 배열 적용하는 곳(과목수에 대한)
			score[i] = new int[subnum];
			// 학생마다 다른 과목수를 입력 받아 
			// 배열의 길이가 모두 다를 수 있음 --> 그래서 래기드 배열
			
			for (int j = 0; j < score[i].length; j++) {
				// 과목 점수
				System.out.print((i+1)+"번 학생의 " + (j+1)+ "과목 성적 입력 : ");
				sco = sc.nextInt();
				
				// 합계
				total += sco;
				score[i][j] = sco;
							
			}
			
			avg[i] = (double)total/subnum;
			total = 0;//토탈 값 초기화
			
			switch ((int)(avg[i]/10)) {
			
			case 10 :
				grade[i] = "A";
				break;
			case 9 :
				grade[i] = "A";
				break;
			case 8 :
				grade[i] = "B";
				break;
			case 7 :
				grade[i] = "C";
				break;
			case 6 :
				grade[i] = "D";
				break;
			default : 
				grade[i] = "F";
				break;
					
			
			}
			
			
			// 석차 구하기
			
			
			for (int a = 0; a < name.length; a++) { 
				rank[a] = 1;
				
				for (int j = 0; j < name.length; j++) { 
					if (avg[a] < avg[j]) {
						rank[a]++;
					}
				}
			}
			// 석차 구하기는 공식처럼 외우기 ㅎ
			
			
			
		}// end for 1
		
		//출력
		
/*		
		System.out.println(
		"이름\t과목1\t과목2\t과목3\t과목4\t과목5\t"
		+"평균\t학점\t석차");
		int k, h;
		for (k = 0; k < score.length; k++) {
			System.out.print(name[k]); // 이름 출력
			for (h = 0; h < score[k].length; h++) { // 이름 별 각 과목점수
				System.out.print("\t"+score[k][h]);
			}
			System.out.println("\t"+avg[k]+"\t"+grade[k]+"\t"+rank[k]);
		}
		*/
		
		System.out.println("------------------전체 출력------------------");
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("이름 : %s\t", name[i]);
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%d과목 : %d\t", j+1, score[i][j]);
			}
			System.out.printf("평균 : %.2f\t", avg[i]);
			System.out.printf("학점 : %s\n", grade[i]);
		}
	
		
		
		
		
/*		
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
			name[i] = sc.nextLine(); 
			
			for (j = 0; j < sub.length; j++) {
				
				// 각 과목 점수 이력
				System.out.print(sub[j]+"점수 : ");
				soc[i][j] = sc.nextInt();
				
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
		
		
		*/

	}

}
