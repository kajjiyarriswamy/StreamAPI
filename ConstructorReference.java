package org.java8;

import java.util.function.Supplier;

public class ConstructorReference {


    public static void main(String[] args) {

        //Here the supplier will return String object is one way
        Supplier<String> supplier=()->new String();

        //Here by using Constructor reference we will return String object
        Supplier<String> supplier1=String::new;

    }
}

