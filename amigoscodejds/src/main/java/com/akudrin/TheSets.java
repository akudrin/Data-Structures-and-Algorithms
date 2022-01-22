package com.akudrin;

import java.util.HashSet;
import java.util.Set;

public class TheSets {
    public static void main(String[] args) {
        //order is not guaranteed
    Set<Ball> balls = new HashSet<>();
    balls.add(new Ball("blue"));
        balls.add(new Ball("red"));
        balls.add(new Ball("red"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("pink"));
        balls.remove(new Ball("pink"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);


    }
    record Ball (String color){};
}
