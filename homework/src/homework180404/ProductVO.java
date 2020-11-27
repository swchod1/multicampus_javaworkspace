package homework180404;

public class ProductVO {
	
	private String pname; // 상품명
	private int price, quantity; // 단가, 수량
	
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// System.out.println("코드 \t 상품명 \t 단가 \t 수량");
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub

		String str = String.format(pname + " \t " +  price + " \t " + quantity);

		return str;
	}

}
