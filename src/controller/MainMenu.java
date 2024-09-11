package controller;

import model.Account;
import repository.AccountRepo;
import service.RBIService;
import service.SBIServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {

    private final Scanner sc;
    private final Account account;
    private final AccountRepo accountRepo;

    /*
    -Constructor
    -Called from MainCLass
    */
    public MainMenu(Scanner scanner, Account account, AccountRepo accountRepo) {
        this.sc = scanner;
        this.account = account;
        this.accountRepo = accountRepo;
    }

    /*
    -Called from MainCLass
    */
    public void callMenu() {
        RBIService sbi = new SBIServiceImpl(sc, account, accountRepo);

        while (true) {
            switch (selectedBankingOption()) {
                case 1 -> sbi.createAccount();
                case 2 -> sbi.checkBalance();
                case 3 -> sbi.withdrawMoney();
                case 4 -> sbi.addMoney();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }

    public int selectedBankingOption() {
        try {
            System.out.print("""
                    Welcome to Bank
                    Banking Option
                    	1. Create Account
                    	2. Check Balance
                    	3. Withdraw Money
                    	4. Add Money
                    	6. Exit Program
                    	Type option for Banking ->\t""");
            return sc.nextInt();
        } catch (InputMismatchException e) {
            sc.nextLine();
            return 0;
        }
    }
}