package service;

import java.math.BigInteger;
import java.util.Scanner;

import model.Account;

public class CreateAccount {
	
	Account account = new Account();
	Scanner sc = new Scanner(System.in);
 
	public void enterName() {
		System.out.println("\nWrite your name below\t");
		String name = sc.nextLine();
		account.setName(name);
	}
	
	public void settingID() {

		
			System.out.println("\nWrite your ID below\t");
			int idNo = sc.nextInt();
			System.out.println("Id No = "+idNo);

			if (idNo != 0) {
				System.out.println("(Checkiing if Id No == 0)"
						+ "Id No = "+idNo);
				
				account.setId(idNo);
				System.out.println("Id No set = "+idNo);
			}
	}
		public void enterAddress() {
			System.out.println("\nWrite your Address below\t");
			String add = sc.next();
			account.setAdd(add);
		}
		public void enterContactNumber() {
			System.out.println("\nWrite your Contact Number below\t");
			BigInteger contactNumber01 = sc.nextBigInteger();
			account.setContactNumber(contactNumber01);
		}
		public void enterStartingBalance() {
			System.out.println("\nWrite your starting balance below\t");
			double startingBalance = sc.nextDouble();
			account.setBalance(startingBalance);
		}
	}