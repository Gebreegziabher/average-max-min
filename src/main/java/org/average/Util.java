package org.average;

import java.util.List;

public class Util {
    public static double getAverage(List<? extends Number> numbers){
        return getSum(numbers)/numbers.size();
    }
    public static Double getSum(List<? extends Number> numbers){
        Double sum = 0.0;
        for(Number number: numbers)
            sum += number.doubleValue();
        return sum;
    }
}
