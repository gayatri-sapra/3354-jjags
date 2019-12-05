package com.example.petnannydev.Classes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PictureTest {
    int height;
    int width;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test() {
        Picture pic = new Picture(10,10);
        pic.getWidth();
        assertEquals(10,pic.getWidth());
    }

    @Test
    public void test2() {
        Picture pic = new Picture(1000,150);
        pic.getWidth();
        assertEquals(1000,pic.getWidth());
    }

    @Test
    public void test3(){
        Picture pic = new Picture(15,15);
        pic.getHeight();
        assertEquals(15, pic.getHeight());
    }

    @Test
    public void test4(){
        Picture pic  = new Picture(20,35);
        pic.getHeight();
        assertEquals(35, pic.getHeight());
    }

    @Test
    public void test5(){
        Picture pic = new Picture(15,34);
        assertFalse("Not equal",pic.getWidth().equals(20));
    }

    @Test
    public void test6(){
        Picture pic = new Picture(20,13);
        assertFalse("Not equal", pic.getHeight().equals(15));
    }
}