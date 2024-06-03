package service;

import java.util.Scanner;

import model.Account;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account account = new Account();

	@Override
	public void createAccount() {
		System.out.println("\nWrite your name below\t");
		String name = sc.nextLine();
		account.setName(name);
		
		System.out.println("\nWrite your ID below\t");
		int idNo = sc.nextInt();
		System.out.println("Id No = "+idNo);

		if (idNo != 0) {
			System.out.println("(Checking if Id No == 0)"
					+ "Id No = "+idNo);
			
			account.setId(idNo);
			System.out.println("Id No set = "+idNo);
			
			System.out.println("Account ID got -> "+account.getId());
		}
		
		
		System.out.println("\nWrite your Address below\t");
		String add = sc.next();
		account.setAdd(add);
		
		
		System.out.println("\nWrite your starting balance below\t");
		double startingBalance = sc.nextDouble();
		account.setBalance(startingBalance);
		
		System.out.println("\nAccount is created\n");
		System.out.println("---------------------------");
	}	

// ***********************************Here is the Problem**********************
	@Override
		public void checkBalance() {
			
		            System.out.println("\nWhat is your ID No\t");
		            int idNo = sc.nextInt();
		            System.out.println("Typed Id No is "+idNo);
		            if (account.getId() == idNo ) {
		                System.out.println("Name -> "+account.getName());
		                System.out.println("Balance -> "+account.getBalance());
		            } 
		            else {
		            	System.out.println("Invalid ID.");
		                System.out.println("Id No = "+idNo);
		            }
			}
// ***********************************Here is the Problem**********************
	@Override
	public void withdrawMoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addMoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public int tryAgainExit() {
		System.out.println("1. Please try again"
				+ "2. Exit");
		
		int tryAgainOrExit = sc.nextInt();
		return tryAgainOrExit;
		
	}
	
	

}
