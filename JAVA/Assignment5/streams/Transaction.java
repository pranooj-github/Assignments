package streams;

public class Transaction {
	private Traders traders;
	private int year,value;
	public Transaction(Traders traders, int year, int value) {
		super();
		this.traders = traders;
		this.year = year;
		this.value = value;
	}
	public Traders getTraders() {
		return traders;
	}
	public void setTraders(Traders traders) {
		this.traders = traders;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [traders=" + traders + ", year=" + year + ", value=" + value + "]";
	}
	
}
