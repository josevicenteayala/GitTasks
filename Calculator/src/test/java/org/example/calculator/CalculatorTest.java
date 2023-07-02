package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testPerformOperation_AdditionUsingDoubles() {
        double result = Calculator.performOperation(5, 3, Double::sum);
        assertEquals(8, result, "Addition operation should return 8");
    }

    @Test
    void testPerformOperation_SubtractionUsingDoubles() {
        double result = Calculator.performOperation(5, 3, (n1,n2)->n1-n2);
        assertEquals(2, result, "Subtraction operation should return 2");
    }

    @Test
    void testPerformOperation_MultiplicationUsingDoubles() {
        double result = Calculator.performOperation(5, 3, (n1,n2)->n1*n2);
        assertEquals(15, result, "Multiplication operation should return 15");
    }

    @Test
    void testPerformOperation_DivisionUsingDoubles() {
        double result = Calculator.performOperation(6, 2, (n1,n2)->n1/n2);
        assertEquals(3, result, "Division operation should return 3");
    }
}