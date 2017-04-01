package presentation;

import business.entities.Client;
import business.services.ClientService;
import utils.NumberCreationUtils;
import utils.printUtils;

import java.util.Scanner;

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


        printUtils.printIntro();
        Scanner userChoice = new Scanner(System.in);
        int input = userChoice.nextInt();


        switch (input) {
            case 1: //1) CREATE NEW CLIENT
                System.out.println("Please enter a first name:");
                String firstNameCreated = userChoice.nextLine();
                userChoice.nextLine();
                System.out.println("Please enter a last name:");
                String lastNameCreated = userChoice.nextLine();
                userChoice.nextLine();
                System.out.println("Please enter your Social Security Number:");
                int ssn = userChoice.nextInt();
                System.out.println("Please enter the name of the city you live in: ");
                String location = userChoice.nextLine();
                userChoice.nextLine();
                System.out.println("Please enter the year of your birth: ");
                int yearOfBirth = userChoice.nextInt();

                Client c = new Client(firstNameCreated, lastNameCreated, ssn, location, yearOfBirth);
                c.setFirstName(firstNameCreated);
                c.setLastName(lastNameCreated);
                c.setSsn(ssn);
                c.setLocation(location);
                c.setYearOfBirth(yearOfBirth);
                break;

            case 2: // UPDATE CLIENT
                break;

            case 3: //       3) SEARCH CLIENT

                printUtils.searchClientMenu();
                int input2 = userChoice.nextInt();

                                switch (input2) {
                                    case 1: // 3.1 SEARCH BY NAME
                                        System.out.println("Please enter client's first name: ");
                                        String nameSearch1 = userChoice.nextLine();
                                        userChoice.nextLine();
                                        System.out.println("Please enter client's last name: ");
                                        String nameSearch2 = userChoice.nextLine();

                                        printUtils.clearScreen();
                                        System.out.println("Results found: ");
                                        System.out.println(clientservice.searchClientByName(nameSearch1, nameSearch2));

                                        break;


                                    case 2: // 3.2 SEARCH BY SSN
                                        System.out.println("Please enter client's social security number: ");
                                        userChoice.nextLine();
                                        int nameSearch3 = userChoice.nextInt();

                                        printUtils.clearScreen();
                                        System.out.println("Results found: ");
                                        System.out.println(clientservice.searchClientBySsn(nameSearch3));

                                        break;


                                    case 3: // 3.3 SEARCH BY LOCATION
                                        System.out.println("Please enter client's location: ");
                                        userChoice.nextLine();
                                        String nameSearch4 = userChoice.nextLine();

                                        printUtils.clearScreen();
                                        System.out.println("Results found: ");
                                        System.out.println(clientservice.searchClientByLocation(nameSearch4));
                                        break;
                }


            case 4: // MANAGE ACCOUNT
                System.out.println("Please enter the ");

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


