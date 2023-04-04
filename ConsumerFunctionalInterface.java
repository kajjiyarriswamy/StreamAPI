package org.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        //This one way to implement the Consumer functional interface by Lambda expression
        Consumer<Integer> consumer1 = x -> System.out.println(x);

        //Below is the details implementation of the lambda function how it works internally
        //The consumer will accept one input and gives nothing void  return type.
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer number) {
                System.out.println(number);
            }
        };

        //Here the foreach method uses Consumer functional interface as input for implementation
        list.stream().forEach(System.out::println);


        //BiConsumer is also a Functional interface but accepts two arguments and return void
        BiConsumer<Integer, String> biConsumer = (number, str) -> {
            System.out.println(number);
            System.out.println(str);
        };
        biConsumer.accept(10, "raju");
    }
}
