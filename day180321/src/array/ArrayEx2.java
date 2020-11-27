package array;


import java.util.*;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 선언
/*		char[] ch;
		String str[][] = {
				              {"홍길동", "김유신"}, 
				              {"이순신", "을지문덕"},
				              {"이순신", "을지문덕"}
				              };
		
		ch = new char[4]; // 배열 초기화
		
		ch[0] = 'J'; 
		ch[1] = 'A';	
		ch[2] = 'V';
		ch[3] = 'A';
		
		
		for(char temp : ch) {
			System.out.print(temp + "\t");
		}
		
		System.out.println();
		
		for(int i = 0; i < str.length; i++) {
			for(int j = 0 ; j < 2; j++) {
				if(j == 1) {
					System.out.print(str[i][j]+"\n");
				} else {
					System.out.print(str[i][j]+"\t");
				}
				
			}
		}*/
		
		// 3차원 행렬 코드
/*		int cc[][][] = new int[2][3][4];
		int n=1;
		for (int k = 0; k < cc.length; k++) {
			for (int i = 0; i < cc[k].length; i++) {
				for (int j = 0; j < cc[k][i].length; j++) {
					cc[k][i][j] = n++;
				}
			}
		}
		System.out.println();
		for (int k = 0; k < cc.length; k++) {
			for (int i = 0; i < cc[k].length; i++) {
				for (int j = 0; j < cc[k][i].length; j++) {
					System.out.print(cc[k][i][j] + " ");
				}
			}
		}*/
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		System.out.print("행의 길이 : ");
		x = sc.nextInt();
		
		
		int a1[] = new int[x];
		int a2[] = new int[x];
		int a3[] = new int[x];
		int j;

		
		for (int i = 0; i < a1.length; i++) {
			System.out.printf("%d번째 열에 입력할 정수 : ", i+1);
			j = sc.nextInt();
			a1[i] = j;
		}
		
		System.out.println("행에 입력한 수");
		
		for (int i = 0; i < a1.length; i++) {
			System.out.print("["+a1[i]+"]" + "\t");
		}
		
		System.out.println();
		
		int sum = 0;
		
		for (int aa : a1) {
			sum += aa;
		}
		System.out.println("행에 입력된 수들의 총합 : " + sum);
		
		double avg = (double)sum/a1.length;
		System.out.println("행에 입력된 수들의 평균 : " + avg);
		int k = 0, l = 0;
		for (int i = 0; i < a1.length; i++) {
			if (a1[i]%2 == 0) {
				a3[k] = a1[i];
				k++;
			} else {
				a2[l] = a1[i];
				l++;
			}
		}
		
		int a2a[] = new int[l];
		int a3a[] = new int[k];
		
		for (int i =0 ; i < l; i++) {
			a2a[i] = a2[i];
		}
		
		for (int i =0 ; i < k; i++) {
			a3a[i] = a3[i];
		}
		
				
		System.out.println("\n홀수모음");
		
		for (int aa : a2a) {
			System.out.print(aa + "\t");
		}
		
		System.out.println("\n짝수모음");
		for (int aa : a3a) {
			System.out.print(aa + "\t");
		}
		
/*		int m = 0;
		for (int i = 0; i < a2.length; i++ ) {
			if (a2[i]==0) {
				m = i;
				int a2[] = new int[m];
			}
		}*/


	}

}
