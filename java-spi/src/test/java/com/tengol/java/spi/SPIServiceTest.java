package com.tengol.java.spi;

import com.mysql.cj.jdbc.Driver;
import com.tengol.java.spi.service.SPIService;
import org.junit.Test;
import sun.misc.Service;

import java.sql.*;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 单元测试：SPI机制
 *
 * SPI 机制支持 2 种加载方式：
 * （1）sun.misc.Service
 * （2）java.util.ServiceLoader
 *
 * @author dongrui
 * @date 2020/4/15 10:24
 */
public class SPIServiceTest {

    /**
     * 演示 SPI 机制的 2 种加载方式
     *
     */
    @Test
    public void testSPILoad() {
        // 加载方式 1
        Iterator<SPIService> providers = Service.providers(SPIService.class);
        // 加载方式 2，可跟踪源码
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);

        while (providers.hasNext()) {
            SPIService service = providers.next();
            service.execute();
        }
        System.out.println("-----------------------");

        Iterator<SPIService> iterator = load.iterator();
        while (iterator.hasNext()) {
            SPIService spiService = iterator.next();
            spiService.execute();
        }
    }

    @Test
    public void testJdbc() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/my_test?useUnicode=true&useSSL=false&serverTimezone=Asia/Shanghai";
        String username = "root";
        String password = "spf.2020";

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String sql = "select * from tb_user";
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println(resultSet);
    }

    @Test
    public void testDriverInstance() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader = this.getClass().getClassLoader();
        String className = Driver.class.getName();
        Class<?> aClass = Class.forName(className, false, classLoader);
        Object mysqlDriver = aClass.newInstance();
        System.out.println(mysqlDriver.getClass());
    }
}
