package com.tengol.java.spi;

import com.tengol.java.spi.service.demo.SingletonDemo;
import org.junit.Test;

/**
 * 单元测试：静态内部类
 *
 * @author dongrui
 * @date 2020/4/15 16:03
 */
public class SingletonTest {
    @Test
    public void testSingleton() {
        System.out.println("=============begin================");
        SingletonDemo instance = SingletonDemo.getInstance();
        System.out.println("=== 获取到单例实例：" + instance);
        SingletonDemo instance1 = SingletonDemo.getInstance();
        System.out.println("=== 再次获取到单例实例：" + instance1);
        System.out.println("=============end================");
    }

    /**
     * 测试结果：
     * （1）静态内部类 LazyHolder 只被执行了一次，第一次调用时才执行的
     * （2）该写法的单例模式是线程安全的，而且是高效的实现方式（懒加载）
     *
     * @throws InterruptedException 主线程休眠失败时抛出此异常
     */
    @Test
    public void testSingletonByMultiThread() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                String name = Thread.currentThread().getName();
                SingletonDemo instance = SingletonDemo.getInstance();
                System.out.println(name + " === 获取到单例实例：" + instance);
            }).start();
        }

        // 先停1000ms，等待线程创建完成
        Thread.sleep(1000);
    }
}
