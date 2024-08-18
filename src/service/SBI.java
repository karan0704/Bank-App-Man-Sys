package service;

import model.Account;
import repository.AccountRepo;
import repository.AccountRepoImpl;

import java.util.Scanner;

public class SBI implements RBI {

	/* Declaration */
	private final Scanner sc;
	private final AccountRepo;
	

	/* Constructor */
	public SBI(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public void createAccount() {

		AccountRepo accountRepo = new AccountRepoImpl();

		sc.nextLine();
		System.out.println("Write your name below\t");
		String accountName = sc.nextLine();

		System.out.println("Write your ID below\t");
		int accountId = sc.nextInt();

		sc.nextLine();
		System.out.println("Write your Address below\t");
		String accountAddress = sc.nextLine();

		System.out.println("Write your starting balance below\t");
		double accountStartingBalance = sc.nextDouble();

		accountRepo.createAccount(accountName, accountId, accountAddress,accountStartingBalance);
		System.out.println("Account is created");
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
