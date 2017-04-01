package business.services;

import business.entities.Client;

/**
 * Created by nephyr on 3/26/17.
 */
public interface IBank {

    public Client createClient(Client c);

    public void deleteClient(Client client); // delete's client from bank db;

    public String searchClientByName(String firstName, String lastName); // Searches Client By first and last name

    public String searchClientBySsn(int ssn); // Searches Client By SSN

    public String searchClientByLocation(String location); // Searches Client By Location

}
