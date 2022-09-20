package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot9ThenMinus1() {
        int[] data = new int[] {5, 10, 3};
        int el = 9;
        int expected = -1;
        int result = FindLoop.indexOf(data, el);
        assertThat(result).isEqualTo(expected);
    }
}