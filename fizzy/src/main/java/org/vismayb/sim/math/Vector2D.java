package org.vismayb.sim.math;

import java.util.Vector;

public class Vector2D {
    double x;
    double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Vector2D plus(Vector2D other) {
        return new Vector2D(x + other.x, y + other.y);
    }

    public Vector2D minus(Vector2D other) {
        return new Vector2D(x - other.x, y - other.y);
    }

    public double magnitude() {
        return Math.sqrt(x*x + y*y);
    }

    public double magnitudeSq() {
        return x*x + y+y; 
    }

    public double distanceTo(Vector2D other) {
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }
    
    public double distanceToSq(Vector2D other) {
        return Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2);
    }

    public void normalize() {
        var mag = magnitude();
        x /= mag;
        y /= mag;
    }

    public Vector2D normalized() {
        var mag = magnitude();
        return new Vector2D(x / mag, y / mag);
    }
}
