package org.app.subh.org.app.subh.pattern.Prototype;

/**
 * Created by subh on 16/04/17.
 */
public class Rectangle extends Shape{

    int size;

    public Rectangle() {
        type = "rectangle";
        size = 10;
    }

    public void draw() {
        System.out.println("this is rectangle draw");
    }
}
