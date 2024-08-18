package repository;

import model.Account;

import java.util.ArrayList;

public interface AccountRepo {
   ArrayList<Account> getAccounts();
   void createAccount(String accountName, int accountId, String accountAddress, double accountStartingBalance);
   Account getAccount(int id);
   void updateAccount(Account account);
   void deleteAccount(int id);
   Account addMoney(int id, double balance);
   Account withdrawBalance(int id, double balance);
   Account changeName(int id, String newName);

}
