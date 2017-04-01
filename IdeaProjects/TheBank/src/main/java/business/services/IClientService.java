package business.services;

import business.entities.Account;
import business.entities.Client;

import java.util.List;

public interface IClientService {

    public Account createNewAccount();

    public Client updateClientInfo();

//    public void ShowClientInfo(); // prints all info related to that client

    public List<Account> listAllAccounts(); // shows all client's accounts

    public void manageAccount(); // transfers client to account interface;



}
