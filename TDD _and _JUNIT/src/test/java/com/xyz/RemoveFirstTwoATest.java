package com.xyz;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

class RemoveFirstTwoATest {

    /*TODO list for my feature
     * 1. 2 chars :- AA=> "" or AB = > B or BA => B or BB=> BB - success
     * 2. 1 chars :- A => "" or B = > B - success
     * 3. n chars :- ABCDEF => BCDEF or AACD => CD or BACD => BCD or BBAA => BBAA
     * or AABAA => BAA - success
     * 4. empty string :- "" => "" - success
     * */
    com.xyz.RemoveFirstTwoChars removeFirstTwoChars ;

    @BeforeClass
    void setup() {
        removeFirstTwoChars = new com.xyz.RemoveFirstTwoChars();
    }

    @Test
    void forNCharsAB() {
        assertEquals("BCDEF", removeFirstTwoChars.remove("ABCDEF"));
    }

    @Test
    void forNCharsAA() {
        assertEquals("CD", removeFirstTwoChars.remove("AACD"));
    }

    @Test
    void forNCharsBA() {
        assertEquals("BCD", removeFirstTwoChars.remove("BACD"));
    }

    @Test
    void forNCharsBB() {

        String actual = removeFirstTwoChars.remove("BBAA");
        assertEquals("BBAA", actual);
    }

    @Test
    void for2CharsAA() {
        assertEquals("", removeFirstTwoChars.remove("AA"));
    }
    @Test
    void for2CharsAB() {
        assertEquals("B", removeFirstTwoChars.remove("AB"));
    }
    @Test
    void for2CharsBA() {

        String actual = removeFirstTwoChars.remove("BA");
        assertEquals("B", actual);
    }
    @Test
    void for2CharsBB() {
        assertEquals("BB", removeFirstTwoChars.remove("BB"));
    }
    @Test
    void for1CharsA() {
        assertEquals("", removeFirstTwoChars.remove("A"));
    }
    @Test
    void for1CharsB() {
        assertEquals("B", removeFirstTwoChars.remove("B"));
    }
    @Test
    void forEmptyChar() {
        assertEquals("", removeFirstTwoChars.remove(""));
    }




}