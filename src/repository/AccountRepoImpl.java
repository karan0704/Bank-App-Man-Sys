package repository;

import model.Account;

import java.util.ArrayList;

public class AccountRepoImpl implements  AccountRepo{

    private ArrayList<Account> accounts;

    @Override
    public void createAccount(Account account) {
        accounts = new ArrayList<>();
        accounts.add(account);
    }

    @Override
    public ArrayList<Account> getAccounts() {

        if (accounts==null){
            System.out.println("Sorry, there is no accounts in the database");
        }
        return accounts;
    }
    @Override
    public Account getAccount(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void deleteAccount(int id) {

    }

    @Override
    public Account addMoney(int id, double balance) {
        return null;
    }

    @Override
    public Account withdrawBalance(int id, double balance) {
        return null;
    }

    @Override
    public Account changeName(int id, String newName) {
        return null;
    }
    
}
