package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void whenMax1To2Then1() {
        int left = 1;
        int right = 2;
        int expexted = 1;
        int result = Max.max(1, 2);
        assertThat(result).isEqualTo(expexted);
    }

    @Test
    public void whenMax2to1Then2(){
        int left = 2;
        int right = 1;
        int expexted = 2;
        int result = Max.max(2, 1);
        assertThat(result).isEqualTo(expexted);
    }

    @Test
    public void whenMax2to2Then2(){
        int left = 2;
        int right = 2;
        int expexted = 2;
        int result = Max.max(2, 2);
        assertThat(result).isEqualTo(expexted);
    }
}