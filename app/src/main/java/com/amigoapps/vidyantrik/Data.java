package com.amigoapps.vidyantrik;

import android.graphics.Color;

public class Data
{
    private String val1,val2,val3;
   private int image=0;
    private int color;

    public Data(String val1, String val2, String val3, int image, int color) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.image = image;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Data(String val1, String val2, String val3, int image) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getVal1() {
        return val1;
    }

    public void setVal1(String val1) {
        this.val1 = val1;
    }

    public String getVal2() {
        return val2;
    }

    public void setVal2(String val2) {
        this.val2 = val2;
    }

    public String getVal3() {
        return val3;
    }

    public void setVal3(String val3) {
        this.val3 = val3;
    }
}
