package service;

import java.math.BigInteger;
import java.util.Scanner;

import model.Account;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account account = new Account();
	CreateAccount createAccount = new CreateAccount();

	@Override
	public void createAccount() {
		
		createAccount.enteredName();

		createAccount.settingID();

		System.out.println("\nWrite your Addres below\t");
		String add = sc.next();
		account.setAdd(add);

		System.out.println("\nWrite your Contact Number below\t");
		BigInteger contactNumber01 = sc.nextBigInteger();
		account.setContactNumber(contactNumber01);

		System.out.println("\nWrite your starting balance below\t");
		double startingBalance = sc.nextDouble();
		account.setBalance(startingBalance);

		System.out.println("\nAccount is created");
		System.out.println("---------------------------");
	}	

//	@Override
//	public void checkBalance() {
//		System.out.println("\nWhat is your ID No\t");
//		int idNo = sc.nextInt();
//		if (account.getId()==idNo && idNo!=0) {
//			System.out.println(account.getName());
//			System.out.println(account.getBalance());
//		}
//		else {
//			System.out.println("ID not exist");
//			checkBalance();
//			
//		}
//		
//	}

	@Override
	public void checkBalance() {
		while (true) {
	            System.out.println("\nWhat is your ID No\t");
	            int idNo = sc.nextInt();
	            if (idNo != 0 && idNo == account.getId()) {
	                System.out.println(account.getName());
	                System.out.println(account.getBalance());
	                break; 
	            } else {
	                System.out.println("Invalid ID. Please try again.");
	            }
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
