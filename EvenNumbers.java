package org.java8;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {


    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        System.out.println("By using Structred or loops");

        for(int i:list){
            if(i%2==0)
                System.out.println(i);
        }
        System.out.println("By using streams or functional programming");
        list.stream().filter(numbers->numbers%2==0).forEach(System.out::println);

    }
}
