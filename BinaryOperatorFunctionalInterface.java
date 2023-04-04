package org.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class BinaryOperatorFunctionalInterface {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        //This one way to implement the Binary functional interface by Lambda expression
        BinaryOperator<Integer> binaryOperator = (num1, num2) -> {
            return num1 + num2;
        };

        //Below is the details implementation of the lambda function how it works internally
        //The consumer will accept one input and gives nothing void  return type.

        BinaryOperator<Integer> binaryOperator1=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer number1, Integer number2) {
                return number1+number2;
            }
        };

        //Here the sum of numbers value will be printed and reduce method uses binary funcational interface.
      System.out.println(list.stream().reduce(0,binaryOperator1));

      //Below also can be done;
      list.stream().reduce(0,(x1,x2)->{ return x1+x2;});
    }
}
