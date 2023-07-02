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

    @Test
    public void testPerformOperation_Addition() {
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("98765432109876543210");

        BigInteger expected = new BigInteger("111111111011111111100");
        BigInteger result = Calculator.performOperation(num1, num2, BigInteger::add);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPerformOperation_Subtraction() {
        BigInteger num1 = new BigInteger("98765432109876543210");
        BigInteger num2 = new BigInteger("12345678901234567890");

        BigInteger expected = new BigInteger("86419753208641975320");
        BigInteger result = Calculator.performOperation(num1, num2, BigInteger::subtract);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPerformOperation_Multiplication() {
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("98765432109876543210");

        BigInteger expected = new BigInteger("1219326311370217952237463801111263526900");
        BigInteger result = Calculator.performOperation(num1, num2, BigInteger::multiply);

        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testPerformOperation_Division() {
        BigInteger num1 = new BigInteger("98765432109876543210");
        BigInteger num2 = new BigInteger("12345678901234567890");

        BigInteger expected = new BigInteger("8");
        BigInteger result = Calculator.performOperation(num1, num2, BigInteger::divide);

        Assertions.assertEquals(expected, result);
    }
}