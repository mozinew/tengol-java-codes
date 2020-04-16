package com.tengol.java.spi.service.impl;

import com.tengol.java.spi.service.SPIService;

/**
 * SpiServiceImplA
 *
 * @author dongrui
 * @date 2020/4/15 10:04
 */
public class SPIServiceImplA implements SPIService {
    @Override
    public void execute() {
        System.out.println("SPIServiceImplB invoked ......");
    }
}
