package controller;

import java.util.Scanner;

import service.RBI;
import service.SBI;

public class Admin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RBI sbi = new SBI();
		
		do {
			System.out.print("Welcome to Bank");
			System.out.print("Select option for Banking");
			System.out.print("1. Create Account"
					+ "2. Check Balance"
					+ "3. Withdraw Money"
					+ "4. Add Money");
			
			int bankingOption = sc.nextInt();
			
			switch (bankingOption) {
			case 1:sbi.createAccount();
				break;
				
			case 2:sbi.checkBalance();
				break;
				
			case 3:sbi.withdrawMoney();
				break;
			
			case 4:sbi.addMoney();
				break;
			
			default:System.out.println("Choose valid option");
				break;
			}
			
			sc.close();
			
			
			
			
		} while (true);
		
	}

}
