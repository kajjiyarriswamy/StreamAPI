package org.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        System.out.println("Printing the Second largest number");
        list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
    }
}
