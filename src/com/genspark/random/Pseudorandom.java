package com.genspark.random;

import java.util.Random;

/**
 * Provides pseudorandom characters and such.
 * @author Alonso del Arte
 */
public class Pseudorandom {

    private static final Random RANDOM = new Random();

    public static char nextASCIIChar() {
        return '\u4E00';
    }

}
