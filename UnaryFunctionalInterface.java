package org.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryFunctionalInterface {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        //Unaryoperator takes one put and give input back
        UnaryOperator<Integer> unaryOperator=x->{
            return x+x;
        };

        System.out.println(unaryOperator.apply(10));


    }
}
