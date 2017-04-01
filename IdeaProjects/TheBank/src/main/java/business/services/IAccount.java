package business.services;

import business.entities.Account;

/**
 * Created by nephyr on 3/27/17.
 */
public interface IAccount {

    Account createNewAccount();
    void withdrawMoney(int value);
    void depositMoney(int value);
    void transferMoney(Account acc, int value);
    double checkBalance();



}
