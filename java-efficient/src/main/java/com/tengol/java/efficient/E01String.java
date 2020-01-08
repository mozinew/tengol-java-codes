package com.tengol.java.efficient;

import java.util.Objects;

/**
 * 对字符串的高效操作
 * （1）字符串首字母大写变小写
 *
 * @author dongrui
 * @date 2020/01/08
 */
public class E01String {

    public static void main(String[] args) {
        //高效01-将字符串首字母由大写变为小写
        String hello = "HelloWorld";
        String newHello = makeFirstLetterLower(hello);
        System.out.println("Before: " + hello + ", After: " + newHello);
    }

    /**
     * 高效地将字符串首字母由大写变为小写
     *
     * @param str 首字母大写的字符串
     * @return 首字母小写的字符串
     */
    private static String makeFirstLetterLower(String str) {
        if (Objects.isNull(str)) {
            return null;
        }
        //转为字符数组，将数组第一个元素转为大写
        char[] chars = str.toCharArray();
        //对字符 char 做加减法运算就是对 ASCII 码做加减法运算，ASCII 码中大小写字母数值差是 32
        chars[0] += 32;

        return String.valueOf(chars);
    }

}
