package com.tengol.practice.java.jdk8.hello;


import java.util.Base64;

/**
 * Base64Test
 *
 * @author dongrui
 * @date 2020/3/5 16:51
 */
public class Base64Test {
    public static void main(String[] args) {
        String data = "CAEQARqgAwiLlOzNJhKXAwiAIBCCgDAY/cj3NSDotbsNKIKb9zUwxs67DThMQABIAFDtrYfwBVjEpyNg7a2H8AVoAHAAeACgAQKoAQq4AQCCAs8BCgUIpQEQAAoFCKYBEAAKBQinARAACgUIqAEQAAoFCK0BEAAKBQiuARAACgQIJBAACgQIHxAACgQIIBAACgUIIRCEBwoGCA8Q0+kDCgQIMxAACgQIKhAACgQIKRAACgQINRAACgYIGxCI3BgKBAgyEAAKBQgcEKwCCgUIBhD0TgoFCAgQhAcKBwgZEPC1oDoKCAgaEKDJsIMGCgYIHhC2ohAKBAgxEAAKBggLEIXGOgoFCI8BEAAKBQiQARAACgcIpAEQwcUECgcInAEQp6cCkgIIAAIAAAQAAAiaAg0YACjyATgASABQAGAAoAIAsAIAugJOCAAQABgAIAAoADUAAAAAPQAAAABAAEgAUABYAGUAAAAAbQAAAABwAH0AAAAAgAEAiAEAkAEAnQEAAAAApQEAAAAAqAEAsAEAuAEAwAEA1QJ74RVG3QIAmCZF6AIA8gIA";

        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(data);
        System.out.println(new String(decode));


    }
}
