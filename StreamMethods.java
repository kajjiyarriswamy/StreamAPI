package org.java8;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {

        //rangeclosed method will have range of streams between the two arguments
        //The peek method will print the numbers of stream have
        System.out.println("The below code prints the numbers involved in stream and prints the sum of those numbers");
        System.out.println(IntStream.rangeClosed(1, 10).peek(System.out::println).sum());
        System.out.println("The below code will print even numbers and will print sum of the numbers");
        System.out.println(IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum());

        System.out.println("The below code will print 2*2,4*2,... numbers and will print sum of the numbers");
        System.out.println(IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum());
        System.out.println("The below code used to collect the numbers into list from above code");
        //The boxed method is used convert the primitive to wrapper class then only we can collect to list otherwise will give exception
        List<Integer> l = IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList());
        System.out.println(l);

        System.out.println("When we are dealing with big numbers this is the sample example");
        System.out.println(LongStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));


        List<String> courses = Stream.of("Spring", "AWS", "Azure", "GCP").collect(Collectors.toList());
        System.out.println("Combing the list of courses separating by space");
        System.out.println(courses.stream().collect(Collectors.joining(" ")));


    }

}
