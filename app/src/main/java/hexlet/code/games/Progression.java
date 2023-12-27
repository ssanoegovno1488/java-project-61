package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.MINIMUM_VALUE;
import static hexlet.code.Engine.MAXIMUM_VALUE;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class Progression {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int VALUE_FOR_PROGRESSION_LENGTH = 10;
    public static void startProgressionGame() {
        String[] gameQuestions = new String[ROUNDS_COUNT];
        String[] gameAnswers = new String[ROUNDS_COUNT];
        int minValue = MINIMUM_VALUE;
        int maxValue = MAXIMUM_VALUE;
        int numberOfTerms = VALUE_FOR_PROGRESSION_LENGTH;
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int startValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int incrementValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int elementToReplace = minValue + (int) (Math.random() * (VALUE_FOR_PROGRESSION_LENGTH - minValue));
            String[] progressionSequence = getProgression(startValue, incrementValue, numberOfTerms);

            gameAnswers[i] = progressionSequence[elementToReplace];
            progressionSequence[elementToReplace] = "..";
            String progressionSequenceForPrint = String.join(" ", progressionSequence);
            gameQuestions[i] = progressionSequenceForPrint;
        }
        Engine.runGame(gameQuestions, gameAnswers, GAME_DESCRIPTION);
    }
    private static String[] getProgression(int startValue, int incrementValue, int numberOfTerms) {
        String[] progressionSequence = new String[numberOfTerms];
        for (int j = 0; j < numberOfTerms; j++) {
            progressionSequence[j] = String.valueOf(startValue + (j * incrementValue));
        }
        return progressionSequence;
    }
}
