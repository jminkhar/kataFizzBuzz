package com.olbati.fizzbuzz;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class FizzBuzz {

    private static Map<Integer, String> config = new HashMap<>();
    public static void main(String... args){
        IntStream.rangeClosed(1,5).boxed().forEach(i-> {});
    }
    static {
        config.put(3, "Fizz");
        config.put(5, "Buzz");
        config.put(7, "Olbati");
    }

    public String process(int input) {
        if (input < 1 || input > 100) {
            throw new IllegalArgumentException();
        }

        StringBuilder outputBuilder = new StringBuilder();
        Set<Integer> configurationKeys = config.keySet();

        for (Integer key : configurationKeys) {
            if (input % key == 0) {
                outputBuilder.append(config.get(key));
            }
        }

        if (outputBuilder.length() == 0) {
            outputBuilder.append(input);
        }

        return outputBuilder.toString();
    }


    public String processOld(int input) {
        if (input < 1 || input > 100) {
            throw new IllegalArgumentException();
        }

        if (input % 3 == 0 && input % 5 == 0) {
            return "FizzBuzz";
        }
        if (input % 3 == 0) {
            return "Fizz";
        }
        if (input % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(input);
    }
}
