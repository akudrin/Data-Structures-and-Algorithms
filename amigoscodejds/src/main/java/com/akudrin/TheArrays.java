package com.akudrin;

import java.util.Arrays;
import java.util.stream.IntStream;


public class TheArrays {
    public static void main(String[] args) {

        int[] myIntArray1 = new int[3];
        int[] myIntArray2 = {1, 2, 3};
        int[] myIntArray3 = new int[]{1, 2, 3};

        // Since Java 8. Doc of IntStream: https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html

        int [] myIntArray4 = IntStream.range(0, 100).toArray(); // From 0 to 99
        int [] myIntArray5 = IntStream.rangeClosed(0, 100).toArray(); // From 0 to 100
        int [] myIntArray6 = IntStream.of(12,25,36,85,28,96,47).toArray(); // The order is preserved.
        int [] myIntArray7 = IntStream.of(12,25,36,85,28,96,47).sorted().toArray(); // Sort

        String[] colors = new String[5];
        colors[0]="purple";
        colors[1]="blue";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100,200};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        for (int i = colors.length-1; i >=0 ; i--) {
            System.out.println(colors[i]);

        }

        for (String color:colors){
            System.out.println(color);
        }

        Arrays.stream(colors).forEach(System.out::println);

    }

}
