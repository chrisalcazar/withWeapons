package com.gorgonshank.manyfragments.Sprite;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class Enemy extends Sprite {
    public Enemy(Resources resources, Drawable temp,String name, int width, int height) {
        super(resources, temp, name, width, height);
    }

    public String toString(){
        return super.toString();
    }

}
