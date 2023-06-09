package com.colinapp.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.colinapp.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author ruoyi
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ColinAppAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ColinAppAuthApplication.class, args);
        System.out.println("认证授权中心启动成功");
    }
}
