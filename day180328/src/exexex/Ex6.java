package exexex;

// 두 점 (x, y)와 (x1, y1) 간의 거리를 구한다.

// 제곱근 계산은 Math.sqrt(double a)를 사용

public class Ex6 {
	
	
	
	static double getDistance(int x, int y, int x1, int y1) {
		
		return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); 
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getDistance(1,1,2,2));

	}

}
