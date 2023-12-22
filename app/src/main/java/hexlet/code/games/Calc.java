package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.MINIMUM_VALUE;
import static hexlet.code.Engine.MAXIMUM_VALUE;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class Calc {
    private static final char[] OPERATORS = {'+', '-', '*'};
    public static void startCalcGame() {
        String[] gameQuestions = new String[ROUNDS_COUNT];
        String[] gameAnswers = new String[ROUNDS_COUNT];
        int minValue = MINIMUM_VALUE;
        int maxValue = MAXIMUM_VALUE;
        String gameStartSalute = "What is the result of the expression?";
        for (int i = 0; i < ROUNDS_COUNT; i++) {
            int firstOperand = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            int secondOperand = minValue + (int) (Math.random() * (maxValue - minValue + 1));
            char operator = OPERATORS[new Random().nextInt(0, OPERATORS.length)];
            gameQuestions[i] = firstOperand + " " + operator + " " + secondOperand;
            gameAnswers[i] = String.valueOf(calculateTwoOperands(firstOperand, secondOperand, operator));
        }
        Engine.gameLauncher(gameQuestions, gameAnswers, gameStartSalute);
    }
    private static int calculateTwoOperands(int firstOperand, int secondOperand, char operator) {
        return switch (operator) {
            case '+' -> firstOperand + secondOperand;
            case '-' -> firstOperand - secondOperand;
            case '*' -> firstOperand * secondOperand;
            default -> 0;
        };
    }
}
