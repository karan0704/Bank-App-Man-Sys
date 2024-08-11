package model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
@Getter
@Setter
public class Account {

	private int id;
	private String name;
	private String address;
	private BigInteger contactNumber;
	private double balance;

	

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", balance=" + balance + "]";
	}

	
	

}
