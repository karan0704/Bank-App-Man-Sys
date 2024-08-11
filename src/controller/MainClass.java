package controller;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);
		Admin admin = new Admin(scannerObject);
		
		admin.callMenu();
		scannerObject.close();
    }

}
