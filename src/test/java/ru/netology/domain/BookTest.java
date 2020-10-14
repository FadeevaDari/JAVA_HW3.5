package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book = new Book(1, "name1", 100, "Author1");

    @Test
    public void shouldToCheckAnExistingName() {
        String text = "Name1";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldToCheckANonExistentName() {
        String text = "Name2";
        assertFalse(book.matches(text));
    }

    @Test
    public void shouldToCheckAnExistingAuthor() {
        String text = "Author1";
        assertTrue(book.matches(text));
    }

    @Test
    public void shouldToCheckANonExistentAuthor() {
        String text = "Author2";
        assertFalse(book.matches(text));
    }

}