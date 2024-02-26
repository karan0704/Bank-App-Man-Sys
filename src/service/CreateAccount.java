package service;

import java.util.Scanner;

import model.Account;

public class CreateAccount {
	
	Account account = new Account();
	Scanner sc = new Scanner(System.in);
 
	public void enteredName() {
		System.out.println("\nWrite your name below\t");
		String name = sc.nextLine();
		account.setName(name);
	}
	
	public void settingID() {

		int idNo = 0;

		if (idNo == 0) {
			System.out.println("\nWrite your ID below\t");
			idNo = sc.nextInt();

			if (idNo != 0) {
				account.setId(idNo);
			}

			else {
				System.out.println("Enter non-zero Number for ID");
				settingID();
			}
		}
	}

}
