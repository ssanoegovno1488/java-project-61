package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int MINIMUM_VALUE = 1;
    public static final int MAXIMUM_VALUE = 50;

    public static void runGame(String[] gameQuestions, String[] gameAnswers, String gameDescription) {
        Scanner scanner = new Scanner(System.in);
        String userName = Cli.getUserName();
        System.out.println(gameDescription);
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String gameQuestion = gameQuestions[i];
            String gameAnswer = gameAnswers[i];
            System.out.println("Question: " + gameQuestion);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next().toLowerCase();
            if (gameAnswer.equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + gameAnswer + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
