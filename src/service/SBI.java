package service;

import model.Account;

import java.util.Scanner;

public class SBI implements RBI {

	/* Declaration */
	private final Scanner sc;
	Account accountObject;

	/* Constructor */
	public SBI(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public void createAccount() {

		if(accountObject != null) {
			System.out.println("Account already exists");
			return;
		}

		accountObject = new Account();

		System.out.println("\nWrite your name below\n");
		accountObject.setName(sc.nextLine());

		System.out.println("\nWrite your ID below\t");
		accountObject.setId(sc.nextInt());

		System.out.println("\nWrite your Address below\t");
		accountObject.setAddress(sc.nextLine());

		System.out.println("\nWrite your starting balance below\t");
		accountObject.setBalance(sc.nextDouble());

		System.out.println("\nAccount is created\n");
		System.out.println("---------------------------");
	}

	@Override
	public void checkBalance() {

		if(accountObject == null) {
			System.out.println("Sorry, you have not created your account");
			return;
		}

		System.out.println("\nWhat is your ID No\t");
		int idNo = sc.nextInt();

		if(accountObject.getId() != idNo) {
			System.out.println("Sorry, Invalid ID or no account created.");
		}
		System.out.println("Name -> " + accountObject.getName());
		System.out.println("Balance -> " + accountObject.getBalance());
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
