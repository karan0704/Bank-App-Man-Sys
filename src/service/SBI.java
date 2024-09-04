package service;

import model.Account;
import repository.AccountRepo;

import java.util.Optional;
import java.util.Scanner;

public class SBI implements RBI {

	/* Declaration */
	private final Scanner sc;
	private final Account account;
	AccountRepo accountRepo;

	/*
	-Constructor
	*/
	public SBI(Scanner sc, Account account, AccountRepo accountRepo) {
		this.sc = sc;
		this.account = account;
		this.accountRepo = accountRepo;
	}

	@Override
	public void createAccount() {
		//accountRepo = new AccountRepoImpl();

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
		sc.nextLine();
		System.out.println("\nWhat is your ID No\t");

		Optional<Account> optionalAccount = accountRepo.getAccount(sc.nextInt());
		if (optionalAccount.isPresent()) {
			System.out.println(optionalAccount.get().getBalance());
		}
		System.out.println("Account not found");
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
