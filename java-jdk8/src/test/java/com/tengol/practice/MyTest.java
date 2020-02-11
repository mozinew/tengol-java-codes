package com.tengol.practice;

import java.util.UUID;

/**
 * MyTest
 *
 * @author dongrui
 * @date 2020/1/6 11:29
 */
public class MyTest {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        String fileName = "01.jpg";
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(fileType);
        System.out.println(uuid.concat(fileType));

    }
}
