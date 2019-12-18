package com.example.awritersmood.ui.newboard;

import android.media.Image;

public class Board {
    public String text;
    public Image appGalleryImage;
    public Image deviceGalleryImage;
    public Image unsplashImage;

    public Board(String s, Image agi, Image dgi, Image usi) {
        this.text = s;
        this.appGalleryImage = agi;
        this.deviceGalleryImage = dgi;
        this.unsplashImage = usi;
    } // Board()
} // class
