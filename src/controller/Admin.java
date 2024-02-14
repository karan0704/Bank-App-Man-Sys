package controller;

import java.util.Scanner;

public class Admin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Welcome to Bank");
			System.out.print("Select option for Banking");
			System.out.print("1. Create Account"
					+ "2. Check Balance"
					+ "3. Withdraw Money"
					+ "4. Add Money");
			
			int bankingOption = sc.nextInt();
			
			switch (bankingOption) {
			case 1:
				
				break;

			default:
				break;
			}
			
			sc.close();
			
			
			
			
		} while (true);
		
	}

}
