package com.example.petnannydev.Classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class PetProfileTest {

    Birthday birthday = new Birthday(10,2,1940);
    Picture picture = new Picture(200,200);
    PetProfile petProfile = new PetProfile("fido", "ayush", "rottweiler", birthday, picture, 10 );


    @Test
    public void getName() {
        assertEquals("fido", petProfile.getName());
    }

    @Test
    public void getAge() {
        assertEquals(10, petProfile.getAge());
    }

    @Test
    public void getBreed() {
        assertEquals("rottweiler", petProfile.getBreed());
    }

    @Test
    public void getOwner() {
        assertEquals("ayush", petProfile.getOwner());
    }
}