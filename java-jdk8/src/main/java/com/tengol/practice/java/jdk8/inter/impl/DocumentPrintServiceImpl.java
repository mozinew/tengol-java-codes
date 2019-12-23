package com.tengol.practice.java.jdk8.inter.impl;

import com.tengol.practice.java.jdk8.inter.PrintService;

/**
 * DocumentPrintServiceImpl
 *
 * @author dongrui
 * @date 2019/12/19 14:29
 */
public class DocumentPrintServiceImpl implements PrintService {
    @Override
    public void printInfo(String message) {
        System.out.println("DocumentPrintServiceImpl.printInfo() is invoked with param : " + message);
    }

    @Override
    public void printWhoIs() {
        System.out.println("I am DocumentPrintServiceImpl");
    }

    public static void main(String[] args) {
        PrintService printService = new DocumentPrintServiceImpl();
        printService.printWhoIs();
        printService.printInfo("Test JDK8");
        System.out.println(printService.createDirectory("hello"));
    }
}
