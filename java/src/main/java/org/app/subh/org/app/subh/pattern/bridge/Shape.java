package org.app.subh.org.app.subh.pattern.bridge;

/**
 * Created by subh on 17/04/17.
 */
public abstract class Shape {
    public Color color;

    public Shape (Color color) {
        this.color = color;
    }

    public abstract void drawShape();
}
