package org.app.subh.org.app.subh.pattern.Prototype;

import java.util.Hashtable;

/**
 * Created by subh on 16/04/17.
 */
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }


    public static void loadCache() {
        Rectangle rectangle = new Rectangle();
        rectangle.setId("1");

        shapeMap.put(rectangle.getId(), rectangle);
    }

    public static void main(String args[]) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println(clonedShape.getType());

        Rectangle rect = (Rectangle) clonedShape;
        System.out.println(rect.size);
    }
}
