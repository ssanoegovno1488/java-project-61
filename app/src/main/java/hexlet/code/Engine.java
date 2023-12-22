package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int MINIMUM_VALUE = 1;
    public static final int MAXIMUM_VALUE = 50;
    public static String getUserInput() {
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static boolean answersComparsion(String gameAnswer, String userAnswer) {
        return gameAnswer.equals(userAnswer);
    }

    public static void gameLauncher(String[] gameQuestions, String[] gameAnswers, String gameStartSalute) {
        int count = 0;
        System.out.println("Question:" + gameStartSalute);
        String userName = Cli.getUserName();
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String gameQuestion = gameQuestions[i];
            String gameAnswer = gameAnswers[i];
            System.out.println("Question:" + gameQuestion);
            String userAnswer = getUserInput().toLowerCase();
            boolean result = answersComparsion(gameAnswer, userAnswer);
            if (result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + gameAnswer + "'" + ".");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
            if (count == ROUNDS_COUNT) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
