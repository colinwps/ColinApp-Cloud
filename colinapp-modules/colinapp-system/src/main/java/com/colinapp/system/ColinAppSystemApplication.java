package com.colinapp.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.colinapp.common.security.annotation.EnableCustomConfig;
import com.colinapp.common.security.annotation.EnableRyFeignClients;
import com.colinapp.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class ColinAppSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ColinAppSystemApplication.class, args);
        System.out.println("系统模块启动成功");
    }
}
