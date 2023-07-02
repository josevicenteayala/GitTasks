package org.example.calculator;

import java.math.BigInteger;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public class Calculator {

    public static double performOperation(double number1,
                                          double number2,
                                          DoubleBinaryOperator doubleBinaryOperator ) {
        return doubleBinaryOperator.applyAsDouble(number1, number2);
    }

    public static BigInteger performOperation(BigInteger number1,
                                              BigInteger number2,
                                              BinaryOperator<BigInteger> binaryOperator ) {
        BigInteger result = binaryOperator.apply(number1, number2);
        return result;
    }
}
