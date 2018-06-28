package com.example.study;

public class SelfTestStudy {

    public String fizzBuzz(int number) {
        if (isFizzBuzz(number)) return "FizzBuzz";
        if (isFizz(number)) return "Fizz";
        if (isBuzz(number)) return "Buzz";
        return String.valueOf(number);
    }

    public boolean isFizz(int number) {
        return number % 3 == 0;
    }

    public boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    public boolean isFizzBuzz(int number) {
        return isFizz(number) && isBuzz(number);
    }
}
