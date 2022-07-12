package com.genspark.random;

import java.util.Random;

/**
 * Provides pseudorandom characters and such.
 * @author Alonso del Arte
 */
public class Pseudorandom {

    private static final char PRINTABLE_ASCII_SPAN_BEGIN = ' ';

    private static final char PRINTABLE_ASCII_SPAN_END = '~';

    private static final int PRINTABLE_ASCII_SPAN = PRINTABLE_ASCII_SPAN_END
            - PRINTABLE_ASCII_SPAN_BEGIN + 1;

    private static final Random RANDOM = new Random();

    public static char nextASCIIChar() {
        return (char) (' ' + RANDOM.nextInt(PRINTABLE_ASCII_SPAN));
    }

    // TODO: Write tests for this
    public static String nextASCIICharSeq(int length) {
        return "NOT IMPLEMENTED YET";
    }

    // TODO: Write tests for this
    public static String nextASCIICharSeq(int minLength, int maxLength) {
        return "NOT IMPLEMENTED YET";
    }

}
