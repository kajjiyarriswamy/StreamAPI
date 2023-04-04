package org.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        System.out.println("By using Structred or loops");

        //This one way to implement the predicate functional interface by Lambda expression
        Predicate<Integer>  predicate1=x->x%2==0;


        //Below is the details implementation of the lambda function how it works internally
        //The predicate will accept one input and gives boolean  return type.
        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                if(num%2==0) {
                    return true;
                }else{
                    return false;
                }
            }
        };

        //Here the filter method uses predicate
        list.stream().filter(num->num%2==0).forEach(System.out::println);
        System.out.println("Below is the BiPredicate functional interface");
        //Below is the BiPredicate functional interface which accepts two arguments the return type is boolean type

        BiPredicate<Integer,String> biPredicate=(x,y)->{
            return x<10 && y.length()>5;
        };

       System.out.println(biPredicate.test(3,"ramanujam"));
    }
}
