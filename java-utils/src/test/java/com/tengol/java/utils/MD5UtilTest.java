package com.tengol.java.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * MD5UtilTest - 单元测试
 *
 * @author dongrui
 * @date 2020/3/20 9:14
 */
public class MD5UtilTest {
    @Test
    public void generate64Md5(){
        String passowrd = "dongrui123";
        String saltValue = "58";

        String newPassword = MD5Util.generate64Md5(passowrd, saltValue);
        Assert.assertEquals(newPassword,"9e0c86597be2be9280010a475268c160");
    }
}
