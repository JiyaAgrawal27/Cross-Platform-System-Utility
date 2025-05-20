package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

  
    @Test
    public void testGreetingMessage() {
        String name = "Alice";
        String expected = "Hello, Alice! Welcome to the Utility Dashboard.";
        String actual = "Hello, " + name + "! Welcome to the Utility Dashboard."; 

        assertEquals(expected, actual, "Greeting message should match the expected format");
    }
}

