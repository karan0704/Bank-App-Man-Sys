package service;

import model.Account;
import repository.AccountRepo;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class SBIServiceImpl implements RBIService {

	/* Declaration */
	private final Scanner sc;
	private final Account account;
	private final AccountRepo accountRepo;

	/*
	-Constructor
	*/
	public SBIServiceImpl(Scanner sc, Account account, AccountRepo accountRepo) {
		this.sc = sc;
		this.account = account;
		this.accountRepo = accountRepo;
	}

	@Override
	public void createAccount() {
		sc.nextLine();

		try {
			System.out.println("Write your name below\t");
			account.setName(sc.nextLine());
		} catch (Exception e) {
			sc.nextLine();
			System.out.println(e.getMessage());
		}

		boolean validId = false;
		while (!validId) {
			try {
				System.out.println("Write your ID below\t");
				account.setId(sc.nextInt());
				validId = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		sc.nextLine();

		try {
			System.out.println("Write your Address below\t");
			account.setAddress(sc.nextLine());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		boolean validBalance = false;
		while (!validBalance) {
			try {
				System.out.println("Write your starting balance below\t");
				account.setBalance(sc.nextDouble());
				validBalance = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println(e.getMessage());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}


			accountRepo.createAccount(account);
			System.out.println("Account is created");
			System.out.println("---------------------------");
		}
	}

	@Override
	public void checkBalance() {
		sc.nextLine();

		Optional<Account> optionalAccount = null;

		boolean validId = false;
		while (!validId) {
			try {
				System.out.println("\nWhat is your ID No\t");
				optionalAccount = accountRepo.getAccount(sc.nextInt());
				validId = true;
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Invalid Input");
			}
		}

		if (optionalAccount.isPresent()) {
			System.out.println(optionalAccount.get().getBalance());
		} else {
			System.out.println("Account not found");
		}
	}

	@Override
	public void withdrawMoney() {
	}


	@Override
	public void addMoney() {
		// TODO Auto-generated method stub
	}
}

