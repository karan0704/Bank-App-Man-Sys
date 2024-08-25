package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigInteger;
@Getter
@Setter
@ToString
public class Account {
	private int id;
	private String name;
	private String address;
	private BigInteger contactNumber;
	private double balance;
}
