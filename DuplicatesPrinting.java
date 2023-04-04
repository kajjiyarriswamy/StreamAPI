package org.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicatesPrinting {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);
        list.add(87);

        System.out.println("Printing the duplicate number");
        list.stream().filter(num-> Collections.frequency(list,num)>1).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
