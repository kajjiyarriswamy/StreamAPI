package org.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestNumber {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        System.out.println("Printing the largest number");
        list.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);
    }
}
