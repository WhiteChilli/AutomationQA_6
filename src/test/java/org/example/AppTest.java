package org.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class AppTest 
{

    @Test
    public void checkSum() {
        Calculator calculator = new Calculator();
        int sumResult = calculator.doSum(7, 6);
        assertEquals(13, sumResult);
    }

    @Test
    public void checkSumNegativeNum() {
        Calculator calculator = new Calculator();
        int sumResult = calculator.doSum(-9, 8);
        assertEquals(-1, sumResult);
    }

    @Test
    public void checkSumZero() {
        Calculator calculator = new Calculator();
        int sumResult = calculator.doSum(0, 2);
        assertEquals(2, sumResult);
    }

    @Test
    public void checkDiff() {
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
    public void checkDiffZero() {
        Calculator calculator = new Calculator();
        int diffResult = calculator.doDiff(6, 0);
        assertEquals(6, diffResult);
    }

    @Test
    public void checkNameWasUpdated() {
        Calculator calculator = new Calculator();
        User user = new User("Bob",355, 44);
        user.changeName("Rob");
        assertEquals("Rob", user.name);
    }

    @Test
    public void checkConstructorWithData() {
        User user = new User("Tiffany", 582, 33);
        assertNotNull(user.name);
    }

    @Test
    public void checkConstructorWithoutData() {
        User user = new User();
        assertNull(user.name);
    }

}



























