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

        final int MAXCOUNT = 4 ;

        int numberOfGuesses = 0;

        System.out.println("Enter your guess: ");
        int userGuess = input.nextInt();

        int generatednumber = (int) Math.ceil(Math.random() * 100);




        do {
            if (userguess > generatednumber) {
                System.out.println("your number is to high!");
                numberOfGuesses++;
            } else if (userguess < generatednumber) {
                System.out.println("your number is to low!");
                numberOfGuesses++;
            }else if (userGuess == generatednumber) {
                System.out.println("Congrats, you guessed the number!");
            } else if (numberOfGuesses == MAXCOUNT) {
                System.out.println("Sorry, you ran out of chances. The correct number was: " + generatednumber);
            }
        } while (numberOfGuesses <= 4);
    }
}