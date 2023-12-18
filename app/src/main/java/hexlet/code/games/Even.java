package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Even {
    public static void startEvenGame() {
        int count = 0;
        var userName = Cli.getUserName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (count < ROUNDS_COUNT) {
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
            String userAnswer = Engine.getUserInput().toLowerCase();
            boolean result = Engine.answersComparsion(answerToCompare, userAnswer, userName);
            if (result) {
                count++;
            } else {
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
