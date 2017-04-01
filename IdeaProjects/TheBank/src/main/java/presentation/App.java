package presentation;

import business.entities.Client;
import business.services.ClientService;
import utils.choicesUtils;

/**
 * Created by nephyr on 3/26/17.
 */
public class App {


    public static void main(String[] args) {

        ClientService clientservice = new ClientService();


        Client client1 = new Client("Luis", "Wood", 258487941, "Porto", 1990);
        Client client2 = new Client("André", "Costa", 258787941, "Lisboa", 1990);
        Client client3 = new Client("Joao", "Niza", 251187941, "Porto", 1987);
        Client client4 = new Client("Luis", "Sousa", 218487941, "Coimbra", 1928);


        clientservice.createClient(client1);
        clientservice.createClient(client2);
        clientservice.createClient(client3);
        clientservice.createClient(client4);


        while (1 < 2) {                                        // ********** INTRO *********************
            int input = choicesUtils.introMethod();         //  ************ MENU   **************+
                if (input == 0){
                    System.exit(0);
                }

            switch (input) {
                case 1: // CREATE CLIENT

                    clientservice.createClient(choicesUtils.creationOfClient());

                    break;

                case 2: // UPDATE CLIENT
                    break;

                case 3: //       3) SEARCH CLIENT
                    int input2 = choicesUtils.searchClientMenu();
                    switch (input2) {

                        case 0: break; // return

                        case 1: // 3.1 SEARCH BY NAME
                            choicesUtils.searchClientByName(clientservice);
                            break;

                        case 2: // 3.2 SEARCH BY SSN
                            choicesUtils.searchClientBySsn(clientservice);

                            break;


                        case 3: // 3.3 SEARCH BY LOCATION
                            choicesUtils.searchClientByLocation(clientservice);
                            break;
                    }


                case 4: // MANAGE ACCOUNT

                    // after selecting the account the following options should be possible:
                /*
                - Withdraw money;
                - deposit money;
                -transfer money;
                - check balance;
                 */
            }
        }
    }
}


