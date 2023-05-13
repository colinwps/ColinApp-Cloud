package com.colinapp.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author colin
 * @Date 20230513
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ColinAppGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ColinAppGatewayApplication.class, args);
        System.out.println("网关启动成功...");
    }
}
