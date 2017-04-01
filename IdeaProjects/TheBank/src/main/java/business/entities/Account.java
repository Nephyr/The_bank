package business.entities;

import business.services.IAccount;
import utils.NumberCreationUtils;

public class Account implements IAccount{

    private String accountNumber;
    private String accountSecurityPin; // 4 digit number
    private double balance;




    public Account createNewAccount() {

    Account newAcc = new Account();
    newAcc.accountNumber = NumberCreationUtils.createAccountNumber();
    newAcc.accountSecurityPin = NumberCreationUtils.createPinCode();
    newAcc.balance = 0.0;
        return newAcc;
    }

    public void withdrawMoney(int value) {
        balance = balance - value;
    }

    public void depositMoney(int value) {
        balance = balance + value;
    }

    public void transferMoney(Account acc, int value) {

        balance = balance - value;
        acc.setBallance(acc.getBallance() + value);
    }

    public double checkBalance() {
        System.out.println(balance);
        return balance;
    }

//
//    public void withdrawMoney(int value) {
//    balance = balance - value;
//    }
//
//    public void depositMoney(int value) {
//        balance = balance + value;
//    }
//
//    public void transferMoney(Account acc, int value) {
//
//        balance = balance - value;
//        acc.setBallance(acc.getBallance() + value);
//
//    }
//
//    public double checkBalance() {
//
//        System.out.println(balance);
//
//        return balance;
//    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                                // GETTERS AND SETTERS
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountSecurityPin() {
        return accountSecurityPin;
    }

    public double getBallance() {
        return balance;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountSecurityPin(String accountSecurityPin) {
        this.accountSecurityPin = accountSecurityPin;
    }

    public void setBallance(double ballance) {
        this.balance = ballance;
    }


}