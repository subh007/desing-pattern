package org.app.subh.org.app.subh.stack;

/**
 * Created by subh on 12/04/17.
 */
public class Stack {

    private Object[] stack;
    private int marker;
    public Stack(int size) {
        stack = new Object[size];
        marker = -1;
    }

    public Object pop() {
        if (marker > -1) {
            return stack[marker--];
        }
        return null;
    }

    public void push (Object obj) {
        if (marker+1 < stack.length) {
            stack[marker++] = obj;
        }
    }
}
