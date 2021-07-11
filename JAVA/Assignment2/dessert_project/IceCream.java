package dessert_project;

public class IceCream extends Desserts {
	  IceCream(double price, double tax, double stock)
	  {
	    this.setPrice(price);
	    this.setTax(tax);
	    this.setStock(stock);
	  }
	  public void getDetails(){
	  System.out.println("The stock left: "+stock+"the price: "+price+" tax: "+tax);
	  }
	  //adding items
	  public void add_item(int num)
	  {
		this.setStock(this.getStock()+num);
		System.out.println(num+" IceCream added current details of IceCreams are: ");
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
		double cost= (price+curr_tax)*60;//*60 is for currency conversion
		return cost;
	}

}
