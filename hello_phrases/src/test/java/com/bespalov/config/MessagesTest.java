package com.bespalov.config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class MessagesTest {
    private Messages messages;

    @BeforeEach
    void setUp() {
        messages = new Messages();
    }

    @AfterEach
    void tearDown() {
        messages = null;
    }

    @Test
    void getResult() {
        String expect = "Добрый день, мир!";
        assertEquals(expect, messages.getResult("day", ResourceBundle.getBundle("Message", Locale.getDefault())));
    }

}