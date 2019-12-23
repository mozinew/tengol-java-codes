package com.tengol.practice.java.jdk8.inter;

import java.util.Objects;

/**
 * PrintService
 *
 * @author dongrui
 * @date 2019/12/19 14:23
 */
public interface PrintService {
    void printInfo(String message);

    default String createDirectory(String basicPath){
        return Objects.isNull(basicPath) ? "D:\\test\\default" : "D:\\test\\".concat(basicPath);
    }

    default void printWhoIs(){
        System.out.println("I am PrintService");
    }
}
