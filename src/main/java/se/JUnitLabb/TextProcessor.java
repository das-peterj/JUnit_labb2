package se.JUnitLabb;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessor {
    public String tillVersaler(String strang) {
        return strang.toUpperCase();
    }

    public String tillGemener(String strang) {
        return strang.toLowerCase();
    }

    public String reverseString(String strang) {
        StringBuilder stringBuilder = new StringBuilder(strang);
        StringBuilder reverseString = stringBuilder.reverse();
        System.out.println("Original string = " + strang + " and the reversed string: " + reverseString.toString());
        return reverseString.toString();
    }

    public static void main(String[] args) {


    }
}
