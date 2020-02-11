package com.tengol.practice.java.jdk8.stream;

import java.math.BigDecimal;

/**
 * StreamDemo
 *
 * @author dongrui
 * @date 2020/1/17 14:32
 */
public class StreamDemo {
    public static void main(String[] args) {
       double cost = 44.555;
        BigDecimal newCost = new BigDecimal(cost+"");
        cost = newCost.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(cost);
    }
}
