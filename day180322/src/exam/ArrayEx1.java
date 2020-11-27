package exam;


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
		
		int i, j, k, h;
		
		String sub[] = {"국어", "영어", "수학", "사회", "과학"};
		
		int[][] soc = new int[5][5];
		int[] rank = new int[5];// 석차
		
		
		for(i = 0; i < name.length; i++) {
			// 이름 입력
			System.out.print("이름 입력 : ");
			name[i] = br.readLine(); 
			
			// 과목 입력
			for (j = 0; j < sub.length; j++) {
				System.out.print(sub[j]+"점수 : ");
				soc[i][j] = Integer.parseInt(br.readLine());
			}
		}
				
		
		
		
/*		if (a >= b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		if (b >= c) {
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
		if (a >= b) {
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}

		if (a >= b) {
			d = a;
			a = b;
			b = d;
		}
		if (b >= c) {
			d = b;
			b = c;
			c = d;
		}
		if (a >= b) {
			d = a;
			a = b;
			b = d;
		}*/
	

	}

}
