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

		System.out.println("\nWhat is your ID No\t");
		int idNo = sc.nextInt();
		System.out.println("Typed Id No is " + idNo);
		System.out.println(accountObject.getId());

		if (accountObject != null && accountObject.getId() == idNo) {
			System.out.println("Name -> " + accountObject.getName());
			System.out.println("Balance -> " + accountObject.getBalance());
		} else {
			System.out.println("Invalid ID or no account created.");
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
