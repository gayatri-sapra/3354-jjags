package com.example.petnannydev.Classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest {

    Event one = new Event(10, 11, "10/11/2020", "Grooming", "TBD", "", "1");
    Event two = new Event(0, 24, "12/25/2019", "Christmas", "Home", "Merry Christmas!", "");

    @Test
    public void getStartTime() {
        assertEquals(10, one.getStartTime());
        assertEquals(0, two.getStartTime());
    }

    @Test
    public void getEndTime() {
        assertEquals(11, one.getEndTime());
        assertEquals(24, two.getStartTime());
    }

    @Test
    public void getDate() {
        assertEquals("10/11/2020", one.getDate());
        assertEquals("12/25/2019", two.getDate());
    }

    @Test
    public void getName() {
        assertEquals("Grooming", one.getName());
        assertEquals("Christmas", two.getName());
    }
}