package src.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.w3c.dom.Text;
import se.JUnitLabb.TextProcessor;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("JUnit labb mha Maven")
class TextProcessorTest {
    TextProcessor textProcessor = new TextProcessor();

    @Test
    void testTillVersaler() {
        assertEquals("PETER", textProcessor.tillVersaler("Peter"));
    }

    @Disabled("Kör inte startProgram() för att annars förstörs COVID-19 vaccinet!")
    @Test
    void startProgram() {
        System.out.println("Programmet får köras! Inga möjliga konsekvenser hittade.");
    }

    @Test
    void testReverseString() {
        assertNotNull(textProcessor.reverseString("Coldplay"));
    }
}