package array;

/*
 * 
 * 
 */


public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] test;
		
		test = new int [3][];
		
		test[0] = new int[2]; // 1행
		test[1] = new int[1]; // 2행
		test[2] = new int[3]; // 3행
		
		// 1행
		test[0][0] = 100;
		test[0][1] = 200;
		
		// 2행
		test[1][0] = 300;
		
		//3행
		test[2][0] = 400;
		test[2][1] = 500;
		test[2][2] = 600;
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print("test [" + i + "] [" + j + "]" + test[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
