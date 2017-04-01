package business.services;

import business.entities.Account;
import business.entities.Client;

import java.util.ArrayList;
import java.util.List;



public class ClientService implements IClientService, IBank{

    List<Client> clientsList = new ArrayList<Client>(); // eventually this will be our db




////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // BANK MANAGEMENT
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public Client createClient(Client c) {
        clientsList.add(c);
        return c;
    }


    public void deleteClient(Client c) {
        c = null; // not sure if possible!

    }


    public String searchClientByName(String firstName, String lastName) {

        String response = "";
        for(Client c : clientsList){


            if ((c.toString().contains(firstName)) && (c.toString().contains(lastName))){
                response = '\n' + response + "   " + c + '\n' + "____________________________" + '\n';


            }
        }
        return response;
    }



    public String searchClientBySsn(int ssn) {
        String response = "";
        String searchSsn = "" + ssn;


        for(Client c : clientsList){
            if ((c.toString().contains(searchSsn))){
                response = '\n' + response + "   " + c + '\n' + "____________________________" + '\n';

            }
        }
        return response;
    }

    public String searchClientByLocation(String location) {
        String response = "";
        for(Client c : clientsList){

            if ((c.toString().contains(location))){
                response = '\n' + response + "   " + c + '\n' + "____________________________" + '\n';

            }
        }
        return response;
    }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // CLIENT MANAGEMENT
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public Account createNewAccount() {

        Account newAcc = new Account();
        newAcc.createNewAccount();

        return newAcc;
    }

//    public void ShowClientInfo() {
//
//        System.out.println(Client.get);
//    }


    public Client updateClientInfo() {
        return null;
    }



    public List<Account> listAllAccounts() {


        return null;
    }

    public void manageAccount() {

    }



}
