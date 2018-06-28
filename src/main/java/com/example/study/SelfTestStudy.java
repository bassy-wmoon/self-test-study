package com.example.study;

public class SelfTestStudy {

    public String fizzBuzz(int i) {
        if (isFizz(i) && isBuzz(i)) return "FizzBuzz";
        if (isFizz(i)) return "Fizz";
        if (isBuzz(i)) return "Buzz";
        return String.valueOf(i);
    }

    public boolean isFizz(int i) {
        return i % 3 == 0;
    }

    public boolean isBuzz(int i) {
        return i % 5 == 0;
    }
}
