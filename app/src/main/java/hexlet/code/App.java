package hexlet.code;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner choiceScanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String userChoice = choiceScanner.next();
        System.out.println("Your choice: " + userChoice);
        if (userChoice.equals("1")) {
            Cli.getUserName();
        } else if (userChoice.equals("2")) {
            Even.startEvenGame();
        }
        choiceScanner.close();
    }
}
