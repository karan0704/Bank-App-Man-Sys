package model;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Account {
	private int id;
	private String name;
	private String address;
	private BigInteger contactNumber;
	private double balance;
}
