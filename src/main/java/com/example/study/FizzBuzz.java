package com.example.study;

public class FizzBuzz {
    public static void main(String[] args) {
        SelfTestStudy a = new SelfTestStudy();

        for(int i = 1; i <= 30; i++) {
            System.out.println(a.fizzBuzz(i));
        }
    }
}
