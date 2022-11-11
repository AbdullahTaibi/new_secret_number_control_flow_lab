// DataTypes.java
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args){

        byte secretNumber = 12;


        int randomNumber = rand.nextInt(50) + 1;

        System.out.println("Please enter your answer (1-100):");

        Scanner scanner = new Scanner(System.in);
                int playerGuess = scanner.nextInt();

        if (playerGuess == randomNumber){
            System.out.println("Well Done!");
        } else if (randomNumber > playerGuess) {
            System.out.println("Try Again");


            }

        }
    }

