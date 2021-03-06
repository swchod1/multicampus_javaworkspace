package homework180405prac;

import java.util.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Calendar c = Calendar.getInstance(); 
		System.out.println(Calendar.DATE);
		
		System.out.println(c.get(Calendar.YEAR));
		
		System.out.println(c.get(Calendar.MONTH)+1);
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		try {
			

			
			
			System.out.print("입력 : ");

			String date = sc.next();

			while (true) {

				if (date.length() != 10) {
					System.out.println("입력하신 날짜가 형식에 맞지 않습니다.");
					return;
				}

				StringTokenizer tokens = new StringTokenizer(date, ".");

				if (tokens.countTokens() != 3) {
					System.out.println("입력하신 날짜가 형식에 맞지 않습니다.");
					return;
				}

				String temp[] = new String[tokens.countTokens()];

				for (int x = 1; tokens.hasMoreTokens(); x++) {
					temp[x - 1] = tokens.nextToken();
				}

				int yyyy = Integer.parseInt(temp[0]);
				int mm = Integer.parseInt(temp[1]);
				int dd = Integer.parseInt(temp[2]);
				
				int year = c.get(Calendar.YEAR);
				int month = c.get(Calendar.MONTH)+1;
				int day = c.get(Calendar.DAY_OF_MONTH);

				int lastday;

				if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
					lastday = 30;
				} else if (mm == 2) {
					if (((yyyy % 4 == 0) && (yyyy % 100 != 0)) || (yyyy % 400 == 0)) {
						lastday = 29;
					} else {
						lastday = 28;
					}
				} else {
					lastday = 31;
				}

				if (yyyy > year || yyyy < 2000 || mm < 1 || dd < 1) {
					System.out.println("입력하신 날짜가 범위를 초과 합니다.");
					return;
				} else if (yyyy == year) {
					if (mm > month) {
						System.out.println("입력하신 날짜가 범위를 초과 합니다.");
						return;
					} else if (mm == month) {
						if (dd > day) {
							System.out.println("입력하신 날짜가 범위를 초과 합니다.");
							return;
						}
					} else {
						if (dd > lastday) {
							System.out.println("입력하신 날짜가 범위를 초과 합니다.");
							return;
						}
					}
				} else {
					if (mm > 12 || dd > lastday) {
						System.out.println("입력하신 날짜가 범위를 초과 합니다.");
						return;
					}
				}
				
				System.out.println(date);
				return;

			}
			
		} catch (InputMismatchException im) {

			sc = new Scanner(System.in);
			System.out.println("형식에 맞지 않게 입력하셨습니다. 다시 시도하세요.");

		} 
		
		System.out.println("에러남");


	}

}
