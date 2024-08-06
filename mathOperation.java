package com.example.assignment3javafx;

/**
 * Abstract base class for mathematical operations.
 */
abstract class MathOperation {
    abstract double operate(double a, double b);
}

/**
 * Performs addition operation.
 */
class Addition extends MathOperation {
    @Override
    double operate(double a, double b) {
        return a + b;
    }
}

/**
 * Performs subtraction operation.
 */
class Subtraction extends MathOperation {
    @Override
    double operate(double a, double b) {
        return a - b;
    }
}

/**
 * Performs multiplication operation.
 */
class Multiply extends MathOperation {
    @Override
    double operate(double a, double b) {
        return a * b;
    }
}

/**
 * Performs division operation.
 */
class Division extends MathOperation {
    @Override
    double operate(double a, double b) {
        return a / b;
    }
}

/**
 * Converts Celsius to Fahrenheit.
 */
class CelsiusToFahrenheit {
    double convert(double celsius) {
        return celsius * 9/5 + 32;
    }
}

/**
 * Converts Fahrenheit to Celsius.
 */
class FahrenheitToCelsius {
    double convert(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
