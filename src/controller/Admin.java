package controller;

import java.util.Scanner;

import model.Account;
import service.RBI;
import service.SBI;

public class Admin {

	private Scanner sc;

	public Admin(Scanner sc) {
		this.sc = sc;
	}

	public void callMenu() {
		;
		RBI sbi = new SBI(sc);

		switch (selectedBankingOption()) {

		case 1:
			sbi.createAccount();
			break;

		case 2:
			sbi.checkBalance();
			break;

		case 3:
			sbi.withdrawMoney();
			break;

		case 4:
			sbi.addMoney();
			break;

		case 5:
			System.out.println("Exiting...");
			return;

		default:
			System.out.println("Choose valid option");
			break;
		}
	}

	public int selectedBankingOption() {
		System.out.print("Welcome to Bank\n");
		System.out.print("\nBanking Option");
		System.out.print("\n1. Create Account" + "\n2. Check Balance" + "\n3. Withdraw Money" + "\n4. Add Money\n"
				+ "\nType option for Banking ->\t");

		int selectedBankingOption = sc.nextInt();
		return selectedBankingOption;
	}
}