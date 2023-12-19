package hexlet.code;


import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner choiceScanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String userChoice = choiceScanner.next();
        System.out.println("Your choice: " + userChoice);
        switch (userChoice) {
            case "1" -> Cli.getUserName();
            case "2" -> Even.startEvenGame();
            case "3" -> Calc.startCalcGame();
            case "4" -> GCD.startGCDGame();
            case "5" -> Progression.startProgressionGame();
            case "6" -> Prime.startPrimeGame();
            case "0" -> System.out.println("Goodbye!");
            default -> System.out.println("Unexpected value: " + userChoice);
        }
        choiceScanner.close();
    }
}
