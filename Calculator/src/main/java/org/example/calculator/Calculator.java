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

}
