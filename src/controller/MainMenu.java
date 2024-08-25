package controller;

import model.Account;
import repository.AccountRepo;
import repository.AccountRepoImpl;
import service.RBI;
import service.SBI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private final Scanner sc;
	private final Account account;

	/*
	-Constructor
	-Called from MainCLass*/
	public MainMenu(Scanner sc, Account account) {
		this.sc = sc;
		this.account = account;
	}

	public int selectedBankingOption() {
		try {
			System.out.print("""
					Welcome to Bank
					Banking Option
						1. Create Account
						2. Check Balance
						3. Withdraw Money
						4. Add Money
						6. Exit Program
						Type option for Banking ->\t""");
			return sc.nextInt();
		}catch (InputMismatchException e) {
			sc.nextLine();
			System.out.println("Please enter a valid option");
			return selectedBankingOption();
		}
	}

	public void callMenu() {
		RBI sbi = new SBI(sc, account);

		while(true) {
			switch (selectedBankingOption()) {
				case 1 -> sbi.createAccount();
				case 2 -> sbi.checkBalance();
				case 3 -> sbi.withdrawMoney();
				case 4 -> sbi.addMoney();
				case 6 -> {
					System.out.println("Exiting...");
					return;
				}
			}
		}
	}
}