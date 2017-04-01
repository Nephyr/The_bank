package utils;

import business.entities.Client;
import business.services.ClientService;

import java.util.Scanner;

public class choicesUtils {

    public static int introMethod(){
        printUtils.printIntro();
        Scanner userChoice = new Scanner(System.in);
        int input = userChoice.nextInt();
        return input;
    }

    public static Client creationOfClient(){ //  CLIENT CREATION MENU

                Scanner userChoice = new Scanner(System.in);


                System.out.println("Please enter a first name:");
                String firstNameCreated = userChoice.nextLine();
                System.out.println("Please enter a last name:");
                String lastNameCreated = userChoice.nextLine();
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
            return c;
    }

    public static int searchClientMenu(){

        printUtils.searchClientMenu();
        Scanner userChoice = new Scanner(System.in);
        int input2 = userChoice.nextInt();
        return input2;
    }

    public static void searchClientByName(ClientService clientservice){

        Scanner userChoice = new Scanner(System.in);

        System.out.println("Please enter client's first name: ");
        String nameSearch1 = userChoice.nextLine();
        System.out.println("Please enter client's last name: ");
        String nameSearch2 = userChoice.nextLine();
        printUtils.clearScreen();
        System.out.println("Results found: ");
        System.out.println(clientservice.searchClientByName(nameSearch1, nameSearch2));
        System.out.println("");
        System.out.println("");
        System.out.println("                   RETURN? ");
        System.out.println("");
        System.out.println("                    <OK>");
        userChoice.nextLine();
        printUtils.clearScreen();

    }

    public static void searchClientBySsn (ClientService clientservice) {
        Scanner userChoice = new Scanner(System.in);

        System.out.println("Please enter client's social security number: ");
        userChoice.nextLine();
        int nameSearch3 = userChoice.nextInt();

        printUtils.clearScreen();
        System.out.println("Results found: ");
        System.out.println(clientservice.searchClientBySsn(nameSearch3));
        System.out.println("");
        System.out.println("");
        System.out.println("                   RETURN? ");
        System.out.println("");
        System.out.println("                    <OK>");
        userChoice.nextLine();
        printUtils.clearScreen();
    }

    public static void searchClientByLocation(ClientService clientservice){
        Scanner userChoice = new Scanner(System.in);
        System.out.println("Please enter client's location: ");
        userChoice.nextLine();
        String nameSearch4 = userChoice.nextLine();

        printUtils.clearScreen();
        System.out.println("Results found: ");
        System.out.println(clientservice.searchClientByLocation(nameSearch4));
        System.out.println("");
        System.out.println("");
        System.out.println("                   RETURN? ");
        System.out.println("");
        System.out.println("                    <OK>");
        userChoice.nextLine();
        printUtils.clearScreen();
    }

}

