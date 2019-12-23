package com.tengol.practice.java.hello;

import com.tengol.practice.java.hello.domain.Person;

import java.net.Inet4Address;

/**
 * EqualDemo
 *
 * @author dongrui
 * @date 2019/12/3 12:06
 */
public class EqualDemo {
    public static void main(String[] args) {
        Integer a1 = 1;
        Integer a2 = 1;
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        String b1 = "Hello";
        String b2 = "Hello";
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        Person c1 = new Person("Hello");
        Person c2 = new Person("Hello");
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        /**
         * 使用 new 方式创建
         */
        System.out.println("-------");

        Integer d1 = new Integer(1);
        Integer d2 = new Integer(1);
        System.out.println(d1 == d2);
        System.out.println(d1.equals(d2));

        String f1 = new String("Hello");
        String f2 = new String("Hello");
        System.out.println(f1 == f2);
        System.out.println(f1.equals(f2));

        System.out.println("------");

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b);
        System.out.println(a.equals(b));


        System.out.println("-----");
        Integer c = 1;
        Integer d = new Integer(1);
        System.out.println(c == d);
    }

}
