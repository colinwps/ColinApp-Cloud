package com.colinapp.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.colinapp.common.security.annotation.EnableCustomConfig;
import com.colinapp.common.security.annotation.EnableRyFeignClients;
import com.colinapp.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringBootApplication
public class ColinAppGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ColinAppGenApplication.class, args);
        System.out.println("代码生成模块启动成功");
    }
}
