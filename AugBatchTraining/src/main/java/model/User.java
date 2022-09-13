package model;

public class User {

	private int id;
	private String name;
	private String emailId;
	private long phoneNo;

	public int getId() {
		return id;
	}

	public User setId(int id) {
		this.id = id;
		
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}

	public String getEmailId() {
		return emailId;
	}

	public User setEmailId(String emailId) {
		this.emailId = emailId;
		return this;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public User setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
		return this;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
	}

}
