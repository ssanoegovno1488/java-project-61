package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Calc {
    public static void startCalcGame() {
        int count = 0;
        var userName = Cli.getUserName();
        System.out.println("What is the result of the expression?");
        while (count < ROUNDS_COUNT) {
            Random r = new Random();
            int minValue = 1;
            int maxValue = 50;
            int firstOperand = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int secondOperand = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            char operator;
            int value = 0;
            switch (r.nextInt(3)) {
                case 0:
                    operator = '+';
                    value = firstOperand + secondOperand;
                    break;
                case 1:
                    operator = '-';
                    value = firstOperand - secondOperand;
                    break;
                case 2:
                    operator = '*';
                    value = firstOperand * secondOperand;
                    break;
                default:
                    operator = '?';
            }

            String answerToCompare = String.valueOf(value);
            System.out.println("Question: " + firstOperand + operator + secondOperand);
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
