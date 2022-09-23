package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap5to2() {
        int[] input = {11, 22, 33, 44, 55, 66};
        int source = 1;
        int dest = 5;
        int[] expected = {11, 66, 33, 44, 55, 22};
        int[] result = SwitchArray.swap(input, source, dest);
        assertThat(result).containsExactly(expected);
    }

}