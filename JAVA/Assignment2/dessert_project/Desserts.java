package dessert_project;

public abstract class Desserts {
	double tax,price,stock;
	  abstract double getCost(double n);
	  public void setTax(double tax)
	  {
	    this.tax=tax;
	  }
	  public void setPrice(double price)
	  {
	    this.price=price;
	  }
	  public void setStock(double stock)
	  {
	    this.stock=stock;
	  }
	  public double getTax(){
	    return tax;
	  }
	  public double getPrice(){
	    return price;
	  }
	  public double getStock()
	  {
	    return stock;
	  }

}
