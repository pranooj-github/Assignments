package streams;

public class Fruit {
	String name,color;
	int calory,price;
	public Fruit(String name, String color, int calory,int price) {
		super();
		this.name = name;
		this.color = color;
		this.calory = calory;
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", calory=" + calory + "]";
	}
	

}
