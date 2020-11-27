package arrayexam;

import java.util.*;

public class ArrayEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] score; // 학생수에 따른 과목별 점수
		String[] name;
		String[] grade;
		double[] avg;

		int total = 0, student, subnum, sco;
		String Sname;

		System.out.print("학생 수 입력:");
		student = sc.nextInt();

		score = new int[student][];
		// 입력받은 학생수 만큼 배열의 크기 할당

		name = new String[student];
		avg = new double[student];
		grade = new String[student];

		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 학생 이름 입력:");
			// 이름입력
			Sname = sc.next();
			name[i] = Sname;

			// 과목수
			System.out.print((i + 1) + "번 학생 과목수 입력:");
			subnum = sc.nextInt();

			// 여기가 래기드배열적용하는 곳
			score[i] = new int[subnum];
			// 학생마다 다른 과목수를 입력받아
			// 배열의 길이가 모두 다를 수 있음

			for (int j = 0; j < score[i].length; j++) {
				System.out.print((i + 1) + "번 학생 " + (j + 1) + "과목성적입력:");
				sco = sc.nextInt();

				total += sco;// 합계
				score[i][j] = sco;

			}

			avg[i] = (double) total / subnum;
			total = 0;
			// 학점
			switch((int)avg[i] / 10){
		    case 10:
		    case 9: grade[i] = "A"; break;
		    case 8: grade[i] = "B"; break;
		    case 7: grade[i] = "C"; break;
		    case 6: grade[i] = "D"; break;
		    default : grade[i] = "F"; break;
		   }   
		  }
		  
		  System.out.println("--------------------------------전 체 출 력--------------------------------");
		  
		  for(int i = 0 ; i < score.length ; i++){
		   System.out.printf("이름 : %s\t", name[i]);
		   for(int j = 0 ; j < score[i].length ; j++){
		    System.out.printf("%d과목 : %d\t", j+1, score[i][j]);
		   }
		   System.out.printf("평균 : %.2f\t", avg[i]);
		   System.out.printf("학점 : %s\n", grade[i]);
		  }
		
		
		
	}

}
