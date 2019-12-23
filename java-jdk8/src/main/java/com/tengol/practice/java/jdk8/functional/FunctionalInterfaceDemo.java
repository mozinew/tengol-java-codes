package com.tengol.practice.java.jdk8.functional;

/**
 * FunctionalInterfaceDemo
 *
 * @author dongrui
 * @date 2019/12/19 15:05
 */
public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Converter<String,String> stringConverter = b -> "Hello ".concat(b);
        System.out.println(stringConverter.convert("World"));

        stringConverter = "Hello "::concat;

    }
}
