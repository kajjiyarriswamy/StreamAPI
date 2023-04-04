package org.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviourParameterizedFunctionalInterface {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);


        //Here we can pass the implementation as argument to a method.
        List<Integer> squareOfList = functionalMethod(list, x -> x * x);
        List<Integer> cubeOfList = functionalMethod(list, x -> x * x * x);
        System.out.println("Square of numbers");
        System.out.println(squareOfList);

        System.out.println("cube of numbers");
        System.out.println(cubeOfList);

        System.out.println("even numbers");
        List<Integer> evenNumbers = filterAndPrint(list, x -> x % 2 == 0);
        System.out.println(evenNumbers);

        System.out.println("odd of numbers");
        List<Integer> oddNumbers = filterAndPrint(list, x -> x % 2 != 0);
        System.out.println(oddNumbers);

    }


    private static List<Integer> functionalMethod(List<Integer> numberList, Function<Integer, Integer> function) {
        return numberList.stream().map(function).collect(Collectors.toList());
    }


    private static List<Integer> filterAndPrint(List<Integer> numberList, Predicate<Integer> predicate) {
        return numberList.stream().filter(predicate).collect(Collectors.toList());
    }
}