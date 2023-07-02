package org.example.calculator;

import java.math.BigInteger;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import org.example.logger.Logger;

public class Calculator {

    private static System.Logger logger = new Logger(Calculator.class);

    public static double performOperation(double number1,
                                          double number2,
                                          DoubleBinaryOperator doubleBinaryOperator ) {
        return doubleBinaryOperator.applyAsDouble(number1, number2);
    }

    public static BigInteger performOperation(BigInteger number1,
                                              BigInteger number2,
                                              BinaryOperator<BigInteger> binaryOperator ) {
        BigInteger result = binaryOperator.apply(number1, number2);
        logger.log(System.Logger.Level.INFO, () -> String.format("The intermediate result is %s",result));
        return result;
    }
}
