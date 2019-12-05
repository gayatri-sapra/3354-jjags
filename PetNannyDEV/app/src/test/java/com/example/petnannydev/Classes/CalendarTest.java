package com.example.petnannydev.Classes;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class CalendarTest {
    Calendar test = new Calendar();
    Event one = new Event(10, 11, "10/11/2020", "Grooming", "TBD", "", "1");

    @Test
    public void testTimeChange() {
        assertFalse(test.editEventEndTime(one, 12));
    }
}
