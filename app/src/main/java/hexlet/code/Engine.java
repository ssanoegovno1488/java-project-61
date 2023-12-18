package hexlet.code;

import java.util.Scanner;
public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static boolean answersComparsion(String gameAnswer, String userAnswer, String userName) {
        boolean result = false;
        if (gameAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
            result = true;
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + gameAnswer + ".");
            System.out.println("Let's try again, " + userName);
        }
        return result;
    }

    public static int calculateGCD(int firstDigit, int secondDigit) {
        while (secondDigit != 0) {
            int tmp = firstDigit % secondDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }
        return firstDigit;
    }
}
