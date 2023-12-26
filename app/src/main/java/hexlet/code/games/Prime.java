package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.MINIMUM_VALUE;
import static hexlet.code.Engine.MAXIMUM_VALUE;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class Prime {
    public static void startPrimeGame() {
        String[] gameQuestions = new String[ROUNDS_COUNT];
        String[] gameAnswers = new String[ROUNDS_COUNT];
        int minValue = MINIMUM_VALUE;
        int maxValue = MAXIMUM_VALUE;
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            gameQuestions[i] = String.valueOf(randomValue);
            if (isPrime(randomValue)) {
                gameAnswers[i] = "yes";
            } else {
                gameAnswers[i] = "no";
            }
        }
        Engine.runGame(gameQuestions, gameAnswers, gameDescription);
    }

    private static boolean isPrime(int number) {
        boolean result = number >= 2;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
