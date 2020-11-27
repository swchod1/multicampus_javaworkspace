package test01;

public class Student01 implements Comparable<Student01> {
	
	public String id;
	public int score;
	
	public Student01(String id, int score) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.score = score;
		
	}
	
	@Override
	public int compareTo(Student01 o) {
		// TODO Auto-generated method stub
		if(score < o.score) {
			return -1;
		} else if(score == o.score) {
			return 0;
		} else {
			return 1;
		}
	}
	
	

}
