package com.tengol.java.utils;

import org.apache.commons.codec.binary.Hex;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/**
 * MD5Util
 *
 * @author dongrui
 * @date 2020/3/20 8:54
 */
public class MD5Util {
    private static final String STRING_EMPTY = "";

    public static String generate64Md5(String str, String saltValue) {
        if (Objects.isNull(str) || str.trim().length() == 0) {
            return STRING_EMPTY;
        }

        try {

            MessageDigest messageDigest = MessageDigest.getInstance("md5");

            String md5Str = new String(Hex.encodeHex(messageDigest.digest(str.getBytes())));
            if (Objects.isNull(saltValue) || saltValue.trim().length() == 0) {
                return md5Str;
            }

            return new String(Hex.encodeHex(messageDigest.digest((md5Str + saltValue).getBytes())));

        } catch (NoSuchAlgorithmException e) {
            System.out.println("generate 64bit md5 error msg: " + e.getMessage());
        }
        return STRING_EMPTY;
    }

}
