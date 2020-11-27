package switchexam;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String month = "february"; //2월
		
		int monthNumber;

		switch (month) {
		case "january":
			monthNumber = 1;
			break;

		case "february":
			monthNumber = 2;
			break;

		case "march":
			monthNumber = 3;
			break;

		default:
			monthNumber = 0;
			break;

		}
		
		System.out.println(monthNumber);
		
		
		

	}

}
