package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    private Smartphone smartphone = new Smartphone(1, "name1", 500, "vendor1");

    @Test
    public void shouldToCheckAnExistingName() {
        String text = "name1";
        assertTrue(smartphone.matches(text));
    }

    @Test
    public void shouldToCheckANonExistentName() {
        String text = "name2";
        assertFalse(smartphone.matches(text));
    }

    @Test
    public void shouldToCheckAnExistingVendor() {
        String text = "vendor1";
        assertTrue(smartphone.matches(text));
    }

    @Test
    public void shouldToCheckANonExistentVendor() {
        String text = "vendor2";
        assertFalse(smartphone.matches(text));
    }

}