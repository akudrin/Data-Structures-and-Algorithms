package com.akudrin;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {

        List<String> colorsUnmodifiable = List.of("blue","red");


        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        System.out.println(colors);
        System.out.println(colors.size());

        for(String color:colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int c = 0; c < colors.size(); c++) {
            System.out.println(colors.get(c));

        }

    }
}
