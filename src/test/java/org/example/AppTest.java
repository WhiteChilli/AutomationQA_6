package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{

    @Test
    public void checkSum()
    {
        Calculator calculator = new Calculator();
        int sumResult = calculator.doSum(7, 6);
        assertEquals(13, sumResult);
    }

    @Test
    public void checkSumNegativeNum()
    {
        Calculator calculator = new Calculator();
        int sumResult = calculator.doSum(-9, 8);
        assertEquals(-1, sumResult);
    }

    @Test
    public void checkSumZero()
    {
        Calculator calculator = new Calculator();
        int sumResult = calculator.doSum(0, 0);
        assertEquals(0, sumResult);
    }

    @Test
    public void checkDiff()
    {
        Calculator calculator = new Calculator();
        int diffResult = calculator.doDiff(7, 6);
        assertEquals(1, diffResult);
    }

    @Test
    public void checkDiffNegativeNum() {
        Calculator calculator = new Calculator();
        int diffResult = calculator.doDiff(5, -1);
        assertEquals(6, diffResult);
    }

    @Test
    public void checkDiffZero()
    {
        Calculator calculator = new Calculator();
        int diffResult = calculator.doDiff(0, 0);
        assertEquals(0, diffResult);
    }
}



























