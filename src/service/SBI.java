package service;

import model.Account;
import repository.AccountRepo;
import repository.AccountRepoImpl;

import java.util.Scanner;

public class SBI implements RBI {

	/* Declaration */
	private final Scanner sc;
	private Account account;
	AccountRepo accountRepo;

	/* Constructor */
	public SBI(Scanner sc, Account account) {
		this.sc = sc;
		this.account = account;
	}

	@Override
	public void createAccount() {
		accountRepo = new AccountRepoImpl();

		sc.nextLine();
		System.out.println("Write your name below\t");
		account.setName(sc.nextLine());

		System.out.println("Write your ID below\t");
		account.setId(sc.nextInt());

		sc.nextLine();
		System.out.println("Write your Address below\t");
		account.setAddress(sc.nextLine());

		System.out.println("Write your starting balance below\t");
		account.setBalance(sc.nextDouble());

		accountRepo.createAccount(account);
		System.out.println("Account is created");
		System.out.println("---------------------------");
	}

	@Override
	public void checkBalance() {

		if(accountRepo.getAccounts() == null) {
			System.out.println("Sorry, you have not created your account");
			return;
		}

		System.out.println("\nWhat is your ID No\t");
		Account account1 = accountRepo.getAccount(sc.nextInt());
		account1.toString();
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
