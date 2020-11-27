package exexex;

/*
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
    [4, 6, 8, 3, 2, 9, 7, 1, 5]
*/




public class Ex20 {
	
	///////////// 내가 한거 ///////////////
	
/*	
	public static int[] shuffle (int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			int j = (int)(Math.random()*arr.length);
			
			int k;
			
			k = arr[i];
			arr[i] = arr[j];
			arr[j] = k;
			
					
		}
				
		
		return arr;
	}
	*/
	
	/////////// 정답 //////////////

	public static int[] shuffle(int[] arr) {
		if (arr == null || arr.length == 0)
			return arr;

		for (int i = 0; i < arr.length; i++) {
			int j = (int) (Math.random() * arr.length);
			// arr[i] arr[j] . 와 의 값을 서로 바꾼다
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));

	}

}
