package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
public class Prime {
    public static void startPrimeGame() {
        int count = 0;
        var userName = Cli.getUserName();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (count < ROUNDS_COUNT) {
            int minValue = 1;
            int maxValue = 100;
            int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            String answerToCompare;

            if (isPrime(randomValue)) {
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

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
