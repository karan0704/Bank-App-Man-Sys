package service;

import java.math.BigInteger;
import java.util.Scanner;

import model.Account;

public class SBI implements RBI{
	
	Scanner sc = new Scanner(System.in);
	Account account = new Account();
	@Override
	public void createAccount() {
		System.out.println("Write your name below");
		String name = sc.next();
		account.setName(name);
		
		System.out.println("Write your ID below");
		int id = sc.nextInt();
		account.setId(id);
		
		System.out.println("Write your Addres below");
		String add = sc.next();
		account.setAdd(add);
		
		System.out.println("Write your Contact Number below");
		BigInteger contactNumber01 = sc.nextBigInteger();
		account.setContactNumber(contactNumber01);
		
		System.out.println("Write your starting balance below");
		double startingBalance = sc.nextDouble();
		account.setBalance(startingBalance);
		
		System.out.println("Account is created");
	}

	@Override
	public void checkBalance() {
		System.out.println("\nWhat is your ID No");
		int idNo = sc.nextInt();
		if (account.getId()==idNo && idNo!=0) {
			System.out.println(account.getName());
			System.out.println(account.getBalance());
		}
		else {
			System.out.println("ID not exist");
		}
		
	}

	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMoney() {
		// TODO Auto-generated method stub
		
	}

}
