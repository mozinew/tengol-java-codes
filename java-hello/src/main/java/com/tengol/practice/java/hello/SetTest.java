package com.tengol.practice.java.hello;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * SetTest
 *
 * @author dongrui
 * @date 2020/3/30 16:03
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Integer> existIds = new HashSet<>(Arrays.asList(1,2,5,6));
//        Set<Integer> newIds = new HashSet<>(Arrays.asList(2,3,6,7));
        Set<Integer> newIds = new HashSet<>(Arrays.asList(1,2,5,6,7,8,9));

        //求交集
        Set<Integer> coms = existIds.stream().filter(i -> newIds.contains(i)).collect(Collectors.toSet());
        System.out.println("共同：" + coms);

        existIds.removeAll(coms);
        System.out.println("删除：" +existIds);

        newIds.removeAll(coms);
        System.out.println("新增：" + newIds);

//        existIds.removeAll(newIds);
//        System.out.println(existIds);
//        System.out.println(newIds);
//
//        newIds.removeAll(existIds);
//        System.out.println(newIds);
    }
}
