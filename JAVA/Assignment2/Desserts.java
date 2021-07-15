abstract class DessertItem{
  double tax,price,stock;
  abstract double getCost();
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
class candy extends DessertItem{
  candy(double price, double tax, double stock)
  {
    this.setPrice(price);
    this.setTax(tax);
    this.setStock(stock);
  }
  public void getDetails(){
  System.out.println("The stock left: "+stock+"the price: "+price+" tax: "+tax);
  }
}
public class Desserts{
  public static void main (String args[])
  {
    candy obj=new candy(10,5,4);
    obj.getDetails();
  }
}
