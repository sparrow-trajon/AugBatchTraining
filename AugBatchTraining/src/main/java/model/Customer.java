package model;

public class Customer {
	
	private int customer_id;
	private int storeId;
	private String firstName;
	private String lastName;
	private String email;
	private String addressId;
	public int getCustomer_id() {
		return customer_id;
	}
	public Customer setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
		return this;
	}
	public int getStoreId() {
		return storeId;
	}
	public Customer setStoreId(int storeId) {
		this.storeId = storeId;
		return this;
	}
	public String getFirstName() {
		return firstName;
	}
	public Customer setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public String getLastName() {
		return lastName;
	}
	public Customer setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public Customer setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getAddressId() {
		return addressId;
	}
	public Customer setAddressId(String addressId) {
		this.addressId = addressId;
		return this;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", storeId=" + storeId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", addressId=" + addressId + "]";
	}
	
	

}
