package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SystemMonitorTest {

  
    @Test
    public void testGreetingMessage() {
      //random name for test message
        String name = "Alice";
        String expected = "Hello, Alice! Welcome to our dashboard.";
        String actual = "Hello, " + name + "! Welcome to our Dashboard."; 

        assertEquals(expected, actual, "Greeting message matches the expected format");
    }
}

