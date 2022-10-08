package com.github.fenixsoft.bookstore.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * SpringCloud Netflix全家桶的服务API网关
 *
 * @author icyfenix@gmail.com
 * @date 2020/4/4 16:12
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
