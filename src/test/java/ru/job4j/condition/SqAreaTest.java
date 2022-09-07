package ru.job4j.condition;

import org.junit.Assert;

import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square1() {
        double p = 6;
        double k = 2;
        double expected = 1;
        double out = SqArea.square(6, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K3Square1dot25() {
        double p = 10;
        double k = 3;
        double expected = 1.25;
        double out = SqArea.square(10, 3);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24dot5K5dot75Square1dot81() {
        double p = 24.5;
        double k = 5.75;
        double expected = 1.81;
        double out = SqArea.square(24.5, 5.75);
        Assert.assertEquals(expected, out, 0.01);
    }
}