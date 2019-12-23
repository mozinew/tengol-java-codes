package com.tengol.practice.java.hello;

/**
 * StringDemo
 *
 * @author dongrui
 * @date 2019/12/3 13:04
 */
public class StringDemo {
    public static void main(String[] args) {
        String a1 = "Hello";
        String a2 = "Hello";
        String a3 = new String("Hello");
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println("------");
        //intern()方法将返回从字符串池中的字符串对象的引用
        a3 = a3.intern();
        System.out.println(a1 == a3);
    }
}
