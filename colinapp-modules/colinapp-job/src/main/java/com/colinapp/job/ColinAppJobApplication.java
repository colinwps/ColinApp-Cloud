package com.colinapp.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.colinapp.common.security.annotation.EnableCustomConfig;
import com.colinapp.common.security.annotation.EnableRyFeignClients;
import com.colinapp.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author ruoyi
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringBootApplication
public class ColinAppJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ColinAppJobApplication.class, args);
        System.out.println("定时任务模块启动成功");
    }
}
