package array;

public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2차원 배열 선언
		
		int[][] test;
		int n = 100;
		test = new int[2][3];// 배열의 크기 : 2행 3열
		// 배열 전체크기는 : 2*3=6
		
		/*test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		//첫번째 행
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		//두번째 행
		*/
		
		
        /*
        100 200 300
		400 500 600
		*/
		
		for(int i = 0; i < test.length; i++) {//행
			for(int j = 0; j < test[i].length; j++) {//열
				test[i][j] = n++;
			}
		}
		
		
		for(int i = 0; i < test.length; i++) {//행
			for(int j = 0; j < test[i].length; j++) {//열
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}
		
								
		

	}

}
