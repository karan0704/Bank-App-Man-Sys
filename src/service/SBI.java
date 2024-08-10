package service;

import model.Account;

import java.util.Scanner;

public class SBI implements RBI {

	private final Scanner sc;
	Account accountObject;

	public SBI(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public void createAccount() {

		System.out.println("\nWrite your name below\n");
		sc.nextLine(); // Consume newline character
		accountObject = new Account();
		String name = sc.nextLine();
		accountObject.setName(name);

		System.out.println("\nWrite your ID below\t");
		// idNo = Saving input value
		int idNo = sc.nextInt();
		System.out.println("Id No = " + idNo);

		if (idNo != 0) {
			System.out.println("(Checking if Id No == 0)" + "Id No = " + idNo);

			accountObject.setId(idNo);
			System.out.println("Id No set = " + idNo);

			System.out.println("Account ID got -> " + accountObject.getId());
		}

		System.out.println("\nWrite your Address below\t");
		sc.nextLine();
		String add = sc.nextLine();
		accountObject.setAdd(add);

		System.out.println("\nWrite your starting balance below\t");
		double startingBalance = sc.nextDouble();
		sc.nextLine(); // Consume newline character
		accountObject.setBalance(startingBalance);

		System.out.println("\nAccount is created\n");
		System.out.println("---------------------------");
	}

	@Override
	public void checkBalance() {
		System.out.println("\nWhat is your ID No\t");
		int idNo = sc.nextInt();
		System.out.println("Typed Id No is " + idNo);
		System.out.println("Name -> " + accountObject.getName());
		if (accountObject != null && accountObject.getId() == idNo) {
			// System.out.println("Name -> "+accountObject.getName());
			System.out.println("Balance -> " + accountObject.getBalance());
		} else {
			System.out.println("Invalid ID.");
			System.out.println("Id No = " + idNo);
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

	@Override
	public int tryAgainExit() {
		System.out.println("1. Please try again" + "2. Exit");

		return sc.nextInt();

	}

}
