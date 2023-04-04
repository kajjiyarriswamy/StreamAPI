package org.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(87);
        list.add(26);
        list.add(99);
        list.add(8);

        //The supplier functional interface will not accept any argument but return something
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(supplier.get());
    }
}
