package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int counter = 0;

    public static int randomGenerator(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }
    public static int guess(int total) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much will you take off? 1, 2, or 3!");
        int userChoice = input.nextInt();
        if (userChoice<4){
    }return total(total, userChoice);
    }
    public static int total(int number, int userChoice){
        number = number - userChoice;
        System.out.println("The total is now " + number);
        int computerGuess = randomGenerator(1,4);
        counter++;
        if(number>0) {
            if ((number > 4) || (number == 1)) {
                System.out.println("The computer guessed " + computerGuess);
                number = number - computerGuess;
                System.out.println("The total is now " + number);

            } else if (number == 3) {
                System.out.println("The computer guessed " + 2);
                number = number - computerGuess;
            } else if (number == 2) {
                System.out.println("The computer guessed " + 1);
                number = number - 1;
            } else if (number == 4) {
                System.out.println("The computer guessed " + 3);
                number = number - 3;
            }
            counter++;
        }

        return number;
    }


    public static void main(String[] args) {
        int startingNumber = randomGenerator(20, 30);
        System.out.println("Your starting number is " + startingNumber);
        while (startingNumber>0){
            startingNumber = guess(startingNumber);
        }if (counter%2 == 1){
            System.out.println("You lose!!!!. I'm so sorry!");
        }else{
            System.out.println("You win!!!! Congratulations");
        }
    }
}
