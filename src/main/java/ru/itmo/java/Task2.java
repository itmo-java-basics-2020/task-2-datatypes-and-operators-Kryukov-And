package ru.itmo.java;

@SuppressWarnings("all")
public class Task2 {

    double getFractionalPart(double realNumber) {
        return (realNumber - Math.floor(realNumber));
    }

    int charCode(char c) {
        return c;
    }

    boolean testIfIntsEqual(Integer a, Integer b) {
        return a.equals(b);
    }

    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if ((number == null) || (leftBound == null) || (rightBound == null) || (inclusively == null))
            return false;
        if (inclusively)
            return (number >= leftBound) && (number <= rightBound);
        else
            return (number > leftBound) && (number < rightBound);
    }

    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        return Character.isDigit(c1) || Character.isDigit(c2) || Character.isDigit(c3);
    }

    boolean areRealNumbersEqual(double a, double b) {
        return Math.abs(a - b) < 1e-6;
    }

    int sumOfDigits(int n) {
        return n % 10 + n / 10 % 10 + n / 100;
    }

    int nextEvenNumber(int n) {
        return n / 2 * 2 + 2;
    }

    int schoolDesks(int num1, int num2, int num3) {
        return (num1 % 2 + num1 / 2) + (num2 % 2 + num2 / 2) + (num3 % 2 + num3 / 2);
    }

    int xorDigits(int N) {
        return (N % 10) ^ (N / 10 % 10);
    }

}