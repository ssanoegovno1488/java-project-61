package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner choiceScanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        String userChoice = choiceScanner.next();
        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case "1" -> Cli.getUserName();
            case "2" -> Even.startEvenGame();
            case "3" -> Calc.startCalcGame();
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Unexpected value: " + userChoice);
        }
        choiceScanner.close();
    }
}
