package assignments7;

import java.util.Objects;

public class Tocken {
	private int tocken;
	static int i=1;
	public Tocken() {
		this.tocken=i;
		i++;
	}
	public int getTocken() {
		return tocken;
	}
	public void setTocken(int tocken) {
		this.tocken = tocken;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(tocken);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "Tocken [tocken=" + tocken + "]";
	}
	
	
	
}
