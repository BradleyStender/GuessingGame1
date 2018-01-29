package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userguess = 0;

        //1.Allow user input of number (guess)
        //2. Tell the user if their guess is to high or too low.
        //3.Allow for 5 chances, is the number isn't guessed tell them what it is
        //4. if the number is guessed, congratulate them
        //5. Allow the user to play again if they want

        Scanner input = new Scanner(System.in);

        final int MaxGuess = 4;

        int numberOfGuesses = 0;

        int generatednumber = (int) Math.ceil(Math.random() * 100);

            do {
                System.out.println("Pick a number 1 to 100: ");
                int userGuess = input.nextInt();

                if (userGuess > generatednumber) {
                    System.out.println("your number is to high!");
                    numberOfGuesses++;
                } else if (userGuess < generatednumber) {
                    System.out.println("your number is to low!");
                    numberOfGuesses++;
                } else if (userGuess == generatednumber) {
                    System.out.println("Congrats, you guessed the number!");
                }

            } while (numberOfGuesses <= 4);

            Scanner PlayAgain = new Scanner;


            System.out.println("You Lost the number was: " + generatednumber );


            System.out.println("Would you like to play again?");

    }
}