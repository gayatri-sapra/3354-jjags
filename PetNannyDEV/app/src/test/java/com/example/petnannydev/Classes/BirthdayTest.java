package com.example.petnannydev.Classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class BirthdayTest {

    Birthday birthday1 = new Birthday(1, 12, 1989);
    Birthday birthday2 = new Birthday(12, 30, 2004);
    Birthday birthday3 = new Birthday(4, 16, 1204);

    @Test
    public void getMonth() {
        assertEquals(1, birthday1.getMonth());
        assertEquals(12, birthday2.getMonth());
        assertEquals(4, birthday3.getMonth());
    }

    @Test
    public void getDay() {
        assertEquals(12, birthday1.getDay());
        assertEquals(30, birthday2.getDay());
        assertEquals(16, birthday3.getDay());
    }

    @Test
    public void getYear() {
        assertEquals(1989, birthday1.getYear());
        assertEquals(2004, birthday2.getYear());
        assertEquals(1204, birthday3.getYear());
    }
}