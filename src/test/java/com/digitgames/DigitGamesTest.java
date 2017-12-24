package com.digitgames;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Created by upasana.haveri on 11/15/2017.
 */
public class DigitGamesTest {

    private DigitGames sut = new DigitGames();

    @Test
    public void shouldReturnMinusOneIfNoIndexFound(){
     assertEquals(-1, sut.findK(-1, 1));
     assertEquals(-1, sut.findK(0, 1));
    }

    @Test
    public void shouldReturnNumberOfDigits() {
        assertEquals(2, sut.getDigitList(89).size());
    }

    @Test
    public void shouldReturnSumOfExponents() {
        assertEquals(89, sut.getSumOfExponents(Arrays.asList(9, 8), 1));
    }

    @Test
    public void shouldFindFactor() {
        assertEquals(3, sut.getFactor(747, 249));
    }



    @Test
    public void shouldReturnOneFor89(){
        assertEquals(1, sut.findK(89, 1));
        assertEquals(3, sut.findK(249, 1));
        assertEquals(1, sut.findK(135, 1));
        assertEquals(-1, sut.findK(105, 1));
    }

    @Test
    public void shoudlReturnKwithP(){
        assertEquals(9, sut.findK(114, 3));
        assertEquals(588, sut.findK(448, 4));
        assertEquals(-1, sut.findK(144, 1));
    }

    @Test
    public void shoudlFindN(){
        System.out.println(sut.findHowMany());
    }

}
