package org.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        //Here below we are using method reference
        list.stream().forEach(MethodReference::print);

        list.stream().map(String::valueOf).forEach(MethodReference::print);
    }

    public static void print(String x){
        System.out.println(x);
    }

    public static void print(Integer x){
        System.out.println(x);
    }
}
