package com.tengol.practice.java.jdk8.hello;

import java.util.Optional;

/**
 * OptionalDemo
 *
 * @author dongrui
 * @date 2019/12/19 15:19
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("zhangsan");
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Optional<String> nullOptional = Optional.ofNullable(null);
        System.out.println(nullOptional.isPresent());
        System.out.println(nullOptional.get());
    }
}
