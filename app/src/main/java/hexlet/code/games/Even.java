package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.MINIMUM_VALUE;
import static hexlet.code.Engine.MAXIMUM_VALUE;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class Even {
    public static void startEvenGame() {
        String[] gameQuestions = new String[ROUNDS_COUNT];
        String[] gameAnswers = new String[ROUNDS_COUNT];
        int minValue = MINIMUM_VALUE;
        int maxValue = MAXIMUM_VALUE;
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            gameQuestions[i] = String.valueOf(randomValue);
            if (isEven(randomValue)) {
                gameAnswers[i] = "yes";
            } else {
                gameAnswers[i] = "no";
            }
        }
        Engine.runGame(gameQuestions, gameAnswers, gameDescription);
    }
    private static boolean isEven(int randomValue) {
        boolean result;
        result = randomValue % 2 == 0;
        return result;
    }
}
