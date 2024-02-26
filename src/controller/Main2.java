package controller;

import java.util.Scanner;

import service.RBI;
import service.SBI;

public class Main2 {
	public int selectedBankingOption() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Welcome to Bank");
		System.out.print("\nSelect option for Banking");
		System.out.print("\n1. Create Account" + "\n2. Check Balance" + "\n3. Withdraw Money" + "\n4. Add Money\n"
				+ "\nOption for Banking\t");

		int selectedBankingOption = sc.nextInt();

		return selectedBankingOption;
	}

	public void callMenu() {

		RBI sbi = new SBI();

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

		default:
			System.out.println("Choose valid option");
			break;
		}
	}

}
