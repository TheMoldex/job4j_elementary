package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractionPlusDiv(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double plusAll(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + subtraction(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subtractionPlusDiv(15, 24));
        System.out.println("Сложение всех значений равно: " + plusAll(10, 10));
    }
}
