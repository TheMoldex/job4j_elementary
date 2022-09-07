package ru.job4j.condition;

import org.junit.Assert;

import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15To21Then4dot12() {
        int x1 = 1;
        int y1 = 5;
        int x2 = 2;
        int y2 = 1;
        double expected = 4.12;
        double out = Point.distance(1, 5, 2, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus24To2Minus3Then8dot06() {
        int x1 = -2;
        int y1 = 4;
        int x2 = 2;
        int y2 = -3;
        double expected = 8.06;
        double out = Point.distance(-2, 4, 2, -3);
        Assert.assertEquals(expected, out, 0.01);
    }
}