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
			System.out.print("\nSelect option for Banking");
			System.out.print("\n1. Create Account"
					+ "\n2. Check Balance"
					+ "\n3. Withdraw Money"
					+ "\n4. Add Money");
			
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
			
			
			
			
			
			
		} while (true);
		
		
	}

}
