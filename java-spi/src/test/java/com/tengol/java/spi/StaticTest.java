package com.tengol.java.spi;

import com.tengol.java.spi.service.demo.ClassStaticDemo;
import org.junit.Test;

/**
 * StaticTest
 *
 * @author dongrui
 * @date 2020/4/15 14:17
 */
public class StaticTest {
    @Test
    public void testStatic() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        System.out.println("=============begin================");
        //是否初始化
        String className = ClassStaticDemo.class.getName();
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?> aClass = Class.forName(className, false, classLoader);
        System.out.println("Class.forName()");
        aClass.newInstance();
        System.out.println("=============end================");
    }


    @Test
    public void testStaticLoad(){
        System.out.println("=============begin================");
        System.out.println(ClassStaticDemo.class.getName());
        System.out.println(ClassStaticDemo.HELLO);
        System.out.println("=============end================");
    }

    @Test
    public void testStaticLoad2(){
        System.out.println("=============begin================");
        System.out.println(ClassStaticDemo.class.getName());
        ClassStaticDemo.sayHello();
        System.out.println("=============end================");
    }

    @Test
    public void testStaticLoad3(){
        System.out.println("=============begin================");
        System.out.println(ClassStaticDemo.class.getName());
        ClassStaticDemo.main(null);
        System.out.println("=============end================");
    }
}
