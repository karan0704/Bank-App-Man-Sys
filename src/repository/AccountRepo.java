package repository;

import model.Account;

import java.util.Optional;

public interface AccountRepo {

    void createAccount(Account  account);
   Optional<Account> getAccount(int id);
   void updateAccount(Account account);
   void deleteAccount(int id);
   Account addMoney(int id, double balance);
   Account withdrawBalance(int id, double balance);
   Account changeName(int id, String newName);
}
