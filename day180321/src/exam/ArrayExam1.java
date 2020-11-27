package exam;

/*
 * 임의의 숫자가 들어 있는 배열의 숫자 데이터들 중
 * 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 출력
 * 하는 프로그램을 작성하시오.
 * 
 * 임의의 배열 데이터 : 4 7 9 1 3 2 5 6 8 
 * 1차원 배열로 구현
 * 
 * 배열의 전체 데이터 출력
 * 4 7 9 1 3 2 5 6 8
 * 
 * 짝수 데이터 :
 * 4 2 6 8
 * 
 * 3의 배수 데이터 :
 * 9 3 6
 * 
 */


public class ArrayExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[] = {4, 7, 9, 1, 3, 2, 5, 6, 8};
        
        System.out.println("arr 배열의 길이 : " + arr.length);
        
        //전체 데이터 출력
        System.out.print("전체 데이터 출력 :\n");
        for (int i = 0; i < arr.length; i++) {
        	System.out.printf("%2d\t", arr[i]);
        }
        
        System.out.println();
        
        //짝수 데이터 출력
        System.out.print("짝수 데이터 출력 :\n");
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] % 2 == 0) {
        		System.out.printf("%2d\t", arr[i]);
        	}
        }
        
        System.out.println();
		
      //3의 배수 데이터 출력
        System.out.print("3의 배수 데이터 출력 :\n");
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] % 3 == 0) {
        		System.out.printf("%2d\t", arr[i]);
        	}
        }
		
		
		
		

	}

}
