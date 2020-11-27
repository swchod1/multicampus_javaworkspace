package com.employee;


/*EmployeeVO

VO : 데이터를 담는 컨테이너 역할을 하는 클래스로 데이터 전달을 목적으로 만들어진 클래스임
어플리케이션 구조에서 각 단계의 입출력 정보를 전달하는 역할을 수행하며, 속성(필드)을 private 변경자를 갖고 
getter/setter 로 구성됨
*/

public class EmployeeVO {
	
	// 필드 선언
	
	private int no;
	private String name;
	private String jobGrade;
	private int department;
	private String email;
	private String status;
	
	// 디폴트 생성자
	
	public EmployeeVO() {
		// TODO Auto-generated constructor stub
	}


	// 생성자 
	public EmployeeVO(int no, String name, String jobGrade, int department, String email) {
		// TODO Auto-generated constructor stub
		
		this.no= no;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.email = email;
		
		
	}
	
	// 이전 생성자 매개변수에 status 필드 초기화를 추가
	public EmployeeVO(int no, String name, String jobGrade, int department, String email, String status) {
		// TODO Auto-generated constructor stub
		
		this.no= no;
		this.name = name;
		this.jobGrade = jobGrade;
		this.department = department;
		this.email = email;
		this.status = status;
		
	}
	
	
	
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getJobGrade() {
		return jobGrade;
	}


	public void setJobGrade(String jobGrade) {
		this.jobGrade = jobGrade;
	}


	public int getDepartment() {
		return department;
	}


	public void setDepartment(int department) {
		this.department = department;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNo() + ", " + getName();
	}
	

}
