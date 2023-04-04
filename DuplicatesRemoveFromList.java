package org.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DuplicatesRemoveFromList {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);
        list.add(87);

        System.out.println("Printing the list without duplicates number");
        list.stream().distinct().forEach(System.out::println);
    }
}
