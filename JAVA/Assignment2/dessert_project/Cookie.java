package dessert_project;

public class Cookie extends Desserts {
	  Cookie(double price, double tax, double stock)
	  {
	    this.setPrice(price);
	    this.setTax(tax);
	    this.setStock(stock);
	  }
	  public void getDetails(){
	  System.out.println("The stock left of Cookie is "+stock+"the price: "+price+" tax: "+tax);
	  }
	  //adding items
	  public void add_item(int num)
	  {
		this.setStock(this.getStock()+num);
		System.out.println(num+" candies added current details of cookies are: ");
		getDetails();
	  }
	  public void buyItem(int bnum)
	  {
		  System.out.println("Your purchase  was succesful further details are:\n");
		  System.out.println("number of items:"+bnum);
		  System.out.println("Total cost of purchase "+getCost(bnum)+" rs");
	  }
	  //cost when buying
	@Override
	double getCost(double n) {
		double price=this.getPrice()*n;
		double curr_tax=this.getTax();
		double cost= (price+curr_tax)*70;//*70is for currency conversion
		return cost;
	}
}
