package exexex;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex1 she = new Ex1("이소리", 111111);
		// Ex1 (String name, long number)
		
		
		System.out.println(she.name+" "+she.number+" ");
		
		Ex2 f = new Ex2("김영태", 123456, "연한대", 2008);
		Ex1 p = f;
		
		// Ex2 (String name, long number, String univ, long idNumber)
		
		
		System.out.println(p.name + " " + p.number);
		
		//System.out.println(p.univ);
		
		System.out.println(f.name + " " + ((Ex1) f).number);
		
		System.out.println(f.name + " " + f.number);
		
		System.out.println(f.univ + " " + f.number);

	}

}
