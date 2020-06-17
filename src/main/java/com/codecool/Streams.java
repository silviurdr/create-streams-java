package com.codecool;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Streams {
    public static void main(String[] args) {
        /*
         * Create a stream out of the following array.
         */

        String[] a1 = {"one", "two", "three"};
        Stream<String> s1 = Arrays.stream(a1);
        System.out.println("Stream out of an array:");
        s1.forEach(System.out::println);

        /*
         * Create a stream containing the Strings "one" , "two" and "three"
         * without using an array
         */

        Stream<String> s2 = Stream.of("one", "two", "three");
        System.out.println("Stream out of values");
        s2.forEach(System.out::println);

        /*
         * Create a stream using a stream builder.
         */

        Stream.Builder<String> b1 = Stream.builder();
        /* ??? */
        Stream<String> s3 = b1
                            .add("some text")
                            .add("other text")
                            .add("last text")
                            .build();

        System.out.println("Stream using stream builder:");
//        s3.forEach(System.out::println);

        /*
         * Collect one of the above defined streams into a list.
         *
         * HINT: the keyword here is "collect"
         */

        List<String> l1 = s3.collect(Collectors.toList());
        System.out.println("List collected from stream");
        l1.forEach(System.out::println);

        /*
         * Streams can be infinite.  We obviously cannot create such a
         * stream by supplying all the elements ourselves.
         *
         * HINT: When looking for methods to create such streams
         * realize that:
         * - These methods cannot belong to an instance
         * - They are returning streams
         */

        /*
         * Create a stream of the powers of two.
         */

        Integer twoToTheZeroth = 1;
        UnaryOperator<Integer> doubler = (Integer x) -> 2 * x;
        Stream<Integer> s4 = Stream.iterate(twoToTheZeroth, doubler);


        /*
         * Create a stream containing the first ten elements of s4.
         */

        Stream<Integer> s5 = s4.
                            limit(10);
        System.out.println("First 10 powers of 2 stream: ");
        s5.forEach(System.out::println);


        /*
         * Create a stream containing the elements of the Fibonacci
         * sequence.
         *
         * HINT: You will need to create a new class for this.
         */

//        Supplier<Integer> fibSupp = new Fibonacci();
//        Stream<Integer> s6 = /* ??? */;
    }
}
