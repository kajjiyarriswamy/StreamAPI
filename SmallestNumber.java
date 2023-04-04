package org.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SmallestNumber {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        System.out.println("Printing the smallest number");
        list.stream().sorted().limit(1).forEach(System.out::println);
    }
}
