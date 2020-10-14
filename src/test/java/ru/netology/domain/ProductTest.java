package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Product one = new Product(1, "name1", 10);

    @Test
    public void shouldToCheckAnExistingName() {
        String text = "name1";
        assertTrue(one.matches(text));
    }

    @Test
    public void shouldToCheckANonExistentName() {
        String text = "name2";
        assertFalse(one.matches(text));
    }

}