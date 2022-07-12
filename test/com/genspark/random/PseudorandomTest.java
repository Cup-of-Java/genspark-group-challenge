package com.genspark.random;

import java.util.Random;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests of the Pseudorandom class.
 * @author Alonso del Arte
 */
class PseudorandomTest {

    private static final char PRINTABLE_ASCII_SPAN_BEGIN = ' ';

    private static final char PRINTABLE_ASCII_SPAN_END = '~';

    private static final int PRINTABLE_ASCII_SPAN = PRINTABLE_ASCII_SPAN_END
            - PRINTABLE_ASCII_SPAN_BEGIN + 1;

    private static final long RANDOM_SEED
            = Double.doubleToLongBits(Math.random());

    private static final Random RANDOM = new Random(RANDOM_SEED);

    @Test
    void testNextASCIICharGivesASCIICharacter() {
        int span = 2 * PRINTABLE_ASCII_SPAN;
        for (int i = 0; i < span; i++) {
            char ch = Pseudorandom.nextASCIIChar();
            String msg = "Character '" + ch + "' should be at least '"
                    + PRINTABLE_ASCII_SPAN_BEGIN + "' but not more than '"
                    + PRINTABLE_ASCII_SPAN_END + "'";
            assert PRINTABLE_ASCII_SPAN_BEGIN <= ch
                    && ch <= PRINTABLE_ASCII_SPAN_END : msg;
        }
    }

    @Test
    void testNextASCIIChar() {
        System.out.println("nextASCIIChar");
        fail("Haven't written test yet");
    }

}
