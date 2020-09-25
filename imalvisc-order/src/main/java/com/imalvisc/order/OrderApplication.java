package com.imalvisc.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 程序启动类
 *
 * @author imalvisc
 * @version Id: com.imalvisc.order.OrderApplication.java, v 0.1 2020-09-25 14:57 imalvisc Exp $$
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
