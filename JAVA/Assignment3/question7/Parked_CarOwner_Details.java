package assignments7;


public class Parked_CarOwner_Details {
	String name,address,model;
	
	int phn_number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPhn_number() {
		return phn_number;
	}

	public void setPhn_number(int phn_number) {
		this.phn_number = phn_number;
	}

	@Override
	public String toString() {
		return "Parked_CarOwner_Details [name=" + name + ", address=" + address + ", model=" + model + ", phn_number="
				+ phn_number + "]";
	}


	
	
}
