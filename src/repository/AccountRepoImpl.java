package repository;

import model.Account;

import java.util.ArrayList;

public class AccountRepoImpl implements  AccountRepo{

    private ArrayList<Account> accounts;

    @Override
    public ArrayList<Account> getAccounts() {

        if (accounts==null){
            System.out.println("Account list is empty");
        }
        return accounts;
    }

    @Override
    public void createAccount(String accountName, int accountId, String accountAddress, double accountStartingBalance) {
        accounts =new ArrayList<>();
        accounts.add();
    }

    @Override
    public Account getAccount(int id) {
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
