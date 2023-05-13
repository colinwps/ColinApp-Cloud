package com.colinapp.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 * 
 * @author ruoyi
 */
@EnableAdminServer
@SpringBootApplication
public class ColinAppMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ColinAppMonitorApplication.class, args);
        System.out.println("监控中心启动成功");
    }
}
