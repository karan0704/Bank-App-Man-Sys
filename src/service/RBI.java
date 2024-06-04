package service;

public interface RBI {	
	void createAccount();
	void checkBalance();
	void withdrawMoney();
	void addMoney();
	
	int tryAgainExit();
}