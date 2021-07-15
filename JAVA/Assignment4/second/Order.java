package seconQuestion;

public class Order {
	private int order_id,price;
	
	public Order(int order_id, int price, String status) {
		super();
		this.order_id = order_id;
		this.price = price;
		this.status = status;
	}
	
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	String status;
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", price=" + price + ", status=" + status + "]";
	}
	
}
