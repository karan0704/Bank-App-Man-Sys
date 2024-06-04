package controller;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);
		Admin adminObject = new Admin(scannerObject);
		
		do {
			adminObject.callMenu();
		}while(true);
	}

}
