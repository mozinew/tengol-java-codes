package com.tengol.practice.java.jdk8.hello;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * HelloDemo
 *
 * @author dongrui
 * @date 2020/3/4 11:10
 */
public class HelloDemo {
    public static void main(String[] args) throws Exception {
        Date start = getDay("2020-03-03 11:16:00");
        Date end = new Date();

        double a = (double)((end.getTime() - start.getTime())/(1000*3600*24));
        System.out.println(a);
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
    }

    private static Date getDay(String strDate) throws ParseException {
        SimpleDateFormat spf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return spf.parse(strDate);
    }



}
