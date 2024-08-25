package controller;

import model.Account;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		/*Object Creation*/
		Scanner scannerObject = new Scanner(System.in);
		Account accountObject = new Account();
		MainMenu mainMenu = new MainMenu(scannerObject, accountObject);

		/*Method Calls*/
		mainMenu.callMenu();
		scannerObject.close();
    }
}
