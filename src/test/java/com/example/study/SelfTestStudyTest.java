package com.example.study;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 普通に作るテストクラス
 */
public class SelfTestStudyTest {

    private SelfTestStudy selfTestStudy;

    @Before
    public void setUp() {
        selfTestStudy = new SelfTestStudy();
    }

    @Test
    public void インプットが3の倍数の時はFizzを返すこと() {

        String actual = selfTestStudy.fizzBuzz(1);
        assertNotEquals("Fizz", actual);

        actual = selfTestStudy.fizzBuzz(2);
        assertNotEquals("Fizz", actual);

        actual = selfTestStudy.fizzBuzz(3);
        assertEquals("Fizz", actual);

        actual = selfTestStudy.fizzBuzz(6);
        assertEquals("Fizz", actual);

        actual = selfTestStudy.fizzBuzz(8);
        assertNotEquals("Fizz", actual);

        actual = selfTestStudy.fizzBuzz(9);
        assertEquals("Fizz", actual);

        actual = selfTestStudy.fizzBuzz(10);
        assertNotEquals("Fizz", actual);
    }

    @Test
    public void インプットが5の倍数の時はBuzzを返すこと() {

        String actual = selfTestStudy.fizzBuzz(1);
        assertNotEquals("Buzz", actual);

        actual = selfTestStudy.fizzBuzz(2);
        assertNotEquals("Buzz", actual);

        actual = selfTestStudy.fizzBuzz(3);
        assertNotEquals("Buzz", actual);

        actual = selfTestStudy.fizzBuzz(5);
        assertEquals("Buzz", actual);

        actual = selfTestStudy.fizzBuzz(8);
        assertNotEquals("Buzz", actual);

        actual = selfTestStudy.fizzBuzz(10);
        assertEquals("Buzz", actual);
    }

    @Test
    public void インプットが3と5両方の倍数の時はFizzBuzzを返すこと() {

        String actual = selfTestStudy.fizzBuzz(1);
        assertNotEquals("FizzBuzz", actual);

        actual = selfTestStudy.fizzBuzz(3);
        assertNotEquals("FizzBuzz", actual);

        actual = selfTestStudy.fizzBuzz(5);
        assertNotEquals("FizzBuzz", actual);

        actual = selfTestStudy.fizzBuzz(15);
        assertEquals("FizzBuzz", actual);

        actual = selfTestStudy.fizzBuzz(20);
        assertNotEquals("FizzBuzz", actual);

        actual = selfTestStudy.fizzBuzz(30);
        assertEquals("FizzBuzz", actual);
    }

    @Test
    public void インプットが3の倍数でも5の倍数でもない時は数値の文字列を返すこと() {

        String actual = selfTestStudy.fizzBuzz(1);
        assertEquals("1", actual);

        actual = selfTestStudy.fizzBuzz(2);
        assertEquals("2", actual);

        actual = selfTestStudy.fizzBuzz(7);
        assertEquals("7", actual);

        actual = selfTestStudy.fizzBuzz(11);
        assertEquals("11", actual);
    }


    @Test
    public void 数値が3で割り切れる場合はisFizzはtrueを返すこと() {
        assertFalse(selfTestStudy.isFizz(1));
        assertFalse(selfTestStudy.isFizz(2));
        assertFalse(selfTestStudy.isFizz(10));
        assertFalse(selfTestStudy.isFizz(14));
        assertTrue(selfTestStudy.isFizz(3));
        assertTrue(selfTestStudy.isFizz(6));
        assertTrue(selfTestStudy.isFizz(9));
        assertTrue(selfTestStudy.isFizz(12));
        assertTrue(selfTestStudy.isFizz(15));
        assertTrue(selfTestStudy.isFizz(24));
        assertTrue(selfTestStudy.isFizz(27));
        assertTrue(selfTestStudy.isFizz(30));
    }

    @Test
    public void 数値が5で割り切れる場合はisBuzzはtrueを返すこと() {
        assertFalse(selfTestStudy.isBuzz(1));
        assertFalse(selfTestStudy.isBuzz(2));
        assertFalse(selfTestStudy.isBuzz(11));
        assertFalse(selfTestStudy.isBuzz(24));
        assertTrue(selfTestStudy.isBuzz(5));
        assertTrue(selfTestStudy.isBuzz(10));
        assertTrue(selfTestStudy.isBuzz(15));
        assertTrue(selfTestStudy.isBuzz(20));
        assertTrue(selfTestStudy.isBuzz(25));
        assertTrue(selfTestStudy.isBuzz(30));
    }

    @Test
    public void 数値が3と5で割り切れる場合はisFizzBuzzはtrueを返すこと() {
        assertFalse(selfTestStudy.isFizzBuzz(3));
        assertFalse(selfTestStudy.isFizzBuzz(10));
        assertTrue(selfTestStudy.isFizzBuzz(15));
        assertFalse(selfTestStudy.isFizzBuzz(24));
        assertFalse(selfTestStudy.isFizzBuzz(25));
        assertTrue(selfTestStudy.isFizzBuzz(30));
    }

}