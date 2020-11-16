package se.JUnitLabb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator {

    public int addition(int x, int y) { return x + y; }

    public int subtraktion(int x, int y) { return x - y; }

    public int multiplikation(int x, int y) { return x * y; }

    public boolean division(int x, int y) {
        if (x / y == 20) {
            return true;
        } else return x / y == 10;
    }


    public static void main(String[] args) {
        System.out.println("Hej");
    }

}
