package controller;

import model.Account;
import repository.AccountRepo;
import repository.AccountRepoImpl;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		/*Object Creation*/
		Scanner scanner = new Scanner(System.in);
		Account account = new Account();
		AccountRepo accountRepo = new AccountRepoImpl();

		/*Dependency Injection*/
		MainMenu mainMenu = new MainMenu(scanner, account, accountRepo);

		/*Method Calls*/
		mainMenu.callMenu();
		scanner.close();
    }
}
