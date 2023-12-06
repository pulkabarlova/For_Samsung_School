package com.example.for_samsung_school;


import android.widget.ImageView;

public class UtilCollisionDetectGame {

    private static double sObject1X;
    private static double sObject1Y;
    private static double sObject2X;
    private static double sObject2Y;

    private static double sRadiusObject1;
    private static double sRadiusObject2;

    private static double sDx;
    private static double sDy;

    private static double sDistanceObjects;

    public static boolean collisionDetect(ImageView object1, ImageView object2) {

        sObject1X = object1.getX();
        sObject1Y = object1.getY();

        sObject2X = object2.getX();
        sObject2Y = object2.getY();

        sRadiusObject1 = object1.getWidth()/2 - 7;
        sRadiusObject2 = object2.getWidth()/2 - 7;

        sDx = sObject1X - sObject2X;
        sDy = sObject1Y - sObject2Y;

        sDistanceObjects = Math.sqrt(sDx * sDx + sDy * sDy);

        return sDistanceObjects < (sRadiusObject1 + sRadiusObject2);
    }

}
