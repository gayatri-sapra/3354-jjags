package com.example.petnannydev.Classes;

// import java.awt.*;

/** Using java libraries such as awt does not work:
 *  need to physically download library and place in same folder?
 */
public class Picture {

    //private Image img;
    private int width;
    private int height;

    public Picture(/**Image img, */int width, int height) {
        //this.img = img;
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}