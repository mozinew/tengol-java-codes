package com.tengol.practice.java.jdk8.functional;

/**
 * Converter
 *
 * @author dongrui
 * @date 2019/12/19 15:04
 */
@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
