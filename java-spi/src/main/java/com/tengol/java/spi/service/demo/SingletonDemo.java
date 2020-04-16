package com.tengol.java.spi.service.demo;

/**
 * 静态代码块测试：静态内部类
 *  单例模式的其中一种实现方式是静态内部类，静态内部类在首次被调用时才初始化，也就是说使用的时候才初始化静态变量和静态代码块，因此，实现了懒加载。
 *  下面就对这种模式进行测试。
 *
 * @author dongrui
 * @date 2020/4/15 16:01
 */
public class SingletonDemo {
    private SingletonDemo(){
        System.out.println("调用构造方法 SingletonDemo()");
    }

    static {
        System.out.println("调用 SingletonDemo 的静态代码块");
    }

    public static SingletonDemo getInstance(){
        return LazyHolder.SINGLETON_DEMO;
    }

    public static class LazyHolder{
        public static final SingletonDemo SINGLETON_DEMO = new SingletonDemo();

        static {
            System.out.println("调用 LazyHolder 的静态代码块");
        }
    }
}
