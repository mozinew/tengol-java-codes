package com.tengol.java.spi.service.demo;

/**
 * ClassStaticDemo
 *
 * @author dongrui
 * @date 2020/4/15 14:24
 */
public class ClassStaticDemo {
    //静态属性
    public static final String HELLO = "Hello World";

    //静态代码块
    static {
        System.out.println("打印静态代码块");
    }

    //静态方法
    public static void sayHello(){
        System.out.println("打印静态方法：sayHello() ");
    }

    //代码块
    {
        System.out.println("打印代码块");
    }

    public ClassStaticDemo(){
        System.out.println("打印构造方法");
        say();
    }

    public void say(){
        System.out.println("构造方法调用普通方法：" + this);
    }


    public static void main(String[] args) {
        System.out.println("执行 main 方法");
        System.out.println(ClassStaticDemo.HELLO);
    }
}
