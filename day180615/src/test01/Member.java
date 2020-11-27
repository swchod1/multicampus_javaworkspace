package test01;

public class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		// TODO Auto-generated constructor stub
		
		this.age = age;
		this.name = name;
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	

}
