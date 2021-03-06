package homework180405prac;

public class SaleVO {
	
	private String code; // 코드
	private String sname; // 고객명
	private String created; // 판매일
	private int quantity; // 판매수량
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		// System.out.println("코드 \t 고객명 \t 판매일 \t 수량");
		
		String str = String.format("%5s %5s %5s %5d", code, sname, created, quantity);
				
		return str; 
	}
	
	
	
	
	

}
