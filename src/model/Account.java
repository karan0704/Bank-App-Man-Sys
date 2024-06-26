package model;

import java.math.BigInteger;

public class Account {
	private int id;
	private String name;
	private String add;
	private BigInteger contactNumber;
	private double balance;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("setId success= "+id);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public BigInteger getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(BigInteger contactNumber) {
		this.contactNumber = contactNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", add=" + add + ", contactNumber=" + contactNumber
				+ ", balance=" + balance + "]";
	}
	/*public Account(int id, String name, String add, BigInteger contactNumber, double balance, Account accountObject) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.contactNumber = contactNumber;
		this.balance = balance;
	}
	*/
	
	

}
