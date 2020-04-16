package com.tengol.java.spi.service.impl;

import com.tengol.java.spi.service.SPIService;
import lombok.extern.slf4j.Slf4j;

/**
 * SPIServiceImplB
 *
 * @author dongrui
 * @date 2020/4/15 10:20
 */
public class SPIServiceImplB implements SPIService {
    @Override
    public void execute() {
        System.out.println("SPIServiceImplB invoked ......");
    }
}
