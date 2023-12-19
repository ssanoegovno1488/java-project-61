package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.MINIMUM_VALUE;
import static hexlet.code.Engine.MAXIMUM_VALUE;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class GCD {
    public static void startGCDGame() {
        int count = 0;
        var userName = Cli.getUserName();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (count < ROUNDS_COUNT) {
            int minValue = MINIMUM_VALUE;
            int maxValue = MAXIMUM_VALUE;
            int firstDigit = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int secondDigit = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            String answerToCompare = String.valueOf(calculateGCD(firstDigit, secondDigit));
            System.out.println("Question: " + firstDigit + " " + secondDigit);
            String userAnswer = Engine.getUserInput().toLowerCase();
            boolean result = Engine.answersComparsion(answerToCompare, userAnswer, userName);
            if (result) {
                count++;
            } else {
                break;
            }
        }
        if (count == ROUNDS_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    private static int calculateGCD(int firstDigit, int secondDigit) {
        while (secondDigit != 0) {
            int tmp = firstDigit % secondDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }
        return firstDigit;
    }
}
