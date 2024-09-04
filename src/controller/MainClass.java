package controller;

import model.Account;
import repository.AccountRepoImpl;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		/*Object Creation*/
		Scanner scannerObject = new Scanner(System.in);
		Account accountObject = new Account();
		AccountRepoImpl accountRepoObject = new AccountRepoImpl();

		/*Dependency Injection*/
		MainMenu mainMenu = new MainMenu(scannerObject, accountObject, accountRepoObject);

		/*Method Calls*/
		mainMenu.callMenu();
		scannerObject.close();
    }
}
