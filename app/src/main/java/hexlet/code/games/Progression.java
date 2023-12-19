package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.MINIMUM_VALUE;
import static hexlet.code.Engine.MAXIMUM_VALUE;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class Progression {
    public static void startProgressionGame() {
        int count = 0;
        var userName = Cli.getUserName();
        System.out.println("What number is missing in the progression?");
        while (count < ROUNDS_COUNT) {
            int minValue = MINIMUM_VALUE;
            int maxValue = MAXIMUM_VALUE;
            int startValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int incrementValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int elementToReplace = minValue + (int) (Math.random() * (10 - minValue));
            int numberOfTerms = 10;

            String[] progressionSequence = new String[numberOfTerms];

            for (int i = 0; i < numberOfTerms; i++) {
                progressionSequence[i] = String.valueOf(startValue + (i * incrementValue));
            }

            String answerToCompare = progressionSequence[elementToReplace];

            progressionSequence[elementToReplace] = "..";
            String progressionSequenceForPrint = String.join(" ", progressionSequence);
            System.out.println("Question: " + progressionSequenceForPrint);

            String userAnswer = Engine.getUserInput().toLowerCase();

            boolean result = Engine.answersComparsion(answerToCompare, userAnswer, userName);
            if (result) {
                count++;
            } else {
                break;
            }
            if (count == ROUNDS_COUNT) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
