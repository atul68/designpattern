package com.design.patterns.creational.objectpool;

import javafx.geometry.Point2D;

public class Client {

    public static final ObjectPool<Bitmap> bitmappool =  new ObjectPool<>(() -> new Bitmap("Logo.bmp"),5);

    public static void main(String[] args) {
        Bitmap bitmap1 = bitmappool.get();
        bitmap1.setLocation(new Point2D(10,10));
        Bitmap bitmap2 = bitmappool.get();
        bitmap2.setLocation(new Point2D(20,20));

        bitmap1.draw();
        bitmap2.draw();

        bitmappool.release(bitmap1);
        bitmappool.release(bitmap2);
    }
}
