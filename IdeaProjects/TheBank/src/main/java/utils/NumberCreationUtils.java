package utils;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by nephyr on 3/26/17.
 */
public class NumberCreationUtils {


    public static String createAccountNumber (){

        String accNum1 = "0035"; // In This case only. In an advance scenario it would be translated as the bank's code

        Random randomNumber = new Random();


        int accNum2 = randomNumber.nextInt(999);
        String numberTwo;
        if ((accNum2 < 100) && (accNum2 > 9)){
            numberTwo = "0" + accNum2;
        } else if (accNum2 < 10){
            numberTwo = "00" + accNum2;
        } else {
            numberTwo = "" + accNum2;
        }


        int accNum3 = randomNumber.nextInt(999);
        String numberThree;
        if ((accNum3 < 100) && (accNum3 > 9)){
            numberThree = "0" + accNum3;
        } else if (accNum3 < 10){
            numberThree = "00" + accNum3;
        } else {
            numberThree = "" + accNum3;
        }

        int accSpecialNumber = randomNumber.nextInt(99); // eventually an algorithm related code
        String specialNumber;
        if (accSpecialNumber < 10){
            specialNumber = "00" + accSpecialNumber;
        } else {
            specialNumber = "" + accSpecialNumber;
        }


        String accNumber = accNum1 + numberTwo + numberThree+ accSpecialNumber;
        return accNumber;

    }

    public static String createPinCode(){
        String pinCode = "";

        Scanner usersInput = new Scanner(System.in);

        System.out.println("Please enter your 4 - Digit Code!");
        int pinNumber= usersInput.nextInt();
            if (pinNumber < 1000) {
                System.out.println("Your Pin code must have 4 digits! (the first digit cannot be 0(zero))");
                createPinCode();
            } else if (pinNumber > 9999) {
                System.out.println("Your Pin number cannot have more than 4 digits!");
                createPinCode();
            } else {
                pinCode = "" + pinNumber;
            }
        return pinCode;
    }
}
