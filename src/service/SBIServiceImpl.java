package service;

import model.Account;
import repository.AccountRepo;

import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

public class SBIServiceImpl implements RBIService {

    /* Declaration */
    private final Scanner sc;
    private final Account account;
    private final AccountRepo accountRepo;

    /*
    -Constructor
    */
    public SBIServiceImpl(Scanner sc, Account account, AccountRepo accountRepo) {
        this.sc = sc;
        this.account = account;
        this.accountRepo = accountRepo;
    }

    private int validInt() {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter an integer");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String validString() {
        while (true) {
            try {
                return sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void checkBalance() {
        sc.nextLine();

        Optional<Account> optionalAccount = getAccount();

        if (optionalAccount.isPresent()) {
            System.out.println(optionalAccount.get().getBalance());
        } else {
            System.out.println("Account not found");
        }
    }

    private Optional<Account> getAccount() {
        Optional<Account> optionalAccount = Optional.empty();

        boolean validId = false;
        while (!validId) {
            try {
                System.out.println("\nWhat is your ID No\t");
                optionalAccount = accountRepo.getAccount(sc.nextInt());
                validId = true;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid Input");
            }
        }
        return optionalAccount;
    }

    @Override
    public void withdrawMoney() {
        sc.nextLine();

        Optional<Account> optionalAccount = getAccount();
        if (optionalAccount.isPresent()) {
            optionalAccount.get().setBalance(sc.nextDouble());
        } else {
            System.out.println("Account not found");
        }
    }

    @Override
    public void addMoney() {
    }


    @Override
    public void createAccount() {
        getId();
        sc.nextLine();
        getName();
        enterStartingBalance();
    }

    private void enterStartingBalance() {
        boolean validBalance = false;
        while (!validBalance) {
            try {
                System.out.println("Write your starting balance below\t");
                account.setBalance(sc.nextDouble());
                validBalance = true;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid Amount");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            accountRepo.createAccount(account);
            System.out.println("Account is created");
            System.out.println("---------------------------");
        }
        {
            System.out.println("Write your Address below\t");
            account.setAddress(validString());
        }
    }


    private void getName() {
        boolean validName = false;
        while (!validName) {
            try {
                System.out.println("Write your name below\t");
                String name = sc.nextLine();
                if (!name.matches("[a-zA-Z\\s]+")) {
                    System.out.println("Invalid name. Please enter a valid name containing only letters and spaces.");
                } else {
                    account.setName(name);
                }
                validName = true;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println(e.getMessage());
            }
        }
    }

    /*private void getId() {
        boolean validId = false;
        while (!validId) {
            try {
                System.out.println("Write your ID below\t");
                int id = sc.nextInt();
                Optional<Account> optionalAccount = accountRepo.getAccount(id);
                if (optionalAccount.isPresent()) {
                    System.out.println("Invalid ID. Please enter a valid ID.");
                } else {
                    account.setId(id);
                }
                validId = true;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Invalid ID");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }*/

    private void getId() {

        System.out.println("Write your ID below\t");
        int id = validInt();
        Optional<Account> optionalAccount = accountRepo.getAccount(id);
        if (optionalAccount.isPresent()) {
            System.out.println("Invalid ID. Please enter a valid ID.");
        } else {
            account.setId(id);
        }
    }
}


