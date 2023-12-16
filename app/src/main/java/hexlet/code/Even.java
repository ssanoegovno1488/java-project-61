package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void startEvenGame() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (count < 3) {
            int minValue = 1;
            int maxValue = 50;
            int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            String answerToCompare;
            if (randomValue % 2 == 0) {
                answerToCompare = "yes";
            } else {
                answerToCompare = "no";
            }
            System.out.println("Question: " + randomValue);
            String userAnswer = scanner.next().toLowerCase();
            if (userAnswer.equals(answerToCompare)) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + answerToCompare + ".");
                System.out.println("Let's try again, " + userName);
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
