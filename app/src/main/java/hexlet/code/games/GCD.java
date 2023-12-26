package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.MINIMUM_VALUE;
import static hexlet.code.Engine.MAXIMUM_VALUE;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class GCD {
    public static void startGCDGame() {
        String[] gameQuestions = new String[ROUNDS_COUNT];
        String[] gameAnswers = new String[ROUNDS_COUNT];
        int minValue = MINIMUM_VALUE;
        int maxValue = MAXIMUM_VALUE;
        String gameDescription = "Find the greatest common divisor of given numbers.";
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int firstDigit = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int secondDigit = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            gameAnswers[i] = String.valueOf(calculateGCD(firstDigit, secondDigit));
            gameQuestions[i] = firstDigit + " " + secondDigit;

        }
        Engine.runGame(gameQuestions, gameAnswers, gameDescription);
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


