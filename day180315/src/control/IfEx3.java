package control;

import java.util.*;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int com, exc, sum = 0, avg = 0;
		
		System.out.print("컴퓨터 과목 점수 : ");
		com = sc.nextInt();
		System.out.print("엑셀 과목 점수 : ");
		exc = sc.nextInt();
		
		sum = com +exc;
		
		avg = sum / 2;
		
		
		/*
		System.out.printf("당신의 컴퓨터 점수는 %d이고, 엑설 점수는 %d이며, "
				+"총 합은 %d 이고, 평균은 %d입니다.\n", com, exc, sum, avg);
		
		if(avg >= 60) {
			if (com >= 40 && exc >= 40) { 
				System.out.println("이번 자격증 시험에 당당히 합격하셨습니다.");
				System.out.println("자격증 취득을 축하드립니다.");
			}else {
				System.out.println("이번 과목별 과락으로 인하여 자격증 시험에 불합격하셨습니다.");
				System.out.println("다음 기회에 다시 응시하시기 바랍니다.");
			}
				
		} else {
			System.out.println("이번 자격증 시험에 불합격하셨습니다.");
			System.out.println("다음 기회에 다시 응시하시기 바랍니다.");
		}
		*/
		
		
		
		
		/*
		System.out.printf("당신의 컴퓨터 점수는 %d이고, 엑설 점수는 %d이며, "
				+"총 합은 %d 이고, 평균은 %d입니다.\n", com, exc, sum, avg);
		
		if((com < 40) && (exc < 40)) {
			System.out.println("따라서, 당신은 두 과목 점수 미달로 불합격입니다.");
		} else if(com < 40){
		    System.out.println("따라서, 당신은 com 과목 점수 미달로 불합격입니다.");
		} else if(exc < 40){
			System.out.println("따라서, 당신은 exc 과목 점수 미달로 불합격입니다.");
		} else if(avg < 60){
		    System.out.println("따라서, 당신은 평균 점수 미달로 불합격입니다.");
		}else {
		    System.out.println("축하합니다. 합격하셨습니다.");
		}
        */
		
		
		
		System.out.printf("당신의 컴퓨터 점수는 %d이고, 엑설 점수는 %d이며, "
				+"총 합은 %d 이고, 평균은 %d입니다.\n", com, exc, sum, avg);
		
		if((com < 40) && (exc < 40)) {
			System.out.println("따라서, 당신은 두 과목 점수 및 평균 점수 미달로 불합격입니다.");
		} else if((com < 40) && (avg < 60)) {
			System.out.println("따라서, 당신은 com 과목 점수 및 평균 점수 미달로 불합격입니다.");
		} else if(com < 40){
		    System.out.println("따라서, 당신은 com 과목 점수 미달로 불합격입니다.");
		} else if((exc < 40) && (avg < 60)) {
			System.out.println("따라서, 당신은 exc 과목 점수 및 평균 점수 미달로 불합격입니다.");
		} else if(exc < 40){
			System.out.println("따라서, 당신은 exc 과목 점수 미달로 불합격입니다.");
		} else if(avg < 60){
		    System.out.println("따라서, 당신은 평균 점수 미달로 불합격입니다.");
		}else {
		    System.out.println("축하합니다. 합격하셨습니다.");
		}
		
		
		
		
	}

}
