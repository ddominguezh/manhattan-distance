package com.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PointTest {
    
    @Test
    public void calculate_distance(){
        assertEquals(0, Point.create(1, 1).distance(Point.create(1, 1)));
        assertEquals(4, Point.create(5, 4).distance(Point.create(3, 2)));
        assertEquals(4, Point.create(3, 2).distance(Point.create(5, 4)));
        assertEquals(3, Point.create(1, 1).distance(Point.create(0, 3)));
    }  
}
