package com.kata;

public class Point {
    
    private int x;
    private int y;
    protected Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public static Point create(int x, int y){
        return new Point(x, y);
    }
    public int distance(Point point){
        return Math.abs(x - point.x) + Math.abs(y - point.y);
    }
}
