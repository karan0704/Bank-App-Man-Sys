package service;

import java.util.Scanner;

import model.Account;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account account = new Account();
	CreateAccount createAccount = new CreateAccount();

	@Override
	public void createAccount() {
		
		createAccount.enterName();
		createAccount.settingID();
		createAccount.enterAddress();
		createAccount.enterStartingBalance();
		
		System.out.println("\nAccount is created\n");
		System.out.println("---------------------------");
	}	

//	@Override
//	public void checkBalance() {
//		System.out.println("\nWhat is your ID No\t");
//		int idNo = sc.nextInt();
//		if (account.getId()==idNo && idNo!=0) {
//			System.out.println(account.getName());
//			System.out.println(account.getBalance());
//		}
//		else {
//			System.out.println("ID not exist");
//			checkBalance();
//			
//		}
//		
//	}

	@Override
		public void checkBalance() {
			
		            System.out.println("\nWhat is your ID No\t");
		            int idNo = sc.nextInt();
		            System.out.println("Id No = "+idNo);
		            int id = account.getId();
		            System.out.println("Id from getID = "+id);
		            if (idNo != 0 && idNo == id) {
		                System.out.println(account.getName());
		                System.out.println(account.getBalance());
		            } else {
		            	
		                System.out.println("Invalid ID.");
		                System.out.println("Id No = "+idNo);
		            }
			}

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
