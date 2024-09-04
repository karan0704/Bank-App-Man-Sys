package repository;

import model.Account;

import java.util.ArrayList;
import java.util.Optional;

public class AccountRepoImpl implements  AccountRepo{

    private ArrayList<Account> accounts;

    @Override
    public void createAccount(Account account) {
        if (accounts == null) {
            accounts = new ArrayList<>();
        }
        accounts.add(account);
    }

    @Override
    public Optional<Account> getAccount(int id) {
        if (accounts == null) {
            System.out.println("No accounts created");
            return Optional.empty();
        }
        for (Account account : accounts) {
            if (account.getId() == id) {
                return Optional.of(account);
            }
        }

        return Optional.empty();
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
