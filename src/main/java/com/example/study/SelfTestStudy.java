package com.example.study;

public class SelfTestStudy {

    /**
     * 引数の数値を元に以下のルールに従って変換した文字列を返す
     * <li>3の倍数の時は Fizz</li>
     * <li>5の倍数の時は Buzz</li>
     * <li>3と5の倍数の時は FizzBuzz</li>
     * <li>それ以外の時は数値</li>
     * @param number 数値
     * @return
     */
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
