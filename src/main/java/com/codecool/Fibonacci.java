package com.codecool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fibonacci implements Supplier<Integer> {


    List<Integer> fibonaccis = new ArrayList<>(Arrays.asList(0, 1));

    @Override
    public Integer get() {
        int lengthOfFibo = fibonaccis.size();
        int currentFiboLastNumber = fibonaccis.get(lengthOfFibo - 1);
        int currentFiboPenultimateNumber = fibonaccis.get(lengthOfFibo - 2);

        fibonaccis.add(currentFiboPenultimateNumber + currentFiboLastNumber);
        return fibonaccis.get(lengthOfFibo - 2);
    }


}
