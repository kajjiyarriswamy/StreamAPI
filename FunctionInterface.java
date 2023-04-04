package org.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        //This one way to implement the Function functional interface by Lambda expression
        Function<Integer, Integer> function1 = x -> x * x;

        //Below is the details implementation of the lambda function how it works internally
        //The Function will accept one input and gives Integer  return type.
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer num) {
                return num * num;
            }
        };

        //Here the map method uses Function functional interface as input.
        list.stream().map(num -> num * num).forEach(System.out::println);


        System.out.println("Below is the BiFunction functional interface");
        //Below is the BiFunction functional interface which accepts two arguments but the third generic type(String) is to define the return type of the functional interface
        BiFunction<Integer, Integer, String> biFunction = (x, y) -> {
            return x + y + ":The value of two numbers";
        };
        System.out.println(biFunction.apply(10, 19));

    }
}
