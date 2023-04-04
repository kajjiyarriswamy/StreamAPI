package org.java8;

import java.util.ArrayList;
import java.util.List;

public class MatchingWithCharacter {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);
        list.add(68);

        System.out.println("Printing the number starting from 8:");
        list.stream().filter(number->String.valueOf(number).startsWith("8")).forEach(System.out::println);
    }
}
