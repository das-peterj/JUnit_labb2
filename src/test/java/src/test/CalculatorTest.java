package src.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import se.JUnitLabb.Calculator;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    
    @Test
    void testAddition() {
        assertEquals(10, calculator.addition(5, 5));
    }

    @RepeatedTest(3)
    void testDivision() {
        System.out.println("Testing repeated test ");
        assertTrue(calculator.division(100, 5));
    }

    @BeforeAll
    static void welcomeMessage() {
        System.out.println("Nämen tjenare, testar bara @BeforeAll ;)");
    }
}