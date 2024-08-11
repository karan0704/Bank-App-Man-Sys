package controller;

import service.RBI;
import service.SBI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Admin {

    private final Scanner sc;

	/*
	-Constructor
	-Called from MainCLass*/
	public Admin(Scanner sc) {
		this.sc = sc;
	}

	public void callMenu() {

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
		try {
			System.out.print("Welcome to Bank\n");
			System.out.println("\nBanking Option");
			System.out.print("""
					1. Create Account
					2. Check Balance
					3. Withdraw Money
					4. Add Money
					Type option for Banking ->\t""");

			return sc.nextInt();
		}catch (InputMismatchException e) {
			sc.nextLine();
		}
		return 0;
    }
}