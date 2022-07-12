package com.genspark.random;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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
        Set<Character> characters = new HashSet<>(PRINTABLE_ASCII_SPAN);
        for (int i = 0; i < PRINTABLE_ASCII_SPAN; i++) {
            characters.add(Pseudorandom.nextASCIIChar());
        }
        int expected = 55 * PRINTABLE_ASCII_SPAN / 100;
        int actual = characters.size();
        String msg = "Calling nextASCIIChar() " + PRINTABLE_ASCII_SPAN
                + " times gave " + actual
                + " distinct character(s), ought to be at least " + expected
                + " distinct";
        assert expected <= actual : msg;
    }

    @Test
    void testNextASCIICharSeqOneParamGivesRightLength() {
        for (int expected = 2; expected < 80; expected++) {
            String s = Pseudorandom.nextASCIICharSeq(expected);
            int actual = s.length();
            String msg = "Pseudorandom String \"" + s
                    + "\" should be of length " + expected;
            assertEquals(expected, actual, msg);
        }
    }

    @Test
    void testNextASCIICharSeq() {
        System.out.println("nextASCIICharSeq");
        fail("Haven't written test yet");
    }

}
