package controller;

public class MainClass {
	public static void main(String[] args) {
		
		Admin adminObject = new Admin();
		
		do {
			adminObject.callMenu();
		}while(true);
	}

}
