package org.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortedList {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);
        System.out.println("Ascending order or sorted order");
        list.stream().sorted().forEach(System.out::println);

    }
}
